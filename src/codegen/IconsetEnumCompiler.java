import static org.objectweb.asm.Opcodes.AASTORE;
import static org.objectweb.asm.Opcodes.ACC_FINAL;
import static org.objectweb.asm.Opcodes.ACC_PRIVATE;
import static org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static org.objectweb.asm.Opcodes.ACC_STATIC;
import static org.objectweb.asm.Opcodes.ACC_SYNTHETIC;
import static org.objectweb.asm.Opcodes.ACC_TRANSIENT;
import static org.objectweb.asm.Opcodes.ALOAD;
import static org.objectweb.asm.Opcodes.ANEWARRAY;
import static org.objectweb.asm.Opcodes.ARETURN;
import static org.objectweb.asm.Opcodes.ASM8;
import static org.objectweb.asm.Opcodes.ASTORE;
import static org.objectweb.asm.Opcodes.ATHROW;
import static org.objectweb.asm.Opcodes.BIPUSH;
import static org.objectweb.asm.Opcodes.DUP;
import static org.objectweb.asm.Opcodes.F_SAME;
import static org.objectweb.asm.Opcodes.GETSTATIC;
import static org.objectweb.asm.Opcodes.IADD;
import static org.objectweb.asm.Opcodes.ICONST_0;
import static org.objectweb.asm.Opcodes.ICONST_1;
import static org.objectweb.asm.Opcodes.INVOKESPECIAL;
import static org.objectweb.asm.Opcodes.INVOKESTATIC;
import static org.objectweb.asm.Opcodes.NEW;
import static org.objectweb.asm.Opcodes.PUTSTATIC;
import static org.objectweb.asm.Opcodes.RETURN;
import static org.objectweb.asm.Opcodes.SIPUSH;
import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseStart;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ParserConfiguration.LanguageLevel;
import com.github.javaparser.Providers;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.comments.JavadocComment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.processing.Filer;
import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.apache.commons.io.FileUtils;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

public class IconsetEnumCompiler {

  //JDK15+ compilers allow up to 4103 constants
  private static final int THRESHOLD = 4103;
  
  //We can post-compile for up to 10921 constants
  private static final int HARD_LIMIT = 10921;

  private static File sources;
  private static File target;
  private static String sourceLevel;
  private static String targetLevel;
  private static boolean postcompile;

  public static void main(String[] args) throws IOException {
    sources = getRequiredDirectory("codegen.sources"); //the location of generated sources
    target = new File(getRequiredDirectory("codegen.target"),"recompiled/com/flowingcode/vaadin/addons/fontawesome"); //project.build.directory
    sourceLevel = getRequiredProperty("codegen.compiler.source");
    targetLevel = getRequiredProperty("codegen.compiler.target");
    postcompile = Boolean.parseBoolean(System.getProperty("codegen.postcompile"));
    
    target.mkdirs();    

    Map<String, String[]> rewritten = rewrite();
    if (postcompile) {
      compile();
      postcompile(rewritten);
    }
  }

  private static String getRequiredProperty(String name) {
    return Optional.ofNullable(System.getProperty(name)).orElseThrow(()->new NoSuchElementException("Missing system property -D"+name));
  }

  private static File getRequiredDirectory(String name) {
    File directory = new File(getRequiredProperty(name));
    if (!directory.exists()&&!directory.mkdir()) {
      System.err.println("Output directory "+directory+" does not exist and cannot be created");
      System.exit(1);
    }
    return directory;
  }

  private static Map<String,String[]> rewrite() throws IOException {
    System.out.println("Analyze generated code");

    ParserConfiguration cfg = new ParserConfiguration();
    cfg.setLanguageLevel(LanguageLevel.RAW);
    cfg.setAttributeComments(false);
    cfg.setStoreTokens(false);
    JavaParser parser = new JavaParser(cfg);

    File javaFile = new File(sources, "com\\flowingcode\\vaadin\\addons\\fontawesome\\FontAwesome.java");
    CompilationUnit cu = parser.parse(javaFile).getResult().get();

    TypeDeclaration typeDecl = cu.getPrimaryType().get();

    List<EnumDeclaration> toBeRewritten = new ArrayList<>();
    typeDecl.getMembers().stream().forEach(member->{
      if (member instanceof EnumDeclaration) {
        EnumDeclaration enumDecl = (EnumDeclaration) member;
        int size = enumDecl.getEntries().size(); 
        String name = enumDecl.getName().toString();
        if (size>HARD_LIMIT) {
          throw new RuntimeException(String.format("\nCannot compile %s enum: code too large (%s constants)", name, size));
        }
        if (enumDecl.getEntries().size()>THRESHOLD) {
          System.out.println(String.format("Postprocessing required for %s enum because it has %s constants", name, size));
          toBeRewritten.add(enumDecl);
        }
      }
    });

    File rewrittenSource = new File(target, "FontAwesome.java");
    if (toBeRewritten.isEmpty()) {
      if (postcompile) {
        FileUtils.copyFile(javaFile, rewrittenSource);
      }
      return Collections.emptyMap();
    } else { 
      if (!postcompile) {
        throw new RuntimeException("\nPost-compilation is required but it was not enabled. Run with -Pbigenum,generate profiles");
      }
    
      Map<String, String[]> rewritten = new LinkedHashMap<>();
      for (EnumDeclaration enumDecl : toBeRewritten) {
        if (enumDecl.getEntries().size()>THRESHOLD) {
          String[] constants = enumDecl.getEntries().stream().map(e->e.getName().toString()).toArray(String[]::new);
          rewritten.put(enumDecl.getNameAsString(), constants);
          enumDecl.setEntries(new NodeList<>());
        }
      }
  
      PrintStream ps = new PrintStream(new FileOutputStream(rewrittenSource));
      ps.print(cu);
      ps.close();
  
      return rewritten;
    }
  }


  private static void compile() throws IOException {
    System.out.println("Compile FontAwesome.java");
    
    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    if (compiler == null) {
      throw new RuntimeException("\nNo compiler available. Check that you are running with a JDK instead of a JRE");
    }

    String classpath = getRequiredProperty("codegen.classpath"); //classpath for compiler
    File sourceFile = new File(target, "FontAwesome.java");

    List<String> options = new ArrayList<>();
    options.add("--class-path");
    options.add(Stream.of(classpath.split(";")).collect(Collectors.joining(File.pathSeparator)));    
    options.add("--source-path");
    options.add(target.toString());
    options.add("--source");
    options.add(sourceLevel);
    options.add("--target");
    options.add(targetLevel);

    StandardJavaFileManager fileManager = compiler.getStandardFileManager(null,null,null);
    Iterable<? extends JavaFileObject> files= fileManager.getJavaFileObjectsFromFiles(Arrays.asList(sourceFile));

    if (!compiler.getTask(null, null, null, options, null, files).call()) {
      throw new RuntimeException("\nCompilation failed");
    }
    
    sourceFile.delete();
  }


  private static void postcompile(Map<String, String[]> rewritten) throws IOException {

    if (rewritten.isEmpty()) {
      return;
    }
    
    System.out.println("Post-compile FontAwesome.java");
    
    File sourceFile = new File(target, "FontAwesome.java");        

    for (Map.Entry<String, String[]> entry : rewritten.entrySet()) {
      File classFile = new File(target, String.format("FontAwesome$%s.class", entry.getKey()));
      ClassReader reader = new ClassReader(FileUtils.readFileToByteArray(classFile));

      ClassVisitor cv;
      ClassWriter cw = new ClassWriter(0);
      cv = new WriteEnumClassVisitor(ASM8, cw, entry.getValue());
      cv = new FilterClassVisitor(ASM8, cv);

      reader.accept(cv, 0);
      
      FileUtils.writeByteArrayToFile(classFile, cw.toByteArray());      
    }
  }
}


//Filter out methods and fields that will be rewritten
class FilterClassVisitor extends ClassVisitor {

  FilterClassVisitor(int api, ClassVisitor cv) {
    super(api,cv);
  }

  @Override
  public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
    if (name.equals("<clinit>")) {
      return null;
    }
    if ((access & ACC_SYNTHETIC) != 0) {
      return null;
    }
    return super.visitMethod(access, name, descriptor, signature, exceptions);
  }

  @Override
  public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
    if ((access & ACC_SYNTHETIC) != 0 && !name.equals("$VALUES")) {
      return null;
    }
    return super.visitField(access, name, descriptor, signature, value);
  }

  @Override
  public void visitSource(String source, String debug) {
    super.visitSource(source, null);
  }

}

//add field and methods
class WriteEnumClassVisitor extends ClassVisitor {

  private boolean visitedFields;
  private boolean visitedMethods;

  private String[] constants;
  private String classname;
  private String descriptor;

  WriteEnumClassVisitor(int api, ClassVisitor cv, String[] constants) {
    super(api, cv);
    this.constants = constants;
  }

  @Override
  public void visit(int version, int access, String name, String signature, String superName,
      String[] interfaces) {
    classname = name;
    descriptor = String.format("L%s;", classname);
    super.visit(version, access, name, signature, superName, interfaces);
  }

  @Override
  public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
    if (!visitedFields) {
      addFields();
    }
    return super.visitField(access, name, descriptor, signature, value);
  }

  @Override
  public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
    if (!visitedFields) {
      addFields();
    }
    if (!visitedMethods) {
      addMethods();
    }
    return super.visitMethod(access, name, descriptor, signature, exceptions);
  }

  @Override
  public void visitEnd() {
    if (!visitedFields) {
      addFields();
    }
    if (!visitedMethods) {
      addMethods();
    }
    super.visitEnd();
  }

  private void addFields() {
    visitedFields = true;
    for (String name: constants) {
      visitField(ACC_PUBLIC | ACC_STATIC | ACC_FINAL, name, descriptor, null, null);
    }

    visitField(ACC_PRIVATE | ACC_STATIC | ACC_TRANSIENT, "_ordinal", "I", null, null);
    new int[1].clone();
  }

  private void addMethods() {
    visitedMethods = true;
    implementClinit();
    implement$Init();
    implement$Name(0, 0);
    implement$Values();
  }

  private void implementClinit() {
    MethodVisitor mv = visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);

    mv.visitMaxs(1, 0);
    for (String name : constants) {
      mv.visitMethodInsn(INVOKESTATIC, classname, "$init", "()" + descriptor, false);
      mv.visitFieldInsn(PUTSTATIC, classname, name, descriptor);
    }

    mv.visitMethodInsn(INVOKESTATIC, classname, "$values", "()[" + descriptor, false);
    mv.visitFieldInsn(PUTSTATIC, classname, "$VALUES", "[" + descriptor);
    mv.visitInsn(RETURN);
  }

  private void implement$Init() {
    // static String $init() { return new MyEnum($name(_ordinal), _ordinal++); }
    MethodVisitor mv = visitMethod(ACC_STATIC | ACC_SYNTHETIC | ACC_PRIVATE, "$init",
        "()" + descriptor, null, null);
    mv.visitMaxs(4, 1);
    mv.visitTypeInsn(NEW, classname);
    mv.visitInsn(DUP);
    mv.visitMethodInsn(INVOKESTATIC, classname, "$name", "()Ljava/lang/String;", false);
    mv.visitFieldInsn(GETSTATIC, classname, "_ordinal", "I");
    mv.visitMethodInsn(INVOKESPECIAL, classname, "<init>", "(Ljava/lang/String;I)V", false);
    mv.visitVarInsn(ASTORE,0);

    mv.visitFieldInsn(GETSTATIC, classname, "_ordinal", "I");
    mv.visitInsn(ICONST_1);
    mv.visitInsn(IADD);
    mv.visitFieldInsn(PUTSTATIC, classname, "_ordinal", "I");

    mv.visitVarInsn(ALOAD,0);
    mv.visitInsn(ARETURN);
  }

  private void implement$Name(int min, int suffix) {
    String name = "$name" + (suffix == 0 ? "" : String.valueOf(suffix));
    MethodVisitor mv = visitMethod(ACC_STATIC | ACC_SYNTHETIC | ACC_PRIVATE, name, "()Ljava/lang/String;", null, null);
    mv.visitMaxs(2, 0);
    mv.visitFieldInsn(GETSTATIC, classname, "_ordinal", "I");

    int max = Math.min(min + 8187, constants.length - 1);

    Label next = new Label();
    Label[] labels = new Label[max-min+1];
    for (int i=0;i<labels.length;i++) {
      labels[i]=new Label();
    }

    mv.visitTableSwitchInsn(min, max, next, labels);
    for (int i = min; i <= max; i++) {
      mv.visitFrame(F_SAME, 0, null, 0, new Object[] {});
      mv.visitLabel(labels[i - min]);
      mv.visitLdcInsn(constants[i]);
      mv.visitInsn(ARETURN);
    }

    mv.visitLabel(next);
    mv.visitFrame(F_SAME, 0, null, 0, new Object[] {});
    if (max < constants.length - 1) {
      suffix = suffix == 0 ? 2 : suffix + 1;
      name = "$name" + suffix;
      mv.visitMethodInsn(INVOKESTATIC, classname, "$name" + suffix, "()Ljava/lang/String;", false);
      mv.visitInsn(ARETURN);
      implement$Name(max + 1, suffix);
    } else {
      mv.visitTypeInsn(NEW, "java/lang/AssertionError");
      mv.visitInsn(DUP);
      mv.visitMethodInsn(INVOKESPECIAL, "java/lang/AssertionError", "<init>", "()V", false);
      mv.visitInsn(ATHROW);
    }
  }

  private void implement$Values() {
    MethodVisitor mv = visitMethod(ACC_STATIC | ACC_SYNTHETIC | ACC_PRIVATE, "$values", "()[" + descriptor, null, null);

    mv.visitMaxs(4, 0);
    mv.visitIntInsn(SIPUSH, constants.length);
    mv.visitTypeInsn(ANEWARRAY, classname);

    int len = Math.min(8207, constants.length);
    for (int i = 0; i < len; i++) {
      mv.visitInsn(DUP);
      if (i > 127) {
        mv.visitIntInsn(SIPUSH, i);
      } else if (i > 5) {
        mv.visitIntInsn(BIPUSH, i);
      } else {
        mv.visitInsn(ICONST_0 + i);
      }
      mv.visitFieldInsn(GETSTATIC, classname, constants[i], descriptor);
      mv.visitInsn(AASTORE);
    }

    if (len < constants.length) {
      mv.visitInsn(DUP);
      mv.visitMethodInsn(INVOKESTATIC, classname, "$values_hi", "([" + descriptor + ")V", false);
    }

    mv.visitInsn(ARETURN);

    if (len < constants.length) {
      mv = visitMethod(ACC_STATIC | ACC_SYNTHETIC | ACC_PRIVATE, "$values_hi", "([" + descriptor +")V", null, null);
      mv.visitMaxs(3, 1);
      for (int i = len; i < constants.length; i++) {
        mv.visitVarInsn(ALOAD, 0);
        mv.visitIntInsn(SIPUSH, i);
        mv.visitFieldInsn(GETSTATIC, classname, constants[i], descriptor);
        mv.visitInsn(AASTORE);
      }
      mv.visitInsn(RETURN);
    }
  }

}
/*-
 * #%L
 * FontAwesome Iron Iconset
 * %%
 * Copyright (C) 2019 - 2020 Flowing Code
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import static com.github.javaparser.ast.Modifier.createModifierList;
import static com.github.javaparser.ast.Modifier.Keyword.*;
import static com.github.javaparser.JavaParser.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringWriter;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import net.sf.saxon.TransformerFactoryImpl;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.kohsuke.github.GHContent;
import org.kohsuke.github.GHException;
import org.kohsuke.github.GHFileNotFoundException;
import org.kohsuke.github.GHIOException;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.EnumConstantDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.comments.BlockComment;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.comments.LineComment;
import com.github.javaparser.ast.expr.ArrayInitializerExpr;
import com.github.javaparser.ast.expr.ClassExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.Name;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.SingleMemberAnnotationExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.expr.TypeExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;

/**
 * @author Javier Godoy / Flowing Code
 */
public class IconsetEnumGenerator {

	private static final String PACKAGE_NAME = "com.flowingcode.vaadin.addons.fontawesome";

	private static final String RESOURCE_PATH = "font-awesome-iron-iconset";
	
	private static final String DEMO_URL = "https://fontawesome.com/icons/%2$s?style=%1$s";
	
	private static String tagName;
	
	private static String repositoryName;
	
	private static File sources;
	
	private static File resources;
	
	private static File target;

	private static String npmPackage;
	
	private static String npmVersion;
	private static BlockComment license;
	
	public static void main(String[] args) throws IOException {
		
		repositoryName = "FortAwesome/Font-Awesome"; //the name of repository to be parsed
		tagName = getRequiredProperty("codegen.tag"); //the tag in the repository to be parsed
		target = new File(getRequiredProperty("codegen.target")); //the target directory of this build
		sources = getRequiredDirectory("codegen.sources"); //the location of generated sources
		resources = getRequiredDirectory("codegen.resources"); //the location of generated resources
		
		resources = new File(resources, RESOURCE_PATH);
		resources.mkdirs();
		
		npmPackage = System.getProperty("codegen.npmPackage");
		if (npmPackage!=null) {
			npmVersion = getRequiredProperty("codegen.npmVersion");
		}
		
		license = getLicenseInformation();
		
		System.out.println("Using "+repositoryName+" version "+tagName);
		
		System.out.println("Output sources directory is "+Paths.get(sources.getAbsolutePath()).normalize());
		System.out.println("Output resources directory is "+Paths.get(resources.getAbsolutePath()).normalize());
				
		try {
			execute();
		} catch (GHException|GHIOException|GHFileNotFoundException e) {
			System.err.println(e.getMessage());
			System.exit(1);
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
	
	private static void execute()  throws IOException {	
		//Prefer connecting with authentication since the anonymous quota may be exhausted after a few builds 
		GitHub github;
		try {
			github = GitHub.connect();
		} catch (IOException e) {
			github = GitHub.connectAnonymously();
		}
		
		GHRepository repo = github.getRepository(repositoryName);

		CompilationUnit cu = createCompilationUnit();
		
		process(repo, cu, "far", "sprites/regular.svg");
		process(repo, cu, "fas", "sprites/solid.svg");
		process(repo, cu, "fab", "sprites/brands.svg");
		
		save(cu);
	}
	
	private static void process(GHRepository repo, CompilationUnit cu, String family, String path) throws IOException {
		String enumName = StringUtils.capitalize(path.replaceAll(".*/", "").replaceAll("\\..*", ""));
		File file = convertIconset(repo, family, path);
		List<String> icons = readIconNames(file);
		modularize(file);
		cu.getType(0).addMember(createEnumDeclaration(enumName, family, icons));
	}
	
	
	private static File convertIconset(GHRepository repo, String family, String path) throws IOException {
		File file = new File(resources,family+".js");
		
		try (
			InputStream in = repo.getFileContent(path, tagName).read();	
		    InputStream xslt = new FileInputStream("sprites.xslt");
			OutputStream out = new FileOutputStream(file)
		) {
			String licenseComment = license.getContent().replaceAll("\\*", "").replaceFirst("^-", "");
			Transformer t = new TransformerFactoryImpl().newTransformer(new StreamSource(xslt));
			t.setParameter("family", family);
			t.setParameter("license", licenseComment);
			Result outputTarget = new StreamResult(out);
			t.transform(new StreamSource(in), outputTarget);
		} catch (TransformerException e) {
			throw new IOException(e);
		}
		
		return file;		
	}
	
	private static List<String> readIconNames(File file) throws IOException {
		try (
			InputStream in = new FileInputStream(file);
			InputStream xslt = new FileInputStream("icons.xslt")
		) {
			StringWriter out = new StringWriter();
			Transformer t = new TransformerFactoryImpl().newTransformer(new StreamSource(xslt));
			Result outputTarget = new StreamResult(out);
			t.transform(new StreamSource(in), outputTarget);
			return Arrays.asList(out.toString().split(";"));
		} catch (TransformerException e) {
			throw new IOException(e);
		}
	}
	
	private static void modularize(File file) throws IOException {
		File dst = new File(file.getParent(), file.getName()+".2");
		try (
			InputStream in = new FileInputStream(file);
			InputStream xslt = new FileInputStream("modularize.xslt");
			OutputStream out = new FileOutputStream(dst)
		) {
			Transformer t = new TransformerFactoryImpl().newTransformer(new StreamSource(xslt));
			Result outputTarget = new StreamResult(out);
			t.transform(new StreamSource(in), outputTarget);
		} catch (TransformerException e) {
			throw new IOException(e);
		}
		file.delete();
		dst.renameTo(file);
	}
	
	private static CompilationUnit createCompilationUnit() throws FileNotFoundException {
		CompilationUnit cu = new CompilationUnit();
		cu.setPackageDeclaration(PACKAGE_NAME);
		cu.addImport("com.vaadin.flow.component.icon.IronIcon");
		cu.addImport("com.vaadin.flow.component.dependency.JsModule");
		cu.addImport("com.vaadin.flow.component.dependency.NpmPackage");
		cu.addImport("com.vaadin.flow.component.ClickEvent");
		cu.addImport("com.vaadin.flow.component.ClickNotifier");
		cu.addImport("com.vaadin.flow.component.ComponentEventListener");
		cu.addImport("java.util.Locale");
		
		ClassOrInterfaceDeclaration type = new ClassOrInterfaceDeclaration();
		type.setName("FontAwesome");
		type.addModifier(PUBLIC, FINAL);
		//icon.setJavadocComment(new JavadocComment(String.format("Server side component for {@code %s}", decl.getName())));
		type.setJavadocComment(new JavadocComment(
				Stream.of(
					String.format("FontAwesome %s icons.", tagName),
					"@author Javier Godoy / Flowing Code"
				).collect(Collectors.joining("\n"))));
		
		type.addAnnotation(new SingleMemberAnnotationExpr(new Name("SuppressWarnings"), 
				new ArrayInitializerExpr(new NodeList<>(
					new StringLiteralExpr("squid:S4784"),
					new StringLiteralExpr("squid:S00115")
				))
		));
		cu.addType(type);
		
		return cu;
	}
	
	
	private static EnumDeclaration createEnumDeclaration(String enumName, String iconset, List<String> icons) {
	 	EnumDeclaration decl = new EnumDeclaration();
	 	decl.setName(enumName);
	 	decl.addModifier(PUBLIC);
		//decl.addImplementedType("IronIconEnum");
		
		decl.setJavadocComment(new JavadocComment(
			Stream.of(
				String.format("Enumeration of all icons in the FontAwesome %s iconset", enumName.toLowerCase(Locale.ENGLISH)),
				"<p>",
				"These instances can be used to create {@link IronIcon} components either by using",
				"their {@link #create()} method or by passing them to Icon's constructor.",
				"",
				"@author Javier Godoy / Flowing Code"
			).collect(Collectors.joining("\n"))
		));
						
		boolean hasUnderscorePrefix = false;
		for (String icon : icons) {
			String name = icon.toUpperCase(Locale.ENGLISH).replace("-", "_");
			boolean thisHasUnderscorePrefix = false;
			if (!Character.isJavaIdentifierStart(name.charAt(0)) || name.equals("ICONSET")) {
				name = "_"+name;
				hasUnderscorePrefix = thisHasUnderscorePrefix = true;
			}
			
			String seeExample = "See <a href='"+DEMO_URL+"'>example</a>";
			
			EnumConstantDeclaration constant = decl.addEnumConstant(name);
			constant.setJavadocComment(new JavadocComment(String.format("The %1$s %2$s icon."+seeExample, enumName.toLowerCase(Locale.ENGLISH), icon)));			
		}

		String componentName = repositoryName.split("/",2)[1];
		String url = "./"+RESOURCE_PATH+"/"+iconset+".js"; 
		

		decl.addFieldWithInitializer("String", "ICONSET", new StringLiteralExpr(iconset), PUBLIC, STATIC, FINAL)
			.setJavadocComment(new JavadocComment(String.format("The Iconset name, i.e. {@code \"%s\"}.\"",iconset)));

		MethodDeclaration getIconName = decl.addMethod("getIconName", PUBLIC);
		getIconName.setJavadocComment(new JavadocComment(String.format("Return the icon name.\n@return the icon name, i.e. {@code \"%s:name\"}..",iconset)));
		getIconName.setType("String");
		getIconName.getBody().get().addStatement(new ReturnStmt("ICONSET+':'+getIconPart()"));

		String removeUnderscorePrefix = hasUnderscorePrefix?".replaceFirst(\"^-\", \"\")":"";
		MethodDeclaration getIconPart = decl.addMethod("getIconPart", PRIVATE);
		getIconPart.setType("String");
		getIconPart.getBody().get().addStatement(new ReturnStmt("this.name().toLowerCase(Locale.ENGLISH).replace('_', '-')"+removeUnderscorePrefix));
				
		MethodDeclaration create = decl.addMethod("create", PUBLIC);
		create.setJavadocComment(new JavadocComment("Create a new {@link IronIcon} instance with the icon determined by the name.\n@return a new instance of {@link IronIcon} component"));
		create.setType("Icon");
		create.getBody().get().addStatement(new ReturnStmt("new Icon(this.getIconPart())"));

		create = decl.addMethod("create", PUBLIC);
		create.setJavadocComment(new JavadocComment("Create a new {@link IronIcon} instance with the icon determined by the name and a listener for click events.\n"
				+ "@param listener the event listener for click events\n"
				+ "@return a new instance of {@link IronIcon} component"));
		create.setType("Icon");
		create.addParameter("ComponentEventListener<ClickEvent<IronIcon>>", "listener");
		create.getBody().get().addStatement(parseStatement("Icon icon = create();"));
		create.getBody().get().addStatement(parseStatement("icon.addClickListener(listener);"));
		create.getBody().get().addStatement(new ReturnStmt("icon"));
		
		//create a server side component for the iconset
		ClassOrInterfaceDeclaration icon = new ClassOrInterfaceDeclaration();
		icon.setName("Icon");
		icon.addModifier(PUBLIC, STATIC, FINAL);
		icon.addExtendedType("IronIcon");
		icon.addImplementedType("ClickNotifier<IronIcon>");
		icon.setJavadocComment(new JavadocComment(String.format("Server side component for {@code %s}", decl.getName())));
		icon.addSingleMemberAnnotation("JsModule", new StringLiteralExpr(url));
		
		icon.addAndGetAnnotation("NpmPackage")
			.addPair("value", new StringLiteralExpr(npmPackage))
			.addPair("version", new StringLiteralExpr(npmVersion));	
		icon.addSingleMemberAnnotation("SuppressWarnings", new StringLiteralExpr("serial"));		
		decl.addMember(icon);
		
		ConstructorDeclaration ctor = icon.addConstructor(PACKAGE_PRIVATE);
		ctor.addParameter("String", "icon");
		ctor.getBody().addStatement(new MethodCallExpr("super", new NameExpr("ICONSET"), new NameExpr("icon")));
		
		return decl;
	}
	
	private static void save(CompilationUnit cu) throws FileNotFoundException {
		File pkgDirectory = new File(sources, PACKAGE_NAME.replace('.', '/'));
		pkgDirectory.mkdirs();
		
		PrintStream ps = new PrintStream(new FileOutputStream(new File(pkgDirectory,cu.getType(0).getName()+".java")));
		ps.println(license);
		ps.print(cu);
		ps.close();
	}
		
	private static BlockComment getLicenseInformation() throws IOException {
		CompilationUnit cu = JavaParser.parse(new File("TemplateLicense.java"));
		return (BlockComment)cu.getOrphanComments().get(0);
	}
}

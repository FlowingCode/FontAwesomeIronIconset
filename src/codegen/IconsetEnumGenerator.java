/*-
 * #%L
 * FontAwesome Iron Iconset
 * %%
 * Copyright (C) 2019 - 2022 Flowing Code
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


import static com.github.javaparser.ast.Modifier.Keyword.*;
import static com.github.javaparser.JavaParser.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringWriter;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;

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
import com.github.javaparser.ast.expr.ArrayInitializerExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.Name;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.SingleMemberAnnotationExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.stmt.ReturnStmt;

import net.sf.saxon.TransformerFactoryImpl;

/**
 * @author Javier Godoy / Flowing Code
 */
public class IconsetEnumGenerator {

	private static final String PACKAGE_NAME = "com.flowingcode.vaadin.addons.fontawesome";

	private static final String RESOURCE_PATH = "font-awesome-iron-iconset";

	private static final String DEMO_URL5 = "https://fontawesome.com/%3$sicons/%2$s?style=%1$s";
	 
	private static final String DEMO_URL6 = "https://fontawesome.com/%3$sicons/%2$s";

	private static String fontAwesomeVersion;

	private static File sources;

	private static File resources;

	private static File sprites;
	
	private static File download;

	private static String npmPackage;

	private static String npmVersion;

	private static BlockComment license;

	@SuppressWarnings("serial")
	private static final Map<String,String> mappings = new LinkedHashMap<String,String>() {{
		put("far", "regular.svg");
		put("fas", "solid.svg");
		put("fab", "brands.svg");
		put("fal", "light.svg");
		put("fad", "duotone.svg");
		put("thin", "thin.svg");
	}};

	public static void main(String[] args) throws IOException {
		fontAwesomeVersion = getRequiredProperty("codegen.tag"); //the version to be mentioned in the documentation
		sprites = new File(getRequiredProperty("codegen.sprites")); //the location of the SVG sprites
		sources = getRequiredDirectory("codegen.sources"); //the location of generated sources
		resources = getRequiredDirectory("codegen.resources"); //the location of generated resources

		resources = new File(resources, RESOURCE_PATH);
		resources.mkdirs();
		
		if (!sprites.isDirectory()) {
			System.err.println(sprites+ "does not exist or is not a directory");
			System.exit(1);
		}

		boolean embedded = Boolean.parseBoolean(getRequiredProperty("codegen.embedded"));
		if (!embedded) {
			npmPackage = System.getProperty("codegen.npmPackage");
			if (npmPackage!=null) {
				npmVersion = getRequiredProperty("codegen.npmVersion");
			}
		}

		license = getLicenseInformation();

		System.out.println("Sprites directory is "+Paths.get(sprites.getAbsolutePath()).normalize());
		System.out.println("Output sources directory is "+Paths.get(sources.getAbsolutePath()).normalize());
		System.out.println("Output resources directory is "+Paths.get(resources.getAbsolutePath()).normalize());

		execute();
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
		boolean found = false;
		CompilationUnit cu = createCompilationUnit();
		for (Map.Entry<String,String> e:mappings.entrySet())  {
			File file = new File(sprites, e.getValue());
			if (file.exists()) {
				String family = e.getKey();
				process(cu, family, file);
				found = true;
			}
		}
		if (!found) {
			System.err.println("No sprites found in "+sprites);
			System.exit(1);
		}
		save(cu);
	}

	private static void process(CompilationUnit cu, String family, File sprites) throws IOException {
		String enumName = StringUtils.capitalize(FilenameUtils.getBaseName(sprites.getName()));		
		System.out.println(String.format("Generate %s icons (%s)", enumName, family));
		File iconset = convertIconset(family, sprites);
		List<String> icons = readIconNames(iconset);
		modularize(iconset);
		cu.getType(0).addMember(createEnumDeclaration(enumName, family, icons));
	}


	private static File convertIconset(String family, File sprites) throws IOException {
		File file = new File(resources, family+".js");

		try (
			InputStream in   = new FileInputStream(sprites);
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
		cu.addImport("com.vaadin.flow.component.dependency.JsModule");
		if (npmPackage!=null) {
			cu.addImport("com.vaadin.flow.component.dependency.NpmPackage");
		}
		cu.addImport("com.vaadin.flow.component.icon.IconFactory");
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
					String.format("FontAwesome %s icons.", fontAwesomeVersion),
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
		decl.addImplementedType("IconFactory");

		decl.setJavadocComment(new JavadocComment(
			Stream.of(
				String.format("Enumeration of all icons in the FontAwesome %s iconset", enumName.toLowerCase(Locale.ENGLISH)),
				"<p>",
				"These instances can be used to create {@link Icon} components either by using",
				"their {@link #create()} method or by passing them to Icon's constructor.",
				"",
				"@author Javier Godoy / Flowing Code"
			).collect(Collectors.joining("\n"))
		));

		boolean hasUnderscorePrefix = false;
		for (String icon : icons) {
			String name = icon.toUpperCase(Locale.ENGLISH).replace("-", "_");
			if (!Character.isJavaIdentifierStart(name.charAt(0)) || name.equals("ICONSET")) {
				name = "_"+name;
				hasUnderscorePrefix = true;
			}

			String demoUrl;
			if (fontAwesomeVersion.startsWith("5")) {
				demoUrl = DEMO_URL5;
			} else {
				demoUrl = DEMO_URL6;
			}
			
			String seeExample = "See <a href='"+demoUrl+"'>example</a>";
			
			String version = "v"+fontAwesomeVersion.replaceFirst("^\\D*(\\d+\\.\\d+).*", "$1/");
			EnumConstantDeclaration constant = decl.addEnumConstant(name);
			constant.setJavadocComment(new JavadocComment(String.format("The %1$s %2$s icon."+seeExample, enumName.toLowerCase(Locale.ENGLISH), icon, version)));
		}

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
		create.setJavadocComment(new JavadocComment("Create a new {@link Icon} instance with the icon determined by the name.\n@return a new instance of {@link Icon} component"));
		create.setType("Icon");
		create.getBody().get().addStatement(new ReturnStmt("new Icon(this.getIconPart())"));

		create = decl.addMethod("create", PUBLIC);
		create.setJavadocComment(new JavadocComment("Create a new {@link Icon} instance with the icon determined by the name and a listener for click events.\n"
				+ "@param listener the event listener for click events\n"
				+ "@return a new instance of {@link Icon} component"));
		create.setType("Icon");
		create.addParameter("ComponentEventListener<ClickEvent<com.vaadin.flow.component.icon.Icon>>", "listener");
		create.getBody().get().addStatement(parseStatement("Icon icon = create();"));
		create.getBody().get().addStatement(parseStatement("icon.addClickListener(listener);"));
		create.getBody().get().addStatement(new ReturnStmt("icon"));

		//create a server side component for the iconset
		ClassOrInterfaceDeclaration icon = new ClassOrInterfaceDeclaration();
		icon.setName("Icon");
		icon.addModifier(PUBLIC, STATIC, FINAL);
		icon.addExtendedType("com.vaadin.flow.component.icon.Icon");
		icon.addImplementedType("ClickNotifier<com.vaadin.flow.component.icon.Icon>");
		icon.setJavadocComment(new JavadocComment(String.format("Server side component for {@code %s}", decl.getName())));
		icon.addSingleMemberAnnotation("JsModule", new StringLiteralExpr(url));

		if (iconset.equals("fad")) {
			icon.addSingleMemberAnnotation("JsModule", new StringLiteralExpr("./font-awesome-duotone/duotone.js"));
			icon.addSingleMemberAnnotation("com.vaadin.flow.component.Tag", new StringLiteralExpr("duotone-icon"));
		}

		if (npmPackage!=null) {
			icon.addAndGetAnnotation("NpmPackage")
				.addPair("value", new StringLiteralExpr(npmPackage))
				.addPair("version", new StringLiteralExpr(npmVersion));
		}
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

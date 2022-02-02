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


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Optional;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.StringBuilderWriter;
import org.apache.commons.lang3.StringUtils;
import org.kohsuke.github.GHException;
import org.kohsuke.github.GHFileNotFoundException;
import org.kohsuke.github.GHIOException;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import net.sf.saxon.TransformerFactoryImpl;
/**
 * @author Javier Godoy / Flowing Code
 */
public class BuildSprites {

	private static String tagName;

	private static String repositoryName;

	private static File spritesDirectory;
	
	private static File iconsDirectory;
	

	public static void main(String[] args) throws IOException {
		
		iconsDirectory = new File(getRequiredProperty("codegen.icons")); //the location of the icons
		spritesDirectory = new File(getRequiredProperty("codegen.sprites")); //the location of the sprites
		
		if (!iconsDirectory.exists()) {
		  System.out.println("Skipping build-sprites phase");
		  return;
		}
		
		createDirectory(spritesDirectory);

		execute();
		
	}

	private static String getRequiredProperty(String name) {
      return Optional.ofNullable(System.getProperty(name)).orElseThrow(()->new NoSuchElementException("Missing system property -D"+name));
    }
	
	private static File createDirectory(File directory) {
      if (!directory.isDirectory()&&!directory.mkdir()) {
          System.err.println("Output directory "+directory+" does not exist and cannot be created");
          System.exit(1);
      }
      return directory;
    }
	
	private static void execute() throws IOException {	  
	   for (File directory : iconsDirectory.listFiles(File::isDirectory)) {
	     String family = directory.getName();
	     File files[] = directory.listFiles(file->file.getName().endsWith(".svg"));
	     if (files.length==0) continue;
	     
	     System.out.println("Creating sprite for " + family+ " ("+files.length+" icons)");
	     
	     StringBuilderWriter out = new StringBuilderWriter(); 
	     out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n");
	     out.write("<svg xmlns=\"http://www.w3.org/2000/svg\">\r\n");
	     
	     for (File file: files) {
	       String data = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
	       data = data.replace("<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">", "");
	       data = data.replace("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>", "");
	       String name = FilenameUtils.getBaseName(file.getName());
	       out.write("<symbol id=\""+ name +"\">\r\n");
	       out.write(data);
	       out.write("\r\n</symbol>\r\n");
	     }
	     out.write("</svg>");
	     
	     File iconset = new File(spritesDirectory, family+".svg");
	     FileUtils.writeStringToFile(iconset, out.toString(), StandardCharsets.UTF_8);
	     transform(iconset);	     
	   }
	}
	
	private static void transform(File file) throws IOException {
      File dst = new File(file.getParent(), file.getName()+".2");
      try (
          InputStream in = new FileInputStream(file);
          InputStream xslt = new FileInputStream("build-sprites.xslt");
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

}

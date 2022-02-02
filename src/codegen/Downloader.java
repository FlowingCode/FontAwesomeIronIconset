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


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.kohsuke.github.GHException;
import org.kohsuke.github.GHFileNotFoundException;
import org.kohsuke.github.GHIOException;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

/**
 * @author Javier Godoy / Flowing Code
 */
public class Downloader {

	private static String tagName;

	private static String repositoryName;

	private static File spritesDirectory;

	public static void main(String[] args) throws IOException {

		if (Boolean.parseBoolean(System.getProperty("codegen.skipDownload"))) {
			System.out.println("Skipping download phase");
			return;
		}
		
		repositoryName = "FortAwesome/Font-Awesome"; //the name of repository to be parsed
		tagName = getRequiredProperty("codegen.tag"); //the tag in the repository to be parsed
		spritesDirectory = new File(getRequiredProperty("codegen.sprites")); //the location of the downloaded sprites
		createDirectory(spritesDirectory);

		System.out.println("Using "+repositoryName+" version "+tagName);
		System.out.println("Downloading sources to "+Paths.get(spritesDirectory.getAbsolutePath()).normalize());

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

	private static File createDirectory(File directory) {
		if (!directory.isDirectory()&&!directory.mkdir()) {
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


		download(repo, "regular.svg");
		download(repo, "solid.svg");
		download(repo, "brands.svg");
	}

	private static void download(GHRepository repo, String filename) throws IOException {
		String path = "sprites/"+filename;
		File file = new File(spritesDirectory, filename);
		try (
			InputStream in = repo.getFileContent(path, tagName).read();
		) {
			FileUtils.copyToFile(in, file);
			System.out.println("Downloaded "+path);
		}
	}

}

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

	private static File target;

	public static void main(String[] args) throws IOException {

		repositoryName = "FortAwesome/Font-Awesome"; //the name of repository to be parsed
		tagName = getRequiredProperty("codegen.tag"); //the tag in the repository to be parsed
		target = new File(getRequiredProperty("codegen.target"), "download"); //the target directory of this build
		createDirectory(target);

		System.out.println("Using "+repositoryName+" version "+tagName);
		System.out.println("Downloading sources to "+Paths.get(target.getAbsolutePath()).normalize());

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
		File file = new File(target, filename);
		try (
			InputStream in = repo.getFileContent(path, tagName).read();
		) {
			FileUtils.copyToFile(in, file);
			System.out.println("Downloaded "+path);
		}
	}

}

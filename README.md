[![Build Status](https://jenkins.flowingcode.com/job/FontAwesomeIronIconset-14-addon/badge/icon)](https://jenkins.flowingcode.com/job/FontAwesomeIronIconset-14-addon)

# Iron iconset based on FontAwesome

Integration of FontAwesome and vaadin-icon for Vaadin 10+

## Versions

- **Version 1.0.4** (based on FontAwesome 5.11.2) is compatible with Vaadin 10-13 and Vaadin 14 in bower mode. 
- **Version 2.2.2** (based on FontAwesome 5.15.4) is compatible with Vaadin 14+ in npm mode.
- **Version 3.0.x** (based on the latest version of FontAwesome 6, using polymer `iron-icon`) is compatible with Vaadin 14+ in npm mode.
- **Version 4.1.x** (based on the latest version of FontAwesome 6, using `vaadin-icon`) is compatible with Vaadin 23.

For details on which version of FontAwesome is used by each release of this addon, see the [Release Notes](https://github.com/FlowingCode/FontAwesomeIronIconset/releases)

If you want to use Font Awesome Pro icons with this addon, see [here](#integration-with-font-awesome-pro)

## Online demo

[Online demo here](http://addonsv14.flowingcode.com/font-awesome-iron-iconset)

## Download release

[Available in Vaadin Directory](https://vaadin.com/directory/component/fontawesome-iron-iconset)

[Available in npm.js](https://www.npmjs.com/package/@flowingcode/font-awesome-iron-iconset) (since 2.1.0)

### Maven install

Add the following dependencies in your pom.xml file:

```xml
<dependency>
   <groupId>com.flowingcode.addons</groupId>
   <artifactId>font-awesome-iron-iconset</artifactId>
   <version>X.Y.Z</version>
</dependency>
```
<!-- the above dependency should be updated with latest released version information -->

```xml
<repository>
   <id>vaadin-addons</id>
   <url>https://maven.vaadin.com/vaadin-addons</url>
</repository>
```

For SNAPSHOT versions see [here](https://maven.flowingcode.com/snapshots/).

## Building and running demo

- git clone repository
- mvn clean install jetty:run

To see the demo, navigate to http://localhost:8080/

## Issue tracking

The issues for this add-on are tracked on its github.com page. All bug reports and feature requests are appreciated. 

## Contributions

Contributions are welcome, but there are no guarantees that they are accepted as such. 

As first step, please refer to our [Development Conventions](https://github.com/FlowingCode/DevelopmentConventions) page to find information about Conventional Commits & Code Style requeriments.

Then, follow these steps for creating a contibution:

- Fork this project.
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- For commit message, use [Conventional Commits](https://github.com/FlowingCode/DevelopmentConventions/blob/main/conventional-commits.md) to describe your change.
- Send a pull request for the original project.
- Comment on the original issue that you have implemented a fix for it.

## License & Author

Add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.
FontAwesomeIronIconset Addon is written by Flowing Code S.A.

Font Awesome Free 5.13.0 by @fontawesome is distributed under CC BY 4.0 license. For license terms see THIRD-PARTY.txt


# Developer Guide

## Using the icons

- Use the `create` method from the enum type, for instantiating a new `Icon` component based on that icon. There is an enum type for each font family (solid, regular and brands)

```
add(new Button("SAVE", FontAwesome.Solid.SAVE.create()));
```

- You can also use the enumerated value for obtaining the qualified icon name (e.g. `fas:plane-departure`), that can be set in the `icon` attribute of the `vaadin-icon` element. This can be helpful if you are writing a template renderer, such as:

```
	grid.addColumn(LitRenderer.<Flight>of(
	   "<vaadin-icon icon='"+FontAwesome.Solid.PLANE_DEPARTURE+"'></vaadin-icon>${item.takeoff_time}"
	).withProperty("takeoff_time", Flight::getTakeOffTime));
```

In this latter case, you'll need to import the corresponding iconset:
```
@Uses(FontAwesome.Solid.Icon.class)
```

- Use in a Lit or Polymer template:

```
import '@vaadin/vaadin-icon/vaadin-icon.js';
import '@flowingcode/font-awesome-iron-iconset/fab.js';
```

```
<vaadin-icon icon="fab:font-awesome" style="width: 48px; height: 48px"></vaadin-icon>
```

## Special configuration when using Spring

By default, Vaadin Flow only includes ```com/vaadin/flow/component``` to be always scanned for UI components and views. For this reason, the addon might need to be whitelisted in order to display correctly. 

To do so, just add ```com.flowingcode``` to the ```vaadin.whitelisted-packages``` property in ```src/main/resources/application.properties```, like:

```vaadin.whitelisted-packages = com.vaadin,org.vaadin,dev.hilla,com.flowingcode```
 
More information on Spring whitelisted configuration [here](https://vaadin.com/docs/latest/integrations/spring/configuration/#configure-the-scanning-of-packages).
## Integration with Font Awesome Pro

Because of Font Awesome Pro [license terms](https://fontawesome.com/license#what-creators-may-do), the Pro icons cannot published as part of an open source addon. 
However, if you have a Font Awesome Pro license, you can recompile this addon in order to embed the Pro Icons. 

This process will:
- Update the enumerations so that they define constants for the additional Pro Icons
- Create new enumerations for the Ligth and Duotone icon families.
- Embed the Pro Icons as `vaadin-iconset`.

The JAR created in this way will include a copy of the Font Awesome Pro icons, thus it will be subject to the Font Awesome Pro restrictions. You'll need to install it locally or make it available from your internal artifact repository. 
 
1. Checkout a copy of this project: `git clone git@github.com:FlowingCode/FontAwesomeIronIconset.git`
2. Download Font Awesome Pro SVG sprites into `src/main/sprites` OR Font Awesome Pro SVG icons into `/src/main/icons` (`/src/main/icons/solid`, `/src/main/icons/regular`, etc.)
3. Modify the groupId, artifactId and version in the `pom.xml` file.
4. Modify the following properties in the `pom.xml` file:
```
<fontawesome.version>Pro 5.13.1</fontawesome.version>
<project.build.generatedResources>${project.basedir}/src/main/resources/META-INF/resources/frontend</project.build.generatedResources>
<codegen.sprites>${project.basedir}/src/main/sprites</codegen.sprites>
<codegen.skipDownload>true</codegen.skipDownload>
<codegen.embedded>true</codegen.embedded>
```
5. Execute `mvn -Pgenerate clean package`. The code generation process will use the sprites provided in `/src/main/sprites/` (it will not check out Font Awesome Free), and resources will be embedded in the JAR file instead of being available as npm dependencies (the properties `npm.package` and `npm.version` will be ignored).

If you want to import the JS iconset from a Polymer Template when using the integration with Font Awesome Pro, the js module is  
`@vaadin/flow-frontend/font-awesome-iron-iconset/fab.js` instead of `@flowingcode/font-awesome-iron-iconset/fab.js` (you'll need to execute the `mvn vaadin:prepare-frontend` on your project in order to extract the module from the JAR file).

[Duotone styling](https://blog.fontawesome.com/introducing-duotone) is based on CSS variables (`--fa-primary-color`, `--fa-primary-opacity`, `--fa-secondary-color`, and `--fa-secondary-opacity`) that are applied to the `<duotone-icon>`. When importing the iconset from a Polymer Template, you'll also need `@vaadin/flow-frontend/font-awesome-duotone/duotone.js` in addition to `@vaadin/flow-frontend/font-awesome-iron-iconset/fad.js`.

When compiling icons for FontAwesome Pro 6 you need to need to use at least JDK 15. This is because of a [limitation](https://bugs.openjdk.java.net/browse/JDK-8241798) in the maximum number of constants allowed in an enum compiled by javac with earlier JDKs.
 This only affects the generated bytecode: the compatibility level remains 11 so that the library is still compatible with Java 11 (or Java 8 if using version 3.x of this addon).
 
 

[![Build Status](https://jenkins.flowingcode.com/job/FontAwesomeIronIconset-addon/badge/icon)](https://jenkins.flowingcode.com/job/FontAwesomeIronIconset-addon)

# Iron iconset based on FontAwesome

Integration of FontAwesome and iron-icon for Vaadin 10+

## Online demo

[Online demo here](http://addonsv10.flowingcode.com/font-awesome-iron-iconset)

## Building and running demo

- git clone repository
- mvn clean install jetty:run

To see the demo, navigate to http://localhost:8080/

## Release notes

- **Version 1.0.0** Initial Version (based on FontAwesome 5.9.0)

## Issue tracking

The issues for this add-on are tracked on its github.com page. All bug reports and feature requests are appreciated. 

## Contributions

Contributions are welcome, but there are no guarantees that they are accepted as such. Process for contributing is the following:

- Fork this project
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- Refer to the fixed issue in commit
- Send a pull request for the original project
- Comment on the original issue that you have implemented a fix for it

## License & Author

Add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.
IronFontAwesome Addon is written by Flowing Code S.A.

Font Awesome Free 5.9.0 by @fontawesome is distributed under CC BY 4.0 license. For license terms see THIRD-PARTY.txt


# Developer Guide

## Using the icons

- Use the `create` method from the enum type, for instantiating a new `IronIcon` component based on that icon. There is an enum type for each font family (solid, regular and brands)
```
add(new Button("SAVE", FontAwesome.Solid.SAVE.create()));
```

- You can also use the enumerated value for obtaining the qualified icon name (e.g. `fas:plane-departure`), that can be set in the `icon` attribute of the `iron-icon` element. This can be helpful if you are writing a template renderer, such as:
```
	grid.addColumn(TemplateRenderer.<Flight>of(
	   "<iron-icon icon='"+FontAwesome.Solid.PLANE_DEPARTURE+"'></iron-icon>[[item.takeoff_time]]"
	).withProperty("takeoff_time", Flight::getTakeOffTime));
```

## Code generation

For recreating the sources, you need to activate the `generate` maven profile (i.e. `mvn -Pgenerate compile`). This will download the SVG icons from github, and run the code generator (`IconsetEnumGenerator`). The resulting Java enums will be written into `src/main/generated` and the HTML iconsets will be written into `src/main/resources`.

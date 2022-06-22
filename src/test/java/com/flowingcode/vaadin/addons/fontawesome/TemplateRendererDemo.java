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
package com.flowingcode.vaadin.addons.fontawesome;

import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.data.renderer.LitRenderer;
import com.vaadin.flow.data.renderer.TemplateRenderer;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
@Uses(FontAwesome.Solid.Icon.class)
@Uses(FontAwesome.Regular.Icon.class)
@Uses(FontAwesome.Brands.Icon.class)
public class TemplateRendererDemo extends VerticalLayout {

	public TemplateRendererDemo() {
		Grid<Person> grid = new Grid<>();
		grid.setItems(List.of(
	        new Person(100, "Lucas Kane", 68),
	        new Person(101, "Peter Buchanan", 38),
	        new Person(102, "Samuel Lee", 53),
	        new Person(103, "Anton Ross", 37),
	        new Person(104, "Aaron Atkinson", 18),
	        new Person(105, "Jack Woodward", 28)));

		grid.addColumn(LitRenderer.<Person>of(
				"<vaadin-icon icon='" + FontAwesome.Solid.CIRCLE_CHECK.getIconName() + "'></vaadin-icon>[[item.id]]")
				.withProperty("id", Person::getId)).setHeader("ID");
		grid.addColumn(LitRenderer.<Person>of(
				"<vaadin-icon icon='" + FontAwesome.Regular.KEYBOARD.getIconName() + "'></vaadin-icon>[[item.name]]")
				.withProperty("name", Person::getName)).setHeader("Name");
		grid.addColumn(LitRenderer.<Person>of(
				"<vaadin-icon icon='" + FontAwesome.Brands.VAADIN.getIconName() + "'></vaadin-icon>[[item.age]]")
				.withProperty("age", Person::getAge)).setHeader("Age");

		add(grid);
	}

	private class Person {
		int id;
		String name;
		int age;
		public Person(int id, String name, int age) {
			this.id = id;
			this.name = name;
			this.age = age;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setFirstName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	}
}

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

import com.flowingcode.vaadin.addons.DemoLayout;
import com.flowingcode.vaadin.addons.GithubBranch;
import com.flowingcode.vaadin.addons.GithubLink;
import com.flowingcode.vaadin.addons.demo.TabbedDemo;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.router.ParentLayout;
import com.vaadin.flow.router.Route;

@SuppressWarnings("serial")
@Uses(FontAwesome.Regular.Icon.class)
@Uses(FontAwesome.Solid.Icon.class)
@Uses(FontAwesome.Brands.Icon.class)
@StyleSheet("context://frontend/styles/font-awesome/demo-styles.css")
@CssImport(value = "./styles/vaadin-button.css", themeFor = "vaadin-button")
@ParentLayout(DemoLayout.class)
@Route("font-awesome-iron-iconset")
@GithubLink("https://github.com/FlowingCode/FontAwesomeIronIconset")
@GithubBranch("4.x")
public class FontawesomeDemoView extends TabbedDemo {

	public FontawesomeDemoView() {
		addDemo(IconsGalleryView.class);
		addDemo(SimpleDemo.class);
		addDemo(LitRendererDemo.class);
		setSizeFull();
	}
}

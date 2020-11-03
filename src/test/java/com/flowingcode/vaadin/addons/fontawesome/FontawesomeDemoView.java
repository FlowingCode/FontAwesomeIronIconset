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
package com.flowingcode.vaadin.addons.fontawesome;

import com.flowingcode.vaadin.addons.DemoLayout;
import com.flowingcode.vaadin.addons.demo.impl.TabbedDemoImpl;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@SuppressWarnings("serial")
@Uses(FontAwesome.Regular.Icon.class)
@Uses(FontAwesome.Solid.Icon.class)
@Uses(FontAwesome.Brands.Icon.class)
@StyleSheet("context://frontend/styles/font-awesome/demo-styles.css")
@CssImport(value = "./styles/vaadin-button.css", themeFor = "vaadin-button")
@Route(value = "font-awesome-iron-iconset", layout = DemoLayout.class)
public class FontawesomeDemoView extends VerticalLayout {

	private static final String GALLERY_DEMO = "Icons Gallery";
	private static final String SIMPLE_DEMO = "Simple Demo";
	private static final String TEMPLATERENDERER_DEMO = "Template Renderer";
	private static final String SIMPLE_SOURCE = "https://github.com/FlowingCode/FontAwesomeIronIconset/blob/master/src/test/java/com/flowingcode/vaadin/addons/fontawesome/SimpleDemo.java";
	private static final String TEMPLATERENDERER_SOURCE = "https://github.com/FlowingCode/FontAwesomeIronIconset/blob/master/src/test/java/com/flowingcode/vaadin/addons/fontawesome/TemplateRendererDemo.java";

	public FontawesomeDemoView() {
		TabbedDemoImpl<IconsGalleryView> faDemo = new TabbedDemoImpl<>(new IconsGalleryView(), GALLERY_DEMO, null);
		faDemo.addDemo(new SimpleDemo(), SIMPLE_DEMO, SIMPLE_SOURCE);
		faDemo.addDemo(new TemplateRendererDemo(), TEMPLATERENDERER_DEMO, TEMPLATERENDERER_SOURCE);
		setSizeFull();
		add(faDemo);
	}
}

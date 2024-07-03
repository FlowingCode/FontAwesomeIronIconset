/*-
 * #%L
 * FontAwesome Iron Iconset
 * %%
 * Copyright (C) 2019 - 2023 Flowing Code
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

import com.flowingcode.vaadin.addons.demo.DemoSource;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

/**
 * @author Javier Godoy / Flowing Code
 */
@DemoSource
@PageTitle("Basic Demo")
@Route(value = "font-awesome-iron-iconset/simple", layout = FontawesomeDemoView.class)
@SuppressWarnings("serial")
public class SimpleDemo extends VerticalLayout {

	public SimpleDemo() {
		
		//add a button with an iron icon
		add(new Button("Save", FontAwesome.Regular.FLOPPY_DISK.create(), ev->{
			Notification.show("Saved!");
		}));
				
	}

}

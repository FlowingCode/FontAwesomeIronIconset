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

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

@SuppressWarnings("serial")
public class IconsGalleryView extends Div {

	// this demo uses reflection, for a simple example that does not use reflection
	// see SimpleDemoView
	private static final Map<UI, String> searchString = new WeakHashMap<>();

	private final List<Map<String, Component>> icons = new ArrayList<>();
	private final List<Pair<H4, FlexLayout>> layouts = new ArrayList<>();
	private final Div noResults = new Div(new Span("Your search did not match any icons."));

	{
		TextField filter = new TextField();
		filter.setValueChangeMode(ValueChangeMode.EAGER);
		filter.setWidth("100%");
		filter.addValueChangeListener(ev -> this.applyFilter(filter.getValue()));
		filter.setPlaceholder("Search icons");
		add(filter);

		setSizeUndefined();
		addClassName("main-icon-view");

		getIconTypes().forEach(type -> {
			FlexLayout layout = new FlexLayout();
			layout.addClassName("flex");
			H4 h4 = new H4("FontAwesome " + type.getSimpleName());
			add(h4, layout);
			layouts.add(Pair.of(h4, layout));

			Map<String, Component> icons = new HashMap<>();
			this.icons.add(icons);
			for (Object e : type.getEnumConstants()) {
				String name = ((Enum<?>) e).name().toLowerCase().replace('_', '-').replaceFirst("^-", "");
				Button btn = new Button(name, create(type, e));
				btn.setClassName("text-align-left");
				btn.addClickListener(ev -> showDetails(e));
				layout.add(btn);
				layout.setFlexGrow(0, btn);
				icons.put(name, btn);
			}
		});

		add(noResults);
		noResults.addClassName("no-results");
		noResults.setVisible(false);

		addAttachListener(ev -> getUI().map(searchString::get).ifPresent(filter::setValue));
	}

	private void showDetails(Object icon) {
		DemoViewSingle view = new DemoViewSingle();
		Button closeButton = new Button(FontAwesome.Regular.WINDOW_CLOSE.create());
		closeButton.addClassName("close-button");
		HorizontalLayout top = new HorizontalLayout(closeButton);

		view.setParameter(null, FontAwesomeReflect.getIconName(icon).replace(':', '/'));
		Div div = new Div(top, view);
		div.addClassName("details-dialog");
		Dialog dlg = new Dialog(div);
		dlg.open();
		dlg.setWidth("600px");
		closeButton.addClickListener(ev -> dlg.close());
	}

	private Component create(Class<?> type, Object e) {
		try {
			return (Component) type.getMethod("create").invoke(e);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	private static Stream<Class<?>> getIconTypes() {
		return Stream.of(FontAwesome.Regular.class, FontAwesome.Solid.class, FontAwesome.Brands.class);
	}

	private void applyFilter(String value) {
		searchString.put(getUI().get(), value);
		icons.forEach(map -> map.forEach((name, icon) -> icon
				.setVisible(StringUtils.isBlank(value) || name.toLowerCase().contains(value.toLowerCase()))));
		layouts.forEach(p -> p.getLeft().setVisible(p.getRight().getChildren().anyMatch(Component::isVisible)));
		noResults.setVisible(layouts.stream().noneMatch(p -> p.getLeft().isVisible()));
	}
}

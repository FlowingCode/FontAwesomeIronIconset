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

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.function.SerializableConsumer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.apache.commons.lang3.StringUtils;

@PageTitle("Icons Gallery")
@SuppressWarnings("serial")
@Route(value = "font-awesome-iron-iconset/icons", layout = FontawesomeDemoView.class)
@JsModule("./fc-font-awesome-gallery.ts")
@Uses(FontAwesome.Solid.Icon.class)
@Uses(FontAwesome.Regular.Icon.class)
@Uses(FontAwesome.Brands.Icon.class)
public class IconsGalleryView extends Div {

  @Tag("fc-font-awesome-gallery-demo")
  public static class IconsGallery extends Component {

    private static final String EVENT_DETAIL = "event.detail";

    public IconsGallery(Class<?> type, SerializableConsumer<String> iconClickListener) {
      String caption = "FontAwesome " + type.getSimpleName();
      String family = FontAwesomeReflect.getIconset(type);
      getElement().setProperty("caption", caption);
      getElement().setProperty("family", family);
      getElement().addEventListener("iconClick", ev -> {
        iconClickListener.accept(ev.getEventData().getString(EVENT_DETAIL));
      }).addEventData(EVENT_DETAIL);
    }

    public void filter(String filterString) {
      filterString = StringUtils.lowerCase(filterString);
      filterString = StringUtils.trimToNull(filterString);
      getElement().setProperty("filterString", filterString);
    }

  }


  {
    TextField filter = new TextField();
    filter.setValueChangeMode(ValueChangeMode.EAGER);
    filter.setWidth("calc(100vw - 56px)");
    filter.addValueChangeListener(ev -> applyFilter(filter.getValue()));
    filter.setPlaceholder("Search icons");

    add(filter);

    setSizeUndefined();
    addClassName("main-icon-view");

    FontAwesomeReflect.getIconTypes().forEach(type -> {
      add(new IconsGallery(type, this::showDetails));
    });

    Div noResults = new Div(new Span("Your search did not match any icons."));
    noResults.addClassName("no-results");
    noResults.getElement().setAttribute("hidden", "true");
    add(noResults);
  }

  private void showDetails(String icon) {
    DemoViewSingle view = new DemoViewSingle();
    Button closeButton = new Button(FontAwesome.Solid.XMARK.create());
    closeButton.addClassName("close-button");
    HorizontalLayout top = new HorizontalLayout(closeButton);

    view.setParameter(null, icon.replace(':', '/'));
    Div div = new Div(top, view);
    div.addClassName("details-dialog");
    Dialog dlg = new Dialog(div);
    dlg.open();
    dlg.setWidth("600px");
    closeButton.addClickListener(ev -> dlg.close());
  }

  private void applyFilter(String filterString) {
    getChildren().filter(IconsGallery.class::isInstance).map(IconsGallery.class::cast)
        .forEach(gallery -> gallery.filter(filterString));
  }

}

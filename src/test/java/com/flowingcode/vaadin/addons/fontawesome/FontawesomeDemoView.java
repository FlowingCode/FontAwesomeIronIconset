package com.flowingcode.vaadin.addons.fontawesome;

import com.flowingcode.vaadin.addons.DemoLayout;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.IFrame;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout.Orientation;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;

@SuppressWarnings("serial")
@Uses(FontAwesome.Regular.Icon.class)
@Uses(FontAwesome.Solid.Icon.class)
@Uses(FontAwesome.Brands.Icon.class)
@StyleSheet("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-button.css", themeFor = "vaadin-button")
@Route(value = "fontawesome", layout = DemoLayout.class)
public class FontawesomeDemoView extends VerticalLayout {

	private static final String GALLERY_DEMO = "Icons Gallery";
	private static final String SIMPLE_DEMO = "Simple Demo";
	private static final String TEMPLATERENDERER_DEMO = "Template Renderer";
	private static final String SIMPLE_SOURCE = "https://github.com/FlowingCode/FontAwesomeIronIconset/blob/master/src/test/java/com/flowingcode/vaadin/addons/fontawesome/SimpleDemo.java";
	private static final String TEMPLATERENDERER_SOURCE = "https://github.com/FlowingCode/FontAwesomeIronIconset/blob/master/src/test/java/com/flowingcode/vaadin/addons/fontawesome/TemplateRendererDemo.java";

	public FontawesomeDemoView() {
		SplitLayout layout = new SplitLayout();
		layout.setOrientation(Orientation.HORIZONTAL);
		layout.setSizeFull();
		IFrame iframe = new IFrame();
		iframe.getElement().setAttribute("frameborder", "0");
		iframe.setSizeFull();

		Checkbox codeCB = new Checkbox("Show Source Code");
		codeCB.setEnabled(false);
		codeCB.addValueChangeListener(cb -> {
			if (cb.getValue()) {
				layout.setSplitterPosition(50);
			}
			else {
				layout.setSplitterPosition(100);
			}
		});

		Tabs tabs = new Tabs();
		Tab demo1 = new Tab(GALLERY_DEMO);
		Tab demo2 = new Tab(SIMPLE_DEMO);
		Tab demo3 = new Tab(TEMPLATERENDERER_DEMO);
		tabs.setWidthFull();
		tabs.add(demo1, demo2, demo3, codeCB);
		add(tabs, new IconsGalleryView());
		tabs.setSelectedTab(demo1);

		setSizeFull();

		tabs.addSelectedChangeListener(e -> {
			removeAll();
			layout.removeAll();
			switch (e.getSelectedTab().getLabel()) {
			case GALLERY_DEMO:
				codeCB.setEnabled(false);
				codeCB.setValue(false);
				add(tabs, new IconsGalleryView());
				break;
			case SIMPLE_DEMO:
				codeCB.setEnabled(true);
				codeCB.setValue(true);
				iframe.getElement().setAttribute("srcdoc", getSrcdoc(SIMPLE_SOURCE));
				layout.addToPrimary(new SimpleDemoView());
				layout.addToSecondary(iframe);
				add(tabs, layout);
				break;
			case TEMPLATERENDERER_DEMO:
				codeCB.setEnabled(true);
				codeCB.setValue(true);
				iframe.getElement().setAttribute("srcdoc", getSrcdoc(TEMPLATERENDERER_SOURCE));
				layout.addToPrimary(new TemplateRendererDemo());
				layout.addToSecondary(iframe);
				add(tabs, layout);
				break;
			default:
				codeCB.setEnabled(false);
				codeCB.setValue(false);
				add(tabs, new IconsGalleryView());
				break;
			}
		});
	}

	private String getSrcdoc(String sourceUrl) {
		return "<html style=\"overflow-y:hidden; height:100%;\"><body style=\"overflow-y: scroll; height:100%;\"><script src=\"https://gist-it.appspot.com/"
				+ sourceUrl + "\"></script></body></html>";
	}
}

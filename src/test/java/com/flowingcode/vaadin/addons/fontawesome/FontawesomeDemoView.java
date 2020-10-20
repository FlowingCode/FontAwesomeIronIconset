package com.flowingcode.vaadin.addons.fontawesome;

import com.flowingcode.vaadin.addons.DemoLayout;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.IFrame;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
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
@StyleSheet("context://frontend/styles/demo-styles.css")
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

		Tabs tabs = new Tabs();
		Tab demo1 = new Tab(GALLERY_DEMO);
		Tab demo2 = new Tab(SIMPLE_DEMO);
		Tab demo3 = new Tab(TEMPLATERENDERER_DEMO);
		tabs.setWidthFull();
		tabs.add(demo1, demo2, demo3);
		tabs.setSelectedTab(demo1);

		Checkbox orientationCB = new Checkbox("Toggle Orientation");
		orientationCB.setValue(true);
		orientationCB.addClassName("smallcheckbox");
		orientationCB.addValueChangeListener(cb -> {
			if (cb.getValue()) {
				layout.setOrientation(Orientation.HORIZONTAL);
			} else {
				layout.setOrientation(Orientation.VERTICAL);
			}
			layout.setSplitterPosition(50);
			layout.getPrimaryComponent().getElement().setAttribute("style", "width: 100%; height: 100%");
			iframe.setSizeFull();
		});
		Checkbox codeCB = new Checkbox("Show Source Code");
		codeCB.setValue(true);
		codeCB.addClassName("smallcheckbox");
		codeCB.addValueChangeListener(cb -> {
			if (cb.getValue()) {
				layout.setSplitterPosition(50);
				orientationCB.setEnabled(true);
			} else {
				layout.setSplitterPosition(100);
				orientationCB.setEnabled(false);
			}
		});
		HorizontalLayout footer = new HorizontalLayout();
		footer.setWidthFull();
		footer.setJustifyContentMode(JustifyContentMode.END);
		footer.add(codeCB, orientationCB);

		add(tabs, new IconsGalleryView());
		setSizeFull();

		tabs.addSelectedChangeListener(e -> {
			removeAll();
			layout.removeAll();
			switch (e.getSelectedTab().getLabel()) {
			case GALLERY_DEMO:
				add(tabs, new IconsGalleryView());
				break;
			case SIMPLE_DEMO:
				iframe.getElement().setAttribute("srcdoc", getSrcdoc(SIMPLE_SOURCE));
				layout.addToPrimary(new SimpleDemoView());
				layout.addToSecondary(iframe);
				add(tabs, layout, footer);
				break;
			case TEMPLATERENDERER_DEMO:
				iframe.getElement().setAttribute("srcdoc", getSrcdoc(TEMPLATERENDERER_SOURCE));
				layout.addToPrimary(new TemplateRendererDemo());
				layout.addToSecondary(iframe);
				add(tabs, layout, footer);
				break;
			default:
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

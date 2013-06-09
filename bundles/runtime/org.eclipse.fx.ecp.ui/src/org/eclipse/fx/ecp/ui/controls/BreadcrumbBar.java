package org.eclipse.fx.ecp.ui.controls;

import javafx.scene.control.Control;
import javafx.scene.control.SkinBase;
import javafx.scene.layout.HBox;

public class BreadcrumbBar extends Control {

	public static class Skin extends SkinBase<BreadcrumbBar> {

		public Skin(BreadcrumbBar control) {
			super(control);

			HBox hBox = new HBox();
			getChildren().add(hBox);

			hBox.getChildren().add(new BreadcrumbItem());
			hBox.getChildren().add(new BreadcrumbItem());
			hBox.getChildren().add(new BreadcrumbItem());

			hBox.setSpacing(-9);

		}

	}

	public BreadcrumbBar() {
		setSkin(new Skin(this));
		getStyleClass().add("breadcrumb-bar");
	}

	@Override
	protected String getUserAgentStylesheet() {
		return getClass().getResource("BreadcrumbBar.css").toExternalForm();
	}

}

package org.eclipse.fx.ecp.ui.controls;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.control.Control;
import javafx.scene.control.SkinBase;
import javafx.scene.layout.HBox;

import org.eclipse.emf.ecore.EObject;

public class BreadcrumbBar extends Control {

	private HBox hBox;

	public static class Skin extends SkinBase<BreadcrumbBar> {

		public Skin(BreadcrumbBar control) {
			super(control);
		}

	}

	public BreadcrumbBar(EObject modelElement) {
		setSkin(new Skin(this));
		getStyleClass().add("breadcrumb-bar");

		hBox = new HBox();
		getChildren().add(hBox);
		hBox.setSpacing(-9);

		update(modelElement);
	}

	public void update(EObject modelElement) {
		hBox.getChildren().clear();

		EObject eObject = modelElement;

		while (eObject != null) {
			hBox.getChildren().add(0, new BreadcrumbItem(eObject));
			eObject = eObject.eContainer();
		}
	}

	@Override
	protected String getUserAgentStylesheet() {
		return getClass().getResource("BreadcrumbBar.css").toExternalForm();
	}

}

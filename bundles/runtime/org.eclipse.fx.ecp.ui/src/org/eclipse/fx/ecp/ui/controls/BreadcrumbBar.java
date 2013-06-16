package org.eclipse.fx.ecp.ui.controls;

import javafx.scene.control.Control;
import javafx.scene.control.SkinBase;
import javafx.scene.layout.HBox;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ecp.ui.controls.BreadcrumbItem.Position;

public class BreadcrumbBar extends Control {

	private HBox hBox;
	private EObject modelElement;

	public static class Skin extends SkinBase<BreadcrumbBar> {

		public Skin(BreadcrumbBar control) {
			super(control);
		}

	}

	public BreadcrumbBar() {
		setSkin(new Skin(this));
		getStyleClass().add("breadcrumb-bar");
		hBox = new HBox();
		getChildren().add(hBox);
		hBox.setSpacing(-7);
	}

	public void setModelElement(EObject modelElement) {
		this.modelElement = modelElement;
		updateItems();
	}

	private void updateItems() {
		hBox.getChildren().clear();

		EObject eObject = modelElement;

		while (eObject != null) {
			BreadcrumbItem.Position position = Position.Middle;

			if (eObject == modelElement && eObject.eContainer() == null)
				position = Position.Only;
			else if (eObject.eContainer() == null)
				position = Position.First;
			else if (eObject == modelElement)
				position = Position.Last;

			hBox.getChildren().add(0, new BreadcrumbItem(eObject, position));
			eObject = eObject.eContainer();
		}
	}

	@Override
	protected String getUserAgentStylesheet() {
		return getClass().getResource("BreadcrumbBar.css").toExternalForm();
	}

}

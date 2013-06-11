package org.eclipse.fx.ecp.ui.controls.multi;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class MarkButton extends Button {
	
	public MarkButton(String styleClass) {
		super();
		StackPane upMark = new StackPane();
		upMark.getStyleClass().add(styleClass);
		setGraphic(new Group(upMark));
	}

}

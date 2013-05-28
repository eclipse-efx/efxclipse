package org.eclipse.fx.ecp.ui.controls.multi;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class MarkButton extends Button {
	
	{
		setMaxHeight(Double.MAX_VALUE);
		StackPane upMark = new StackPane();
		upMark.getStyleClass().add("mark");
		setGraphic(new Group(upMark));
	}

}

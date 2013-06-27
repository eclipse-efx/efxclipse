package org.eclipse.fx.ecp.ui.controls;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.fx.ecp.ui.ECPUtil;

public class ControlDecoration extends AnchorPane {

	private Label label;
	private Tooltip tooltip;
	private final EStructuralFeature feature;
	private final ECPControlBase control;

	public ControlDecoration(EStructuralFeature feature, ECPControlBase control) {
		this.feature = feature;
		this.control = control;

		getChildren().add(control);

		ImageView imageView = new ImageView(getClass().getResource("asterisk.png").toExternalForm());
		label = new Label();
		label.setGraphic(imageView);

		getChildren().add(label);
		AnchorPane.setTopAnchor(label, -1.0);
		AnchorPane.setLeftAnchor(label, -14.0);
		label.setVisible(false);

		tooltip = new Tooltip();

		label.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				ECPUtil.showContextMenu(tooltip, label);
			}

		});
		
		label.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				tooltip.hide();
			}

		});
	}

	public void handleValidation(Diagnostic diagnostic) {
		boolean showLabel = false;

		if (diagnostic != null) {
			for (Diagnostic childDiagnostic : diagnostic.getChildren()) {
				Object feature = childDiagnostic.getData().get(1);
				if (feature == this.feature) {
					tooltip.setText(childDiagnostic.getMessage());
					showLabel = true;
				}
			}
		}

		label.setVisible(showLabel);
	}

	public void resetValidation() {
		label.setVisible(false);
	}

	public void dispose() {
		control.dispose();
	}

}

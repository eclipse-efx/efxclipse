package org.eclipse.fx.ecp.ui.controls;

import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.fx.ecp.ui.ECPControl;

public class ControlDecoration extends AnchorPane implements ECPControl {

	private Label label;
	private Tooltip tooltip;
	private final EStructuralFeature feature;
	
	public ControlDecoration(EStructuralFeature feature) {
		this.feature = feature;
		ImageView imageView = new ImageView(getClass().getResource("asterisk.png").toExternalForm());
		label = new Label();
		label.setGraphic(imageView);

		getChildren().add(label);
		AnchorPane.setTopAnchor(label, -1.0);
		AnchorPane.setLeftAnchor(label, -14.0);
		label.setVisible(false);

		tooltip = new Tooltip();
		label.setTooltip(tooltip);
	}

	@Override
	public void handleValidation(Diagnostic diagnostic) {
		boolean showLabel = false;

		if (diagnostic != null) {
			for (Diagnostic childDiagnostic : diagnostic.getChildren()) {
				Object feature = childDiagnostic.getData().get(1);
				if(feature == this.feature) {
					tooltip.setText(diagnostic.getMessage());
					showLabel = true;
				}
			}
		}
		
		label.setVisible(showLabel);
	}

	@Override
	public void resetValidation() {
		label.setVisible(false);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}

}

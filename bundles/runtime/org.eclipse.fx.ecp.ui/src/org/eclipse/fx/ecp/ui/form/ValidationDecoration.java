package org.eclipse.fx.ecp.ui.form;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import jidefx.animation.AnimationType;
import jidefx.scene.control.decoration.DecorationUtils;
import jidefx.scene.control.decoration.Decorator;
import jidefx.scene.control.popup.BalloonPopupOutline;
import jidefx.scene.control.popup.ShapedPopup;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Objects;

public class ValidationDecoration {

	protected final static Image errorImage = new Image(Decorator.class.getResourceAsStream("overlay_error.png"));

	protected Control control;
	protected final EStructuralFeature feature;
	protected final ShapedPopup shapedPopup;
	protected Diagnostic diagnostic;
	protected Text popupText;
	

	public ValidationDecoration(Control control, EStructuralFeature feature) {
		super();
		this.control = control;
		this.feature = feature;

		shapedPopup = new ShapedPopup();
		shapedPopup.setAutoHide(false);
		shapedPopup.setInsets(new Insets(20));
		BalloonPopupOutline popupOutline = new BalloonPopupOutline();
		popupOutline.setArrowSide(Side.TOP);
		shapedPopup.setPopupOutline(popupOutline);
		popupText = new Text();
		popupText.setWrappingWidth(300);
		shapedPopup.setPopupContent(popupText);
	}

	public void handleValidation(Diagnostic diagnostic) {

		Diagnostic newDiagnostic = null;

		if (diagnostic != null) {
			for (Diagnostic childDiagnostic : diagnostic.getChildren()) {
				Object feature = childDiagnostic.getData().get(1);
				if (feature == this.feature) {
					newDiagnostic = childDiagnostic;
					break;
				}
			}
		}

		if (newDiagnostic != null && (this.diagnostic == null || !equals(newDiagnostic, this.diagnostic)))
			popupText.setText(newDiagnostic.getMessage());

		if (newDiagnostic != null && !equals(this.diagnostic, newDiagnostic)) {
			final Decorator<Node> validationDecorator = new Decorator<Node>(createErrorGraphic(), Pos.TOP_LEFT, new Point2D(0, 0), new Insets(0), AnimationType.BOUNCE_IN);
			DecorationUtils.install(control, validationDecorator);

			final Node node = validationDecorator.getNode();
			node.setOpacity(0);

			node.setOnMouseEntered(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					if (ValidationDecoration.this.diagnostic != null)
						shapedPopup.showPopup(node, Pos.BOTTOM_CENTER, 0, 5);
				}

			});

			node.setOnMouseExited(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					if (ValidationDecoration.this.diagnostic != null)
						shapedPopup.hide();
				}

			});

		} else if (newDiagnostic == null) {
			DecorationUtils.uninstall(control);
		}

		this.diagnostic = newDiagnostic;
	}

	protected static boolean equals(Diagnostic d1, Diagnostic d2) {
		if (d1 != null && d2 != null)
			return Objects.equal(d1.getMessage(), d2.getMessage());
		else
			return false;
	}

	public Node createErrorGraphic() {
		return new Label(null, new ImageView(errorImage));
	}
	
}
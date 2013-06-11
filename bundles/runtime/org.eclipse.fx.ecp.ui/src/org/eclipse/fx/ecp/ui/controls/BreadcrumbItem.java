package org.eclipse.fx.ecp.ui.controls;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.SkinBase;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.SVGPath;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ecp.ui.ECPUtil;

public class BreadcrumbItem extends Control {

	public class Skin extends SkinBase<BreadcrumbItem> {

		private Label label;

		public Skin(BreadcrumbItem control) {
			super(control);

			HBox hBox = new HBox();
			getChildren().add(hBox);
			hBox.setAlignment(Pos.CENTER);

			// SVGPath leftSide = new SVGPath();
			// hBox.getChildren().add(leftSide);
			// leftSide.setContent("M0 0 L15 0 l0 30 L0 30 Z");
			// leftSide.setContent("M0 0 L15 0 l0 30 L0 30 l10 -15 Z");
			// leftSide.getStyleClass().add("breadcrumbitem-ui");

			// StackPane left = new StackPane();
			// hBox.getChildren().add(left);
			// left.setAlignment(Pos.CENTER_RIGHT);
			//
			// SVGPath leftBottom = new SVGPath();
			// left.getChildren().add(leftBottom);
			// leftBottom.setContent("m0 0 h 15 v 30 h -15 l 10 -15 z");
			// leftBottom.getStyleClass().add("breadcrumbitem-ui");
			//
			// SVGPath leftMiddle = new SVGPath();
			// left.getChildren().add(leftMiddle);
			// leftMiddle.setContent("m0 0 h 14 v 28 h -14 l 10 -14 z");
			// leftMiddle.getStyleClass().add("inner-border");
			//
			// SVGPath leftTop = new SVGPath();
			// left.getChildren().add(leftTop);
			// leftTop.setContent("m0 0 h 13 v 26 h -13 l 10 -13 z");
			// leftTop.getStyleClass().add("body");

			hBox.getChildren().add(new LeftCap());

			StackPane stackPane = new StackPane();
			hBox.getChildren().add(stackPane);
			stackPane.getStyleClass().add("body");
			stackPane.setAlignment(Pos.CENTER);

			label = new Label();
			stackPane.getChildren().add(label);
			label.getStyleClass().add("breadcrumbitem-text");

			// StackPane right = new StackPane();
			// hBox.getChildren().add(right);
			// right.setAlignment(Pos.CENTER_LEFT);
			//
			// SVGPath rightBottom = new SVGPath();
			// right.getChildren().add(rightBottom);
			// rightBottom.setContent("M0,0 L5,0 15,15 5,30 0,30 Z");
			// rightBottom.getStyleClass().add("outer-border");
			//
			// SVGPath rightMiddle = new SVGPath();
			// right.getChildren().add(rightMiddle);
			// rightMiddle.setContent("M0,0 L4.3,0 14,14 4,28 0,28 Z");
			// rightMiddle.getStyleClass().add("inner-border");
			//
			// SVGPath rightTop = new SVGPath();
			// right.getChildren().add(rightTop);
			// rightTop.setContent("M0,0 L3.6,0 13,13 4,26 0,26 Z");
			// rightTop.getStyleClass().add("body");
			//
			// rightTop.setOnMouseEntered(new EventHandler<MouseEvent>() {
			//
			// @Override
			// public void handle(MouseEvent arg0) {
			// System.out.println("entered");
			// }
			//
			// });

			hBox.getChildren().add(new RightCap());

			eObject.eAdapters().add(new AdapterImpl() {

				@Override
				public void notifyChanged(Notification msg) {
					update();
				}

			});

			update();
		}

		public void update() {
			label.setText(ECPUtil.getText(eObject));
			label.setGraphic(ECPUtil.getGraphic(eObject));
		}

	}

	private final EObject eObject;

	public BreadcrumbItem(EObject eObject) {
		this.eObject = eObject;
		setSkin(new Skin(this));
		getStyleClass().add("breadcrumb-item");
	}

	@Override
	protected String getUserAgentStylesheet() {
		return getClass().getResource("BreadcrumbBar.css").toExternalForm();
	}

	static class RightCap extends StackPane {

		public RightCap() {
			setAlignment(Pos.CENTER_LEFT);

			SVGPath bottom = new SVGPath();
			getChildren().add(bottom);
			bottom.setContent("M0,0 L5,0 15,15 5,30 0,30 Z");
			bottom.getStyleClass().add("outer-border");

			SVGPath middle = new SVGPath();
			getChildren().add(middle);
			middle.setContent("M0,0 L4.3,0 14,14 4,28 0,28 Z");
			middle.getStyleClass().add("inner-border");

			SVGPath top = new SVGPath();
			getChildren().add(top);
			top.setContent("M0,0 L3.6,0 13,13 4,26 0,26 Z");
			top.getStyleClass().add("body");
		}

	}

	static class LeftCap extends StackPane {

		static final String[] LAYERS = new String[] { "outer-border", "inner-border", "body" };

		public LeftCap() {
			getStyleClass().add("left-cap");

			setAlignment(Pos.CENTER_RIGHT);

			for (String layer : LAYERS) {
				Group group = new Group();
				getChildren().add(group);
				StackPane stackPane = new StackPane();
				group.getChildren().add(stackPane);
				stackPane.getStyleClass().add(layer);
			}
		}

	}

}

package org.eclipse.fx.ecp.ui.controls;

import javafx.geometry.Pos;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.SkinBase;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.SVGPath;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ecp.ui.ECPUtil;

public class BreadcrumbItem extends Control {

	public enum Position {
		First, Middle, Last, Only
	}
	
	public class Skin extends SkinBase<BreadcrumbItem> {

		private Label label;

		public Skin(BreadcrumbItem control, Position position) {
			super(control);

			HBox hBox = new HBox();
			getChildren().add(hBox);
			hBox.setAlignment(Pos.CENTER);

			hBox.getChildren().add(position == Position.First || position == Position.Only ? new LeftEndCap() : new LeftCap());

			StackPane stackPane = new StackPane();
			hBox.getChildren().add(stackPane);
			stackPane.getStyleClass().add("body");
			stackPane.setAlignment(Pos.CENTER);

			label = new Label();
			stackPane.getChildren().add(label);
			label.getStyleClass().add("breadcrumbitem-text");

			if(position == Position.First || position == Position.Middle)
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

	public BreadcrumbItem(EObject eObject, Position position) {
		this.eObject = eObject;
		setSkin(new Skin(this, position));
		getStyleClass().add("breadcrumb-item");
	}

	@Override
	protected String getUserAgentStylesheet() {
		return getClass().getResource("BreadcrumbBar.css").toExternalForm();
	}
	
	static class LeftEndCap extends StackPane {

		public LeftEndCap() {
			getStyleClass().add("left-cap");

			setAlignment(Pos.CENTER_RIGHT);

			SVGPath bottom = new SVGPath();
			getChildren().add(bottom);
			bottom.setContent("m 0 0 h 7 v 30 h -7 z");
			bottom.getStyleClass().add("outer-border");

			SVGPath middle = new SVGPath();
			getChildren().add(middle);
			middle.setContent("m 0 0 h 6 v 28 h -6 z");
			middle.getStyleClass().add("inner-border");

			SVGPath top = new SVGPath();
			getChildren().add(top);
			top.setContent("m 0 0 h 5 v 26 h -5 z");
			top.getStyleClass().add("body");
		}

	}

	static class LeftCap extends StackPane {

		public LeftCap() {
			getStyleClass().add("left-cap");

			setAlignment(Pos.CENTER_RIGHT);

			SVGPath bottom = new SVGPath();
			getChildren().add(bottom);
			bottom.setContent("m0 0 h 14 v 28 h -14 l 10 -14 z");
			bottom.getStyleClass().add("outer-border");

			SVGPath middle = new SVGPath();
			getChildren().add(middle);
			middle.setContent("m0 0 h 14 v 28 h -14 l 10 -14 z");
			middle.getStyleClass().add("inner-border");

			SVGPath top = new SVGPath();
			getChildren().add(top);
			top.setContent("m0 0 h 13 v 26 h -13 l 10 -13 z");
			top.getStyleClass().add("body");
		}

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
	
	static class RightEndCap extends StackPane {

		public RightEndCap() {
			setAlignment(Pos.CENTER_LEFT);

			SVGPath bottom = new SVGPath();
			getChildren().add(bottom);
			bottom.setContent("m 0 0 h 10 v 30 h -10 z");
			bottom.getStyleClass().add("outer-border");

			SVGPath middle = new SVGPath();
			getChildren().add(middle);
			middle.setContent("m 0 0 h 9 v 28 h -9 z");
			middle.getStyleClass().add("inner-border");

			SVGPath top = new SVGPath();
			getChildren().add(top);
			top.setContent("m 0 0 h 8 v 26 h -8 z");
			top.getStyleClass().add("body");
		}

	}
	
}

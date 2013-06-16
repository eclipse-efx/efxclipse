package org.eclipse.fx.ecp.ui.controls;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.SkinBase;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.SVGPath;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ecp.ui.ECPUtil;

public class BreadcrumbItem extends Control {

	public enum Position {
		First, Middle, Last, Only
	}

	private Label label;
	private Position position;

	public class Skin extends SkinBase<BreadcrumbItem> {

		private Polygon outerBorder;
		private Polygon innerBorder;
		private Polygon body;

		public Skin(BreadcrumbItem control, final Position position) {
			super(control);
			BreadcrumbItem.this.position = position;
			
			// HBox hBox = new HBox();
			// getChildren().add(hBox);
			// hBox.setAlignment(Pos.CENTER);

			// if (position == Position.First || position == Position.Only)
			// hBox.getChildren().add(new LeftEndCap());
			// else if (position == Position.Middle || position == Position.Last)
			// hBox.getChildren().add(new LeftCap());

			StackPane stackPane = new StackPane();
			getChildren().add(stackPane);
			// stackPane.getStyleClass().add("body");
			stackPane.setAlignment(Pos.CENTER);

			outerBorder = new Polygon();
			stackPane.getChildren().add(outerBorder);
			outerBorder.getStyleClass().add("outer-border");
			outerBorder.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// TODO Auto-generated method stub
					System.out.println(outerBorder);
				}
			});

			innerBorder = new Polygon();
			stackPane.getChildren().add(innerBorder);
			innerBorder.getStyleClass().add("inner-border");
			innerBorder.setMouseTransparent(true);

			body = new Polygon();
			stackPane.getChildren().add(body);
			body.getStyleClass().add("body");
			body.setMouseTransparent(true);

			label = new Label();
			stackPane.getChildren().add(label);
			label.getStyleClass().add("breadcrumbitem-text");
			label.setMouseTransparent(true);

			label.widthProperty().addListener(new ChangeListener<Number>() {

				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					System.out.println(arg1 + " -> " + arg2);
					updateBackground();

//					final double w = arg2.doubleValue();
//					final double h = label.getBoundsInParent().getHeight();
//
//					if (position == Position.First) {
//						outerBorder.getPoints().setAll(-5.0, 0.0, w, 0.0, w + 5, h / 2, w, h, -5.0, h);
//						outerBorder.setLayoutX(0);
//						outerBorder.setLayoutY(0);
//
//						innerBorder.getPoints().setAll(-5.0, 1.0, w - 1, 1.0, w + 4, (h - 2) / 2, w - 1, h - 1, -5.0, h - 1);
//						innerBorder.setLayoutX(0);
//						innerBorder.setLayoutY(0);
//
//						body.getPoints().setAll(-3.0, 2.0, w - 2, 2.0, w + 3, h / 2, w - 2, h - 2, -3.0, h - 2);
//						body.setLayoutX(0);
//						body.setLayoutY(0);
//					} else if (position == Position.Middle) {
//						outerBorder.getPoints().setAll(-5.0, 0.0, w, 0.0, w + 5, h / 2, w, h, -5.0, h, 0.0, h / 2);
//						outerBorder.setLayoutX(0);
//						outerBorder.setLayoutY(0);
//
//						innerBorder.getPoints().setAll(-5.0, 1.0, w - 1, 1.0, w + 4, (h - 2) / 2, w - 1, h - 1, -5.0, h - 1, 0.0, h / 2);
//						innerBorder.setLayoutX(0);
//						innerBorder.setLayoutY(0);
//
//						body.getPoints().setAll(-3.0, 2.0, w - 2, 2.0, w + 3, h / 2, w - 2, h - 2, -3.0, h - 2, 2.0, h / 2);
//						body.setLayoutX(0);
//						body.setLayoutY(0);
//					} else if (position == Position.Last) {
//						outerBorder.getPoints().setAll(-5.0, 0.0, w, 0.0, w, h, -5.0, h, 0.0, h / 2);
//						outerBorder.setLayoutX(0);
//						outerBorder.setLayoutY(0);
//
//						innerBorder.getPoints().setAll(-5.0, 1.0, w - 2, 1.0, w - 2, h - 1, -5.0, h - 1, 0.0, h / 2);
//						innerBorder.setLayoutX(0);
//						innerBorder.setLayoutY(0);
//
//						body.getPoints().setAll(-3.0, 2.0, w - 3, 2.0, w - 3, h - 2, -3.0, h - 2, 2.0, h / 2);
//						body.setLayoutX(0);
//						body.setLayoutY(0);
//					} else if (position == Position.Only) {
//						outerBorder.getPoints().setAll(0.0, 0.0, w, 0.0, w, h, 0.0, h);
//						outerBorder.setLayoutX(0);
//						outerBorder.setLayoutY(0);
//
//						innerBorder.getPoints().setAll(1.0, 1.0, w - 1, 1.0, w - 1, h - 1, 1.0, h - 1);
//						innerBorder.setLayoutX(0);
//						innerBorder.setLayoutY(0);
//
//						body.getPoints().setAll(2.0, 2.0, w - 2, 2.0, w - 2, h - 2, 2.0, h - 2);
//						body.setLayoutX(0);
//						body.setLayoutY(0);
//					}
				}

			});

			label.heightProperty().addListener(new ChangeListener<Number>() {

				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					System.out.println(arg1 + " -> " + arg2);
					updateBackground();
				}
				
			});

			

			// if (position == Position.First || position == Position.Middle)
			// hBox.getChildren().add(new RightCap());
			// else if (position == Position.Last || position == Position.Only)
			// hBox.getChildren().add(new RightEndCap());

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
		
		private void updateBackground() {
			final double w = label.getWidth();
			final double h = label.getHeight();
			final double s = 7;//h / 2 - 5;

			if (position == Position.First) {
				outerBorder.getPoints().setAll(0.0, 0.0, w-s, 0.0, w, h/2, w-s, h, 0.0, h);
				outerBorder.setLayoutX(0);
				outerBorder.setLayoutY(0);

				innerBorder.getPoints().setAll(1.0, 1.0, w-s, 1.0, w, h/2, w-s, h-1, 1.0, h-1);
				innerBorder.setLayoutX(0);
				innerBorder.setLayoutY(0);

				body.getPoints().setAll(2.0, 2.0, w-s-1, 2.0, w-2, h/2, w-s-1, h-2, 2.0, h-2);
				body.setLayoutX(0);
				body.setLayoutY(0);
			} else if (position == Position.Middle) {
				outerBorder.getPoints().setAll(0.0,0.0, w-s,0.0, w,h/2, w-s,h, 0.0,h, 5.0,h/2);
				outerBorder.setLayoutX(0);
				outerBorder.setLayoutY(0);

				innerBorder.getPoints().setAll(1.0,1.0, w-s,1.0, w, h/2, w-s,h-1, 1.0,h-1, 6.0,h/2);
				innerBorder.setLayoutX(0);
				innerBorder.setLayoutY(0);

				body.getPoints().setAll(2.0,2.0, w-s-1,2.0, w-1,h/2, w-s-1, h-2, 2.0, h-2, 7.0,h/2);
				body.setLayoutX(0);
				body.setLayoutY(0);
			} else if (position == Position.Last) {
				outerBorder.getPoints().setAll(0.0, 0.0, w, 0.0, w, h, 0.0, h, s, h / 2);
				outerBorder.setLayoutX(0);
				outerBorder.setLayoutY(0);

				innerBorder.getPoints().setAll(1.0, 1.0, w - 1, 1.0, w - 1, h - 1, 1.0, h - 1, s+1, h / 2);
				innerBorder.setLayoutX(0);
				innerBorder.setLayoutY(0);

				body.getPoints().setAll(2.0, 2.0, w - 2, 2.0, w - 2, h - 2, 2.0, h - 2, s+2, h / 2);
				body.setLayoutX(0);
				body.setLayoutY(0);
			} else if (position == Position.Only) {
				outerBorder.getPoints().setAll(0.0, 0.0, w, 0.0, w, h, 0.0, h);
				outerBorder.setLayoutX(0);
				outerBorder.setLayoutY(0);

				innerBorder.getPoints().setAll(1.0, 1.0, w - 1, 1.0, w - 1, h - 1, 1.0, h - 1);
				innerBorder.setLayoutX(0);
				innerBorder.setLayoutY(0);

				body.getPoints().setAll(2.0, 2.0, w - 2, 2.0, w - 2, h - 2, 2.0, h - 2);
				body.setLayoutX(0);
				body.setLayoutY(0);
			}
		}

	}

	private final EObject eObject;

	public BreadcrumbItem(EObject eObject, Position position) {
		this.eObject = eObject;
		setSkin(new Skin(this, position));
		getStyleClass().addAll("breadcrumb-item", position.toString().toLowerCase());

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

package org.eclipse.fx.ecp.ui.controls;

import java.util.Objects;

import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Transition;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;

public class ValidationMessage extends Pane {

	final private Label label;
	final private Polygon arrow;
	private String message;

	public ValidationMessage() {
		setVisible(false);
		setPrefHeight(0);

		final double x = 35;
		arrow = new Polygon(x, 2.0, x + 10, 12.0, x - 10, 12.0);
		arrow.setFill(Color.web("#f04349"));
		getChildren().add(arrow);

		label = new Label();
		label.getStyleClass().add("validationLabel");
		getChildren().add(label);
	}

	public void setMessage(String newMessage) {
		
		if(Objects.equals(message, newMessage))
			return;
		
		message = newMessage;

		final double initialHeight = getHeight();

		if (message == null) {
//			setVisible(false);
			Transition heightTransition = new Transition() {

				{
					setCycleDuration(Duration.millis(300));
				}

				@Override
				protected void interpolate(double t) {
					setPrefHeight((1 - t) * initialHeight);
				}

			};
			
			ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), this);
			scaleTransition.setFromX(1);
			scaleTransition.setToX(0);
			scaleTransition.setFromY(1);
			scaleTransition.setToY(0);
			
			ParallelTransition parallelTransition = new ParallelTransition();
			parallelTransition.getChildren().addAll(heightTransition, scaleTransition);

			parallelTransition.play();
		} else {
			setPrefWidth(label.getWidth());
			final double targetHeight = label.getHeight();

			label.setText(message);
			setScaleX(0);
			setScaleY(0);
			setVisible(true);

			Transition heightTransition = new Transition() {

				{
					setCycleDuration(Duration.millis(300));
				}

				@Override
				protected void interpolate(double t) {
					setPrefHeight(initialHeight + t * (targetHeight - initialHeight));
				}

			};

			ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), this);
			scaleTransition.setDelay(Duration.millis(100));
			scaleTransition.setFromX(0);
			scaleTransition.setToX(1);
			scaleTransition.setFromY(0);
			scaleTransition.setToY(1);

			ParallelTransition parallelTransition = new ParallelTransition();
			parallelTransition.getChildren().addAll(heightTransition, scaleTransition);

			parallelTransition.play();
		}
	}

}

package org.eclipse.fx.ecp.ui.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import org.eclipse.fx.ecp.ui.ECPUtil;

public class JavaFXMainClass extends Application {

	@Override
	public void start(Stage stage) {
		stage.setWidth(250);
		stage.setHeight(180);

		BorderPane borderPane = new BorderPane();

		HBox hBox = new HBox();
		borderPane.setTop(hBox);
		hBox.setFillHeight(true);

		Button decreaseButton = new Button();
		hBox.getChildren().add(decreaseButton);
		decreaseButton.getStyleClass().add("decrease-button");
		decreaseButton.getStyleClass().add("left-pill");
		ECPUtil.addMark(decreaseButton, "minus");

		TextField textField = new TextField() {
			
			@Override
			public void replaceText(int start, int end, String text) {
				if (text.matches("[0-9]*"))
					super.replaceText(start, end, text);
			}

			@Override
			public void replaceSelection(String text) {
				if (text.matches("[0-9]*"))
					super.replaceSelection(text);
			}

		};
		hBox.getChildren().add(textField);
		textField.getStyleClass().add("center-pill");

		Button increaseButton = new Button();
		hBox.getChildren().add(increaseButton);
		increaseButton.getStyleClass().add("increase-button");
		increaseButton.getStyleClass().add("right-pill");
		ECPUtil.addMark(increaseButton, "plus");
		
		ButtonBase bb = new ButtonBase("huhu") {
			
			@Override
			public void fire() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		borderPane.setBottom(bb);

		Scene scene = new Scene(borderPane);
		stage.setScene(scene);
		scene.getStylesheets().add(getClass().getResource("ECPControls.css").toExternalForm());

		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}

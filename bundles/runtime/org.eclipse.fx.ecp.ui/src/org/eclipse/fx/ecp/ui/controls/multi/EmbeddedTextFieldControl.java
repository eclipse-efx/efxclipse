package org.eclipse.fx.ecp.ui.controls.multi;

import java.util.Objects;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
import javafx.scene.text.Text;
import javafx.stage.Popup;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.controls.AutoSelector;

public class EmbeddedTextFieldControl extends AbstractEmbeddedControl {

	final protected EDataTypeValueHandler valueHandler;
	final protected TextField textField;

	public EmbeddedTextFieldControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context, int initialIndex) {
		super(propertyDescriptor, context, initialIndex);

		valueHandler = new EDataTypeValueHandler((EDataType) feature.getEType());
		eList = (EList<?>) modelElement.eGet(feature);

		upButton.getStyleClass().add("center-pill");

		textField = new TextField();
		getChildren().add(0, textField);
		textField.getStyleClass().add("left-pill");
		HBox.setHgrow(textField, Priority.ALWAYS);

		textField.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observableValue, String oldText, String newText) {
				final String message = valueHandler.isValid(newText);
				ObservableList<String> styleClass = textField.getStyleClass();
				if (message == null) {
					styleClass.remove("error");
				} else {
					if (!styleClass.contains("error"))
						styleClass.add("error");

					// Tooltip tooltip = new Tooltip(message);
					// tooltip.setStyle("-fx-background-color: rgba(200, 0, 0, 0.8);");
					// tooltip.getStyleClass().add("error");
					// tooltip.setAutoHide(false);
					// textField.setTooltip(tooltip);
					Point2D p = textField.localToScene(0.0, 0.0);
					// tooltip.show(textField,
					// p.getX() + textField.getScene().getX() + textField.getScene().getWindow().getX(),
					// p.getY() + textField.getScene().getY() + textField.getScene().getWindow().getY() +
					// textField.getHeight());

					// setGraphic(new Group(upMark));

					Popup popup = new Popup();
//					popup.setWidth(200);
//					popup.setHeight(100);
					
					SVGPath svg = new SVGPath();
					svg.setFill(Color.rgb(200, 0, 0, 0.8));
					svg.setStyle("-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.5) , 10, 0.0 , 0 , 0 );");
					
					Text label = new Text(message);
					label.snapshot(null, null);
					double w = label.getLayoutBounds().getWidth();
					double h = label.getLayoutBounds().getHeight();

//					label.getStyleClass().add("validationLabel");
					label.setFill(Color.WHITE);
					svg.setContent("M 0,16 s 0 -6 6 -6 h 30 l 10 -10 10 10 h " + (w - 50) + " s 6 0 6 6 v " + h
							+ " s 0 6 -6 6 h -" + w + " s -6 0 -6 -6 z");
					
					popup.getContent().add(svg);
					popup.getContent().add(label);
					label.setLayoutX(10);
					label.setLayoutY(30);
					
					popup.show(textField, p.getX() + textField.getScene().getX() + textField.getScene().getWindow().getX(), p.getY()
							+ textField.getScene().getY() + textField.getScene().getWindow().getY() + textField.getHeight());
				}
			}

		});
		
		textField.focusedProperty().addListener(new AutoSelector(textField));

		textField.focusedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observableValue, Boolean oldFocused, Boolean newFocused) {
				if (!newFocused) {
					Object oldValue = eList.get(index);
					String text = textField.getText();
					String message = valueHandler.isValid(text);

					if (message == null) {
						Object newValue = valueHandler.toValue(text);

						// only commit if the value has changed
						if (!Objects.equals(oldValue, newValue)) {
							Command command = SetCommand.create(editingDomain, modelElement, feature, newValue, index);
							if (command.canExecute())
								editingDomain.getCommandStack().execute(command);
						}
						// textField.getStyleClass().remove("error");
					} else {
						// if (!textField.getStyleClass().contains("error"))
						// textField.getStyleClass().add("error");
					}
				}
			}

		});

		update();
	}

	@Override
	protected void update() {
		super.update();
		Object value = eList.get(index);
		textField.setText(valueHandler.toString(value));
	}

}

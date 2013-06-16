package org.eclipse.fx.ecp.ui.controls;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.SkinBase;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.ecp.ui.ECPUtil;

public class IntegerControl extends Control implements ECPControl {

	protected final EObject modelElement;
	protected final EStructuralFeature feature;
	private EditingDomain editingDomain;
	private TextField textField;

	private final class Skin extends SkinBase<IntegerControl> {

		private Adapter modelElementAdapter;

		private Skin(IntegerControl control) {
			super(control);

			HBox hBox = new HBox();
			getChildren().add(hBox);
			hBox.setFillHeight(true);

			Button decreaseButton = new Button();
			hBox.getChildren().add(decreaseButton);
			decreaseButton.getStyleClass().add("decrease-button");
			decreaseButton.getStyleClass().add("left-pill");
			ECPUtil.addMark(decreaseButton, "minus");
			decreaseButton.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					Integer value = (Integer) modelElement.eGet(feature);
					Command command = SetCommand.create(editingDomain, modelElement, feature, --value);
					if (command.canExecute())
						editingDomain.getCommandStack().execute(command);
				}

			});

			textField = new TextField() {

				@Override
				public void replaceText(int start, int end, String text) {
					if(start == 0 && text.matches("\\-?[0-9]*"))
						super.replaceText(start, end, text);
						
					
					if (text.matches("[0-9]*"))
						super.replaceText(start, end, text);
				}

				@Override
				public void replaceSelection(String text) {
					getSelectedText();
					getCaretPosition();
					if (text.matches("[0-9]*"))
						super.replaceSelection(text);
				}

			};
			hBox.getChildren().add(textField);
//			textField.setAlignment(Pos.BASELINE_RIGHT);
			textField.getStyleClass().add("center-pill");

			textField.focusedProperty().addListener(new ChangeListener<Boolean>() {

				@Override
				public void changed(ObservableValue<? extends Boolean> observableValue, Boolean oldFocused, Boolean newFocused) {
					if (!newFocused) {
						int oldValue = (Integer) modelElement.eGet(feature);
						int newValue = 0;
						try {
							newValue = Integer.parseInt(textField.getText());
						} catch (NumberFormatException e) {
							// TODO maybe log this?
						}

						// only commit if the value has changed
						if (oldValue != newValue) {
							Command command = SetCommand.create(editingDomain, modelElement, feature, newValue);
							if (command.canExecute())
								editingDomain.getCommandStack().execute(command);
						}
					}
				}

			});

			Button increaseButton = new Button();
			hBox.getChildren().add(increaseButton);
			increaseButton.getStyleClass().add("increase-button");
			increaseButton.getStyleClass().add("right-pill");
			ECPUtil.addMark(increaseButton, "plus");
			increaseButton.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					Integer value = (Integer) modelElement.eGet(feature);
					Command command = SetCommand.create(editingDomain, modelElement, feature, ++value);
					if (command.canExecute())
						editingDomain.getCommandStack().execute(command);
				}

			});

			modelElementAdapter = new AdapterImpl() {

				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getFeature() == feature)
						update();
				}

			};

			modelElement.eAdapters().add(modelElementAdapter);

			update();
		}

	}

	private void update() {
		Integer value = (Integer) modelElement.eGet(feature);
		textField.setText(value.toString());
	}

	public IntegerControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		modelElement = context.getModelElement();
		editingDomain = context.getEditingDomain();
		feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);
		setSkin(new Skin(this));
	}

	@Override
	protected String getUserAgentStylesheet() {
		return getClass().getResource("ECPControls.css").toExternalForm();
	}

	@Override
	public void handleValidation(Diagnostic diagnostic) {
		// TODO Auto-generated method stub
	}

	@Override
	public void resetValidation() {
		// TODO Auto-generated method stub
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public ECPControl createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new IntegerControl(itemPropertyDescriptor, context);
		}

	}

}

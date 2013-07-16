package org.eclipse.fx.ecp.ui.controls;

import java.util.Objects;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.SkinBase;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.ecp.ui.ECPModelElementOpener;

public class TextFieldControl extends ECPControlBase {

	protected TextField textField;

	public TextFieldControl(IItemPropertyDescriptor propertyDescriptor, final EObject modelElement, final EditingDomain editingDomain) {
		super(propertyDescriptor, modelElement, editingDomain);

		setSkin(new Skin(this));
		
		textField.focusedProperty().addListener(new AutoSelector(textField));

		textField.focusedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observableValue, Boolean oldFocused, Boolean newFocused) {
				if (!newFocused) {
					Object oldText = modelElement.eGet(feature);
					String newText = textField.getText();

					// only commit if the value has changed
					if (!Objects.equals(oldText, newText)) {
						Command command = SetCommand.create(editingDomain, modelElement, feature, newText);
						if (command.canExecute())
							editingDomain.getCommandStack().execute(command);
					}
				}
			}

		});

		update();
	}

	@Override
	protected void update() {
		String value = (String) modelElement.eGet(feature);
		textField.setText(value);
	}

	protected class Skin extends SkinBase<TextFieldControl> {

		protected Skin(TextFieldControl control) {
			super(control);

			HBox hBox = new HBox();
			getChildren().add(hBox);

			textField = new TextField();
			hBox.getChildren().add(textField);
			HBox.setHgrow(textField, Priority.ALWAYS);
		}

	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public ECPControlBase createControl(IItemPropertyDescriptor itemPropertyDescriptor, EObject modelElement, EditingDomain editingDomain, ECPModelElementOpener modelElementOpener) {
			return new TextFieldControl(itemPropertyDescriptor, modelElement, editingDomain);
		}

	}

}

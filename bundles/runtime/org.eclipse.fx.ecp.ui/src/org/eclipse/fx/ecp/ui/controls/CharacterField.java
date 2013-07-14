package org.eclipse.fx.ecp.ui.controls;

import java.util.Objects;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.IndexRange;
import javafx.scene.control.SkinBase;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.ecp.ui.ECPControlContext;

public class CharacterField extends ECPControlBase {

	protected TextField textField;

	public CharacterField(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		super(propertyDescriptor, context);

		setSkin(new Skin(this));
		
		textField.focusedProperty().addListener(new AutoSelector(textField));

		textField.focusedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observableValue, Boolean oldFocused, Boolean newFocused) {
				if (!newFocused) {
					Character oldCharacter = (Character) modelElement.eGet(feature);
					String text = textField.getText();
					Character newCharacter = text != null && text.length() > 0 ? text.charAt(0) : null;
					
					// only commit if the value has changed
					if (!Objects.equals(oldCharacter, newCharacter)) {
						Command command = SetCommand.create(editingDomain, modelElement, feature, newCharacter);
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
		Object value = modelElement.eGet(feature);
		textField.setText(value.toString());
	}

	protected class Skin extends SkinBase<CharacterField> {

		protected Skin(CharacterField control) {
			super(control);

			HBox hBox = new HBox();
			getChildren().add(hBox);

			textField = new TextField() {

				@Override
				public void replaceText(int start, int end, String text) {
					String currentText = getText();
					StringBuffer sb = new StringBuffer(currentText);
					sb.replace(start, end, text);
					String tmp = sb.toString();

					if (validate(tmp))
						super.replaceText(start, end, text);
				}

				@Override
				public void replaceSelection(String text) {
					IndexRange selection = getSelection();
					int start = selection.getStart();
					int end = selection.getEnd();
					StringBuffer sb = new StringBuffer(getText());
					sb.replace(start, end, text);
					String tmp = sb.toString();

					if (validate(tmp))
						super.replaceSelection(text);
				}

				private boolean validate(String tmp) {
					return tmp.length() <= 1;
				}

			};
			hBox.getChildren().add(textField);
			textField.setPrefColumnCount(1);
		}

	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public ECPControlBase createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new CharacterField(itemPropertyDescriptor, context);
		}

	}

}

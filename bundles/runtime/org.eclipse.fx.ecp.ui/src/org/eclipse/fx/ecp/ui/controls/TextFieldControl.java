package org.eclipse.fx.ecp.ui.controls;

import java.util.Collection;
import java.util.Objects;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.Control;

import com.google.common.collect.Sets;

@SuppressWarnings("restriction")
public class TextFieldControl extends HBox implements Control {

	final Collection<EDataType> supportedTypes = Sets.newHashSet(
			EcorePackage.Literals.EBIG_DECIMAL, 
			EcorePackage.Literals.EBIG_INTEGER,
			EcorePackage.Literals.EBOOLEAN, 
			EcorePackage.Literals.ECHAR, 
			EcorePackage.Literals.ECHARACTER_OBJECT,
			EcorePackage.Literals.EDATE, 
			EcorePackage.Literals.EDOUBLE, 
			EcorePackage.Literals.EDOUBLE_OBJECT, 
			EcorePackage.Literals.EFLOAT,
			EcorePackage.Literals.EFLOAT_OBJECT, 
			EcorePackage.Literals.EINT, 
			EcorePackage.Literals.EINTEGER_OBJECT,
			EcorePackage.Literals.ELONG, 
			EcorePackage.Literals.ELONG_OBJECT, 
			EcorePackage.Literals.ESHORT,
			EcorePackage.Literals.ESHORT_OBJECT, 
			EcorePackage.Literals.ESTRING);
	private TextField textField;

	public boolean isControlFor(EDataType type) {
		return supportedTypes.contains(type);
	}

	public TextFieldControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {

		final EObject modelElement = context.getModelElement();
		final EditingDomain editingDomain = context.getEditingDomain();

		String displayName = propertyDescriptor.getDisplayName(modelElement);
		Label label = new Label(displayName);
		label.getStyleClass().add(IControlConstants.CONTROL_LABEL_CLASS);
		getChildren().add(label);

		final EStructuralFeature feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);

		//final EDataTypeValueHandler valueHandler = new EDataTypeValueHandler((EDataType) feature.getEType());

		Object value = modelElement.eGet(feature);

		textField = null;//new TextField(valueHandler.toString(value));

		textField.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observableValue, String oldText, String newText) {
				String message = "lala"; //valueHandler.isValid(newText);
				ObservableList<String> styleClass = textField.getStyleClass();
				if (message == null)
					styleClass.remove(IControlConstants.INVALID_CLASS);
				else if (!styleClass.contains(IControlConstants.INVALID_CLASS))
					styleClass.add(IControlConstants.INVALID_CLASS);
			}

		});

		textField.focusedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observableValue, Boolean oldFocused, Boolean newFocused) {
				if (!newFocused) {
					Object oldValue = modelElement.eGet(feature);
					String text = textField.getText();
					String message = "lala"; // valueHandler.isValid(text);

					if (message == null) {
						Object newValue = "lala"; // valueHandler.toValue(text);

						// only commit if the value has changed
						if (!Objects.equals(oldValue, newValue)) {
							Command command = SetCommand.create(editingDomain, modelElement, feature, newValue);
							if (command.canExecute())
								editingDomain.getCommandStack().execute(command);
						}
					} else {
						System.err.println(message);
					}
				}
			}

		});

		HBox.setHgrow(textField, Priority.ALWAYS);

		getChildren().add(textField);
	}

	@Override
	public void handleValidation(Diagnostic diagnostic) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resetValidation() {
		// TODO Auto-generated method stub

	}

	public static class Factory implements Control.Factory {

		@Override
		public Control createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new TextFieldControl(itemPropertyDescriptor, context);
		}

	}

}

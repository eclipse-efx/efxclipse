package org.eclipse.fx.ecp.ui.controls.multi;

import java.util.Objects;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.control.TextField;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.controls.IControlConstants;

public class EmbeddedTextFieldControl extends TextField implements EmbeddedControl {

	private final EDataTypeValueHandler valueHandler;
	private final EList<?> eList;
	private int index;

	public EmbeddedTextFieldControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context, int initialIndex) {

		final EObject modelElement = context.getModelElement();
		final EditingDomain editingDomain = context.getEditingDomain();
		final EStructuralFeature feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);
		valueHandler = new EDataTypeValueHandler((EDataType) feature.getEType());
		eList = (EList<?>) modelElement.eGet(feature);
		setIndex(initialIndex);

		textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observableValue, String oldText, String newText) {
				final String message = valueHandler.isValid(newText);
				ObservableList<String> styleClass = getStyleClass();
				if (message == null) {
					styleClass.remove(IControlConstants.INVALID_CLASS);
				} else {
					if (!styleClass.contains(IControlConstants.INVALID_CLASS))
						styleClass.add(IControlConstants.INVALID_CLASS);
				}
			}

		});

		focusedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observableValue, Boolean oldFocused, Boolean newFocused) {
				if (!newFocused) {
					Object oldValue = eList.get(index);
					String text = getText();
					String message = valueHandler.isValid(text);

					if (message == null) {
						Object newValue = valueHandler.toValue(text);

						// only commit if the value has changed
						if (!Objects.equals(oldValue, newValue)) {
							Command command = SetCommand.create(editingDomain, modelElement, feature, newValue, index);
							if (command.canExecute())
								editingDomain.getCommandStack().execute(command);
						}
					} else {
						System.err.println(message);
					}
				}
			}

		});

	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
		Object value = eList.get(index);
		setText(valueHandler.toString(value));
	}

}

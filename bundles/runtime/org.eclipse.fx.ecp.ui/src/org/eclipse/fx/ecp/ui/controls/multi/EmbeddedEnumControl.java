package org.eclipse.fx.ecp.ui.controls.multi;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ChoiceBox;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public class EmbeddedEnumControl extends ChoiceBox<Enumerator> implements EmbeddedControl {

	private final EList<?> eList;
	private int index;
	private volatile boolean internal;

	public EmbeddedEnumControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context, int initialIndex) {

		final EObject modelElement = context.getModelElement();
		final EditingDomain editingDomain = context.getEditingDomain();
		final EStructuralFeature feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);
		eList = (EList<?>) modelElement.eGet(feature);
		final EClassifier type = feature.getEType();
		final EEnum eEnum = (EEnum) type;
		final EList<EEnumLiteral> enumLiterals = eEnum.getELiterals();

		if (!feature.isRequired())
			getItems().add(null);

		for (EEnumLiteral literal : enumLiterals)
			getItems().add(literal.getInstance());

		getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Enumerator>() {

			@Override
			public void changed(ObservableValue<? extends Enumerator> observableValue, Enumerator oldValue, Enumerator newValue) {
				if (!internal) {
					Command command = SetCommand.create(editingDomain, modelElement, feature, newValue, index);
					if (command.canExecute()) {
						editingDomain.getCommandStack().execute(command);
					} else {
						internal = true;
						getSelectionModel().select(oldValue);
						internal = false;
					}
				}
			}

		});

		setIndex(initialIndex);
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
		Enumerator value = (Enumerator) eList.get(index);
		internal = true;
		getSelectionModel().select(value);
		internal = false;
	}

}

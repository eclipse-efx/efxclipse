package org.eclipse.fx.ecp.ui.controls.numeric;

import javafx.scene.Node;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;

public class FloatSpinner extends NumberSpinner {

	public FloatSpinner(IItemPropertyDescriptor propertyDescriptor, EObject modelElement, EStructuralFeature feature,
			EditingDomain editingDomain) {
		super(propertyDescriptor, modelElement, feature, editingDomain);

		setSkin(new NumberSpinnerSkin<NumberSpinner, Float>(this) {

			@Override
			boolean validate(String literal) {
				if (literal.matches("^\\-?[0-9]+\\.?[0-9]*$")) {
					try {
						Double.parseDouble(literal);
						return true;
					} catch (NumberFormatException e) {
						// do nothing
					}
				}
				return false;
			}

			@Override
			Float decrease(Float value) {
				return value - 1;
			}

			@Override
			Float increase(Float value) {
				return value + 1;
			}

			@Override
			Float parseValue(String literal) {
				try {
					return Float.parseFloat(literal);
				} catch (NumberFormatException e) {
					return 0.0f;
				}
			}

		});
	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public Node createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			EObject modelElement = context.getModelElement();
			EStructuralFeature feature = (EStructuralFeature) itemPropertyDescriptor.getFeature(modelElement);
			EditingDomain editingDomain = context.getEditingDomain();
			return new FloatSpinner(itemPropertyDescriptor, modelElement, feature, editingDomain);
		}

	}

}

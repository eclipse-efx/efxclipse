package org.eclipse.fx.ecp.ui.controls.numeric;

import javafx.scene.Node;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;

public class DoubleSpinner extends NumberSpinner {

	public DoubleSpinner(IItemPropertyDescriptor propertyDescriptor, EObject modelElement, EStructuralFeature feature,
			EditingDomain editingDomain) {
		super(propertyDescriptor, modelElement, feature, editingDomain);

		setSkin(new NumberSpinnerSkin<NumberSpinner, Double>(this) {

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
			Double decrease(Double value) {
				return value - 1;
			}

			@Override
			Double increase(Double value) {
				return value + 1;
			}

			@Override
			Double parseValue(String literal) {
				try {
					return Double.parseDouble(literal);
				} catch (NumberFormatException e) {
					return 0.0;
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
			return new DoubleSpinner(itemPropertyDescriptor, modelElement, feature, editingDomain);
		}

	}

}

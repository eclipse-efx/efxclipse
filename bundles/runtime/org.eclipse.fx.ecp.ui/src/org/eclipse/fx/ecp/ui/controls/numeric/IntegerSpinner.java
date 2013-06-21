package org.eclipse.fx.ecp.ui.controls.numeric;

import javafx.scene.Node;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;

public class IntegerSpinner extends NumberSpinner {

	public IntegerSpinner(IItemPropertyDescriptor propertyDescriptor, EObject modelElement, EStructuralFeature feature,
			EditingDomain editingDomain) {
		super(propertyDescriptor, modelElement, feature, editingDomain);
		
		setSkin(new NumberSpinnerSkin<NumberSpinner, Integer>(this) {

			@Override
			boolean validate(String literal) {
				if (literal.matches("^\\-?[0-9]*$")) {
					try {
						Integer.parseInt(literal);
						return true;
					} catch (NumberFormatException e) {
						// do nothing
					}
				}
				return false;
			}

			@Override
			Integer decrease(Integer value) {
				return value - 1;
			}

			@Override
			Integer increase(Integer value) {
				return value + 1;
			}

			@Override
			Integer parseValue(String literal) {
				try {
					return Integer.parseInt(literal);
				} catch (NumberFormatException e) {
					return 0;
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
			return new IntegerSpinner(itemPropertyDescriptor, modelElement, feature, editingDomain);
		}

	}

}

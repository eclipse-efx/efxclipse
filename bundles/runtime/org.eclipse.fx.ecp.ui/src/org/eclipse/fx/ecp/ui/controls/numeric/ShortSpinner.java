package org.eclipse.fx.ecp.ui.controls.numeric;

import javafx.scene.Node;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;

public class ShortSpinner extends NumberSpinner {

	public ShortSpinner(IItemPropertyDescriptor propertyDescriptor, EObject modelElement, EStructuralFeature feature,
			EditingDomain editingDomain) {
		super(propertyDescriptor, modelElement, feature, editingDomain);
		
		setSkin(new NumberSpinnerSkin<NumberSpinner, Short>(this) {

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
			Short decrease(Short value) {
				int decreased = value - 1;
				return decreased >= Short.MIN_VALUE ? (short) decreased : value;
			}

			@Override
			Short increase(Short value) {
				int increased = value + 1;
				return increased <= Short.MAX_VALUE ? (short) increased : value;
			}

			@Override
			Short parseValue(String literal) {
				try {
					return Short.parseShort(literal);
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
			return new ShortSpinner(itemPropertyDescriptor, modelElement, feature, editingDomain);
		}

	}

}

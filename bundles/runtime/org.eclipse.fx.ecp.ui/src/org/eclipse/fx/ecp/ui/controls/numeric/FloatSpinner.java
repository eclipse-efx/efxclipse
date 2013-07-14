package org.eclipse.fx.ecp.ui.controls.numeric;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.ecp.ui.controls.ECPControlBase;

public class FloatSpinner extends NumberSpinner {

	public static final float DEFAULT_VALUE = 0f;

	public FloatSpinner(IItemPropertyDescriptor propertyDescriptor, final EObject modelElement, final EditingDomain editingDomain) {
		super(propertyDescriptor, modelElement, editingDomain);

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
				if (value == null)
					value = DEFAULT_VALUE;
				return value - 1;
			}

			@Override
			Float increase(Float value) {
				if (value == null)
					value = DEFAULT_VALUE;
				return value + 1;
			}

			@Override
			Float parseValue(String literal) {
				try {
					return Float.parseFloat(literal);
				} catch (NumberFormatException e) {
					return DEFAULT_VALUE;
				}
			}

		});
	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public ECPControlBase createControl(IItemPropertyDescriptor itemPropertyDescriptor, EObject modelElement, EditingDomain editingDomain) {
			return new FloatSpinner(itemPropertyDescriptor, modelElement, editingDomain);
		}

	}

}

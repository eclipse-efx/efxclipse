package org.eclipse.fx.ecp.ui.controls.numeric;

import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.ecp.ui.controls.ECPControlBase;

public class DoubleSpinner extends NumberSpinner {

	public DoubleSpinner(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		super(propertyDescriptor, context);

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
		public ECPControlBase createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new DoubleSpinner(itemPropertyDescriptor, context);
		}

	}

}

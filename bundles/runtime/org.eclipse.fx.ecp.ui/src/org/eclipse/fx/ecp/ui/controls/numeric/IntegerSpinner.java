package org.eclipse.fx.ecp.ui.controls.numeric;

import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.ecp.ui.controls.ECPControlBase;

public class IntegerSpinner extends NumberSpinner {

	public IntegerSpinner(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		super(propertyDescriptor, context);
		
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
		public ECPControlBase createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new IntegerSpinner(itemPropertyDescriptor, context);
		}

	}

}

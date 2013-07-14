package org.eclipse.fx.ecp.ui.controls.numeric;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.ecp.ui.ECPControlContext;
import org.eclipse.fx.ecp.ui.controls.ECPControlBase;

public class ShortSpinner extends NumberSpinner {

	public static final short DEFAULT_VALUE = 0;

	public ShortSpinner(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		super(propertyDescriptor, context);

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
				if (value == null)
					value = DEFAULT_VALUE;
				int decreased = value - 1;
				return decreased >= Short.MIN_VALUE ? (short) decreased : value;
			}

			@Override
			Short increase(Short value) {
				if (value == null)
					value = DEFAULT_VALUE;
				int increased = value + 1;
				return increased <= Short.MAX_VALUE ? (short) increased : value;
			}

			@Override
			Short parseValue(String literal) {
				try {
					return Short.parseShort(literal);
				} catch (NumberFormatException e) {
					return DEFAULT_VALUE;
				}
			}

		});
	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public ECPControlBase createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new ShortSpinner(itemPropertyDescriptor, context);
		}

	}

}

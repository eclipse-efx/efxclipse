package org.eclipse.fx.ecp.ui.controls.numeric;

import java.math.BigDecimal;

import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.ecp.ui.controls.ECPControlBase;


public class BigDecimalSpinner extends NumberSpinner {

	public BigDecimalSpinner(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		super(propertyDescriptor, context);

		setSkin(new NumberSpinnerSkin<NumberSpinner, BigDecimal>(this) {

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
			BigDecimal decrease(BigDecimal value) {
				if(value == null)
					value = BigDecimal.ZERO;
				
				return value.subtract(BigDecimal.ONE);
			}

			@Override
			BigDecimal increase(BigDecimal value) {
				if(value == null)
					value = BigDecimal.ZERO;
				
				return value.add(BigDecimal.ONE);
			}

			@Override
			BigDecimal parseValue(String literal) {
				try {
					return new BigDecimal(literal);
				} catch (NumberFormatException e) {
					return BigDecimal.ZERO;
				}
			}

		});
	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public ECPControlBase createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new BigDecimalSpinner(itemPropertyDescriptor, context);
		}

	}

}

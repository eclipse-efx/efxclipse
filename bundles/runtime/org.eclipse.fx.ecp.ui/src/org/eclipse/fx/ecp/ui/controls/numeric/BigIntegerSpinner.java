package org.eclipse.fx.ecp.ui.controls.numeric;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.ecp.ui.controls.ECPControlBase;

public class BigIntegerSpinner extends NumberSpinner {

	private static final BigInteger DEFAULT_VALUE = BigInteger.ZERO;

	public BigIntegerSpinner(IItemPropertyDescriptor propertyDescriptor, final EObject modelElement, final EditingDomain editingDomain) {
		super(propertyDescriptor, modelElement, editingDomain);

		setSkin(new NumberSpinnerSkin<NumberSpinner, BigInteger>(this) {

			@Override
			boolean validate(String literal) {
				if (literal.matches("^\\-?[0-9]*$")) {
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
			BigInteger decrease(BigInteger value) {
				if (value == null)
					value = DEFAULT_VALUE;
				return value.subtract(BigInteger.ONE);
			}

			@Override
			BigInteger increase(BigInteger value) {
				if (value == null)
					value = DEFAULT_VALUE;
				return value.add(BigInteger.ONE);
			}

			@Override
			BigInteger parseValue(String literal) {
				try {
					return new BigInteger(literal);
				} catch (NumberFormatException e) {
					return DEFAULT_VALUE;
				}
			}

		});
	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public ECPControlBase createControl(IItemPropertyDescriptor itemPropertyDescriptor, EObject modelElement, EditingDomain editingDomain) {
			return new BigIntegerSpinner(itemPropertyDescriptor, modelElement, editingDomain);
		}

	}

}

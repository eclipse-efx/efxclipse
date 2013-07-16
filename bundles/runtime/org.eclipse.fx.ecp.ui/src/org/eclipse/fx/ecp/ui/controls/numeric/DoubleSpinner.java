package org.eclipse.fx.ecp.ui.controls.numeric;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.ecp.ui.ECPModelElementOpener;
import org.eclipse.fx.ecp.ui.controls.ECPControlBase;

public class DoubleSpinner extends NumberSpinner {

	public static final double DEFAULT_VALUE = 0.0;

	public DoubleSpinner(IItemPropertyDescriptor propertyDescriptor, final EObject modelElement, final EditingDomain editingDomain) {
		super(propertyDescriptor, modelElement, editingDomain);

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
				if (value == null)
					value = DEFAULT_VALUE;
				return value - 1;
			}

			@Override
			Double increase(Double value) {
				if (value == null)
					value = DEFAULT_VALUE;
				return value + 1;
			}

			@Override
			Double parseValue(String literal) {
				try {
					return Double.parseDouble(literal);
				} catch (NumberFormatException e) {
					return DEFAULT_VALUE;
				}
			}

		});
	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public ECPControlBase createControl(IItemPropertyDescriptor itemPropertyDescriptor, EObject modelElement, EditingDomain editingDomain, ECPModelElementOpener modelElementOpener) {
			return new DoubleSpinner(itemPropertyDescriptor, modelElement, editingDomain);
		}

	}

}

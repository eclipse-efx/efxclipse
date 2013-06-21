package org.eclipse.fx.ecp.ui.controls.numeric;

import java.math.BigInteger;

import javafx.scene.Node;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;

public class BigIntegerSpinner extends NumberSpinner {

	public BigIntegerSpinner(IItemPropertyDescriptor propertyDescriptor, EObject modelElement, EStructuralFeature feature,
			EditingDomain editingDomain) {
		super(propertyDescriptor, modelElement, feature, editingDomain);

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
					value = BigInteger.ZERO;

				return value.subtract(BigInteger.ONE);
			}

			@Override
			BigInteger increase(BigInteger value) {
				if (value == null)
					value = BigInteger.ZERO;

				return value.add(BigInteger.ONE);
			}

			@Override
			BigInteger parseValue(String literal) {
				try {
					return new BigInteger(literal);
				} catch (NumberFormatException e) {
					return BigInteger.ZERO;
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
			return new BigIntegerSpinner(itemPropertyDescriptor, modelElement, feature, editingDomain);
		}

	}

}

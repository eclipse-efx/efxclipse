package org.eclipse.fx.ecp.ui.controls.numeric;

import java.math.BigDecimal;

import javafx.scene.Node;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;

public class BigDecimalSpinner extends NumberSpinner {

	public BigDecimalSpinner(IItemPropertyDescriptor propertyDescriptor, EObject modelElement, EStructuralFeature feature,
			EditingDomain editingDomain) {
		super(propertyDescriptor, modelElement, feature, editingDomain);

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
		public Node createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			EObject modelElement = context.getModelElement();
			EStructuralFeature feature = (EStructuralFeature) itemPropertyDescriptor.getFeature(modelElement);
			EditingDomain editingDomain = context.getEditingDomain();
			return new BigDecimalSpinner(itemPropertyDescriptor, modelElement, feature, editingDomain);
		}

	}

}

package org.eclipse.fx.ecp.ui;

import java.util.Set;

import javafx.beans.property.Property;
import javafx.scene.control.TextField;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecp.edit.AbstractControl;
import org.eclipse.emf.ecp.edit.ControlDescription;
import org.eclipse.emf.ecp.edit.ControlFactory;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public class FXControlFactory implements ControlFactory {
	
	public static final FXControlFactory INSTANCE = new FXControlFactory();  

	@Override
	public <T> AbstractControl<T> createControl(T parent, IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
		return null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> AbstractControl<T> createControl(T parent, IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context,
			String controlId) {
		EStructuralFeature feature = (EStructuralFeature) itemPropertyDescriptor.getFeature(context.getModelElement());
		
		if(feature instanceof EAttribute) {
			EAttribute attribute = (EAttribute) feature;
			if(attribute.getEAttributeType() == EcorePackage.Literals.ESTRING) {
				return (AbstractControl<T>) new StringControl(true, itemPropertyDescriptor, feature, context, false);
			}
		}		
		
		return null;
	}

	@Override
	public Set<ControlDescription> getControlDescriptors() {
		// TODO Auto-generated method stub
		return null;
	}

}

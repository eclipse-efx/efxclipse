package org.eclipse.fx.ecp.ui;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.controls.ECPControlBase;
import org.eclipse.fx.ecp.ui.impl.ControlFactoryRegistryImpl;

public interface ECPControl {
	
	void dispose();

	interface Factory {
		
		ECPControlBase createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context);
		
		interface Descriptor {
			
			/**
			 * Creates a factory and returns it.
			 * <p>
			 * An implementation may and usually does choose to create only one instance,
			 * which it returns for each call.
			 * </p>
			 * @return a factory.
			 */
			Factory createFactory();
			
			String getID();
			
			boolean showLabel();
			
			Set<ECPApplicableTester> getTesters();
			
		}
		
		interface Registry {
			
			Registry INSTANCE = new ControlFactoryRegistryImpl();
			
			Factory getFactory(IItemPropertyDescriptor propertyDescriptor, EObject modelElement);
			
		}
		
	}

}

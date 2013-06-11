package org.eclipse.fx.ecp.ui;

import java.util.Set;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.ecp.edit.util.ECPApplicableTester;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.impl.ControlFactoryRegistryImpl;

public interface ECPControl {
	
	void handleValidation(Diagnostic diagnostic);
	
	void resetValidation();
	
	void dispose();

	interface Factory {
		
		ECPControl createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context);
		
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
			
			Factory getFactory(Class<?> controlClass, IItemPropertyDescriptor propertyDescriptor, EObject modelElement);
			
		}
		
	}

}

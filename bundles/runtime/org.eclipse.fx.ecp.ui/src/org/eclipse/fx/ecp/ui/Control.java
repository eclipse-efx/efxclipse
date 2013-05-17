package org.eclipse.fx.ecp.ui;

import java.util.Set;

import javafx.beans.property.Property;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.fx.ecp.ui.impl.ControlFactoryRegistryImpl;

@SuppressWarnings("restriction")
public interface Control {

	void handleValidation(Diagnostic diagnostic);

	void resetValidation();

	interface Factory {

		Control createControl(Property<?> property, EStructuralFeature feature, ECPControlContext context);

		interface Descriptor {

			/**
			 * Creates a factory and returns it.
			 * <p>
			 * An implementation may and usually does choose to create only one instance, which it returns for
			 * each call.
			 * </p>
			 * 
			 * @return a factory.
			 */
			Factory createFactory();

			String getID();

			boolean showLabel();

			Set<ApplicableTester> getTesters();

		}

		interface Registry {

			Registry INSTANCE = new ControlFactoryRegistryImpl();

			Factory getFactory(EStructuralFeature feature, EObject modelElement, boolean multi);

		}

	}

	public interface ApplicableTester {

		int NOT_APPLICABLE = -1;

		int isApplicable(EStructuralFeature feature, EObject eObject);

	}

}

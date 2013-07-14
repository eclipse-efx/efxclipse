package org.eclipse.fx.ecp.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * Context for a modelelement.
 */
public interface ECPControlContext {

	/**
	 * Returns the editing domain.
	 * 
	 * @return the editing domain
	 */
	EditingDomain getEditingDomain();

	/**
	 * Returns the {@link EObject} of this {@link ECPControlContext}.
	 * 
	 * @return the {@link EObject} of this context
	 */
	EObject getModelElement();

	/**
	 * Opens an {@link EObject} in a new context.
	 * 
	 * @param eObject
	 *            the {@link EObject} to open in a new context
	 */
	void openInNewContext(EObject eObject);

}

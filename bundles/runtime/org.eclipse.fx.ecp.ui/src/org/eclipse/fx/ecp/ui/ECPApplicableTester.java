/*******************************************************************************
 * Copyright (c) 2011-2013 EclipseSource Muenchen GmbH and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Eugen Neufeld - initial API and implementation
 * 
 *******************************************************************************/
package org.eclipse.fx.ecp.ui;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This interface defines a {@link #isApplicable(IItemPropertyDescriptor, EObject)} method which is used to determine
 * the priority of a control. The control with the highest priority for a combination of an {@link EObject} and a
 * feature will be used.
 * 
 * @author Eugen Neufeld
 * 
 */
public interface ECPApplicableTester {
	/**
	 * Return this whenever the control should not be drawn for the tested feature.
	 */
	int NOT_APPLICABLE = -1;

	/**
	 * Returns the priority of the corresponding control for the combination of the {@link EObject} and the
	 * {@link IItemPropertyDescriptor}.
	 * 
	 * @param itemPropertyDescriptor the {@link IItemPropertyDescriptor} to test
	 * @param eObject the {@link EObject} to test
	 * @return {@link #NOT_APPLICABLE} if the corresponding control should not be used, a positivie integer value
	 *         otherwise. The control with the highest priority will be taken.
	 */
	int isApplicable(IItemPropertyDescriptor itemPropertyDescriptor, EObject eObject);
}

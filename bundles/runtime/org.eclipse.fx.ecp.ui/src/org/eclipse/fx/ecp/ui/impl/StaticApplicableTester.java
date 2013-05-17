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
package org.eclipse.fx.ecp.ui.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.fx.ecp.ui.Control.ApplicableTester;

public class StaticApplicableTester implements ApplicableTester {

	private final int priority;
	private final Class<?> supportedClassType;
	private final Class<? extends EObject> supportedEObject;
	private final String supportedFeature;

	public StaticApplicableTester(int priority, Class<?> supportedClassType,
			Class<? extends EObject> supportedEObject, String supportedFeature) {
		this.priority = priority;
		this.supportedClassType = supportedClassType;
		this.supportedEObject = supportedEObject;
		this.supportedFeature = supportedFeature;
	}

	public int isApplicable(EStructuralFeature feature, EObject eObject) {

		// if the feature is a multiValue and the description is a singlevalue continue
//		if (isSingleValue() == feature.isMany()) {
//			return NOT_APPLICABLE;
//		}

		// if we have an attribute
		if (EAttribute.class.isInstance(feature)) {
			Class<?> instanceClass = ((EAttribute) feature).getEAttributeType().getInstanceClass();
			// if the attribute class is an primitive test the primitive types
			if (instanceClass.isPrimitive()) {
				try {
					Class<?> primitive = (Class<?>) getSupportedClassType().getField("TYPE").get(null); //$NON-NLS-1$
					if (!primitive.equals(instanceClass)) {
						return NOT_APPLICABLE;
					}

				} catch (IllegalArgumentException e) {
					return NOT_APPLICABLE;
				} catch (SecurityException e) {
					return NOT_APPLICABLE;
				} catch (IllegalAccessException e) {
					return NOT_APPLICABLE;
				} catch (NoSuchFieldException e) {
					return NOT_APPLICABLE;
				}
			}
			// otherwise test the classes itself
			else if (!getSupportedClassType().isAssignableFrom(instanceClass)) {
				return NOT_APPLICABLE;
			}
		}
		// if we have an reference the the classes
		else if (EReference.class.isInstance(feature)) {
			Class<?> instanceClass = feature.getEType().getInstanceClass();
			if (!getSupportedClassType().isAssignableFrom(instanceClass)) {
				return NOT_APPLICABLE;
			}
		}
		// if the supported eobject is assignable from the current eobject and the supported feature is either
		// null or equals the current one
		if (getSupportedEObject().isInstance(eObject)
				&& (getSupportedFeature() == null || eObject.eClass().getEStructuralFeature(getSupportedFeature()).equals(feature))) {
			return getPriority();
		}
		
		return NOT_APPLICABLE;
	}

	/**
	 * The static priority of the corresponding control.
	 * 
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * The eobejct which is supported by the corresponding control.
	 * 
	 * @return the class of the supported eobejct
	 */
	public Class<? extends EObject> getSupportedEObject() {
		return supportedEObject;
	}

	/**
	 * The name of the feature the corresponding control supports.
	 * 
	 * @return the name of the supported feature
	 */
	public String getSupportedFeature() {
		return supportedFeature;
	}

	/**
	 * The class of the type the corresponding control supports.
	 * 
	 * @return the class of the supported type
	 */
	public Class<?> getSupportedClassType() {
		return supportedClassType;
	}

}

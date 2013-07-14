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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * The implementation of the {@link ECPApplicableTester} for a static test, like defined in the staticTest element.
 * 
 * @author Eugen Neufeld
 * 
 */
public final class ECPStaticApplicableTester implements ECPApplicableTester {

	private final boolean singleValue;
	private final int priority;
	private final Class<?> supportedClassType;
	private final Class<? extends EObject> supportedEObject;
	private final String supportedFeature;

	/**
	 * The constructor of the static tester.
	 * 
	 * @param singleValue whether the corresponding control supports only single valued features
	 * @param priority the static priority
	 * @param supportedClassType the class of the supported type
	 * @param supportedEObject the eobject this tester allows
	 * @param supportedFeature the feature this tester allows
	 */
	public ECPStaticApplicableTester(boolean singleValue, int priority, Class<?> supportedClassType,
		Class<? extends EObject> supportedEObject, String supportedFeature) {
		this.singleValue = singleValue;
		this.priority = priority;
		this.supportedClassType = supportedClassType;
		this.supportedEObject = supportedEObject;
		this.supportedFeature = supportedFeature;
	}

	/**
	 * {@inheritDoc}
	 */
	public int isApplicable(IItemPropertyDescriptor itemPropertyDescriptor, EObject eObject) {
		// if the feature is a multiValue and the description is a singlevalue continue
		if (isSingleValue() == itemPropertyDescriptor.isMany(eObject)) {
			return NOT_APPLICABLE;
		}
		EStructuralFeature feature = (EStructuralFeature) itemPropertyDescriptor.getFeature(eObject);
		// if we have an attribute
		if (EAttribute.class.isInstance(feature)) {
			Class<?> instanceClass = ((EAttribute) feature).getEAttributeType().getInstanceClass();
			if (instanceClass == null) {
				return NOT_APPLICABLE;
			}
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
			if (instanceClass == null) {
				instanceClass = EObject.class;
			}
			if (!getSupportedClassType().isAssignableFrom(instanceClass)) {
				return NOT_APPLICABLE;
			}
		}
		// if the supported eobject is assignable from the current eobject and the supported feature is eitehr null or
		// equals the current one
		if (getSupportedEObject().isInstance(eObject)
			&& (getSupportedFeature() == null || feature.equals(eObject.eClass().getEStructuralFeature(getSupportedFeature())))) {
			return getPriority();
		}
		return NOT_APPLICABLE;
	}
	/**
	 * Whether the corresponding control is allowed only for single values.
	 * @return true if only a single value is allows
	 */
	public boolean isSingleValue() {
		return singleValue;
	}
	/**
	 * The static priority of the corresponding control. 
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}
	/**
	 * The eobejct which is supported by the corresponding control.
	 * @return the class of the supported eobejct
	 */
	public Class<? extends EObject> getSupportedEObject() {
		return supportedEObject;
	}
	/**
	 * The name of the feature the corresponding control supports. 
	 * @return the name of the supported feature
	 */
	public String getSupportedFeature() {
		return supportedFeature;
	}
	/**
	 * The class of the type the corresponding control supports.
	 * @return the class of the supported type
	 */
	public Class<?> getSupportedClassType() {
		return supportedClassType;
	}
}

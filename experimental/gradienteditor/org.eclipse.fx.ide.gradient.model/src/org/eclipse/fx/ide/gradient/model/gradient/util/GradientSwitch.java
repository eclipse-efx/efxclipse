/**
 */
package org.eclipse.fx.ide.gradient.model.gradient.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.fx.ide.gradient.model.gradient.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.gradient.model.gradient.GradientPackage
 * @generated
 */
public class GradientSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GradientPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientSwitch() {
		if (modelPackage == null) {
			modelPackage = GradientPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GradientPackage.FX_GRADIENT: {
				FxGradient fxGradient = (FxGradient)theEObject;
				T result = caseFxGradient(fxGradient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GradientPackage.FX_LINEAR_GRADIENT: {
				FxLinearGradient fxLinearGradient = (FxLinearGradient)theEObject;
				T result = caseFxLinearGradient(fxLinearGradient);
				if (result == null) result = caseFxGradient(fxLinearGradient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GradientPackage.FX_RADIAL_GRADIENT: {
				FxRadialGradient fxRadialGradient = (FxRadialGradient)theEObject;
				T result = caseFxRadialGradient(fxRadialGradient);
				if (result == null) result = caseFxGradient(fxRadialGradient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GradientPackage.FX_STOP: {
				FxStop fxStop = (FxStop)theEObject;
				T result = caseFxStop(fxStop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GradientPackage.FX_COLOR: {
				FxColor fxColor = (FxColor)theEObject;
				T result = caseFxColor(fxColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GradientPackage.RGB_FX_COLOR: {
				RgbFxColor rgbFxColor = (RgbFxColor)theEObject;
				T result = caseRgbFxColor(rgbFxColor);
				if (result == null) result = caseFxColor(rgbFxColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fx Gradient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fx Gradient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFxGradient(FxGradient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fx Linear Gradient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fx Linear Gradient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFxLinearGradient(FxLinearGradient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fx Radial Gradient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fx Radial Gradient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFxRadialGradient(FxRadialGradient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fx Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fx Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFxStop(FxStop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fx Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fx Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFxColor(FxColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rgb Fx Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rgb Fx Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRgbFxColor(RgbFxColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GradientSwitch

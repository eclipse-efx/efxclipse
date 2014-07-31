/**
 */
package org.eclipse.fx.ide.gradient.model.gradient;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.gradient.model.gradient.GradientPackage
 * @generated
 */
public interface GradientFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GradientFactory eINSTANCE = org.eclipse.fx.ide.gradient.model.gradient.impl.GradientFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fx Linear Gradient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fx Linear Gradient</em>'.
	 * @generated
	 */
	FxLinearGradient createFxLinearGradient();

	/**
	 * Returns a new object of class '<em>Fx Radial Gradient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fx Radial Gradient</em>'.
	 * @generated
	 */
	FxRadialGradient createFxRadialGradient();

	/**
	 * Returns a new object of class '<em>Fx Stop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fx Stop</em>'.
	 * @generated
	 */
	FxStop createFxStop();

	/**
	 * Returns a new object of class '<em>Rgb Fx Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rgb Fx Color</em>'.
	 * @generated
	 */
	RgbFxColor createRgbFxColor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GradientPackage getGradientPackage();

} //GradientFactory

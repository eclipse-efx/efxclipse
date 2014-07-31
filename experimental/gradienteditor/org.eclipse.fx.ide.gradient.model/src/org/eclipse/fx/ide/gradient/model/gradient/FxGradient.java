/**
 */
package org.eclipse.fx.ide.gradient.model.gradient;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fx Gradient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.FxGradient#isProportional <em>Proportional</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.FxGradient#getCycleMethod <em>Cycle Method</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.FxGradient#getStops <em>Stops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.gradient.model.gradient.GradientPackage#getFxGradient()
 * @model abstract="true"
 * @generated
 */
public interface FxGradient extends EObject {
	/**
	 * Returns the value of the '<em><b>Proportional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proportional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proportional</em>' attribute.
	 * @see #setProportional(boolean)
	 * @see org.eclipse.fx.ide.gradient.model.gradient.GradientPackage#getFxGradient_Proportional()
	 * @model
	 * @generated
	 */
	boolean isProportional();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.gradient.model.gradient.FxGradient#isProportional <em>Proportional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proportional</em>' attribute.
	 * @see #isProportional()
	 * @generated
	 */
	void setProportional(boolean value);

	/**
	 * Returns the value of the '<em><b>Cycle Method</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fx.ide.gradient.model.gradient.FxCycleMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycle Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycle Method</em>' attribute.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxCycleMethod
	 * @see #setCycleMethod(FxCycleMethod)
	 * @see org.eclipse.fx.ide.gradient.model.gradient.GradientPackage#getFxGradient_CycleMethod()
	 * @model
	 * @generated
	 */
	FxCycleMethod getCycleMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.gradient.model.gradient.FxGradient#getCycleMethod <em>Cycle Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycle Method</em>' attribute.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxCycleMethod
	 * @see #getCycleMethod()
	 * @generated
	 */
	void setCycleMethod(FxCycleMethod value);

	/**
	 * Returns the value of the '<em><b>Stops</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.gradient.model.gradient.FxStop}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stops</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stops</em>' containment reference list.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.GradientPackage#getFxGradient_Stops()
	 * @model containment="true"
	 * @generated
	 */
	EList<FxStop> getStops();

} // FxGradient

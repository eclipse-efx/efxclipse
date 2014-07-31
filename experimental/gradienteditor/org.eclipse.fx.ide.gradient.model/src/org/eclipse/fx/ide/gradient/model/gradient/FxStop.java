/**
 */
package org.eclipse.fx.ide.gradient.model.gradient;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fx Stop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.FxStop#getColor <em>Color</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.FxStop#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.gradient.model.gradient.GradientPackage#getFxStop()
 * @model
 * @generated
 */
public interface FxStop extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' containment reference.
	 * @see #setColor(FxColor)
	 * @see org.eclipse.fx.ide.gradient.model.gradient.GradientPackage#getFxStop_Color()
	 * @model containment="true"
	 * @generated
	 */
	FxColor getColor();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.gradient.model.gradient.FxStop#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(FxColor value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(double)
	 * @see org.eclipse.fx.ide.gradient.model.gradient.GradientPackage#getFxStop_Offset()
	 * @model
	 * @generated
	 */
	double getOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.gradient.model.gradient.FxStop#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(double value);

} // FxStop

/**
 */
package org.eclipse.fx.ide.gradient.model.gradient.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.fx.ide.gradient.model.gradient.FxLinearGradient;
import org.eclipse.fx.ide.gradient.model.gradient.GradientPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fx Linear Gradient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxLinearGradientImpl#getStartX <em>Start X</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxLinearGradientImpl#getStartY <em>Start Y</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxLinearGradientImpl#getEndX <em>End X</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxLinearGradientImpl#getEndY <em>End Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FxLinearGradientImpl extends FxGradientImpl implements FxLinearGradient {
	/**
	 * The default value of the '{@link #getStartX() <em>Start X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartX()
	 * @generated
	 * @ordered
	 */
	protected static final double START_X_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getStartX() <em>Start X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartX()
	 * @generated
	 * @ordered
	 */
	protected double startX = START_X_EDEFAULT;
	/**
	 * The default value of the '{@link #getStartY() <em>Start Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartY()
	 * @generated
	 * @ordered
	 */
	protected static final double START_Y_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getStartY() <em>Start Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartY()
	 * @generated
	 * @ordered
	 */
	protected double startY = START_Y_EDEFAULT;
	/**
	 * The default value of the '{@link #getEndX() <em>End X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndX()
	 * @generated
	 * @ordered
	 */
	protected static final double END_X_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getEndX() <em>End X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndX()
	 * @generated
	 * @ordered
	 */
	protected double endX = END_X_EDEFAULT;
	/**
	 * The default value of the '{@link #getEndY() <em>End Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndY()
	 * @generated
	 * @ordered
	 */
	protected static final double END_Y_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getEndY() <em>End Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndY()
	 * @generated
	 * @ordered
	 */
	protected double endY = END_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FxLinearGradientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GradientPackage.Literals.FX_LINEAR_GRADIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStartX() {
		return startX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartX(double newStartX) {
		double oldStartX = startX;
		startX = newStartX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GradientPackage.FX_LINEAR_GRADIENT__START_X, oldStartX, startX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStartY() {
		return startY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartY(double newStartY) {
		double oldStartY = startY;
		startY = newStartY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GradientPackage.FX_LINEAR_GRADIENT__START_Y, oldStartY, startY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEndX() {
		return endX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndX(double newEndX) {
		double oldEndX = endX;
		endX = newEndX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GradientPackage.FX_LINEAR_GRADIENT__END_X, oldEndX, endX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEndY() {
		return endY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndY(double newEndY) {
		double oldEndY = endY;
		endY = newEndY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GradientPackage.FX_LINEAR_GRADIENT__END_Y, oldEndY, endY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GradientPackage.FX_LINEAR_GRADIENT__START_X:
				return getStartX();
			case GradientPackage.FX_LINEAR_GRADIENT__START_Y:
				return getStartY();
			case GradientPackage.FX_LINEAR_GRADIENT__END_X:
				return getEndX();
			case GradientPackage.FX_LINEAR_GRADIENT__END_Y:
				return getEndY();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GradientPackage.FX_LINEAR_GRADIENT__START_X:
				setStartX((Double)newValue);
				return;
			case GradientPackage.FX_LINEAR_GRADIENT__START_Y:
				setStartY((Double)newValue);
				return;
			case GradientPackage.FX_LINEAR_GRADIENT__END_X:
				setEndX((Double)newValue);
				return;
			case GradientPackage.FX_LINEAR_GRADIENT__END_Y:
				setEndY((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GradientPackage.FX_LINEAR_GRADIENT__START_X:
				setStartX(START_X_EDEFAULT);
				return;
			case GradientPackage.FX_LINEAR_GRADIENT__START_Y:
				setStartY(START_Y_EDEFAULT);
				return;
			case GradientPackage.FX_LINEAR_GRADIENT__END_X:
				setEndX(END_X_EDEFAULT);
				return;
			case GradientPackage.FX_LINEAR_GRADIENT__END_Y:
				setEndY(END_Y_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GradientPackage.FX_LINEAR_GRADIENT__START_X:
				return startX != START_X_EDEFAULT;
			case GradientPackage.FX_LINEAR_GRADIENT__START_Y:
				return startY != START_Y_EDEFAULT;
			case GradientPackage.FX_LINEAR_GRADIENT__END_X:
				return endX != END_X_EDEFAULT;
			case GradientPackage.FX_LINEAR_GRADIENT__END_Y:
				return endY != END_Y_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (startX: ");
		result.append(startX);
		result.append(", startY: ");
		result.append(startY);
		result.append(", endX: ");
		result.append(endX);
		result.append(", endY: ");
		result.append(endY);
		result.append(')');
		return result.toString();
	}

} //FxLinearGradientImpl

/**
 */
package org.eclipse.fx.ide.gradient.model.gradient.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.fx.ide.gradient.model.gradient.FxRadialGradient;
import org.eclipse.fx.ide.gradient.model.gradient.GradientPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fx Radial Gradient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxRadialGradientImpl#getFocusAngle <em>Focus Angle</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxRadialGradientImpl#getFocusDistance <em>Focus Distance</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxRadialGradientImpl#getCenterX <em>Center X</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxRadialGradientImpl#getCenterY <em>Center Y</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxRadialGradientImpl#getRadius <em>Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FxRadialGradientImpl extends FxGradientImpl implements FxRadialGradient {
	/**
	 * The default value of the '{@link #getFocusAngle() <em>Focus Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocusAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double FOCUS_ANGLE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getFocusAngle() <em>Focus Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocusAngle()
	 * @generated
	 * @ordered
	 */
	protected double focusAngle = FOCUS_ANGLE_EDEFAULT;
	/**
	 * The default value of the '{@link #getFocusDistance() <em>Focus Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocusDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double FOCUS_DISTANCE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getFocusDistance() <em>Focus Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocusDistance()
	 * @generated
	 * @ordered
	 */
	protected double focusDistance = FOCUS_DISTANCE_EDEFAULT;
	/**
	 * The default value of the '{@link #getCenterX() <em>Center X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterX()
	 * @generated
	 * @ordered
	 */
	protected static final double CENTER_X_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getCenterX() <em>Center X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterX()
	 * @generated
	 * @ordered
	 */
	protected double centerX = CENTER_X_EDEFAULT;
	/**
	 * The default value of the '{@link #getCenterY() <em>Center Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterY()
	 * @generated
	 * @ordered
	 */
	protected static final double CENTER_Y_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getCenterY() <em>Center Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterY()
	 * @generated
	 * @ordered
	 */
	protected double centerY = CENTER_Y_EDEFAULT;
	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIUS_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected double radius = RADIUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FxRadialGradientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GradientPackage.Literals.FX_RADIAL_GRADIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFocusAngle() {
		return focusAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocusAngle(double newFocusAngle) {
		double oldFocusAngle = focusAngle;
		focusAngle = newFocusAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GradientPackage.FX_RADIAL_GRADIENT__FOCUS_ANGLE, oldFocusAngle, focusAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFocusDistance() {
		return focusDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocusDistance(double newFocusDistance) {
		double oldFocusDistance = focusDistance;
		focusDistance = newFocusDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GradientPackage.FX_RADIAL_GRADIENT__FOCUS_DISTANCE, oldFocusDistance, focusDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCenterX() {
		return centerX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenterX(double newCenterX) {
		double oldCenterX = centerX;
		centerX = newCenterX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GradientPackage.FX_RADIAL_GRADIENT__CENTER_X, oldCenterX, centerX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCenterY() {
		return centerY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenterY(double newCenterY) {
		double oldCenterY = centerY;
		centerY = newCenterY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GradientPackage.FX_RADIAL_GRADIENT__CENTER_Y, oldCenterY, centerY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(double newRadius) {
		double oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GradientPackage.FX_RADIAL_GRADIENT__RADIUS, oldRadius, radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GradientPackage.FX_RADIAL_GRADIENT__FOCUS_ANGLE:
				return getFocusAngle();
			case GradientPackage.FX_RADIAL_GRADIENT__FOCUS_DISTANCE:
				return getFocusDistance();
			case GradientPackage.FX_RADIAL_GRADIENT__CENTER_X:
				return getCenterX();
			case GradientPackage.FX_RADIAL_GRADIENT__CENTER_Y:
				return getCenterY();
			case GradientPackage.FX_RADIAL_GRADIENT__RADIUS:
				return getRadius();
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
			case GradientPackage.FX_RADIAL_GRADIENT__FOCUS_ANGLE:
				setFocusAngle((Double)newValue);
				return;
			case GradientPackage.FX_RADIAL_GRADIENT__FOCUS_DISTANCE:
				setFocusDistance((Double)newValue);
				return;
			case GradientPackage.FX_RADIAL_GRADIENT__CENTER_X:
				setCenterX((Double)newValue);
				return;
			case GradientPackage.FX_RADIAL_GRADIENT__CENTER_Y:
				setCenterY((Double)newValue);
				return;
			case GradientPackage.FX_RADIAL_GRADIENT__RADIUS:
				setRadius((Double)newValue);
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
			case GradientPackage.FX_RADIAL_GRADIENT__FOCUS_ANGLE:
				setFocusAngle(FOCUS_ANGLE_EDEFAULT);
				return;
			case GradientPackage.FX_RADIAL_GRADIENT__FOCUS_DISTANCE:
				setFocusDistance(FOCUS_DISTANCE_EDEFAULT);
				return;
			case GradientPackage.FX_RADIAL_GRADIENT__CENTER_X:
				setCenterX(CENTER_X_EDEFAULT);
				return;
			case GradientPackage.FX_RADIAL_GRADIENT__CENTER_Y:
				setCenterY(CENTER_Y_EDEFAULT);
				return;
			case GradientPackage.FX_RADIAL_GRADIENT__RADIUS:
				setRadius(RADIUS_EDEFAULT);
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
			case GradientPackage.FX_RADIAL_GRADIENT__FOCUS_ANGLE:
				return focusAngle != FOCUS_ANGLE_EDEFAULT;
			case GradientPackage.FX_RADIAL_GRADIENT__FOCUS_DISTANCE:
				return focusDistance != FOCUS_DISTANCE_EDEFAULT;
			case GradientPackage.FX_RADIAL_GRADIENT__CENTER_X:
				return centerX != CENTER_X_EDEFAULT;
			case GradientPackage.FX_RADIAL_GRADIENT__CENTER_Y:
				return centerY != CENTER_Y_EDEFAULT;
			case GradientPackage.FX_RADIAL_GRADIENT__RADIUS:
				return radius != RADIUS_EDEFAULT;
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
		result.append(" (focusAngle: ");
		result.append(focusAngle);
		result.append(", focusDistance: ");
		result.append(focusDistance);
		result.append(", centerX: ");
		result.append(centerX);
		result.append(", centerY: ");
		result.append(centerY);
		result.append(", radius: ");
		result.append(radius);
		result.append(')');
		return result.toString();
	}

} //FxRadialGradientImpl

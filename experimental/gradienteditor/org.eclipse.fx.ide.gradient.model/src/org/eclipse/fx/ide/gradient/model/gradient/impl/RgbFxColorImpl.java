/**
 */
package org.eclipse.fx.ide.gradient.model.gradient.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fx.ide.gradient.model.gradient.GradientPackage;
import org.eclipse.fx.ide.gradient.model.gradient.RgbFxColor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rgb Fx Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.impl.RgbFxColorImpl#getRed <em>Red</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.impl.RgbFxColorImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.impl.RgbFxColorImpl#getBlue <em>Blue</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.impl.RgbFxColorImpl#getOpacity <em>Opacity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RgbFxColorImpl extends FxColorImpl implements RgbFxColor {
	/**
	 * The default value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected static final double RED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected double red = RED_EDEFAULT;

	/**
	 * The default value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected static final double GREEN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected double green = GREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected static final double BLUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected double blue = BLUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final double OPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected double opacity = OPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RgbFxColorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GradientPackage.Literals.RGB_FX_COLOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRed() {
		return red;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRed(double newRed) {
		double oldRed = red;
		red = newRed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GradientPackage.RGB_FX_COLOR__RED, oldRed, red));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGreen() {
		return green;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreen(double newGreen) {
		double oldGreen = green;
		green = newGreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GradientPackage.RGB_FX_COLOR__GREEN, oldGreen, green));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBlue() {
		return blue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlue(double newBlue) {
		double oldBlue = blue;
		blue = newBlue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GradientPackage.RGB_FX_COLOR__BLUE, oldBlue, blue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOpacity() {
		return opacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpacity(double newOpacity) {
		double oldOpacity = opacity;
		opacity = newOpacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GradientPackage.RGB_FX_COLOR__OPACITY, oldOpacity, opacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GradientPackage.RGB_FX_COLOR__RED:
				return getRed();
			case GradientPackage.RGB_FX_COLOR__GREEN:
				return getGreen();
			case GradientPackage.RGB_FX_COLOR__BLUE:
				return getBlue();
			case GradientPackage.RGB_FX_COLOR__OPACITY:
				return getOpacity();
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
			case GradientPackage.RGB_FX_COLOR__RED:
				setRed((Double)newValue);
				return;
			case GradientPackage.RGB_FX_COLOR__GREEN:
				setGreen((Double)newValue);
				return;
			case GradientPackage.RGB_FX_COLOR__BLUE:
				setBlue((Double)newValue);
				return;
			case GradientPackage.RGB_FX_COLOR__OPACITY:
				setOpacity((Double)newValue);
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
			case GradientPackage.RGB_FX_COLOR__RED:
				setRed(RED_EDEFAULT);
				return;
			case GradientPackage.RGB_FX_COLOR__GREEN:
				setGreen(GREEN_EDEFAULT);
				return;
			case GradientPackage.RGB_FX_COLOR__BLUE:
				setBlue(BLUE_EDEFAULT);
				return;
			case GradientPackage.RGB_FX_COLOR__OPACITY:
				setOpacity(OPACITY_EDEFAULT);
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
			case GradientPackage.RGB_FX_COLOR__RED:
				return red != RED_EDEFAULT;
			case GradientPackage.RGB_FX_COLOR__GREEN:
				return green != GREEN_EDEFAULT;
			case GradientPackage.RGB_FX_COLOR__BLUE:
				return blue != BLUE_EDEFAULT;
			case GradientPackage.RGB_FX_COLOR__OPACITY:
				return opacity != OPACITY_EDEFAULT;
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
		result.append(" (red: ");
		result.append(red);
		result.append(", green: ");
		result.append(green);
		result.append(", blue: ");
		result.append(blue);
		result.append(", opacity: ");
		result.append(opacity);
		result.append(')');
		return result.toString();
	}

} //RgbFxColorImpl

/**
 */
package org.eclipse.fx.ide.gradient.model.gradient.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.fx.ide.gradient.model.gradient.FxCycleMethod;
import org.eclipse.fx.ide.gradient.model.gradient.FxGradient;
import org.eclipse.fx.ide.gradient.model.gradient.FxStop;
import org.eclipse.fx.ide.gradient.model.gradient.GradientPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fx Gradient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxGradientImpl#isProportional <em>Proportional</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxGradientImpl#getCycleMethod <em>Cycle Method</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxGradientImpl#getStops <em>Stops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FxGradientImpl extends MinimalEObjectImpl.Container implements FxGradient {
	/**
	 * The default value of the '{@link #isProportional() <em>Proportional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProportional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROPORTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProportional() <em>Proportional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProportional()
	 * @generated
	 * @ordered
	 */
	protected boolean proportional = PROPORTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCycleMethod() <em>Cycle Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleMethod()
	 * @generated
	 * @ordered
	 */
	protected static final FxCycleMethod CYCLE_METHOD_EDEFAULT = FxCycleMethod.NO_CYCLE;

	/**
	 * The cached value of the '{@link #getCycleMethod() <em>Cycle Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleMethod()
	 * @generated
	 * @ordered
	 */
	protected FxCycleMethod cycleMethod = CYCLE_METHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStops() <em>Stops</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStops()
	 * @generated
	 * @ordered
	 */
	protected EList<FxStop> stops;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FxGradientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GradientPackage.Literals.FX_GRADIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProportional() {
		return proportional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProportional(boolean newProportional) {
		boolean oldProportional = proportional;
		proportional = newProportional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GradientPackage.FX_GRADIENT__PROPORTIONAL, oldProportional, proportional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxCycleMethod getCycleMethod() {
		return cycleMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycleMethod(FxCycleMethod newCycleMethod) {
		FxCycleMethod oldCycleMethod = cycleMethod;
		cycleMethod = newCycleMethod == null ? CYCLE_METHOD_EDEFAULT : newCycleMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GradientPackage.FX_GRADIENT__CYCLE_METHOD, oldCycleMethod, cycleMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FxStop> getStops() {
		if (stops == null) {
			stops = new EObjectContainmentEList<FxStop>(FxStop.class, this, GradientPackage.FX_GRADIENT__STOPS);
		}
		return stops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GradientPackage.FX_GRADIENT__STOPS:
				return ((InternalEList<?>)getStops()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GradientPackage.FX_GRADIENT__PROPORTIONAL:
				return isProportional();
			case GradientPackage.FX_GRADIENT__CYCLE_METHOD:
				return getCycleMethod();
			case GradientPackage.FX_GRADIENT__STOPS:
				return getStops();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GradientPackage.FX_GRADIENT__PROPORTIONAL:
				setProportional((Boolean)newValue);
				return;
			case GradientPackage.FX_GRADIENT__CYCLE_METHOD:
				setCycleMethod((FxCycleMethod)newValue);
				return;
			case GradientPackage.FX_GRADIENT__STOPS:
				getStops().clear();
				getStops().addAll((Collection<? extends FxStop>)newValue);
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
			case GradientPackage.FX_GRADIENT__PROPORTIONAL:
				setProportional(PROPORTIONAL_EDEFAULT);
				return;
			case GradientPackage.FX_GRADIENT__CYCLE_METHOD:
				setCycleMethod(CYCLE_METHOD_EDEFAULT);
				return;
			case GradientPackage.FX_GRADIENT__STOPS:
				getStops().clear();
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
			case GradientPackage.FX_GRADIENT__PROPORTIONAL:
				return proportional != PROPORTIONAL_EDEFAULT;
			case GradientPackage.FX_GRADIENT__CYCLE_METHOD:
				return cycleMethod != CYCLE_METHOD_EDEFAULT;
			case GradientPackage.FX_GRADIENT__STOPS:
				return stops != null && !stops.isEmpty();
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
		result.append(" (proportional: ");
		result.append(proportional);
		result.append(", cycleMethod: ");
		result.append(cycleMethod);
		result.append(')');
		return result.toString();
	}

} //FxGradientImpl

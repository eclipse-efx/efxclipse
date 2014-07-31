/**
 */
package org.eclipse.fx.ide.gradient.model.gradient.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.fx.ide.gradient.model.gradient.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.gradient.model.gradient.GradientPackage
 * @generated
 */
public class GradientAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GradientPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GradientPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradientSwitch<Adapter> modelSwitch =
		new GradientSwitch<Adapter>() {
			@Override
			public Adapter caseFxGradient(FxGradient object) {
				return createFxGradientAdapter();
			}
			@Override
			public Adapter caseFxLinearGradient(FxLinearGradient object) {
				return createFxLinearGradientAdapter();
			}
			@Override
			public Adapter caseFxRadialGradient(FxRadialGradient object) {
				return createFxRadialGradientAdapter();
			}
			@Override
			public Adapter caseFxStop(FxStop object) {
				return createFxStopAdapter();
			}
			@Override
			public Adapter caseFxColor(FxColor object) {
				return createFxColorAdapter();
			}
			@Override
			public Adapter caseRgbFxColor(RgbFxColor object) {
				return createRgbFxColorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.gradient.model.gradient.FxGradient <em>Fx Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxGradient
	 * @generated
	 */
	public Adapter createFxGradientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.gradient.model.gradient.FxLinearGradient <em>Fx Linear Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxLinearGradient
	 * @generated
	 */
	public Adapter createFxLinearGradientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.gradient.model.gradient.FxRadialGradient <em>Fx Radial Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxRadialGradient
	 * @generated
	 */
	public Adapter createFxRadialGradientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.gradient.model.gradient.FxStop <em>Fx Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxStop
	 * @generated
	 */
	public Adapter createFxStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.gradient.model.gradient.FxColor <em>Fx Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxColor
	 * @generated
	 */
	public Adapter createFxColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.gradient.model.gradient.RgbFxColor <em>Rgb Fx Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.RgbFxColor
	 * @generated
	 */
	public Adapter createRgbFxColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GradientAdapterFactory

/**
 */
package org.eclipse.fx.ide.gradient.model.gradient.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.fx.ide.gradient.model.gradient.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GradientFactoryImpl extends EFactoryImpl implements GradientFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GradientFactory init() {
		try {
			GradientFactory theGradientFactory = (GradientFactory)EPackage.Registry.INSTANCE.getEFactory(GradientPackage.eNS_URI);
			if (theGradientFactory != null) {
				return theGradientFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GradientFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GradientPackage.FX_LINEAR_GRADIENT: return createFxLinearGradient();
			case GradientPackage.FX_RADIAL_GRADIENT: return createFxRadialGradient();
			case GradientPackage.FX_STOP: return createFxStop();
			case GradientPackage.RGB_FX_COLOR: return createRgbFxColor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GradientPackage.FX_CYCLE_METHOD:
				return createFxCycleMethodFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GradientPackage.FX_CYCLE_METHOD:
				return convertFxCycleMethodToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxLinearGradient createFxLinearGradient() {
		FxLinearGradientImpl fxLinearGradient = new FxLinearGradientImpl();
		return fxLinearGradient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxRadialGradient createFxRadialGradient() {
		FxRadialGradientImpl fxRadialGradient = new FxRadialGradientImpl();
		return fxRadialGradient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxStop createFxStop() {
		FxStopImpl fxStop = new FxStopImpl();
		return fxStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RgbFxColor createRgbFxColor() {
		RgbFxColorImpl rgbFxColor = new RgbFxColorImpl();
		return rgbFxColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxCycleMethod createFxCycleMethodFromString(EDataType eDataType, String initialValue) {
		FxCycleMethod result = FxCycleMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFxCycleMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientPackage getGradientPackage() {
		return (GradientPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GradientPackage getPackage() {
		return GradientPackage.eINSTANCE;
	}

} //GradientFactoryImpl

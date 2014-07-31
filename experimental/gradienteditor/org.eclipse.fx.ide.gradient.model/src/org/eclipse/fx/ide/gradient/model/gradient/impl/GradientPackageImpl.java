/**
 */
package org.eclipse.fx.ide.gradient.model.gradient.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.fx.ide.gradient.model.gradient.FxColor;
import org.eclipse.fx.ide.gradient.model.gradient.FxCycleMethod;
import org.eclipse.fx.ide.gradient.model.gradient.FxGradient;
import org.eclipse.fx.ide.gradient.model.gradient.FxLinearGradient;
import org.eclipse.fx.ide.gradient.model.gradient.FxRadialGradient;
import org.eclipse.fx.ide.gradient.model.gradient.FxStop;
import org.eclipse.fx.ide.gradient.model.gradient.GradientFactory;
import org.eclipse.fx.ide.gradient.model.gradient.GradientPackage;
import org.eclipse.fx.ide.gradient.model.gradient.RgbFxColor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GradientPackageImpl extends EPackageImpl implements GradientPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxGradientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxLinearGradientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxRadialGradientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxStopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rgbFxColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fxCycleMethodEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.fx.ide.gradient.model.gradient.GradientPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GradientPackageImpl() {
		super(eNS_URI, GradientFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GradientPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GradientPackage init() {
		if (isInited) return (GradientPackage)EPackage.Registry.INSTANCE.getEPackage(GradientPackage.eNS_URI);

		// Obtain or create and register package
		GradientPackageImpl theGradientPackage = (GradientPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GradientPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GradientPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGradientPackage.createPackageContents();

		// Initialize created meta-data
		theGradientPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGradientPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GradientPackage.eNS_URI, theGradientPackage);
		return theGradientPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxGradient() {
		return fxGradientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxGradient_Proportional() {
		return (EAttribute)fxGradientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxGradient_CycleMethod() {
		return (EAttribute)fxGradientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxGradient_Stops() {
		return (EReference)fxGradientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxLinearGradient() {
		return fxLinearGradientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxLinearGradient_StartX() {
		return (EAttribute)fxLinearGradientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxLinearGradient_StartY() {
		return (EAttribute)fxLinearGradientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxLinearGradient_EndX() {
		return (EAttribute)fxLinearGradientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxLinearGradient_EndY() {
		return (EAttribute)fxLinearGradientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxRadialGradient() {
		return fxRadialGradientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxRadialGradient_FocusAngle() {
		return (EAttribute)fxRadialGradientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxRadialGradient_FocusDistance() {
		return (EAttribute)fxRadialGradientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxRadialGradient_CenterX() {
		return (EAttribute)fxRadialGradientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxRadialGradient_CenterY() {
		return (EAttribute)fxRadialGradientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxRadialGradient_Radius() {
		return (EAttribute)fxRadialGradientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxStop() {
		return fxStopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFxStop_Color() {
		return (EReference)fxStopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFxStop_Offset() {
		return (EAttribute)fxStopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFxColor() {
		return fxColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRgbFxColor() {
		return rgbFxColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRgbFxColor_Red() {
		return (EAttribute)rgbFxColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRgbFxColor_Green() {
		return (EAttribute)rgbFxColorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRgbFxColor_Blue() {
		return (EAttribute)rgbFxColorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRgbFxColor_Opacity() {
		return (EAttribute)rgbFxColorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFxCycleMethod() {
		return fxCycleMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientFactory getGradientFactory() {
		return (GradientFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		fxGradientEClass = createEClass(FX_GRADIENT);
		createEAttribute(fxGradientEClass, FX_GRADIENT__PROPORTIONAL);
		createEAttribute(fxGradientEClass, FX_GRADIENT__CYCLE_METHOD);
		createEReference(fxGradientEClass, FX_GRADIENT__STOPS);

		fxLinearGradientEClass = createEClass(FX_LINEAR_GRADIENT);
		createEAttribute(fxLinearGradientEClass, FX_LINEAR_GRADIENT__START_X);
		createEAttribute(fxLinearGradientEClass, FX_LINEAR_GRADIENT__START_Y);
		createEAttribute(fxLinearGradientEClass, FX_LINEAR_GRADIENT__END_X);
		createEAttribute(fxLinearGradientEClass, FX_LINEAR_GRADIENT__END_Y);

		fxRadialGradientEClass = createEClass(FX_RADIAL_GRADIENT);
		createEAttribute(fxRadialGradientEClass, FX_RADIAL_GRADIENT__FOCUS_ANGLE);
		createEAttribute(fxRadialGradientEClass, FX_RADIAL_GRADIENT__FOCUS_DISTANCE);
		createEAttribute(fxRadialGradientEClass, FX_RADIAL_GRADIENT__CENTER_X);
		createEAttribute(fxRadialGradientEClass, FX_RADIAL_GRADIENT__CENTER_Y);
		createEAttribute(fxRadialGradientEClass, FX_RADIAL_GRADIENT__RADIUS);

		fxStopEClass = createEClass(FX_STOP);
		createEReference(fxStopEClass, FX_STOP__COLOR);
		createEAttribute(fxStopEClass, FX_STOP__OFFSET);

		fxColorEClass = createEClass(FX_COLOR);

		rgbFxColorEClass = createEClass(RGB_FX_COLOR);
		createEAttribute(rgbFxColorEClass, RGB_FX_COLOR__RED);
		createEAttribute(rgbFxColorEClass, RGB_FX_COLOR__GREEN);
		createEAttribute(rgbFxColorEClass, RGB_FX_COLOR__BLUE);
		createEAttribute(rgbFxColorEClass, RGB_FX_COLOR__OPACITY);

		// Create enums
		fxCycleMethodEEnum = createEEnum(FX_CYCLE_METHOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fxLinearGradientEClass.getESuperTypes().add(this.getFxGradient());
		fxRadialGradientEClass.getESuperTypes().add(this.getFxGradient());
		rgbFxColorEClass.getESuperTypes().add(this.getFxColor());

		// Initialize classes, features, and operations; add parameters
		initEClass(fxGradientEClass, FxGradient.class, "FxGradient", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFxGradient_Proportional(), ecorePackage.getEBoolean(), "proportional", null, 0, 1, FxGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFxGradient_CycleMethod(), this.getFxCycleMethod(), "cycleMethod", null, 0, 1, FxGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFxGradient_Stops(), this.getFxStop(), null, "stops", null, 0, -1, FxGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fxLinearGradientEClass, FxLinearGradient.class, "FxLinearGradient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFxLinearGradient_StartX(), ecorePackage.getEDouble(), "startX", null, 0, 1, FxLinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFxLinearGradient_StartY(), ecorePackage.getEDouble(), "startY", null, 0, 1, FxLinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFxLinearGradient_EndX(), ecorePackage.getEDouble(), "endX", null, 0, 1, FxLinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFxLinearGradient_EndY(), ecorePackage.getEDouble(), "endY", null, 0, 1, FxLinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fxRadialGradientEClass, FxRadialGradient.class, "FxRadialGradient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFxRadialGradient_FocusAngle(), ecorePackage.getEDouble(), "focusAngle", null, 0, 1, FxRadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFxRadialGradient_FocusDistance(), ecorePackage.getEDouble(), "focusDistance", null, 0, 1, FxRadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFxRadialGradient_CenterX(), ecorePackage.getEDouble(), "centerX", null, 0, 1, FxRadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFxRadialGradient_CenterY(), ecorePackage.getEDouble(), "centerY", null, 0, 1, FxRadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFxRadialGradient_Radius(), ecorePackage.getEDouble(), "radius", null, 0, 1, FxRadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fxStopEClass, FxStop.class, "FxStop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFxStop_Color(), this.getFxColor(), null, "color", null, 0, 1, FxStop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFxStop_Offset(), ecorePackage.getEDouble(), "offset", null, 0, 1, FxStop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fxColorEClass, FxColor.class, "FxColor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rgbFxColorEClass, RgbFxColor.class, "RgbFxColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRgbFxColor_Red(), ecorePackage.getEDouble(), "red", null, 0, 1, RgbFxColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRgbFxColor_Green(), ecorePackage.getEDouble(), "green", null, 0, 1, RgbFxColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRgbFxColor_Blue(), ecorePackage.getEDouble(), "blue", null, 0, 1, RgbFxColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRgbFxColor_Opacity(), ecorePackage.getEDouble(), "opacity", null, 0, 1, RgbFxColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fxCycleMethodEEnum, FxCycleMethod.class, "FxCycleMethod");
		addEEnumLiteral(fxCycleMethodEEnum, FxCycleMethod.NO_CYCLE);
		addEEnumLiteral(fxCycleMethodEEnum, FxCycleMethod.REFLECT);
		addEEnumLiteral(fxCycleMethodEEnum, FxCycleMethod.REPEAT);

		// Create resource
		createResource(eNS_URI);
	}

} //GradientPackageImpl

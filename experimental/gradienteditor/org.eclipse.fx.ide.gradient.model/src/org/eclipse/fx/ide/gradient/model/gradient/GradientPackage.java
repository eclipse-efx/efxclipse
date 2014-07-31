/**
 */
package org.eclipse.fx.ide.gradient.model.gradient;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.gradient.model.gradient.GradientFactory
 * @model kind="package"
 * @generated
 */
public interface GradientPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gradient";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/efxclipse/tooling/fxgraph/Gradient";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gradient";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GradientPackage eINSTANCE = org.eclipse.fx.ide.gradient.model.gradient.impl.GradientPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxGradientImpl <em>Fx Gradient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.FxGradientImpl
	 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.GradientPackageImpl#getFxGradient()
	 * @generated
	 */
	int FX_GRADIENT = 0;

	/**
	 * The feature id for the '<em><b>Proportional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_GRADIENT__PROPORTIONAL = 0;

	/**
	 * The feature id for the '<em><b>Cycle Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_GRADIENT__CYCLE_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Stops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_GRADIENT__STOPS = 2;

	/**
	 * The number of structural features of the '<em>Fx Gradient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_GRADIENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Fx Gradient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_GRADIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxLinearGradientImpl <em>Fx Linear Gradient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.FxLinearGradientImpl
	 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.GradientPackageImpl#getFxLinearGradient()
	 * @generated
	 */
	int FX_LINEAR_GRADIENT = 1;

	/**
	 * The feature id for the '<em><b>Proportional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LINEAR_GRADIENT__PROPORTIONAL = FX_GRADIENT__PROPORTIONAL;

	/**
	 * The feature id for the '<em><b>Cycle Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LINEAR_GRADIENT__CYCLE_METHOD = FX_GRADIENT__CYCLE_METHOD;

	/**
	 * The feature id for the '<em><b>Stops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LINEAR_GRADIENT__STOPS = FX_GRADIENT__STOPS;

	/**
	 * The feature id for the '<em><b>Start X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LINEAR_GRADIENT__START_X = FX_GRADIENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LINEAR_GRADIENT__START_Y = FX_GRADIENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LINEAR_GRADIENT__END_X = FX_GRADIENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LINEAR_GRADIENT__END_Y = FX_GRADIENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fx Linear Gradient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LINEAR_GRADIENT_FEATURE_COUNT = FX_GRADIENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Fx Linear Gradient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LINEAR_GRADIENT_OPERATION_COUNT = FX_GRADIENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxRadialGradientImpl <em>Fx Radial Gradient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.FxRadialGradientImpl
	 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.GradientPackageImpl#getFxRadialGradient()
	 * @generated
	 */
	int FX_RADIAL_GRADIENT = 2;

	/**
	 * The feature id for the '<em><b>Proportional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIAL_GRADIENT__PROPORTIONAL = FX_GRADIENT__PROPORTIONAL;

	/**
	 * The feature id for the '<em><b>Cycle Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIAL_GRADIENT__CYCLE_METHOD = FX_GRADIENT__CYCLE_METHOD;

	/**
	 * The feature id for the '<em><b>Stops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIAL_GRADIENT__STOPS = FX_GRADIENT__STOPS;

	/**
	 * The feature id for the '<em><b>Focus Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIAL_GRADIENT__FOCUS_ANGLE = FX_GRADIENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Focus Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIAL_GRADIENT__FOCUS_DISTANCE = FX_GRADIENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Center X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIAL_GRADIENT__CENTER_X = FX_GRADIENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Center Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIAL_GRADIENT__CENTER_Y = FX_GRADIENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIAL_GRADIENT__RADIUS = FX_GRADIENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Fx Radial Gradient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIAL_GRADIENT_FEATURE_COUNT = FX_GRADIENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Fx Radial Gradient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIAL_GRADIENT_OPERATION_COUNT = FX_GRADIENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxStopImpl <em>Fx Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.FxStopImpl
	 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.GradientPackageImpl#getFxStop()
	 * @generated
	 */
	int FX_STOP = 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_STOP__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_STOP__OFFSET = 1;

	/**
	 * The number of structural features of the '<em>Fx Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_STOP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Fx Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_STOP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxColorImpl <em>Fx Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.FxColorImpl
	 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.GradientPackageImpl#getFxColor()
	 * @generated
	 */
	int FX_COLOR = 4;

	/**
	 * The number of structural features of the '<em>Fx Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_COLOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Fx Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_COLOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.gradient.model.gradient.impl.RgbFxColorImpl <em>Rgb Fx Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.RgbFxColorImpl
	 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.GradientPackageImpl#getRgbFxColor()
	 * @generated
	 */
	int RGB_FX_COLOR = 5;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_FX_COLOR__RED = FX_COLOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_FX_COLOR__GREEN = FX_COLOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_FX_COLOR__BLUE = FX_COLOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_FX_COLOR__OPACITY = FX_COLOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rgb Fx Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_FX_COLOR_FEATURE_COUNT = FX_COLOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Rgb Fx Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_FX_COLOR_OPERATION_COUNT = FX_COLOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.gradient.model.gradient.FxCycleMethod <em>Fx Cycle Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxCycleMethod
	 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.GradientPackageImpl#getFxCycleMethod()
	 * @generated
	 */
	int FX_CYCLE_METHOD = 6;

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.gradient.model.gradient.FxGradient <em>Fx Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fx Gradient</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxGradient
	 * @generated
	 */
	EClass getFxGradient();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gradient.model.gradient.FxGradient#isProportional <em>Proportional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proportional</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxGradient#isProportional()
	 * @see #getFxGradient()
	 * @generated
	 */
	EAttribute getFxGradient_Proportional();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gradient.model.gradient.FxGradient#getCycleMethod <em>Cycle Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cycle Method</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxGradient#getCycleMethod()
	 * @see #getFxGradient()
	 * @generated
	 */
	EAttribute getFxGradient_CycleMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.gradient.model.gradient.FxGradient#getStops <em>Stops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stops</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxGradient#getStops()
	 * @see #getFxGradient()
	 * @generated
	 */
	EReference getFxGradient_Stops();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.gradient.model.gradient.FxLinearGradient <em>Fx Linear Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fx Linear Gradient</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxLinearGradient
	 * @generated
	 */
	EClass getFxLinearGradient();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gradient.model.gradient.FxLinearGradient#getStartX <em>Start X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start X</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxLinearGradient#getStartX()
	 * @see #getFxLinearGradient()
	 * @generated
	 */
	EAttribute getFxLinearGradient_StartX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gradient.model.gradient.FxLinearGradient#getStartY <em>Start Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Y</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxLinearGradient#getStartY()
	 * @see #getFxLinearGradient()
	 * @generated
	 */
	EAttribute getFxLinearGradient_StartY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gradient.model.gradient.FxLinearGradient#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxLinearGradient#getEndX()
	 * @see #getFxLinearGradient()
	 * @generated
	 */
	EAttribute getFxLinearGradient_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gradient.model.gradient.FxLinearGradient#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxLinearGradient#getEndY()
	 * @see #getFxLinearGradient()
	 * @generated
	 */
	EAttribute getFxLinearGradient_EndY();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.gradient.model.gradient.FxRadialGradient <em>Fx Radial Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fx Radial Gradient</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxRadialGradient
	 * @generated
	 */
	EClass getFxRadialGradient();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gradient.model.gradient.FxRadialGradient#getFocusAngle <em>Focus Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Focus Angle</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxRadialGradient#getFocusAngle()
	 * @see #getFxRadialGradient()
	 * @generated
	 */
	EAttribute getFxRadialGradient_FocusAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gradient.model.gradient.FxRadialGradient#getFocusDistance <em>Focus Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Focus Distance</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxRadialGradient#getFocusDistance()
	 * @see #getFxRadialGradient()
	 * @generated
	 */
	EAttribute getFxRadialGradient_FocusDistance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gradient.model.gradient.FxRadialGradient#getCenterX <em>Center X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Center X</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxRadialGradient#getCenterX()
	 * @see #getFxRadialGradient()
	 * @generated
	 */
	EAttribute getFxRadialGradient_CenterX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gradient.model.gradient.FxRadialGradient#getCenterY <em>Center Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Center Y</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxRadialGradient#getCenterY()
	 * @see #getFxRadialGradient()
	 * @generated
	 */
	EAttribute getFxRadialGradient_CenterY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gradient.model.gradient.FxRadialGradient#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxRadialGradient#getRadius()
	 * @see #getFxRadialGradient()
	 * @generated
	 */
	EAttribute getFxRadialGradient_Radius();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.gradient.model.gradient.FxStop <em>Fx Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fx Stop</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxStop
	 * @generated
	 */
	EClass getFxStop();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.gradient.model.gradient.FxStop#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxStop#getColor()
	 * @see #getFxStop()
	 * @generated
	 */
	EReference getFxStop_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gradient.model.gradient.FxStop#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxStop#getOffset()
	 * @see #getFxStop()
	 * @generated
	 */
	EAttribute getFxStop_Offset();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.gradient.model.gradient.FxColor <em>Fx Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fx Color</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxColor
	 * @generated
	 */
	EClass getFxColor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.gradient.model.gradient.RgbFxColor <em>Rgb Fx Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rgb Fx Color</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.RgbFxColor
	 * @generated
	 */
	EClass getRgbFxColor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gradient.model.gradient.RgbFxColor#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.RgbFxColor#getRed()
	 * @see #getRgbFxColor()
	 * @generated
	 */
	EAttribute getRgbFxColor_Red();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gradient.model.gradient.RgbFxColor#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.RgbFxColor#getGreen()
	 * @see #getRgbFxColor()
	 * @generated
	 */
	EAttribute getRgbFxColor_Green();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gradient.model.gradient.RgbFxColor#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.RgbFxColor#getBlue()
	 * @see #getRgbFxColor()
	 * @generated
	 */
	EAttribute getRgbFxColor_Blue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gradient.model.gradient.RgbFxColor#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.RgbFxColor#getOpacity()
	 * @see #getRgbFxColor()
	 * @generated
	 */
	EAttribute getRgbFxColor_Opacity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fx.ide.gradient.model.gradient.FxCycleMethod <em>Fx Cycle Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fx Cycle Method</em>'.
	 * @see org.eclipse.fx.ide.gradient.model.gradient.FxCycleMethod
	 * @generated
	 */
	EEnum getFxCycleMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GradientFactory getGradientFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxGradientImpl <em>Fx Gradient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.FxGradientImpl
		 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.GradientPackageImpl#getFxGradient()
		 * @generated
		 */
		EClass FX_GRADIENT = eINSTANCE.getFxGradient();

		/**
		 * The meta object literal for the '<em><b>Proportional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_GRADIENT__PROPORTIONAL = eINSTANCE.getFxGradient_Proportional();

		/**
		 * The meta object literal for the '<em><b>Cycle Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_GRADIENT__CYCLE_METHOD = eINSTANCE.getFxGradient_CycleMethod();

		/**
		 * The meta object literal for the '<em><b>Stops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_GRADIENT__STOPS = eINSTANCE.getFxGradient_Stops();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxLinearGradientImpl <em>Fx Linear Gradient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.FxLinearGradientImpl
		 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.GradientPackageImpl#getFxLinearGradient()
		 * @generated
		 */
		EClass FX_LINEAR_GRADIENT = eINSTANCE.getFxLinearGradient();

		/**
		 * The meta object literal for the '<em><b>Start X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_LINEAR_GRADIENT__START_X = eINSTANCE.getFxLinearGradient_StartX();

		/**
		 * The meta object literal for the '<em><b>Start Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_LINEAR_GRADIENT__START_Y = eINSTANCE.getFxLinearGradient_StartY();

		/**
		 * The meta object literal for the '<em><b>End X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_LINEAR_GRADIENT__END_X = eINSTANCE.getFxLinearGradient_EndX();

		/**
		 * The meta object literal for the '<em><b>End Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_LINEAR_GRADIENT__END_Y = eINSTANCE.getFxLinearGradient_EndY();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxRadialGradientImpl <em>Fx Radial Gradient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.FxRadialGradientImpl
		 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.GradientPackageImpl#getFxRadialGradient()
		 * @generated
		 */
		EClass FX_RADIAL_GRADIENT = eINSTANCE.getFxRadialGradient();

		/**
		 * The meta object literal for the '<em><b>Focus Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_RADIAL_GRADIENT__FOCUS_ANGLE = eINSTANCE.getFxRadialGradient_FocusAngle();

		/**
		 * The meta object literal for the '<em><b>Focus Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_RADIAL_GRADIENT__FOCUS_DISTANCE = eINSTANCE.getFxRadialGradient_FocusDistance();

		/**
		 * The meta object literal for the '<em><b>Center X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_RADIAL_GRADIENT__CENTER_X = eINSTANCE.getFxRadialGradient_CenterX();

		/**
		 * The meta object literal for the '<em><b>Center Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_RADIAL_GRADIENT__CENTER_Y = eINSTANCE.getFxRadialGradient_CenterY();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_RADIAL_GRADIENT__RADIUS = eINSTANCE.getFxRadialGradient_Radius();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxStopImpl <em>Fx Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.FxStopImpl
		 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.GradientPackageImpl#getFxStop()
		 * @generated
		 */
		EClass FX_STOP = eINSTANCE.getFxStop();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_STOP__COLOR = eINSTANCE.getFxStop_Color();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_STOP__OFFSET = eINSTANCE.getFxStop_Offset();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.gradient.model.gradient.impl.FxColorImpl <em>Fx Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.FxColorImpl
		 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.GradientPackageImpl#getFxColor()
		 * @generated
		 */
		EClass FX_COLOR = eINSTANCE.getFxColor();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.gradient.model.gradient.impl.RgbFxColorImpl <em>Rgb Fx Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.RgbFxColorImpl
		 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.GradientPackageImpl#getRgbFxColor()
		 * @generated
		 */
		EClass RGB_FX_COLOR = eINSTANCE.getRgbFxColor();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_FX_COLOR__RED = eINSTANCE.getRgbFxColor_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_FX_COLOR__GREEN = eINSTANCE.getRgbFxColor_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_FX_COLOR__BLUE = eINSTANCE.getRgbFxColor_Blue();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_FX_COLOR__OPACITY = eINSTANCE.getRgbFxColor_Opacity();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.gradient.model.gradient.FxCycleMethod <em>Fx Cycle Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.gradient.model.gradient.FxCycleMethod
		 * @see org.eclipse.fx.ide.gradient.model.gradient.impl.GradientPackageImpl#getFxCycleMethod()
		 * @generated
		 */
		EEnum FX_CYCLE_METHOD = eINSTANCE.getFxCycleMethod();

	}

} //GradientPackage

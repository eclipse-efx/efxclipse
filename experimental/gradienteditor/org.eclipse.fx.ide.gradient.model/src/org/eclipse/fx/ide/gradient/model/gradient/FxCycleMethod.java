/**
 */
package org.eclipse.fx.ide.gradient.model.gradient;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fx Cycle Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.gradient.model.gradient.GradientPackage#getFxCycleMethod()
 * @model
 * @generated
 */
public enum FxCycleMethod implements Enumerator {
	/**
	 * The '<em><b>No Cycle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CYCLE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_CYCLE(0, "noCycle", "noCycle"),

	/**
	 * The '<em><b>Reflect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFLECT_VALUE
	 * @generated
	 * @ordered
	 */
	REFLECT(1, "reflect", "reflect"),

	/**
	 * The '<em><b>Repeat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPEAT_VALUE
	 * @generated
	 * @ordered
	 */
	REPEAT(2, "repeat", "repeat");

	/**
	 * The '<em><b>No Cycle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Cycle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_CYCLE
	 * @model name="noCycle"
	 * @generated
	 * @ordered
	 */
	public static final int NO_CYCLE_VALUE = 0;

	/**
	 * The '<em><b>Reflect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reflect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFLECT
	 * @model name="reflect"
	 * @generated
	 * @ordered
	 */
	public static final int REFLECT_VALUE = 1;

	/**
	 * The '<em><b>Repeat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Repeat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPEAT
	 * @model name="repeat"
	 * @generated
	 * @ordered
	 */
	public static final int REPEAT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Fx Cycle Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FxCycleMethod[] VALUES_ARRAY =
		new FxCycleMethod[] {
			NO_CYCLE,
			REFLECT,
			REPEAT,
		};

	/**
	 * A public read-only list of all the '<em><b>Fx Cycle Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FxCycleMethod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fx Cycle Method</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FxCycleMethod get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FxCycleMethod result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fx Cycle Method</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FxCycleMethod getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FxCycleMethod result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fx Cycle Method</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FxCycleMethod get(int value) {
		switch (value) {
			case NO_CYCLE_VALUE: return NO_CYCLE;
			case REFLECT_VALUE: return REFLECT;
			case REPEAT_VALUE: return REPEAT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FxCycleMethod(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FxCycleMethod

package at.bestsolution.efxclipse.ecp.ui.controls;

import javafx.scene.Node;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public class FormControlFactory {

	public Node createFormControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {

		EObject modelElement = context.getModelElement();
		EStructuralFeature feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);

		EClassifier type = feature.getEType();

		if (feature.isMany()) {
			if (type == EcorePackage.Literals.ESTRING) {
				return new MultiTextControl(propertyDescriptor, context);
			}
			if (feature instanceof EReference) {
				return new MultiReferenceControl(propertyDescriptor, context);
			}
		} else {

			if (type == EcorePackage.Literals.EBOOLEAN) {
				return new CheckBoxControl(propertyDescriptor, context);
			} else if (type instanceof EEnum) {
				return new EnumControl(propertyDescriptor, context);
			} else if (feature instanceof EAttribute) {
				TextFieldControl textFieldControl = new TextFieldControl(propertyDescriptor, context);
				if (type instanceof EDataType && textFieldControl.isControlFor((EDataType) type))
					return textFieldControl;
			} else if (feature instanceof EReference) {
				return new ReferenceControl(propertyDescriptor, context);
			}

		}

		return new DummyControl(propertyDescriptor, context);

	}

}

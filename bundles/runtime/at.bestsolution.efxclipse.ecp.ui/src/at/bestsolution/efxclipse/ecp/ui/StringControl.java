package at.bestsolution.efxclipse.ecp.ui;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.databinding.edit.EditingDomainEObjectObservableValue;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecp.edit.AbstractControl;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public class StringControl extends AbstractControl<Node> {

	public StringControl(boolean showLabel, IItemPropertyDescriptor itemPropertyDescriptor, EStructuralFeature feature,
			ECPControlContext modelElementContext, boolean embedded) {
		super(showLabel, itemPropertyDescriptor, feature, modelElementContext, embedded);
	}

	@Override
	public Node createControl(Node parent) {
		IItemPropertyDescriptor descriptor = getItemPropertyDescriptor();
		EObject modelElement = getModelElementContext().getModelElement();
		EditingDomain editingDomain = getModelElementContext().getEditingDomain();
		DataBindingContext dataBindingContext = getModelElementContext().getDataBindingContext();
		
		HBox hBox = new HBox();
		
		Label label = new Label(descriptor.getDisplayName(modelElement));
		label.setPrefWidth(150);
		hBox.getChildren().add(label);
		
		Object feature = descriptor.getFeature(modelElement);

		if(feature instanceof EAttribute) {
			EAttribute attribute = (EAttribute) feature;
			if(attribute.getEAttributeType() == EcorePackage.Literals.ESTRING) {
				TextField textField = new TextField();
				HBox.setHgrow(textField, Priority.ALWAYS);
				hBox.getChildren().add(textField);
				
				//Property<String> textProperty = EMFEditFXProperties.value(editingDomain, modelElement, attribute);
				//textField.textProperty().bindBidirectional(textProperty);
				
				FXPropertyObservableValue<String> targetObservableValue = new FXPropertyObservableValue<String>(textField.textProperty());
				
				EditingDomainEObjectObservableValue modelObservableValue = new EditingDomainEObjectObservableValue(editingDomain, modelElement, attribute);
				
				dataBindingContext.bindValue(targetObservableValue, modelObservableValue);
			}
		}
		
		return null;
	}

	@Override
	public void dispose() {
		// do nothing
	}

	@Override
	public void handleValidation(Diagnostic diagnostic) {
		// TODO Auto-generated method stub
	}

	@Override
	public void resetValidation() {
		// TODO Auto-generated method stub
	}

	@Override
	public void setEditable(boolean isEditable) {
		// TODO Auto-generated method stub
	}

}

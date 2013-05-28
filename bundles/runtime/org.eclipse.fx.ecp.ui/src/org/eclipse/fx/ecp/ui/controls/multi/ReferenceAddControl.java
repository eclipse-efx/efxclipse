package org.eclipse.fx.ecp.ui.controls.multi;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

public class ReferenceAddControl extends HBox {
	
	private Button addButton;
	private Command addCommand;
	final private EditingDomain editingDomain;
	final private EStructuralFeature feature;
	final private EObject modelElement;

	public ReferenceAddControl(final EditingDomain editingDomain, final EStructuralFeature feature, final EObject modelElement) {
		this.editingDomain = editingDomain;
		this.feature = feature;
		this.modelElement = modelElement;

		addButton = new Button();
		getChildren().add(addButton);
		addButton.getStyleClass().add("reference-add-button");
		
		StackPane cssNode = new StackPane();
        cssNode.getStyleClass().add("mark");
        addButton.setGraphic(new Group(cssNode));
		
		addButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
			    EClass eClass = (EClass) feature.getEType();
				
			    EObject obj = EcoreUtil.create(eClass);
				
			    Command command = AddCommand.create(editingDomain, modelElement, feature, obj);
			    
				if(command.canExecute()) {
					editingDomain.getCommandStack().execute(command);
					// un-focus the button
					requestFocus();
				}
			}

		});
		
		modelElement.eAdapters().add(new AdapterImpl() {
			
			@Override
			public void notifyChanged(Notification msg) {
				if(msg.getFeature() == feature)
					updateAddButton();
			}
			
		});
		
		updateAddButton();
	}
	
	private void updateAddButton() {
		
	}

}

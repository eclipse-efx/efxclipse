package org.eclipse.fx.ecp.ui.controls.multi;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

public class ReferenceAddControl extends Button {

	final protected EditingDomain editingDomain;
	final protected EReference reference;
	final protected EObject modelElement;
	final protected EClass eClass;
	protected Command addCommand;

	public ReferenceAddControl(final EditingDomain editingDomain, final EReference reference, final EObject modelElement) {
		this.editingDomain = editingDomain;
		this.reference = reference;
		eClass = (EClass) reference.getEType();
		this.modelElement = modelElement;

		StackPane cssNode = new StackPane();
		cssNode.getStyleClass().add("plus");
		setGraphic(new Group(cssNode));

		setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				editingDomain.getCommandStack().execute(addCommand);
			}

		});

		modelElement.eAdapters().add(new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				if (msg.getFeature() == reference)
					updateAddButton();
			}

		});

		updateAddButton();
	}

	@Override
	protected String getUserAgentStylesheet() {
		return ReferenceAddControl.class.getResource("controls.css").toExternalForm();
	}

	protected void updateAddButton() {
		EObject obj = EcoreUtil.create(eClass);
		addCommand = AddCommand.create(editingDomain, modelElement, reference, obj);
		setDisable(!addCommand.canExecute());
	}

}

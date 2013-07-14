package org.eclipse.fx.ecp.ui.controls.multi;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.SkinBase;
import javafx.scene.layout.HBox;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControlContext;
import org.eclipse.fx.ecp.ui.ECPUtil;
import org.eclipse.fx.ecp.ui.controls.ECPControlBase;

public class ReferenceAddControl extends ECPControlBase {

	protected EClass eClass;
	protected Button addButton;
	protected Command addNewCommand;
	protected Command addExistingCommand;

	protected class Skin extends SkinBase<ReferenceAddControl> {

		protected Skin(ReferenceAddControl control) {
			super(control);

			HBox hBox = new HBox();
			getChildren().add(hBox);

			// display the add button only for containment references
			if (((EReference) feature).isContainment()) {
				addButton = new Button();
				hBox.getChildren().add(addButton);
				addButton.getStyleClass().add("add-reference-button");
				ECPUtil.addMark(addButton, "plus");

				addButton.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						editingDomain.getCommandStack().execute(addNewCommand);
					}

				});
			}
		}
		
	}

	public ReferenceAddControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		super(propertyDescriptor, context);
		eClass = (EClass) ((EReference) feature).getEType();

		setSkin(new Skin(this));
		
		getStyleClass().add("reference-add-control");

		update();
	}

	@Override
	protected String getUserAgentStylesheet() {
		return ReferenceAddControl.class.getResource("../ECPControls.css").toExternalForm();
	}

	@Override
	protected void update() {
		if (addButton != null) {
			EObject obj = EcoreUtil.create(eClass);
			addNewCommand = AddCommand.create(editingDomain, modelElement, feature, obj);
			setDisable(!addNewCommand.canExecute());
		}
	}

}

package org.eclipse.fx.ecp.ui.controls.multi;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.SkinBase;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPUtil;
import org.eclipse.fx.ecp.ui.controls.ECPControlBase;

public class EnumAddControl extends ECPControlBase {

	protected ChoiceBox<Enumerator> choiceBox;
	protected Button addButton;
	protected Command addCommand;

	public EnumAddControl(IItemPropertyDescriptor propertyDescriptor, final EObject modelElement, final EditingDomain editingDomain) {
		super(propertyDescriptor, modelElement, editingDomain);
		
		setSkin(new Skin(this));
		getStyleClass().add("enum-add-control");
		update();
	}

	@Override
	protected String getUserAgentStylesheet() {
		return getClass().getResource("../ECPControls.css").toExternalForm();
	}

	@Override
	protected void update() {
		Enumerator selectedItem = choiceBox.getSelectionModel().getSelectedItem();
		addCommand = AddCommand.create(editingDomain, modelElement, feature, selectedItem);
		addButton.setDisable(!addCommand.canExecute());
	}

	protected class Skin extends SkinBase<EnumAddControl> {

		Skin(EnumAddControl control) {
			super(control);

			EClassifier type = feature.getEType();
			EEnum eEnum = (EEnum) type;
			EList<EEnumLiteral> enumLiterals = eEnum.getELiterals();

			final HBox hBox = new HBox();
			getChildren().add(hBox);

			choiceBox = new ChoiceBox<Enumerator>();
			hBox.getChildren().add(choiceBox);
			choiceBox.getStyleClass().add("left-pill");
			choiceBox.setMaxWidth(Double.MAX_VALUE);
			HBox.setHgrow(choiceBox, Priority.ALWAYS);

			for (EEnumLiteral literal : enumLiterals)
				choiceBox.getItems().add(literal.getInstance());

			SingleSelectionModel<Enumerator> selectionModel = choiceBox.getSelectionModel();

			selectionModel.select(0);

			selectionModel.selectedItemProperty().addListener(new ChangeListener<Enumerator>() {

				@Override
				public void changed(ObservableValue<? extends Enumerator> arg0, Enumerator arg1, Enumerator arg2) {
					update();
				}

			});

			addButton = new Button();
			hBox.getChildren().add(addButton);
			addButton.getStyleClass().addAll("right-pill", "add-enum-button");
			ECPUtil.addMark(addButton, "plus");
			addButton.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					editingDomain.getCommandStack().execute(addCommand);
					choiceBox.requestFocus();
				}

			});
		}

	}

}

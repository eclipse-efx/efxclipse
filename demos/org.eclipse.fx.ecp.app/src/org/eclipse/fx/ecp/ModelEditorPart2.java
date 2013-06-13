/******************************************************************************* 
 * Copyright (c) 2012 TESIS DYNAware GmbH and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Torsten Sommer <torsten.sommer@tesis.de> - initial API and implementation 
 *******************************************************************************/
package org.eclipse.fx.ecp;

import java.util.Stack;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.fx.ecp.ui.ModelElementEditor;
import org.eclipse.fx.ecp.ui.controls.BreadcrumbBar;
import org.eclipse.fx.ecp.ui.controls.ModelElementForm;

public class ModelEditorPart2 implements ModelElementEditor {

	private ScrollPane scrollPane;
	private ECPControlContext controlContext;
	private BorderPane parent;
	private final Stack<ECPControlContext> prevModelElements = new Stack<>();
	private final Stack<ECPControlContext> nextModelElements = new Stack<>();
	// private final SimpleListProperty<EObject> prevModelElements = new SimpleListProperty<EObject>(
	// FXCollections.<EObject> observableArrayList());
	// private final SimpleListProperty<EObject> nextModelElements = new SimpleListProperty<EObject>(
	// FXCollections.<EObject> observableArrayList());
	private Button forwardButton;
	private Button backButton;
	private BreadcrumbBar breadcrumbBar;

	// private final ObservableList<EObject> prevModelElements = FXCollections.observableArrayList();
	// private final ObservableList<EObject> nextModelElements = FXCollections.observableArrayList();

	@Inject
	public ModelEditorPart2(BorderPane parent, final MApplication application, MPart part) {
		this.parent = parent;
		scrollPane = new ScrollPane();
		parent.setCenter(scrollPane);
		scrollPane.setFitToWidth(true);
		
		HBox hBox = new HBox();
		
		backButton = new Button();
		hBox.getChildren().add(backButton);
		backButton.getStyleClass().add("back-button");
		ECPUtil.addMark(backButton, "arrow");
		backButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				nextModelElements.push(controlContext);
				controlContext = prevModelElements.pop();
				updateControls();
			}
			
		});
		
		forwardButton = new Button();
		hBox.getChildren().add(forwardButton);
		forwardButton.getStyleClass().add("forward-button");
		ECPUtil.addMark(forwardButton, "arrow");
		// why is this not working?
		// forwardButton.disabledProperty().isEqualTo(nextModelElements.emptyProperty());
		forwardButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				prevModelElements.push(controlContext);
				controlContext = nextModelElements.pop();
				updateControls();
			}
			
		});
		
		breadcrumbBar = new BreadcrumbBar();
		HBox.setHgrow(breadcrumbBar, Priority.ALWAYS);
		hBox.getChildren().add(breadcrumbBar);
		
		parent.setTop(hBox);
	}

	public void setInput(final ECPControlContext modelElementContext) {
		if (controlContext != null)
			prevModelElements.push(controlContext);

		controlContext = modelElementContext;

		nextModelElements.clear();
		
		updateControls();
	}

	void updateControls() {
		backButton.setDisable(prevModelElements.isEmpty());
		forwardButton.setDisable(nextModelElements.isEmpty());
		breadcrumbBar.setModelElement(controlContext.getModelElement());
		scrollPane.setContent(new ModelElementForm(controlContext));
	}

}

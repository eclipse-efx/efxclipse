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
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.stage.Window;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.fx.ecp.ui.ModelElementEditor;
import org.eclipse.fx.ecp.ui.controls.BreadcrumbBar;
import org.eclipse.fx.ecp.ui.controls.ModelElementForm;

public class ModelEditorPart2 implements ModelElementEditor {

	private ScrollPane scrollPane;
	private ECPControlContext controlContext;
	private final Stack<ECPControlContext> prevModelElements = new Stack<>();
	private final Stack<ECPControlContext> nextModelElements = new Stack<>();
	private Button forwardButton;
	private Button backButton;
	private BreadcrumbBar breadcrumbBar;

	@Inject
	public ModelEditorPart2(BorderPane parent, final MApplication application, MPart part) {
		scrollPane = new ScrollPane();
		parent.setCenter(scrollPane);
		scrollPane.setFitToWidth(true);

		HBox hBox = new HBox();

		backButton = new Button();
		hBox.getChildren().add(backButton);
		backButton.getStyleClass().add("back-button");
		org.eclipse.fx.ecp.ui.ECPUtil.addMark(backButton, "arrow");
		backButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				nextModelElements.push(controlContext);
				controlContext = prevModelElements.pop();
				updateControls();
			}

		});
		
		backButton.setOnMousePressed(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				show(backButton, prevModelElements);
			}
			
		});

		forwardButton = new Button();
		hBox.getChildren().add(forwardButton);
		forwardButton.getStyleClass().add("forward-button");
		org.eclipse.fx.ecp.ui.ECPUtil.addMark(forwardButton, "arrow");
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
		
		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(new TextField());
		stackPane.getChildren().add(new Button("x"));
		stackPane.setAlignment(Pos.CENTER_RIGHT);
		parent.setBottom(stackPane);
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
	
	public void show(Node node, Stack<ECPControlContext> modelElements) {
		ContextMenu contextMenu = new ContextMenu();
		
		for (final ECPControlContext controlContext : modelElements) {
			EObject modelElement = controlContext.getModelElement();
			String text = org.eclipse.fx.ecp.ui.ECPUtil.getText(modelElement);
			Node graphic = org.eclipse.fx.ecp.ui.ECPUtil.getGraphic(modelElement);
			MenuItem menuItem = new MenuItem(text, graphic);
			contextMenu.getItems().add(menuItem);
			menuItem.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					setInput(controlContext);
				}
				
			});
		}
		
		Point2D position = node.localToScene(0.0, 0.0);
		Scene scene = node.getScene();
		Window window = scene.getWindow();
		double x = position.getX() + scene.getX() + window.getX();
		double y = position.getY() + scene.getY() + window.getY() + node.getLayoutBounds().getHeight() + 5;
		contextMenu.show(node, x, y);
	}

}

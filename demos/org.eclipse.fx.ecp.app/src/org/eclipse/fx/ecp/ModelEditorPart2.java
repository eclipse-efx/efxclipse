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

import java.util.LinkedList;
import java.util.List;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Window;
import javafx.util.Duration;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.ecp.ui.ECPUtil;
import org.eclipse.fx.ecp.ui.ModelElementEditor;
import org.eclipse.fx.ecp.ui.controls.BreadcrumbBar;
import org.eclipse.fx.ecp.ui.form.DefaultModelElementForm;
import org.eclipse.fx.ecp.ui.form.ModelElementForm;

public class ModelEditorPart2 implements ModelElementEditor {

	private final ScrollPane scrollPane;
	private EObject modelElement;
	// TODO change this to weak references
	private final LinkedList<EObject> prevModelElements = new LinkedList<>();
	private final LinkedList<EObject> nextModelElements = new LinkedList<>();
	private final Button forwardButton;
	private final Button backButton;
	private final BreadcrumbBar breadcrumbBar;
	private final ContextMenu contextMenu = new ContextMenu();
	private Timeline contextMenuTimeline;
	private DefaultModelElementForm modelElementForm;

	@Inject
	public ModelEditorPart2(BorderPane parent, final MApplication application, MPart part) {
		scrollPane = new ScrollPane();
		parent.setCenter(scrollPane);
		scrollPane.setFitToWidth(true);
		scrollPane.getStyleClass().add("my-scroll-pane");

		HBox hBox = new HBox();
		parent.setTop(hBox);

		backButton = new Button();
		hBox.getChildren().add(backButton);
		backButton.getStyleClass().add("back-button");
		org.eclipse.fx.ecp.ui.ECPUtil.addMark(backButton, "arrow");
		backButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				nextModelElements.push(modelElement);
				modelElement = prevModelElements.pop();
				if (contextMenuTimeline != null)
					contextMenuTimeline.stop();
				if (contextMenu != null)
					contextMenu.hide();
				updateControls();
			}

		});

		backButton.setOnMousePressed(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				contextMenuTimeline = new Timeline(new KeyFrame(Duration.millis(250), new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						showContextMenu(backButton, true);
					}

				}));

				contextMenuTimeline.play();
			}

		});

		forwardButton = new Button();
		hBox.getChildren().add(forwardButton);
		forwardButton.getStyleClass().add("forward-button");
		org.eclipse.fx.ecp.ui.ECPUtil.addMark(forwardButton, "arrow");
		// why is this not working?
		// forwardButton.disabledProperty().isEqualTo(nextModelElements.emptyProperty());

		forwardButton.setOnMousePressed(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				contextMenuTimeline = new Timeline(new KeyFrame(Duration.millis(250), new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						showContextMenu(backButton, false);
					}

				}));

				contextMenuTimeline.play();
			}

		});

		forwardButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				prevModelElements.push(modelElement);
				modelElement = nextModelElements.pop();
				if (contextMenuTimeline != null)
					contextMenuTimeline.stop();
				if (contextMenu != null)
					contextMenu.hide();
				updateControls();
			}

		});

		breadcrumbBar = new BreadcrumbBar();
		HBox.setHgrow(breadcrumbBar, Priority.ALWAYS);
		hBox.getChildren().add(breadcrumbBar);

		final Button moreButton = new Button();
		hBox.getChildren().add(moreButton);
		moreButton.getStyleClass().addAll("more-button");
		ECPUtil.addMark(moreButton, "lines");

		moreButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				ContextMenu contextMenu2 = new ContextMenu();
				MenuItem menuItem = new MenuItem("Validate");
				contextMenu2.getItems().add(menuItem);
				menuItem.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// validate();
					}

				});
				ECPUtil.showContextMenu(contextMenu2, moreButton);
			}

		});

	}

	public void setInput(EObject modelElement) {
		if (modelElement != null)
			prevModelElements.push(modelElement);

		this.modelElement = modelElement;

		nextModelElements.clear();

		updateControls();
	}

	void updateControls() {
		backButton.setDisable(prevModelElements.isEmpty());
		forwardButton.setDisable(nextModelElements.isEmpty());
		breadcrumbBar.setModelElement(modelElement);

		if (modelElementForm != null)
			modelElementForm.dispose();

		// TODO: add null check
		EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(modelElement);

		modelElementForm = (DefaultModelElementForm) ModelElementForm.Factory.Registry.INSTANCE.getFactory(modelElement)
				.createModelElementForm(modelElement, editingDomain);

		scrollPane.setContent(modelElementForm);
	}

	public void showContextMenu(Node node, boolean back) {
		contextMenu.getItems().clear();

		List<EObject> modelElements = back ? prevModelElements : nextModelElements;

		for (int i = 0; i < modelElements.size(); i++) {
			final int j = back ? -i - 1 : i + 1;
			EObject modelElement = modelElements.get(i);
			String text = org.eclipse.fx.ecp.ui.ECPUtil.getText(modelElement);
			Node graphic = org.eclipse.fx.ecp.ui.ECPUtil.getGraphic(modelElement);
			MenuItem menuItem = new MenuItem(text, graphic);
			contextMenu.getItems().add(menuItem);
			menuItem.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					go(j);
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

	/**
	 * Go back and forward in history
	 */
	private void go(int position) {
		while (position < 0) {
			nextModelElements.push(modelElement);
			modelElement = prevModelElements.pop();
			position++;
		}

		while (position > 0) {
			prevModelElements.push(modelElement);
			modelElement = nextModelElements.pop();
			position--;
		}

		updateControls();
	}

}

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

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.Control;
import org.eclipse.fx.ecp.ui.Control.Factory;
import org.eclipse.fx.ecp.ui.Control.Factory.Registry;
import org.eclipse.fx.ecp.ui.ModelElementEditor;

public class ModelEditorPart implements ModelElementEditor {

	private ScrollPane scrollPane;
	private MPart part;
	private Map<EStructuralFeature, Control> controls = new HashMap<>();

	@Inject
	public ModelEditorPart(BorderPane parent, final MApplication application, MPart part) {
		this.part = part;

		scrollPane = new ScrollPane();
		scrollPane.setFitToWidth(true);
		scrollPane.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

		parent.setCenter(scrollPane);
	}

	public void setInput(final ECPControlContext modelElementContext) {
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactoryItemDelegator adapterFactoryItemDelegator = new AdapterFactoryItemDelegator(adapterFactory);
		EObject modelElement = modelElementContext.getModelElement();

		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(modelElement, IItemLabelProvider.class);
		part.setLabel(labelProvider.getText(modelElement));
		Object image = labelProvider.getImage(modelElement);
		if (image instanceof URL)
			part.setIconURI(((URL) image).toExternalForm());

		List<IItemPropertyDescriptor> propertyDescriptors = adapterFactoryItemDelegator.getPropertyDescriptors(modelElement);
		// FormControlFactory controlFactory = new FormControlFactory();

		GridPane gridPane = new GridPane();
		gridPane.getStyleClass().add("theForm");
		// gridPane.setStyle("-fx-alignment: top-left;");

		// VBox vBox = new VBox();
		// vBox.getStyleClass().add("theForm");

		Button button = new Button("validate");
		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				Diagnostic diagnostic = Diagnostician.INSTANCE.validate(modelElementContext.getModelElement());
				for (Diagnostic childDiagnostic : diagnostic.getChildren()) {
					Control control = controls.get(childDiagnostic.getData().get(1));
					if (control != null)
						control.handleValidation(childDiagnostic);
				}

			}

		});

		gridPane.add(button, 1, 0);

		Registry registry = Control.Factory.Registry.INSTANCE;

		int i = 1;
		for (IItemPropertyDescriptor propertyDescriptor : propertyDescriptors) {

			String displayName = propertyDescriptor.getDisplayName(modelElement);
			Label label = new Label(displayName);
			label.getStyleClass().add("controlLabel");
			// label.setStyle("-fx-alignment: top-left;");
			GridPane.setValignment(label, VPos.TOP);
			gridPane.add(label, 0, i);
			
			EStructuralFeature feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);

			Factory factory = registry.getFactory(Node.class, propertyDescriptor, modelElement);

			if (factory != null) {
				Control control = factory.createControl(propertyDescriptor, modelElementContext);
				Node node = (Node) control;
				gridPane.add(node, 1, i);
				GridPane.setHgrow(node, Priority.ALWAYS);
				controls.put(feature, control);
			} else {
				System.out.println(":-(");
			}
			
			i++;
		}

		Label label = new Label("The End.");
		gridPane.add(label, 0, i);

		scrollPane.setContent(gridPane);
	}

}

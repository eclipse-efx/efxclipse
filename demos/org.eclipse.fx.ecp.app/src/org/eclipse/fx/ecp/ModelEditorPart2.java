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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.DummyControlFactory;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.ecp.ui.ECPControl.Factory;
import org.eclipse.fx.ecp.ui.ECPControl.Factory.Registry;
import org.eclipse.fx.ecp.ui.ModelElementEditor;
import org.eclipse.fx.ecp.ui.controls.BreadcrumbBar;
import org.eclipse.fx.ecp.ui.controls.DummyControl;
import org.eclipse.fx.ecp.ui.controls.ModelElementForm;

public class ModelEditorPart2 implements ModelElementEditor {

	private ScrollPane scrollPane;
	private MPart part;
	private EObject modelElement;
	private AdapterFactoryItemDelegator adapterFactoryItemDelegator;
	private ComposedAdapterFactory adapterFactory;
	private BorderPane parent;

	@Inject
	public ModelEditorPart2(BorderPane parent, final MApplication application, MPart part) {
		this.part = part;
		this.parent = parent;
		scrollPane = new ScrollPane();
		parent.setCenter(scrollPane);
		scrollPane.setFitToWidth(true);
	}

	public void setInput(final ECPControlContext modelElementContext) {
		modelElement = modelElementContext.getModelElement();
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactoryItemDelegator = new AdapterFactoryItemDelegator(adapterFactory);
		
		parent.setTop(new BreadcrumbBar(modelElement));
		scrollPane.setContent(new ModelElementForm(modelElementContext));
	}

}

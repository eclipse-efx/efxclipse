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
import java.util.Map;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import javax.inject.Inject;

import jfxtras.labs.scene.control.BigDecimalField;
import jfxtras.labs.scene.control.CalendarPicker;
import jfxtras.labs.scene.control.CalendarTextField;
import jfxtras.labs.scene.control.LocalDatePicker;
import jfxtras.labs.scene.control.SlideLock;
import jfxtras.labs.scene.control.gauge.Battery;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.ecp.ui.ModelElementEditor;
import org.eclipse.fx.ecp.ui.controls.BreadcrumbBar;
import org.eclipse.fx.ecp.ui.form.DefaultModelElementForm;

public class ModelEditorPart implements ModelElementEditor {

	private ScrollPane scrollPane;
	private MPart part;
	private Map<EStructuralFeature, ECPControl> controls = new HashMap<>();
	private EObject modelElement;
	private AdapterFactoryItemDelegator adapterFactoryItemDelegator;
	private ComposedAdapterFactory adapterFactory;
	private BorderPane parent;

	@Inject
	public ModelEditorPart(BorderPane parent, final MApplication application, MPart part) {
		this.part = part;
		this.parent = parent;
		scrollPane = new ScrollPane();
		scrollPane.setFitToWidth(true);
		scrollPane.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

		// DummyControl dummyControl = new DummyControl(null, null);
		// dummyControl.setPrefWidth(Double.MAX_VALUE);
		// parent.setTop(dummyControl);

		parent.setCenter(scrollPane);

//		VBox vBox = new VBox();
//		parent.setBottom(vBox);
//
//		vBox.getChildren().add(new CalendarTextField());
//		vBox.getChildren().add(new SlideLock());
	}

	public void setInput(final ECPControlContext modelElementContext) {
		modelElement = modelElementContext.getModelElement();
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactoryItemDelegator = new AdapterFactoryItemDelegator(adapterFactory);

		scrollPane.setContent(new DefaultModelElementForm(modelElementContext));

		modelElement.eAdapters().add(new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				update();
			}

		});

		update();
	}

	public void update() {
		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(modelElement, IItemLabelProvider.class);
		if (labelProvider != null) {
			part.setLabel(labelProvider.getText(modelElement));
			Object image = labelProvider.getImage(modelElement);
			if (image instanceof URL)
				part.setIconURI(((URL) image).toExternalForm());
		} else {
			part.setLabel("Model Editor");
		}
	}

}

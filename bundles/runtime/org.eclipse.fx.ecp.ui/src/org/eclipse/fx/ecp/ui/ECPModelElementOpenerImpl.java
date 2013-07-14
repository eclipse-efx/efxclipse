package org.eclipse.fx.ecp.ui;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.ecore.EObject;

public class ECPModelElementOpenerImpl implements ECPModelElementOpener {

	final private MApplication application;
	final private EModelService modelService;

	@Inject
	public ECPModelElementOpenerImpl(MApplication application, EModelService modelService) {
		super();
		this.application = application;
		this.modelService = modelService;
		this.application.getContext().set(ECPModelElementOpener.class, this);
	}

	@Override
	public void openModelElement(final EObject modelElement) {
		MUIElement uiElement = modelService.find("org.eclipse.fx.ecp.app.parts.modelEditor", application);

		if (uiElement instanceof MPart) {
			MPart part = (MPart) uiElement;
			Object object = part.getObject();
			
			if (object instanceof ModelElementEditor) {
				
				((ModelElementEditor) object).setInput(modelElement);
			}
			
		}

	}

}

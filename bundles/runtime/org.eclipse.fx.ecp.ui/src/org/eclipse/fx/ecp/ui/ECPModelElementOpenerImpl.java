package org.eclipse.fx.ecp.ui;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MInputPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.fx.ecp.dummy.DummyControlContext;

public class ECPModelElementOpenerImpl implements ECPModelElementOpener {

	final private MApplication application;
	final private EModelService modelService;
	final private EPartService partService;

	@Inject
	public ECPModelElementOpenerImpl(MApplication application, EModelService modelService, EPartService partService) {
		super();
		this.application = application;
		this.modelService = modelService;
		this.partService = partService;
		this.application.getContext().set(ECPModelElementOpener.class, this);
	}

	@Override
	public void openModelElement(EObject modelElement) {
		MPartStack stack = (MPartStack) modelService.find("org.eclipse.fx.ecp.app.partstacks.editors", application);

		MInputPart part = MBasicFactory.INSTANCE.createInputPart();
		part.setContributionURI("bundleclass://org.eclipse.fx.ecp.app/org.eclipse.fx.ecp.ModelEditorPart");

		// part.setIconURI("platform:/plugin/de.vogella.rcp.e4.todo/icons/sample.gif");
		part.setCloseable(true);

		stack.getChildren().add(part);
		partService.showPart(part, PartState.ACTIVATE);

		part.getContext().set(EObject.class, modelElement);

		ModelElementEditor editor = (ModelElementEditor) part.getObject();

		ECPControlContext modelElementContext = new DummyControlContext(modelElement);

		editor.setInput(modelElementContext);
	}

}

package org.eclipse.fx.ecp.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ecp.dummy.DummyWorkspace;
import org.eclipse.fx.ecp.ui.ECPModelElementOpener;


@SuppressWarnings("restriction")
public class OpenModelElementHandler {

	// @Execute
	// public void open(MApplication application, EModelService modelService,
	// EPartService partService) {
	// // Assuming that all editors should open in the the stack with the
	// // ID "org.eclipse.e4.primaryDataStack"
	//
	// MPartStack stack = (MPartStack)
	// modelService.find("org.eclipse.fx.ecp.app.partstacks.editors",
	// application);
	//
	// MInputPart part = MBasicFactory.INSTANCE.createInputPart();
	// // Pointing to the contributing class
	// part.setContributionURI("bundleclass://org.eclipse.fx.ecp.app/org.eclipse.fx.ecp.ModelEditorPart");
	//
	// // part.setInputURI(input.getInputURI());
	// //
	// part.setIconURI("platform:/plugin/de.vogella.rcp.e4.todo/icons/sample.gif");
	// part.setLabel("huhu");
	// // part.setTooltip(input.getTooltip());
	// part.setCloseable(true);
	//
	// stack.getChildren().add(part);
	// partService.showPart(part, PartState.ACTIVATE);
	//
	// part.getContext().set(EObject.class,
	// DummyWorkspace.INSTANCE.getTournament());
	//
	// ModelEditorPart modelEditorPart = (ModelEditorPart) part.getObject();
	//
	// ECPControlContext modelElementContext = new
	// DummyControlContext(DummyWorkspace.INSTANCE.getReferee());
	//
	// modelEditorPart.setInput(modelElementContext);
	// }

	
	@Execute
	public void open(ECPModelElementOpener modelElementOpener, MApplication application, EModelService modelService,
			 EPartService partService) {
		
		EObject modelElement = DummyWorkspace.INSTANCE.getReferee();
		modelElementOpener.openModelElement(modelElement, application, modelService, partService);
	}

}

package at.bestsolution.efxclipse.ecp.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MInputPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProjectManager;
import org.eclipse.emf.ecp.edit.ECPControlContext;

import at.bestsolution.efxclipse.ecp.ModelEditorPart;
import at.bestsolution.efxclipse.ecp.ui.ECPModelElementOpener;
import at.bestsolution.efxclipse.runtime.ecp.dummy.DummyControlContext;
import at.bestsolution.efxclipse.runtime.ecp.dummy.DummyWorkspace;

@SuppressWarnings("restriction")
public class OpenModelElementHandler {

	// @Execute
	// public void open(MApplication application, EModelService modelService,
	// EPartService partService) {
	// // Assuming that all editors should open in the the stack with the
	// // ID "org.eclipse.e4.primaryDataStack"
	//
	// MPartStack stack = (MPartStack)
	// modelService.find("at.bestsolution.efxclipse.ecp.app.partstacks.editors",
	// application);
	//
	// MInputPart part = MBasicFactory.INSTANCE.createInputPart();
	// // Pointing to the contributing class
	// part.setContributionURI("bundleclass://at.bestsolution.efxclipse.ecp.app/at.bestsolution.efxclipse.ecp.ModelEditorPart");
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

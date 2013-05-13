package org.eclipse.fx.ecp.ui;

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
import org.eclipse.fx.ecp.dummy.DummyWorkspace;


@SuppressWarnings("restriction")
public class ECPModelElementOpenerImpl implements ECPModelElementOpener {

	@Override
	public void openModelElement(EObject modelElement, MApplication application, EModelService modelService, EPartService partService) {
		 MPartStack stack = (MPartStack)
		 modelService.find("org.eclipse.fx.ecp.app.partstacks.editors",
		 application);
		
		 MInputPart part = MBasicFactory.INSTANCE.createInputPart();
		 part.setContributionURI("bundleclass://org.eclipse.fx.ecp.app/org.eclipse.fx.ecp.ModelEditorPart");
		
//		 part.setIconURI("platform:/plugin/de.vogella.rcp.e4.todo/icons/sample.gif");
		 part.setCloseable(true);
		
		 stack.getChildren().add(part);
		 partService.showPart(part, PartState.ACTIVATE);
		
		 part.getContext().set(EObject.class, modelElement);
		
		 ModelElementEditor editor = (ModelElementEditor) part.getObject();
		
		 ECPControlContext modelElementContext = new DummyControlContext(DummyWorkspace.INSTANCE.getPlayer());
		
		 editor.setInput(modelElementContext);
	}

}

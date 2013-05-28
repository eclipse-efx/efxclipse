package org.eclipse.fx.ecp.ui.impl;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.fx.ecp.ui.ECPModelElementOpenerImpl;

public class ECPModelContextFunction extends ContextFunction {

	@Override
	public Object compute(IEclipseContext context, String contextKey) {
		ECPModelElementOpenerImpl make = ContextInjectionFactory.make(ECPModelElementOpenerImpl.class, context);
		
		return make;
	}
	
}

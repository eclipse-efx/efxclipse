/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.extapi;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.css.cssDsl.CssProperty;
import org.eclipse.fx.ide.css.cssDsl.CssTok;
import org.eclipse.fx.ide.css.cssDsl.FuncTok;
import org.eclipse.fx.ide.css.cssDsl.Selector;

/**
 * @author ccaks
 *
 */
public interface CssExt {

	public boolean isPropertyKnown(EObject context, CssProperty property);
	public boolean isPropertyBySelectorSupported(EObject context, List<Selector> selectors, CssProperty property);

	public boolean isPropertyVariable(EObject context, String name);
	public boolean isPropertyVariable(EObject context, CssProperty property);
	public boolean isPropertyVariable(EObject context, List<Selector> selectors, CssProperty property);


	public List<Proposal> getPropertyProposalsForSelector(EObject context, List<Selector> selector);
	public List<Proposal> getValueProposalsForProperty(EObject context, List<Selector> selector, CssProperty property, List<CssTok> prefixTok, String prefixString);

	public List<Proposal> getValueProposalsForFunction(EObject context, List<Selector> selector, CssProperty property, FuncTok function, List<CssTok> prefixTok, String prefixString);


	public String getDocumentationHeader(EObject context, EObject obj);
	public String getDocumentation(EObject context, EObject obj);

}

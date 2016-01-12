/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.ui.highlighting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.fx.ide.css.cssDsl.CssDeclaration;
import org.eclipse.fx.ide.css.cssDsl.CssTok;
import org.eclipse.fx.ide.css.cssDsl.ElementSelector;
import org.eclipse.fx.ide.css.cssDsl.FuncTok;
import org.eclipse.fx.ide.css.cssDsl.IdentifierTok;
import org.eclipse.fx.ide.css.cssDsl.SimpleSelector;
import org.eclipse.fx.ide.css.cssDsl.StringTok;
import org.eclipse.fx.ide.css.cssDsl.Stylesheet;
import org.eclipse.fx.ide.css.cssDsl.SymbolTok;
import org.eclipse.fx.ide.css.cssDsl.URLType;
import org.eclipse.fx.ide.css.extapi.CssExt;
import org.eclipse.fx.ide.css.extapi.CssExtProvider;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.util.CancelIndicator;

import com.google.inject.Inject;

// TODO port to new API
public class CssDslHighlightingCalculator2 implements ISemanticHighlightingCalculator {
	
	@Inject(optional = true)
	private CssExtProvider extProvider;
	
	private CssExt getExt(EObject context) {
		if (extProvider == null) return null;
		return extProvider.getCssExt(context);
	}
	
	public CssDslHighlightingCalculator2() {
		System.err.println(this);
	}
	
	private void markImports(Stylesheet s, IHighlightedPositionAcceptor acceptor) {
		// TODO move the @import search logic to some common place
		Pattern p = Pattern.compile("@import\\s+([\\w\\d:/.]+)");
		// get all hidden ML_COMMENTS
		ICompositeNode rootNode = NodeModelUtils.findActualNodeFor(s);
		BidiTreeIterator<INode> iterator = rootNode.getAsTreeIterable().iterator();
		while (iterator.hasNext()) {
			INode cur = iterator.next();
			
			if (cur instanceof HiddenLeafNode) {
				HiddenLeafNode n = (HiddenLeafNode) cur;
				if (n.getGrammarElement() instanceof TerminalRule) {
					TerminalRule tr = (TerminalRule) n.getGrammarElement();
					
					if ("ML_COMMENT".equals(tr.getName())) {
						// got one
						//System.err.println(" => " + n.getText());
						
						Matcher matcher = p.matcher(n.getText());
						while (matcher.find()) {
							acceptor.addPosition(n.getOffset() + matcher.start(), matcher.end(1) - matcher.start(), CssDslHighlightingConfiguration.SELECTOR);
							acceptor.addPosition(n.getOffset() + matcher.start(1), matcher.end(1) - matcher.start(1), CssDslHighlightingConfiguration.URL);
						}
					}
				}
			}
			
			
		}
		
	}
	
	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator cancel) {
		// TODO Auto-generated method stub
		
		if( resource == null ) {
			return;
		}
		
		EList<EObject> contents = resource.getContents();
		if (contents.size() > 0) {
			EObject eObject = contents.get(0);
			if (eObject instanceof Stylesheet) {
				markImports((Stylesheet) eObject, acceptor);
			}
		}
		
		
		TreeIterator<Object> it = EcoreUtil.getAllContents(resource, true);
		
		while( it.hasNext() ) {
			Object o = it.next();
			
			
			
			if (o instanceof ElementSelector) {
				final ICompositeNode n = NodeModelUtils.getNode((EObject)o);
				if( n != null ) {
					acceptor.addPosition(n.getOffset(), n.getLength(), CssDslHighlightingConfiguration.ELEMENT);	
				}
			}
			else if (o instanceof IdentifierTok) {
				final ICompositeNode n = NodeModelUtils.getNode((EObject)o);
				
				CssExt cssExt = getExt((EObject)o);
				if (cssExt != null && cssExt.isPropertyVariable((IdentifierTok)o, ((IdentifierTok) o).getName())) {
					if( n != null ) {
						acceptor.addPosition(n.getOffset(), n.getLength(), CssDslHighlightingConfiguration.VARIABLE);	
					}
				}
				else {
					if( n != null ) {
						acceptor.addPosition(n.getOffset(), n.getLength(), DefaultHighlightingConfiguration.DEFAULT_ID);	
					}
				}
			}
			else if( o instanceof CssDeclaration ) {
				CssDeclaration dec = (CssDeclaration) o;
				if( dec.getProperty() != null && dec.getProperty().getName() != null && dec.getProperty().getName().trim().length() > 0 ) {
					
					String type = CssDslHighlightingConfiguration.DECLARATIONNAME;
					
//					if (dec.eContainer() instanceof Ruleset) {
//						Ruleset ruleset = (Ruleset) dec.eContainer();
//						if (ext.isPropertyVariable(dec, ruleset.getSelectors(), dec.getProperty())) {
//							type = CssDslHighlightingConfiguration.VARIABLE;
//						}
//					}
					
					ICompositeNode n = NodeModelUtils.getNode(dec);
					if( n != null ) {
						if( n.hasChildren() ) {
							acceptor.addPosition(n.getFirstChild().getOffset(), n.getFirstChild().getLength(), type);
						}							
					}
				}
			} 
			else if( o instanceof SimpleSelector ) {
				final ICompositeNode n = NodeModelUtils.getNode((EObject)o);
				if( n != null ) {
					acceptor.addPosition(n.getOffset(), n.getLength(), CssDslHighlightingConfiguration.SELECTOR);	
				}
			}
			else if (o instanceof URLType) {
				final URLType url = (URLType) o;
				final ICompositeNode n = NodeModelUtils.getNode(url);
				if( n != null ) {
					acceptor.addPosition(n.getOffset(), 4, CssDslHighlightingConfiguration.FUNCTION);
					acceptor.addPosition(n.getOffset()+4, n.getLength()-5, CssDslHighlightingConfiguration.URL);
					acceptor.addPosition(n.getOffset() + n.getLength() - 1, 1, CssDslHighlightingConfiguration.FUNCTION);					
				}
			}
			else if (o instanceof FuncTok) {
				final FuncTok funcTok = (FuncTok) o;
				final ICompositeNode n = NodeModelUtils.getNode(funcTok);
				
				int nameLength = funcTok.getName().getName().length();
				if( n != null ) {
					acceptor.addPosition(n.getOffset(), nameLength + 1, CssDslHighlightingConfiguration.FUNCTION);	
				}
				
				for (CssTok tok : ((FuncTok) o).getParams()) {
					if (tok instanceof SymbolTok) {
						if (",".equals(((SymbolTok) tok).getSymbol())) { //$NON-NLS-1$
							ICompositeNode colonNode = NodeModelUtils.getNode(tok);
							if( colonNode != null ) {
								acceptor.addPosition(colonNode.getOffset(), colonNode.getLength(), CssDslHighlightingConfiguration.FUNCTION);	
							}
						}
					}
				}
				
				if( n != null ) {
					acceptor.addPosition(n.getOffset() + n.getLength() - 1, 1, CssDslHighlightingConfiguration.FUNCTION);	
				}
			}
			else if (o instanceof StringTok) {
				final ICompositeNode n = NodeModelUtils.getNode((EObject)o);
				if( n != null ) {
					acceptor.addPosition(n.getOffset(), n.getLength(), DefaultHighlightingConfiguration.STRING_ID);	
				}
			}
		}
	}
}
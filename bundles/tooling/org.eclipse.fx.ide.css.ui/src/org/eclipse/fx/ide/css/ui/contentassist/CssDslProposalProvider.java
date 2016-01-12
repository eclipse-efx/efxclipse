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
package org.eclipse.fx.ide.css.ui.contentassist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.core.log.LoggerCreator;
import org.eclipse.fx.ide.css.cssDsl.CssDeclaration;
import org.eclipse.fx.ide.css.cssDsl.CssDslFactory;
import org.eclipse.fx.ide.css.cssDsl.CssProperty;
import org.eclipse.fx.ide.css.cssDsl.CssTok;
import org.eclipse.fx.ide.css.cssDsl.FontFaceRule;
import org.eclipse.fx.ide.css.cssDsl.FuncTok;
import org.eclipse.fx.ide.css.cssDsl.Ruleset;
import org.eclipse.fx.ide.css.cssDsl.Selector;
import org.eclipse.fx.ide.css.cssDsl.Stylesheet;
import org.eclipse.fx.ide.css.extapi.CssExt;
import org.eclipse.fx.ide.css.extapi.CssExtProvider;
import org.eclipse.fx.ide.css.extapi.Proposal;
import org.eclipse.fx.ide.css.extapi.Proposal.Type;
import org.eclipse.fx.ide.css.extapi.SimpleProposal;
import org.eclipse.fx.ide.css.ui.extapi.UIProposal;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal.IReplacementTextApplier;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.ReplacementTextApplier;
import org.eclipse.xtext.ui.editor.hover.DispatchingEObjectTextHover;

import com.google.inject.Inject;


/**
 * @author ccaks
 *
 */
public class CssDslProposalProvider extends AbstractCssDslProposalProvider {

	public CssDslProposalProvider() {
		System.err.println(this);
	}
	
	@Inject(optional=true)
	private CssExtProvider extProvider;

	private CssExt getExt(EObject context) {
		if (extProvider == null) return null;
		return extProvider.getCssExt(context);
	}
	
	@Inject
	private DispatchingEObjectTextHover hoverDispatcher;

	@Inject
	private ILabelProvider labelProvider;
	
	private static Logger LOGGER = LoggerCreator.createLogger(CssDslProposalProvider.class); 


	private void acceptProposals(List<Proposal> proposals, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		for (Proposal p : proposals) {

			final Image img = labelProvider.getImage(CssDslFactory.eINSTANCE.createCssProperty());

			if (p instanceof UIProposal) {
				ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) createCompletionProposal(p.getLabel(), p.getLabel(), img, context);
				final UIProposal uiP = (UIProposal)p;

				if (cp != null) {
					cp.setTextApplier(new ReplacementTextApplier() {
						//@Override
						public String getActualReplacementString(ConfigurableCompletionProposal proposal) {
							if (uiP.show()) {
								return uiP.getProposal();
							}
							return "";
						}
					});
					cp.setPriority(p.getPriority());
					acceptor.accept(cp);
				}
			}
			else {

				ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) createCompletionProposal(p.getProposal(), p.getLabel(), img, context);
				if (cp != null) {
					cp.setAdditionalProposalInfo(p.getAdditionalInfo());
					cp.setHover(hoverDispatcher);

					cp.setTriggerCharacters(new char[] { ' ' });

					if (p.getType() == Type.Property) {
						// add ": " to proposal
						cp.setTextApplier(new IReplacementTextApplier() {

							@Override
							public void apply(IDocument document, ConfigurableCompletionProposal proposal) throws BadLocationException {
								document.replace(proposal.getReplacementOffset(), proposal.getReplacementLength(), proposal.getReplacementString() + ": ");
								proposal.setCursorPosition(proposal.getCursorPosition()+2);
							}
						});
					}
					if (p.getType() == Type.Value) {
						cp.setTextApplier(new IReplacementTextApplier() {

							private int findWSCountBeforeProposal(IDocument document, ConfigurableCompletionProposal proposal) throws BadLocationException {
								// remove spaces " " before proposal
								int offset = 0;

								int amount = 10;
								if (proposal.getReplacementOffset() - amount < 0) {
									amount = proposal.getReplacementOffset();
								}
								String beforeChars = document.get(proposal.getReplacementOffset() - amount, amount);
								Pattern spaces = Pattern.compile("(.*)[ ]+$");
								Matcher m = spaces.matcher(beforeChars);
								if (m.matches()) {
									offset = amount - m.end(1);
								}
								return offset;
							}

							@Override
							public void apply(IDocument document, ConfigurableCompletionProposal proposal) throws BadLocationException {
								if (proposal.getReplacementString().equals(";")) {
									int wsCount = findWSCountBeforeProposal(document, proposal);

									document.replace(proposal.getReplacementOffset()-wsCount, proposal.getReplacementLength()+wsCount, proposal.getReplacementString());
									proposal.setCursorPosition(proposal.getCursorPosition()-wsCount);
								}
								else if (proposal.getReplacementString().equals(",")) {
									int wsCount = findWSCountBeforeProposal(document, proposal);

									document.replace(proposal.getReplacementOffset()-wsCount, proposal.getReplacementLength()+wsCount, proposal.getReplacementString() + " ");
									proposal.setCursorPosition(proposal.getCursorPosition()+1-wsCount);
								}
								else {
									// add " " to proposal
									document.replace(proposal.getReplacementOffset(), proposal.getReplacementLength(), proposal.getReplacementString() + " ");
									proposal.setCursorPosition(proposal.getCursorPosition()+1);
								}
							}
						});
					}
					cp.setPriority(p.getPriority());

					acceptor.accept(cp);
				}
				else {
					LOGGER.debug("cound not create proposal for " + p); //$NON-NLS-1$
				}
			}
		}
	}



	private List<CssTok> findPrefixTokens(ContentAssistContext context) {
		List<CssTok> prefixToks = new ArrayList<CssTok>();
		if (context.getLastCompleteNode().getSemanticElement() instanceof CssTok) {
			CssTok currentTok = (CssTok) context.getLastCompleteNode().getSemanticElement();
			EObject dings = context.getLastCompleteNode().getSemanticElement().eContainer();
			if (dings instanceof CssDeclaration) {
				CssDeclaration decl = (CssDeclaration) dings;
				for (CssTok tok : decl.getValueTokens()) {
					if (tok == currentTok) break;
					prefixToks.add(tok);
				}
			}
			else if (dings instanceof FuncTok) {
				FuncTok funcTok = (FuncTok) dings;
				for (CssTok tok : funcTok.getParams()) {
					if (tok == currentTok) break;
					prefixToks.add(tok);
				}
			}

			// TEST
			prefixToks.add(currentTok);
		}
		return prefixToks;
	}

	private List<Selector> findSelectors(CssDeclaration decl) {
		if (decl.eContainer() instanceof Ruleset) {
			return ((Ruleset)decl.eContainer()).getSelectors();
		}
		return Collections.emptyList();
	}
	
	private List<Selector> findSelectors(FuncTok ft) {
		EObject container = ft;
		
		while (container != null) {
			if (container instanceof Ruleset) {
				return ((Ruleset) container).getSelectors();
			}
			container = container.eContainer();
		}
		
		return Collections.emptyList();
	}
	
	private CssProperty findProperty(CssTok token) {
		EObject container = token;
		
		while (container != null) {
			if (container instanceof CssDeclaration) {
				return ((CssDeclaration) container).getProperty();
			}
			container = container.eContainer();
		}
		
		return null;
	}

	public void complete_CssTok(FuncTok model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		CssExt cssExt = getExt(model);
		if (cssExt == null) return;
		final List<Proposal> proposals = cssExt.getValueProposalsForFunction(model, findSelectors(model), findProperty(model), model, findPrefixTokens(context), context.getPrefix());
		System.err.println("-> func proposals: " + proposals);
		acceptProposals(proposals, context, acceptor);
	}
	
	
	public void complete_CssTok(CssDeclaration model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		CssExt cssExt = getExt(model);
		if (cssExt == null) return;
		
		if( model.eContainer() instanceof FontFaceRule ) {
			return;
		}

		final List<Proposal> proposals = cssExt.getValueProposalsForProperty(model, findSelectors(model), model.getProperty(), findPrefixTokens(context), context.getPrefix());

		acceptProposals(proposals, context, acceptor);
	}

	private void filterDuplicates(Ruleset model, List<Proposal> proposals) {
		final Set<String> defined = new HashSet<>();
		for (CssDeclaration d : model.getDeclarations()) {
			defined.add(d.getProperty().getName());
		}
		final Iterator<Proposal> filterIterator = proposals.iterator();
		while (filterIterator.hasNext()) {
			Proposal curr = filterIterator.next();
			if (defined.contains(curr.getProposal())) {
				filterIterator.remove();
			}
		}
	}

	static class FontPropertyProposal extends SimpleProposal {

		public FontPropertyProposal(String proposal) {
			super(proposal);
		}

		@Override
		public Type getType() {
			return Type.Property;
		}
	}

	private static <O extends EObject> void  filterDuplicates(O model, Function<O, List<CssDeclaration>> f, List<Proposal> proposals) {
		final Set<String> defined = new HashSet<>();
		for (CssDeclaration d : f.apply(model)) {
			defined.add(d.getProperty().getName());
		}
		final Iterator<Proposal> filterIterator = proposals.iterator();
		while (filterIterator.hasNext()) {
			Proposal curr = filterIterator.next();
			if (defined.contains(curr.getProposal())) {
				filterIterator.remove();
			}
		}
	}

	@Override
	public void completeFontFaceRule_Declarations(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		List<Proposal> proposals = new ArrayList<>();
		proposals.add(new FontPropertyProposal("font-family")); //$NON-NLS-1$
		proposals.add(new FontPropertyProposal("src")); //$NON-NLS-1$
		proposals.add(new FontPropertyProposal("font-stretch")); //$NON-NLS-1$
		proposals.add(new FontPropertyProposal("font-style")); //$NON-NLS-1$
		proposals.add(new FontPropertyProposal("font-weight")); //$NON-NLS-1$
		proposals.add(new FontPropertyProposal("unicode-range")); //$NON-NLS-1$
		filterDuplicates((FontFaceRule) model, (o) -> o.getDeclarations(), proposals);
		acceptProposals(proposals, context, acceptor);

		super.completeFontFaceRule_Declarations(model, assignment, context, acceptor);
	}

	public void completeRuleset_Declarations(Ruleset model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		CssExt cssExt = getExt(model);
		if (cssExt == null) return;
		
		final List<Proposal> proposals = cssExt.getPropertyProposalsForSelector(model, model.getSelectors());
		filterDuplicates(model, proposals);
		acceptProposals(proposals, context, acceptor);
	}

	// known issue
	// for some reason autocompletion for the last property in a ruleset ends up here
	// for now i try to get the current model, but in case we fail i return the full list
	public void completeRuleset_Declarations(Stylesheet model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		CssExt cssExt = getExt(model);
		if (cssExt == null) return;
		
		if (context.getPreviousModel() instanceof Ruleset) {
			Ruleset ruleset = (Ruleset) context.getPreviousModel();
			final List<Proposal> proposals = cssExt.getPropertyProposalsForSelector(model, ruleset.getSelectors());
			filterDuplicates(ruleset, proposals);
			acceptProposals(proposals, context, acceptor);
		}
		else {
			final List<Proposal> proposals = cssExt.getPropertyProposalsForSelector(model, null);
			acceptProposals(proposals, context, acceptor);
		}
	}


	@Override
	public void completeKeyword(Keyword keyword,
			ContentAssistContext contentAssistContext,
			ICompletionProposalAcceptor acceptor) {
		return;
	}

}

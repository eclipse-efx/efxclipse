package org.eclipse.fx.ide.gradient.app;

import org.eclipse.fx.ide.css.cssext.proposal.CssExtProposalContributor;
import org.eclipse.fx.ide.css.extapi.Proposal;


public class GradientProposalContributer implements CssExtProposalContributor {

	@Override
	public String getRule() {
		return "javafx.paint";
	}

	@Override
	public Proposal getProposal() {
		return new GradientProposal();
	}

}

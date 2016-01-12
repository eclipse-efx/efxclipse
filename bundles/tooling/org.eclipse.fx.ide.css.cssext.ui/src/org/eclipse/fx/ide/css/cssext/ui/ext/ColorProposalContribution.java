package org.eclipse.fx.ide.css.cssext.ui.ext;

import org.eclipse.fx.ide.css.cssext.api.ProposalContribution;
import org.eclipse.fx.ide.css.extapi.Proposal;
import org.osgi.service.component.annotations.Component;

@Component
public class ColorProposalContribution implements ProposalContribution {

	@Override
	public String getRule() {
		return "javafx.color";
	}

	@Override
	public Proposal getProposal() {
		return new ColorProposal();
	}

}

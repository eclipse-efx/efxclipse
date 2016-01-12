package org.eclipse.fx.ide.css.cssext.api.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.fx.ide.css.cssext.api.ProposalContribution;
import org.eclipse.fx.ide.css.cssext.api.ProposalContributionRegistry;
import org.eclipse.fx.ide.css.cssext.extapi.scope.Scope;
import org.eclipse.fx.ide.css.extapi.Proposal;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

@Component
public class ProposalContributionRegistryImpl implements ProposalContributionRegistry {

	private List<ProposalContribution> proposalContributions = new ArrayList<>();

	@Reference(cardinality=ReferenceCardinality.MULTIPLE, policy=ReferencePolicy.DYNAMIC, policyOption=ReferencePolicyOption.GREEDY)
	protected void addProposalContribution(ProposalContribution c) {
		proposalContributions.add(c);
	}
	protected void removeProposalContribution(ProposalContribution c) {
		proposalContributions.remove(c);
	}

	@Override
	public List<Proposal> getContributedProposalsForRule(Scope scope, String fqRuleName) {
		System.err.println("getContriubtedProposalsForRule: " + fqRuleName + " in " + proposalContributions.size() + " contributions");
		List<Proposal> result = new ArrayList<>();
		for (ProposalContribution c : proposalContributions) {
			if (fqRuleName.equals(c.getRule())) {
				result.add(c.getProposal());
				System.err.println(" * found " + c.getProposal() + " for " + fqRuleName);
			}
		}
		return result;
	}

}

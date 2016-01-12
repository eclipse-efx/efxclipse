package org.eclipse.fx.ide.css.cssext.api;

import java.util.List;

import org.eclipse.fx.ide.css.cssext.extapi.scope.Scope;
import org.eclipse.fx.ide.css.extapi.Proposal;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import com.google.inject.Provider;

public interface ProposalContributionRegistry {

	public List<Proposal> getContributedProposalsForRule(Scope scope, String fqRuleName);

	public static class OSGiServiceProvider implements Provider<ProposalContributionRegistry> {

		@Override
		public ProposalContributionRegistry get() {
			BundleContext ctx = FrameworkUtil.getBundle(ProposalContributionRegistry.class).getBundleContext();

			ServiceReference<ProposalContributionRegistry> ref = ctx.getServiceReference(ProposalContributionRegistry.class);

			return ctx.getService(ref);
		}

	}
}

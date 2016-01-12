package org.eclipse.fx.ide.css.cssext.extapi;

import java.util.List;

import org.eclipse.fx.ide.css.cssDsl.CssProperty;
import org.eclipse.fx.ide.css.cssDsl.CssTok;
import org.eclipse.fx.ide.css.cssDsl.FuncTok;
import org.eclipse.fx.ide.css.cssDsl.Selector;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRule;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleRef;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PropertyDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PseudoClassDefinition;
import org.eclipse.fx.ide.css.cssext.extapi.scope.Scope;
import org.eclipse.fx.ide.css.extapi.Proposal;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import com.google.inject.Provider;

public interface CssExtApi {

	boolean isPropertyVariable(Scope context, CssProperty property);

	boolean isPropertyKnown(Scope context, CssProperty property);
	boolean isPropertyBySelectorSupported(Scope context, List<Selector> selectors, CssProperty property);

	List<Proposal> getPropertyProposalsForSelector(Scope context, List<Selector> selector);
	List<Proposal> getValueProposalsForProperty(Scope context, List<Selector> selector, CssProperty property, List<CssTok> prefixTok, String prefixString);


	List<PropertyDefinition> findPropertiesBySelector(Scope context, Selector cssSelector);

	PseudoClassDefinition findPseudoClassByName(Scope context, String pseudoName);

	PropertyDefinition findPropertyByName(Scope context, String propertyName);
	ElementDefinition findElementByName(Scope context, String elName);
	List<PropertyDefinition> findAllProperties(Scope context);
	CSSRule resolveReference(Scope context, final CSSRuleRef ref);
	ElementDefinition findElementByStyleClass(Scope context, String styleClass);

	public static class OsgiServiceProvider implements Provider<CssExtApi> {

		private CssExtApi instance = null;

		@Override
		public CssExtApi get() {
			System.err.println("Getting CssExt");
			if (instance == null) {
				BundleContext context = FrameworkUtil.getBundle(CssExtApi.class).getBundleContext();
				ServiceReference<CssExtApi> ref = context.getServiceReference(CssExtApi.class);
				if (ref != null) {
					instance = context.getService(ref);
				}
				else {
					System.err.println("CssExtApi not available!!");
				}
			}
			System.err.println("returning " + instance);
			return instance;
		}

	}

	boolean isPropertyVariable(Scope context, String name);

	boolean isPropertyVariable(Scope context, List<Selector> selectors, CssProperty property);

	List<Proposal> getValueProposalsForFunction(Scope context, List<Selector> selector, CssProperty property,
			FuncTok funcTok, List<CssTok> prefixTok, String prefixString);



}

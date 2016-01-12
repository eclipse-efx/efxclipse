package org.eclipse.fx.ide.css.cssext.ui.internal;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.fx.ide.css.CssStateResource;
import org.eclipse.fx.ide.css.cssDsl.CssProperty;
import org.eclipse.fx.ide.css.cssDsl.CssTok;
import org.eclipse.fx.ide.css.cssDsl.FuncTok;
import org.eclipse.fx.ide.css.cssDsl.Selector;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSType;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;
import org.eclipse.fx.ide.css.cssext.extapi.CssDocApi;
import org.eclipse.fx.ide.css.cssext.extapi.CssExtApi;
import org.eclipse.fx.ide.css.cssext.extapi.CssExtApi.OsgiServiceProvider;
import org.eclipse.fx.ide.css.cssext.extapi.registry.ImportUtil;
import org.eclipse.fx.ide.css.cssext.extapi.scope.ResourceScopeProvider;
import org.eclipse.fx.ide.css.cssext.extapi.scope.Scope;
import org.eclipse.fx.ide.css.cssext.parser.CssExtParser;
import org.eclipse.fx.ide.css.extapi.CssExt;
import org.eclipse.fx.ide.css.extapi.Proposal;
import org.eclipse.xtext.resource.XtextResource;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import com.google.inject.Inject;

public class CssExtImpl implements CssExt {

	@Inject
	private CssExtApi impl;

	@Inject
	private CssDocApi docApi;


	public CssExtImpl() {

	}

//	public CssExtImpl(EObject context) {
//		Injector i = CssextActivator.getInstance().getInjector(CssextActivator.ORG_ECLIPSE_FX_IDE_CSS_CSSEXT_CSSEXTDSL);
//		EclipseProjectScope projectScope = i.getInstance(EclipseProjectScope.class);
//		try {
//			projectScope.enter(new java.net.URI(context.eResource().getURI().toString()));
//		} catch (URISyntaxException e) {
//			e.printStackTrace();
//		}
//		try {
//			i.injectMembers(this);
//		}
//		finally {
//			projectScope.exit();
//		}
//	}

//	private Set<CssExtension> getImportedExtensions(XtextResource resource) {
//		Set<CssExtension> result = new HashSet<>();
//		for (CssExtImportProvider p : importProviders) {
//			result.addAll(p.getImportedExtensions(resource));
//		}
//		return result;
//	}

//	private Set<URI> getImportedURIs(XtextResource resource) {
//		Set<URI> result = new HashSet<>();
//		for (CssExtImportProvider p : importProviders) {
//			result.addAll(p.getImportedURIs(resource));
//		}
//		return result;
//	}


	@Inject
	private CssExtParser parser;

	private Scope createContext(EObject context) {

		BundleContext bctx = FrameworkUtil.getBundle(CssExtImpl.class).getBundleContext();
		ServiceReference<ResourceScopeProvider> ref = bctx.getServiceReference(ResourceScopeProvider.class);
		ResourceScopeProvider p = bctx.getService(ref);

		return p.getScope(context);



//		if (context.eResource() instanceof CssStateResource) {
//			CssStateResource resource = (CssStateResource) context.eResource();
//			resource.registerState("importURIs", r -> {
//				return importManager.getImportedURIs(context);
//			});
//			resource.registerState(Scope.class, r -> {
//				Set<CssExtension> models = importManager.getImportedExtensions();
//				//Set<CssExtension> models = getImportedExtensions(resource);
//				return new Scope(context, resource, models, checkPropertyRefSupport(models));
//			});
//
//			return resource.getState(Scope.class);
//		}
//		else {
//			 return new Scope(context, (XtextResource) context.eResource());
//		}
	}

	@Override
	public boolean isPropertyVariable(EObject context, String name) {
		return impl.isPropertyVariable(createContext(context), name);
	}

	@Override
	public boolean isPropertyVariable(EObject context, CssProperty property) {
		return impl.isPropertyVariable(createContext(context), property);
	}

	@Override
	public boolean isPropertyVariable(EObject context, List<Selector> selectors, CssProperty property) {
		return impl.isPropertyVariable(createContext(context), selectors, property);
	}

	@Override
	public boolean isPropertyBySelectorSupported(EObject context, List<Selector> selectors, CssProperty property) {
		return impl.isPropertyBySelectorSupported(createContext(context), selectors, property);
	}

	@Override
	public boolean isPropertyKnown(EObject context, CssProperty property) {
		return impl.isPropertyKnown(createContext(context), property);
	}

	@Override
	public List<Proposal> getPropertyProposalsForSelector(EObject context, List<Selector> selectors) {
		System.err.println("getPropertyProposalsForSelector("+context+", "+selectors+")");
		return impl.getPropertyProposalsForSelector(createContext(context), selectors);
	}

	@Override
	public List<Proposal> getValueProposalsForProperty(EObject context, List<Selector> selector, CssProperty property, List<CssTok> prefixTok, String prefixString) {
		System.err.println("getValueProposalsForProperty("+context+", "+selector+", " + property + ")");
		return impl.getValueProposalsForProperty(createContext(context), selector, property, prefixTok, prefixString);
	}

	@Override
	public List<Proposal> getValueProposalsForFunction(EObject context, List<Selector> selector, CssProperty property, FuncTok funcTok, List<CssTok> prefixTok, String prefixString) {
		System.err.println("getValueProposalsForFunction("+context+", "+selector+", " + property + ", " + funcTok.getName() + ")");
		return impl.getValueProposalsForFunction(createContext(context), selector, property, funcTok, prefixTok, prefixString);
	}

	@Override
	public String getDocumentationHeader(EObject context, EObject obj) {
		return docApi.getDocHead(createContext(context), obj);
	}

	@Override
	public String getDocumentation(EObject context, EObject obj) {
		return docApi.getDocumentation(createContext(context), obj);
	}
}

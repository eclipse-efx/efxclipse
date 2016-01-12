package org.eclipse.fx.ide.css.cssext.extapi.scope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.eclipse.fx.ide.css.cssext.extapi.registry.CssExtFileWatcher;
import org.eclipse.fx.ide.css.cssext.extapi.registry.ImportUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

public class GlobalScope extends AScope {

	public GlobalScope(XtextResourceSet resource) {
		super(null, resource);
	}

	@Override
	public Optional<XtextResource> getResource() {
		return Optional.empty();
	}

	@Override
	protected void doInit() {
		System.err.println("GlobalScope#initialize()");
		long now = System.currentTimeMillis();
		getServices().forEach(s-> {
			s.subscribe(null, added -> {
				ImportUtil.findNamespace(this, ImportUtil.convert(added)).ifPresent(namespace ->
					autoAdd(namespace, ImportUtil.convert(added))
				);
			}, removed -> {
				ImportUtil.findNamespace(this, ImportUtil.convert(removed)).ifPresent(namespace ->
					autoRemove(namespace)
				);
			});
			System.err.println(" initializing " + s.getId());
			for (java.net.URI c : s.getCurrent(null)) {
				System.err.println("  - " + c);
				ImportUtil.findNamespace(this, ImportUtil.convert(c)).ifPresent(namespace ->
					autoAdd(namespace, ImportUtil.convert(c))
				);
			}
		});
		System.err.println("GlobalScope#initialize() needed " + (System.currentTimeMillis()-now) + "ms");
	}



	private List<CssExtFileWatcher<Void>> getServices() {
		List<CssExtFileWatcher<Void>> services = new ArrayList<>();
		BundleContext ctx = FrameworkUtil.getBundle(GlobalScope.class).getBundleContext();

		try {
			@SuppressWarnings("rawtypes")
			Collection<ServiceReference<CssExtFileWatcher>> refs = ctx.getServiceReferences(CssExtFileWatcher.class, "(context=java.lang.Void)");
			for (@SuppressWarnings("rawtypes") ServiceReference<CssExtFileWatcher> ref : refs) {
				@SuppressWarnings("unchecked")
				CssExtFileWatcher<Void> service = (CssExtFileWatcher<Void>)ctx.getService(ref);
				services.add(service);
			}

		} catch (InvalidSyntaxException e) {
			e.printStackTrace();
		}
		return services;
	}
}

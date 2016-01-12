//package org.eclipse.fx.ide.css.cssext.ui.internal;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//import org.eclipse.core.resources.IProject;
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.fx.ide.css.cssext.extapi.registry.CssExtFileWatcher;
//import org.eclipse.fx.ide.css.cssext.extapi.registry.GlobalRegistry;
//import org.eclipse.fx.ide.css.cssext.extapi.registry.GlobalRegistryImpl;
//import org.eclipse.fx.ide.css.cssext.extapi.registry.ImportUtil;
//import org.eclipse.fx.ide.css.cssext.extapi.registry.Registry;
//import org.osgi.framework.BundleContext;
//import org.osgi.framework.FrameworkUtil;
//import org.osgi.framework.InvalidSyntaxException;
//import org.osgi.framework.ServiceReference;
//
//import com.google.inject.Inject;
//import com.google.inject.name.Named;
//
//public class ProjectRegistry extends Registry {
//
//	@Inject
//	private ImportUtil importManager;
//
//	@Inject
//	@GlobalRegistry
//	private Registry parent;
//
//	@Inject
//	@Named("currentProject")
//	private IProject project;
//
//	private List<CssExtFileWatcher<IProject>> getServices() {
//		List<CssExtFileWatcher<IProject>> services = new ArrayList<>();
//		BundleContext ctx = FrameworkUtil.getBundle(GlobalRegistryImpl.class).getBundleContext();
//
//		try {
//			@SuppressWarnings("rawtypes")
//			Collection<ServiceReference<CssExtFileWatcher>> refs = ctx.getServiceReferences(CssExtFileWatcher.class, "(context=org.eclipse.core.resources.IProject)");
//			for (@SuppressWarnings("rawtypes") ServiceReference<CssExtFileWatcher> ref : refs) {
//				@SuppressWarnings("unchecked")
//				CssExtFileWatcher<IProject> service = (CssExtFileWatcher<IProject>)ctx.getService(ref);
//				services.add(service);
//			}
//
//		} catch (InvalidSyntaxException e) {
//			e.printStackTrace();
//		}
//		return services;
//	}
//
////	@Inject
//	public void initialize() {
//		System.err.println("ProjectRegistry#initialize("+project.getName()+")");
//		long now = System.currentTimeMillis();
//		getServices().forEach(s-> {
//			s.subscribe(project, added -> importManager.findNamespace(convert(added)).ifPresent(namespace->autoAdd(namespace, convert(added))), removed -> importManager.findNamespace(convert(removed)).ifPresent(namespace->autoRemove(namespace)));
//			System.err.println(" initializing " + s.getId());
//			for (java.net.URI c : s.getCurrent(project)) {
//				System.err.println("  - " + c);
//				importManager.findNamespace(convert(c)).ifPresent(namespace->autoAdd(namespace, convert(c)));
//			}
//		});
//		System.err.println("ProjectRegistry#initialize("+project.getName()+") needed " + (System.currentTimeMillis()-now) + "ms");
//	}
//
//	private URI convert(java.net.URI uri) {
//		return URI.createURI(uri.toString());
//	}
//
//	@Override
//	public URI lookup(String namespace) {
//		URI result = super.lookup(namespace);
//		if (result == null) {
//			if (parent != null) {
//				result = parent.lookup(namespace);
//			}
//		}
//		return result;
//	}
//
//}

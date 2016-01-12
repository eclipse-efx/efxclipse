//package org.eclipse.fx.ide.css.cssext.ui.internal;
//
//import java.net.URI;
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.Set;
//
//import org.eclipse.core.resources.IProject;
//import org.eclipse.fx.ide.css.cssext.extapi.registry.CssExtFileWatcher;
//import org.eclipse.fx.ide.css.cssext.extapi.registry.RegistryPopulator;
//import org.osgi.framework.BundleContext;
//import org.osgi.framework.FrameworkUtil;
//import org.osgi.framework.InvalidSyntaxException;
//import org.osgi.framework.ServiceReference;
//
//import com.google.inject.Inject;
//import com.google.inject.name.Named;
//
//public class ProjectRegistryPopulator implements RegistryPopulator {
//
//	@Inject
//	@Named("currentProject")
//	private IProject project;
//
//	@Override
//	public Set<URI> findEntries() {
//		System.err.println("ProjectRegistry#findEntries("+project.getName()+")");
//		Set<URI> result = new HashSet<>();
//		BundleContext ctx = FrameworkUtil.getBundle(GlobalRegistryPopulator.class).getBundleContext();
//
//		try {
//			@SuppressWarnings("rawtypes")
//			Collection<ServiceReference<CssExtFileWatcher>> refs = ctx.getServiceReferences(CssExtFileWatcher.class, "(context=org.eclipse.core.resources.IProject)");
//			for (@SuppressWarnings("rawtypes") ServiceReference<CssExtFileWatcher> ref : refs) {
//				@SuppressWarnings("unchecked")
//				CssExtFileWatcher<IProject> service = (CssExtFileWatcher<IProject>)ctx.getService(ref);
//				try {
//					long now = System.currentTimeMillis();
//
////					Set<URI> files = service.getCssExtFiles(project);
////					result.addAll(files);
//
////					System.err.println(" - " + service.getId() + " found " + files.size() + " entries in " + (System.currentTimeMillis() - now) + "ms");
//				}
//				finally {
//					ctx.ungetService(ref);
//				}
//			}
//
//		} catch (InvalidSyntaxException e) {
//			e.printStackTrace();
//		}
//		System.err.println("ProjectRegistry#findEntries() returns " + result.size() + " entries");
//		return result;
//	}
//
//}

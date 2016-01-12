//package org.eclipse.fx.ide.css.cssext.ui.internal;
//
//import java.net.URI;
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.Set;
//
//import org.eclipse.fx.ide.css.cssext.extapi.registry.CssExtFileWatcher;
//import org.eclipse.fx.ide.css.cssext.extapi.registry.RegistryPopulator;
//import org.osgi.framework.BundleContext;
//import org.osgi.framework.FrameworkUtil;
//import org.osgi.framework.InvalidSyntaxException;
//import org.osgi.framework.ServiceReference;
//
//import com.google.inject.Singleton;
//
//@Singleton
//public class GlobalRegistryPopulator implements RegistryPopulator {
//
//	@Override
//
//	public Set<URI> findEntries() {
//		System.err.println("GlobalRegistry#findEntries()");
//		Set<URI> result = new HashSet<>();
//		BundleContext ctx = FrameworkUtil.getBundle(GlobalRegistryPopulator.class).getBundleContext();
//
//		try {
//			@SuppressWarnings("rawtypes")
//			Collection<ServiceReference<CssExtFileWatcher>> refs = ctx.getServiceReferences(CssExtFileWatcher.class, "(context=java.lang.Void)");
//			for (@SuppressWarnings("rawtypes") ServiceReference<CssExtFileWatcher> ref : refs) {
//				@SuppressWarnings("unchecked")
//				CssExtFileWatcher<Void> service = (CssExtFileWatcher<Void>)ctx.getService(ref);
//				try {
//					long now = System.currentTimeMillis();
//
////					Set<URI> files = service.getCssExtFiles(null);
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
//		System.err.println("GlobalRegistry#findEntries() returns " + result.size() + " entries");
//		return result;
//	}
//
//}

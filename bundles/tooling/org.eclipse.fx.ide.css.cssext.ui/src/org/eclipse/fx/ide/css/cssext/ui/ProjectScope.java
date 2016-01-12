package org.eclipse.fx.ide.css.cssext.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.css.cssext.extapi.registry.CssExtFileWatcher;
import org.eclipse.fx.ide.css.cssext.extapi.registry.ImportUtil;
import org.eclipse.fx.ide.css.cssext.extapi.scope.AScope;
import org.eclipse.fx.ide.css.cssext.extapi.scope.Scope;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

public class ProjectScope extends AScope {

	private final IProject project;

	public ProjectScope(Scope parent, XtextResourceSet resourceSet, IProject project) {
		super(parent, resourceSet);
		this.project = project;
		if (project == null) throw new NullPointerException();
	}

	public Optional<IProject> getProject() {
		return Optional.ofNullable(project);
	}

	@Override
	public Optional<XtextResource> getResource() {
		return Optional.empty();
	}

	protected void doInit() {
		System.err.println("ProjectScope#initialize("+project.getName()+")");
		long now = System.currentTimeMillis();
		getServices().forEach(s-> {
			s.subscribe(project, added -> ImportUtil.findNamespace(this, ImportUtil.convert(added)).ifPresent(namespace->autoAdd(namespace, ImportUtil.convert(added))), removed -> ImportUtil.findNamespace(this, ImportUtil.convert(removed)).ifPresent(namespace->autoRemove(namespace)));
			System.err.println(" initializing " + s.getId());
			for (java.net.URI c : s.getCurrent(project)) {
				System.err.println("  - " + c);
				ImportUtil.findNamespace(this, ImportUtil.convert(c)).ifPresent(namespace->autoAdd(namespace, ImportUtil.convert(c)));
			}
		});
		System.err.println("ProjectScope#initialize("+project.getName()+") needed " + (System.currentTimeMillis()-now) + "ms");
	}

	private List<CssExtFileWatcher<IProject>> getServices() {
		List<CssExtFileWatcher<IProject>> services = new ArrayList<>();
		BundleContext ctx = FrameworkUtil.getBundle(ProjectScope.class).getBundleContext();

		try {
			@SuppressWarnings("rawtypes")
			Collection<ServiceReference<CssExtFileWatcher>> refs = ctx.getServiceReferences(CssExtFileWatcher.class, "(context=org.eclipse.core.resources.IProject)");
			for (@SuppressWarnings("rawtypes") ServiceReference<CssExtFileWatcher> ref : refs) {
				@SuppressWarnings("unchecked")
				CssExtFileWatcher<IProject> service = (CssExtFileWatcher<IProject>)ctx.getService(ref);
				services.add(service);
			}

		} catch (InvalidSyntaxException e) {
			e.printStackTrace();
		}
		return services;
	}

}
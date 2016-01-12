package org.eclipse.fx.ide.css;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class CssResourceFactory extends XtextResourceFactory {

	@Inject
	public CssResourceFactory(Provider<XtextResource> resourceProvider) {
		super(resourceProvider);
	}
	
	@Override
	public Resource createResource(URI uri) {
		return super.createResource(uri);
	}

}

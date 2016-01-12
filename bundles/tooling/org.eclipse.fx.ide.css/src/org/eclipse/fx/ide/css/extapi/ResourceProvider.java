package org.eclipse.fx.ide.css.extapi;

import java.net.URI;

import org.eclipse.xtext.resource.XtextResource;

public interface ResourceProvider {

	XtextResource getResource(URI resource);
	
}

package org.eclipse.fx.ide.css.cssext.ui.internal;

import java.net.URISyntaxException;

import org.eclipse.emf.ecore.EObject;
//import org.eclipse.fx.ide.css.cssext.guice.AbstractProjectScope;
//import org.eclipse.fx.ide.css.cssext.guice.AbstractResourceScope;
import org.eclipse.fx.ide.css.extapi.CssExt;
import org.eclipse.fx.ide.css.extapi.CssExtProvider;
import org.osgi.service.component.annotations.Component;

import com.google.inject.Injector;

@Component
public class CssExtProviderImpl implements CssExtProvider {

	CssExt cache;

	@Override
	public CssExt getCssExt(EObject context) {
		if (cache == null) {
			Injector injector = CssextActivator.getInstance().getInjector(CssextActivator.ORG_ECLIPSE_FX_IDE_CSS_CSSEXT_CSSEXTDSL);
			cache = injector.getInstance(CssExt.class);
		}

//		AbstractProjectScope projectScope = injector.getInstance(AbstractProjectScope.class);
//		AbstractResourceScope resourceScope = injector.getInstance(AbstractResourceScope.class);

//		projectScope.enter(context);
		try {
//			resourceScope.enter(context);
			try {
				return cache;
			}
			finally {
//				resourceScope.exit();
			}
		}
		finally {
//			projectScope.exit();
		}
	}

}

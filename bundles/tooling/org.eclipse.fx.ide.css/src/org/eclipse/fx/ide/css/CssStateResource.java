package org.eclipse.fx.ide.css;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;

public class CssStateResource extends LazyLinkingResource {

	private Runnable onClearAction;

	private void onClear() {
		if (onClearAction != null) {
			onClearAction.run();
		}
	}

	public void setOnClear(Runnable action) {
		this.onClearAction = action;
	}

	EContentAdapter ad = new EContentAdapter() {
		public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
			if (notification.getEventType() != Notification.REMOVING_ADAPTER) {
				onClear();
			}
			super.notifyChanged(notification);
		}
	};

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		super.doLoad(inputStream, options);
		eAdapters.add(ad);
	}

	@Override
	protected void doUnload() {
		eAdapters.remove(ad);
		super.doUnload();
	}

}

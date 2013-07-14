package org.eclipse.fx.ecp.ui.controls.multi;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControlContext;
import org.eclipse.fx.ecp.ui.ECPUtil;

public class EmbeddedReferenceControl extends AbstractEmbeddedControl {

	protected Hyperlink hyperlink;
	protected AdapterImpl valueAdapter;
	protected EObject value;

	public EmbeddedReferenceControl(IItemPropertyDescriptor propertyDescriptor, final ECPControlContext context, int initialIndex) {
		super(propertyDescriptor, context, initialIndex);
		
		valueAdapter = new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				update();
			}

		};
		
		setSkin(new Skin(this));
		
		update();
	}

	@Override
	protected void update() {
		super.update();

		// only update if index inside bounds
		if (eList.size() > index) {
			EObject newValue = (EObject) eList.get(index);

			if (newValue != value) {
				if (value != null)
					value.eAdapters().remove(valueAdapter);
				newValue.eAdapters().add(valueAdapter);
				value = newValue;
			}

			String text = ECPUtil.getText(value);
			Node icon = ECPUtil.getGraphic(value);

			hyperlink.setText(text);
			hyperlink.setGraphic(icon);
		} else {
			hyperlink.setText(null);
			hyperlink.setGraphic(null);
		}
	}
	
	@Override
	public void dispose() {
		value.eAdapters().remove(valueAdapter);
		super.dispose();
	}
	
	protected class Skin extends EmbeddedControlSkin {

		protected Skin(EmbeddedReferenceControl control) {
			super(control);
			
			hyperlink = new Hyperlink();
			hBox.getChildren().add(0, hyperlink);
			HBox.setHgrow(hyperlink, Priority.ALWAYS);
			hyperlink.setMaxWidth(Double.MAX_VALUE);

			hyperlink.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					if (eList.size() > index) {
						Object item = eList.get(index);
						if (item instanceof EObject)
							context.openInNewContext((EObject) item);
					}
				}

			});

			upButton.getStyleClass().add("left-pill");
		}
		
	}

}

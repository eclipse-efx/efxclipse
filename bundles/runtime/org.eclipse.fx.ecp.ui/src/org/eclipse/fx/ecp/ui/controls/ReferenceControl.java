package org.eclipse.fx.ecp.ui.controls;

import java.net.URL;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.Control;

public class ReferenceControl extends HBox implements Control {

	public ReferenceControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {

		final EObject modelElement = context.getModelElement();
		final EditingDomain editingDomain = context.getEditingDomain();

		final EReference feature = (EReference) propertyDescriptor.getFeature(modelElement);

		Object value = modelElement.eGet(feature);

		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(value, IItemLabelProvider.class);

		String text = labelProvider.getText(value);

		URL image = (URL) labelProvider.getImage(value);
		ImageView imageView = new ImageView(image.toExternalForm());

		Hyperlink hyperlink = new Hyperlink(text, imageView);
		getChildren().add(hyperlink);
		hyperlink.setMaxWidth(Double.MAX_VALUE);
		HBox.setHgrow(hyperlink, Priority.ALWAYS);
		

		Button editButton = new Button();
		getChildren().add(editButton);
		editButton.getStyleClass().addAll("editLinkButton", "left-pill");
		editButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
//				ReferenceSelectionDialog referenceSelectionDialog = new ReferenceSelectionDialog(null, null);
//				referenceSelectionDialog.showAndWait();
				
//				final Stage dialog = new Stage();
//			    dialog.initModality(Modality.WINDOW_MODAL);
////			    dialog.initOwner(primaryStage);
//			    dialog.setScene(
//			      new Scene(
//			        HBoxBuilder.create().styleClass("modal-dialog").children(
//			          LabelBuilder.create().text("Will you like this page?").build(),
//			          ButtonBuilder.create().text("Yes").defaultButton(true).onAction(new EventHandler<ActionEvent>() {
//			            @Override public void handle(ActionEvent actionEvent) {
//			              dialog.close();
//			            }
//			          }).build(),
//			          ButtonBuilder.create().text("No").cancelButton(true).onAction(new EventHandler<ActionEvent>() {
//			            @Override public void handle(ActionEvent actionEvent) {
//				              dialog.close();
//			            }
//			          }).build()
//			        ).build()
//			        , Color.TRANSPARENT
//			      )
//			    );
//			    dialog.showAndWait();
			}
		});
		
		Button deleteButton = new Button();
		getChildren().add(deleteButton);
		deleteButton.getStyleClass().addAll("deleteLinkButton", "right-pill");
	}
	
	public static class Factory implements Control.Factory {

		@Override
		public Control createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new ReferenceControl(itemPropertyDescriptor, context);
		}

	}

	@Override
	public void handleValidation(Diagnostic diagnostic) {
		// TODO Auto-generated method stub
	}

	@Override
	public void resetValidation() {
		// TODO Auto-generated method stub
	}

}

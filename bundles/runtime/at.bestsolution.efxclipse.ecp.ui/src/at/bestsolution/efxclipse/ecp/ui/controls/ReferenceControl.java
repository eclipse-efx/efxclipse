package at.bestsolution.efxclipse.ecp.ui.controls;

import java.net.URL;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public class ReferenceControl extends HBox {

	public ReferenceControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {

		final EObject modelElement = context.getModelElement();
		final EditingDomain editingDomain = context.getEditingDomain();

		String displayName = propertyDescriptor.getDisplayName(modelElement);
		Label label = new Label(displayName);
		label.getStyleClass().add(IControlConstants.CONTROL_LABEL_CLASS);
		getChildren().add(label);

		final EReference feature = (EReference) propertyDescriptor.getFeature(modelElement);

		Object value = modelElement.eGet(feature);

		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(value, IItemLabelProvider.class);

		HBox hBox = new HBox();

		Label label2 = new Label(labelProvider.getText(value));

		URL image = (URL) labelProvider.getImage(value);

		hBox.getChildren().add(new ImageView(image.toExternalForm()));
		hBox.getChildren().add(label2);
		Button button = new Button("...");
		button.setOnAction(new EventHandler<ActionEvent>() {
			
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
		
		hBox.getChildren().add(button);

		HBox.setHgrow(label2, Priority.ALWAYS);

		getChildren().add(hBox);
	}

}

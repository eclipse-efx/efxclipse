package org.eclipse.fx.ecp.ui.controls.multi;

import java.net.URL;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.osgi.internal.baseadaptor.AdaptorUtil;

public class EmbeddedReferenceControl extends Hyperlink implements EmbeddedControl {

	private final EList<?> eList;
	private int index;

	public EmbeddedReferenceControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context, int initialIndex) {

		final EObject modelElement = context.getModelElement();
		final EditingDomain editingDomain = context.getEditingDomain();
		final EStructuralFeature feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);
		eList = (EList<?>) modelElement.eGet(feature);
		
		EObject value = (EObject) eList.get(initialIndex);
				
//		IItemLabelProvider labelProvider = ComposedAdapterFactory.Descriptor.Registry.INSTANCE//(IItemLabelProvider) EcoreUtil.getRegisteredAdapter(value, IItemLabelProvider.class);
		
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(value, IItemLabelProvider.class);
		
		String text = labelProvider.getText(value);

		URL image = (URL) labelProvider.getImage(value);
		ImageView imageView = new ImageView(image.toExternalForm());
		
		setText(text);
		
		setGraphic(imageView);

		setMaxWidth(Double.MAX_VALUE);
		
		setIndex(initialIndex);
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}

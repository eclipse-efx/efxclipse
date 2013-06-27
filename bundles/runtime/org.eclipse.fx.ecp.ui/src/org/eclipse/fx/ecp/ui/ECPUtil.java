package org.eclipse.fx.ecp.ui;

import java.net.URL;

import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Labeled;
import javafx.scene.control.TreeItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.PopupWindow;
import javafx.stage.Window;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryCellFactory;
import org.osgi.framework.Bundle;

public class ECPUtil {

	public static final ComposedAdapterFactory DEFAULT_ADAPTER_FACTORY;
	private static final String PACKAGE_IMAGE_URL;

	static {
		DEFAULT_ADAPTER_FACTORY = new ComposedAdapterFactory();
		DEFAULT_ADAPTER_FACTORY.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		DEFAULT_ADAPTER_FACTORY.addAdapterFactory(new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE));
		Bundle bundle = Platform.getBundle("org.eclipse.fx.ecp.app");
		URL entry = bundle.getEntry("icons/EPackage.gif");
		PACKAGE_IMAGE_URL = entry.toExternalForm();
	}

	public static TreeItem<ENamedElement> getConcreteClasses() {

		TreeItem<ENamedElement> root = new TreeItem<>();

		for (String nsURI : Registry.INSTANCE.keySet()) {
			EPackage ePackage = Registry.INSTANCE.getEPackage(nsURI);

			addPackage(root, ePackage);
		}

		return root;
	}

	private static void addPackage(TreeItem<ENamedElement> root, EPackage ePackage) {
		TreeItem<ENamedElement> ePackageItem = new TreeItem<ENamedElement>(ePackage, new ImageView(PACKAGE_IMAGE_URL));
		root.getChildren().add(ePackageItem);

		for (EPackage eSubpackage : ePackage.getESubpackages())
			addPackage(ePackageItem, eSubpackage);

		addConcreteClasses(ePackage, ePackageItem);
	}

	private static void addConcreteClasses(EPackage ePackage, TreeItem<ENamedElement> ePackageItem) {
		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			if (eClassifier instanceof EClass) {
				EClass eClass = (EClass) eClassifier;
				if (!eClass.isAbstract() && !eClass.isInterface()) {
					Node graphic = getIconForEClass(eClass);
					ePackageItem.getChildren().add(new TreeItem<ENamedElement>(eClassifier, graphic));
				}
			}
		}
	}

	private static Node getIconForEClass(EClass eClass) {
		EPackage ePackage = eClass.getEPackage();
		EObject instance = ePackage.getEFactoryInstance().create(eClass);
		try {
			IItemLabelProvider labelProvider = (IItemLabelProvider) DEFAULT_ADAPTER_FACTORY.adapt(instance, IItemLabelProvider.class);
			if (labelProvider != null) {
				Object image = labelProvider.getImage(instance);
				return AdapterFactoryCellFactory.graphicFromObject(image);
			}
		} catch (Exception e) {
			// TODO maybe log this?
		}
		return null;
	}

	public static String getText(Object object) {
		IItemLabelProvider labelProvider = (IItemLabelProvider) DEFAULT_ADAPTER_FACTORY.adapt(object, IItemLabelProvider.class);
		return labelProvider != null ? labelProvider.getText(object) : null;
	}

	public static Node getGraphic(Object object) {
		IItemLabelProvider labelProvider = (IItemLabelProvider) DEFAULT_ADAPTER_FACTORY.adapt(object, IItemLabelProvider.class);

		if (labelProvider != null) {
			Object image = labelProvider.getImage(object);
			return AdapterFactoryCellFactory.graphicFromObject(image);
		}

		return null;
	}

	public static void addMark(Labeled backButton, String styleClass) {
		StackPane mark = new StackPane();
		mark.getStyleClass().add(styleClass);
		backButton.setGraphic(new Group(mark));
	}
	
	public static void showContextMenu(PopupWindow popupWindow, Node node) {
		Point2D position = node.localToScene(0.0, 0.0);
		Scene scene = node.getScene();
		Window window = scene.getWindow();
		double x = position.getX() + scene.getX() + window.getX();
		double y = position.getY() + scene.getY() + window.getY() + node.getLayoutBounds().getHeight() + 5;
		popupWindow.show(node, x, y);
	}

}

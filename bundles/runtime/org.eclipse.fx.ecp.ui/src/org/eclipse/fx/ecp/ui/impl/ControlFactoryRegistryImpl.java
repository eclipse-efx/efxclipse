package org.eclipse.fx.ecp.ui.impl;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.edit.util.ECPApplicableTester;
import org.eclipse.emf.ecp.edit.util.StaticApplicableTester;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.Control;
import org.eclipse.fx.ecp.ui.Control.Factory;
import org.osgi.framework.Bundle;

public class ControlFactoryRegistryImpl implements Control.Factory.Registry {

	private static final String CONTROL_EXTENSION = "org.eclipse.fx.ecp.ui.controls";

	private static final String CLASS_ATTRIBUTE = "class";
	private static final String CONTROL_ID = "id";
	private static final String CONTROL_CLASS_ATTRIBUTE = "controlClass";
	private static final String LABEL_ATTRIBUTE = "showLabel";

	private static final String TEST_DYNAMIC = "dynamicTest";
	private static final String CONTROL_TESTER = "testClass";

	private static final String TEST_STATIC = "staticTest";
	private static final String TESTER_PRIORITY = "priority";
	private static final String TESTER_CLASSTYPE = "supportedClassType";
	private static final String TESTER_EOBJECT = "supportedEObject";
	private static final String TESTER_FEATURE = "supportedFeature";
	private static final String TESTER_SINGLEVALUE = "singleValue";

	private final Set<ControlFactoryDescriptor> controlDescriptors = new HashSet<ControlFactoryDescriptor>();

	public ControlFactoryRegistryImpl() {
		readExtensionPoint();
	}

	public Factory getFactory(Class<?> controlClass, IItemPropertyDescriptor propertyDescriptor, EObject modelElement) {
		ControlFactoryDescriptor factoryDescriptor = getControlFactoryCandidate(controlClass, propertyDescriptor,
			modelElement);
		return factoryDescriptor != null ? factoryDescriptor.createFactory() : null;
	}

	private void readExtensionPoint() {
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(
			CONTROL_EXTENSION);

		for (IConfigurationElement configurationElement : configurationElements) {
			try {
				String id = configurationElement.getAttribute(CONTROL_ID);
				Control.Factory factory = (Control.Factory) configurationElement
					.createExecutableExtension(CLASS_ATTRIBUTE);
				boolean showLabel = Boolean.parseBoolean(configurationElement.getAttribute(LABEL_ATTRIBUTE));
				String controlClass = configurationElement.getAttribute(CONTROL_CLASS_ATTRIBUTE);
//				Class<?> resolvedWidgetClass = loadClass(configurationElement.getContributor().getName(), controlClass);

				Set<ECPApplicableTester> testers = new HashSet<ECPApplicableTester>();

				for (IConfigurationElement testerExtension : configurationElement.getChildren()) {

					if (TEST_DYNAMIC.equals(testerExtension.getName())) {
						testers.add((ECPApplicableTester) testerExtension.createExecutableExtension(CONTROL_TESTER));
					} else if (TEST_STATIC.equals(testerExtension.getName())) {
						boolean singleValue = Boolean.parseBoolean(testerExtension.getAttribute(TESTER_SINGLEVALUE));
						int priority = Integer.parseInt(testerExtension.getAttribute(TESTER_PRIORITY));

						String type = testerExtension.getAttribute(TESTER_CLASSTYPE);
						Class<?> supportedClassType = Class.forName(type);

						String eObject = testerExtension.getAttribute(TESTER_EOBJECT);

						if (eObject == null)
							eObject = "org.eclipse.emf.ecore.EObject";

						Class<? extends EObject> supportedEObject = loadClass(testerExtension.getContributor()
							.getName(), eObject);

						String supportedFeature = testerExtension.getAttribute(TESTER_FEATURE);

						testers.add(new StaticApplicableTester(singleValue, priority, supportedClassType,
							supportedEObject, supportedFeature));
					}

				}

				controlDescriptors.add(new ControlFactoryDescriptor(id, factory, showLabel, testers));
			} catch (ClassNotFoundException e1) {
				// TODO log exception
				e1.printStackTrace();
			} catch (CoreException e1) {
				// TODO log exception
				e1.printStackTrace();
			}
		}
	}

	@SuppressWarnings("unchecked")
	private static <T> Class<T> loadClass(String bundleName, String clazz) throws ClassNotFoundException {
		Bundle bundle = Platform.getBundle(bundleName);
		if (bundle == null) {
			// TODO externalize strings
			throw new ClassNotFoundException(clazz + " cannot be loaded because bundle " + bundleName
				+ " cannot be resolved");
		}
		return (Class<T>) bundle.loadClass(clazz);
	}

	private ControlFactoryDescriptor getControlFactoryCandidate(Class<?> clazz,
		IItemPropertyDescriptor itemPropertyDescriptor, EObject modelElement) {
		int highestPriority = -1;

		ControlFactoryDescriptor bestCandidate = null;

		for (ControlFactoryDescriptor descriptor : controlDescriptors) {
			int currentPriority = -1;

			for (ECPApplicableTester tester : descriptor.getTesters()) {
				if(tester instanceof StaticApplicableTester) {
					if (((StaticApplicableTester) tester).isSingleValue() == false)
						System.out.println();;
				}
				
				int testerPriority = tester.isApplicable(itemPropertyDescriptor, modelElement);
				if (testerPriority > currentPriority)
					currentPriority = testerPriority;
			}

			if (currentPriority > highestPriority) {
				highestPriority = currentPriority;
				bestCandidate = descriptor;
			}
		}

		return bestCandidate;
	}

}

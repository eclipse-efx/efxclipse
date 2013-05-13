package org.eclipse.fx.ecp.ui.impl;

import java.util.Set;

import org.eclipse.emf.ecp.edit.util.ECPApplicableTester;
import org.eclipse.fx.ecp.ui.Control;
import org.eclipse.fx.ecp.ui.Control.Factory;

public class ControlFactoryDescriptor implements Control.Factory.Descriptor {

	private final String id;
	private final Factory factoryInstance;
	private final boolean showLabel;
	private final Set<ECPApplicableTester> applicableTesters;

	public ControlFactoryDescriptor(String id, Factory factoryInstance, boolean showLabel, Set<ECPApplicableTester> applicableTesters) {
		this.id = id;
		this.factoryInstance = factoryInstance;
		this.showLabel = showLabel;
		this.applicableTesters = applicableTesters;
	}

	public Factory createFactory() {
		return factoryInstance;
	}

	public String getID() {
		return id;
	}

	public boolean showLabel() {
		return showLabel;
	}

	public Set<ECPApplicableTester> getTesters() {
		return applicableTesters;
	}

}

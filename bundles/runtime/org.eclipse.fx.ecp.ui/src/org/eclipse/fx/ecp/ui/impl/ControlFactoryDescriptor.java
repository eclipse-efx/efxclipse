package org.eclipse.fx.ecp.ui.impl;

import java.util.Set;

import org.eclipse.fx.ecp.ui.Control;
import org.eclipse.fx.ecp.ui.Control.ApplicableTester;
import org.eclipse.fx.ecp.ui.Control.Factory;

public class ControlFactoryDescriptor implements Control.Factory.Descriptor {

	private final String id;
	private final Factory factoryInstance;
	private final boolean showLabel;
	private final Set<ApplicableTester> applicableTesters;
	private final boolean multi;

	public ControlFactoryDescriptor(String id, Factory factoryInstance, boolean showLabel, Set<ApplicableTester> applicableTesters, boolean multi) {
		this.id = id;
		this.factoryInstance = factoryInstance;
		this.showLabel = showLabel;
		this.applicableTesters = applicableTesters;
		this.multi = multi;
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

	public Set<ApplicableTester> getTesters() {
		return applicableTesters;
	}
	
	public boolean isMulti() {
		return multi;
	}

}

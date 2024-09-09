package com.smart.home.appliance;

/**
 * Appliance Controller superclass.
 */
public abstract class Controller {
	
	protected Appliance appliance;

	public Controller(Appliance appliance) {
		this.appliance = appliance;
	}

	public Appliance getAppliance() {
		return appliance;
	}

	public void setAppliance(Appliance appliance) {
		this.appliance = appliance;
	}

	public void toggleAppliance(boolean isOn) {
		appliance.setOn(isOn);
	}
	
}

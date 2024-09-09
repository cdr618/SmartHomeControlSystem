package com.smart.home.appliance;

public abstract class Controller {
	protected Appliance appliance;
	protected boolean isOn;

	public Controller(Appliance appliance) {
		this.appliance = appliance;
	}

	public Appliance getAppliance() {
		return appliance;
	}

	public void setAppliance(Appliance appliance) {
		this.appliance = appliance;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
		appliance.setOn(isOn);
	}
	
	
}

package com.smart.home.appliance;

public abstract class Appliance {

	private String name;
	private boolean isOn = false;
	
	public Appliance(String name) {
		this.name = name;
	}

	public boolean isOn() {
		return isOn;
	}

	public boolean setOn(boolean isOn) {
		this.isOn = isOn;
		return isOn;
	}

	public String getName() {
		return name == null ? "Unnamed Appliance" : name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

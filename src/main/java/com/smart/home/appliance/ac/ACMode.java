package com.smart.home.appliance.ac;

public enum ACMode {
	COOLER(true), 
	COOL(true), 
	OFF(false);
	
	private final boolean isAcOn;

	private ACMode(boolean isAcOn) {
		this.isAcOn = isAcOn;
	}

	public boolean isAcOn() {
		return isAcOn;
	}

	
	
}

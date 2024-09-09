package com.smart.home.appliance.ac;

/**
 * Possible modes for the air conditioner.
 */
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

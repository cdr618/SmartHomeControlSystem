package com.smart.home.appliance.fan;

public enum FanSpeed {
	
	ZERO("TWO", false),
	ONE("ZERO", true),
	TWO("ONE", true);
	
	private final String nextSpeed;
	private final boolean isFanOn;

	private FanSpeed(String nextSpeed, boolean isFanOn) {
		this.nextSpeed = nextSpeed;
		this.isFanOn = isFanOn;
	}

	public String getNextSpeed() {
		return nextSpeed;
	}

	public boolean isFanOn() {
		return isFanOn;
	}
}

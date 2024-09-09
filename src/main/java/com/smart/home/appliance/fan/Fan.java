package com.smart.home.appliance.fan;

import com.smart.home.appliance.Appliance;

public class Fan extends Appliance {

	private FanSpeed currentSpeed = FanSpeed.ZERO;

	public Fan(String name) {
		super(name);
	}

	public FanSpeed getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(FanSpeed currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

}

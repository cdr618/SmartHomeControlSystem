package com.smart.home.appliance.fan;

import com.smart.home.appliance.Controller;

public class FanCord extends Controller {


	public FanCord(Fan appliance) {
		super(appliance);
	}

	@Override
	public void setOn(boolean isOn) {
		this.isOn = isOn;

		if (!isOn) {
			((Fan) appliance).setCurrentSpeed(FanSpeed.ZERO);
		}
	}
	
	public void pullCord() {
		Fan fan = (Fan) appliance;
		fan.setCurrentSpeed(FanSpeed.valueOf(fan.getCurrentSpeed().getNextSpeed()));
		setOn(fan.getCurrentSpeed().isFanOn());
	}
	
}

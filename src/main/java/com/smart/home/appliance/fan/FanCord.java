package com.smart.home.appliance.fan;

import com.smart.home.appliance.Controller;

/**
 * Controls a fan (cord one would pull from a ceiling fan).
 */
public class FanCord extends Controller {

	public FanCord(Fan appliance) {
		super(appliance);
	}

	/**
	 * If the fan is on, reduces the speed of the fan. If the fan is off, turns the fan on to speed 2.
	 */
	public void pullCord() {
		Fan fan = (Fan) appliance;
		fan.setCurrentSpeed(FanSpeed.valueOf(fan.getCurrentSpeed().getNextSpeed()));
		toggleAppliance(fan.getCurrentSpeed().isFanOn());
	}
	
}

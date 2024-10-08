package com.smart.home.appliance.ac;

import com.smart.home.appliance.Controller;

/**
 * Controls air conditioner.
 */
public class Thermostat extends Controller {
	
	private int currentTemp;
	private int desiredTemp;

	public Thermostat(AirConditioner airConditioner, int currentTemp, int desiredTemp) {
		super(airConditioner);
		this.currentTemp = currentTemp;
		setDesiredTemp(desiredTemp);
	}
	
	public void turnOff() {
		((AirConditioner) appliance).setMode(ACMode.OFF);
	}

	public double getCurrentTemp() {
		return currentTemp;
	}

	public void setCurrentTemp(int currentTemp) {
		this.currentTemp = currentTemp;
	}

	public double getDesiredTemp() {
		return desiredTemp;
	}

	/**
	 * Sets the AC mode based on the difference between the current and desired temperature.
	 * 
	 * @param desiredTemp temperature the thermostat is set to
	 */
	public void setDesiredTemp(int desiredTemp) {
		this.desiredTemp = desiredTemp;
		double tempDiff = currentTemp - desiredTemp;
		AirConditioner airConditioner = (AirConditioner) appliance;
		
		if (tempDiff <= 0) {
			airConditioner.setMode(ACMode.OFF);
		} else if (tempDiff > 2) {
			airConditioner.setMode(ACMode.COOLER);
		} else {
			airConditioner.setMode(ACMode.COOL);
		}
	}
	
}

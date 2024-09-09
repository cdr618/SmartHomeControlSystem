package com.smart.home.appliance.ac;

import com.smart.home.appliance.Appliance;

public class AirConditioner extends Appliance {

	public AirConditioner(String name) {
		super(name);
	}

	private ACMode mode = ACMode.OFF;
		
	public ACMode getMode() {
		return mode;
	}

	public void setMode(ACMode mode) {
		this.mode = mode;
		setOn(mode.isAcOn());
	}
}

package com.smart.home;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.smart.home.appliance.Controller;
import com.smart.home.appliance.ac.AirConditioner;
import com.smart.home.appliance.ac.Thermostat;
import com.smart.home.appliance.fan.Fan;
import com.smart.home.appliance.fan.FanCord;
import com.smart.home.appliance.light.Light;
import com.smart.home.appliance.light.Switch;

import it.sauronsoftware.cron4j.Scheduler;

public class ControlSystem {

	private static Set<Controller> controllers = new HashSet<>();
	
	public static void main(String[] args) {
		try {
			Switch lightSwitch = new Switch(new Light("Light"));
			lightSwitch.setOn(true);
			
			FanCord fanCord = new FanCord(new Fan("Fan"));
			fanCord.pullCord();
			fanCord.pullCord();
			
			Thermostat thermostat = new Thermostat(new AirConditioner("AC"), 24, 24);
			thermostat.setDesiredTemp(18);
			
			controllers.add(lightSwitch);
			controllers.add(fanCord);
			controllers.add(thermostat);
			
			System.out.println("Current appliances: ");
    		for (Controller c : controllers) {
				if (c != null && c.getAppliance() != null) {
					System.out.println(c.getAppliance().getName());					
				}
    		}
			
			Scheduler s = new Scheduler();
			s.schedule("0 1 1 1 *", new Runnable() {
			
				@Override
				public void run() {
					for (Controller c : controllers) {
						if (c != null && c.getAppliance() != null) {
							try {
								c.setOn(false);
								System.out.println("Turned off " + c.getAppliance().getName());
							} catch (Exception e) {
								System.err.println("Failed to turn off " + c.getAppliance().getName());
								e.printStackTrace();
							}							
						}
					}												
				}
				
			});			
				
			s.start();
			
		} catch (Exception e) {
			System.err.println("Failed to initialize Smart Home Control System.");
			e.printStackTrace();
		}

	}
}

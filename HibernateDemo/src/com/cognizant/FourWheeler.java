package com.cognizant;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehicle {

	private String steeringWheel;

	public FourWheeler(int chasisNumber, String vehicleName, String steeringWheel) {
		super(chasisNumber, vehicleName);
		this.steeringWheel = steeringWheel;
	}

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}
	
	
}

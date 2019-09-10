package com.cognizant;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {
	
	@Id
	private int chasisNumber;
	private String vehicleName;
	
	public Vehicle(int chasisNumber, String vehicleName) {
		super();
		this.chasisNumber = chasisNumber;
		this.vehicleName = vehicleName;
	}
	public int getChasisNumber() {
		return chasisNumber;
	}
	public void setChasisNumber(int chasisNumber) {
		this.chasisNumber = chasisNumber;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	

}

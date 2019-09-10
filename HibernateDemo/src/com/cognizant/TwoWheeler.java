package com.cognizant;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle {

	private String handleBar;

	public TwoWheeler(int chasisNumber, String vehicleName, String handleBar) {
		super(chasisNumber, vehicleName);
		this.handleBar = handleBar;
	}

	public String getHandleBar() {
		return handleBar;
	}

	public void setHandleBar(String handleBar) {
		this.handleBar = handleBar;
	}
	
	

}

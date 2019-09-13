package com.cognizant;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Technologies {
	
	@Id
	private String id;
	private String technology;
	
	public Technologies(String id, String technology) {
		super();
		this.id = id;
		this.technology = technology;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String gettechnology() {
		return technology;
	}
	public void settechnology(String technology) {
		this.technology = technology;
	}
	
	
	

}

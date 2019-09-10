package com.cognizant;

import javax.persistence.Entity;

@Entity
public class Module extends Project {
	
	private String moduleName;

	public Module(int projectId, String projectName, String moduleName) {
		super(projectId, projectName);
		this.moduleName = moduleName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	

}

package com.cognizant;

import javax.persistence.Entity;

@Entity
public class Task extends Project {
	
	private String taskName;

	public Task(int projectId, String projectName, String taskName) {
		super(projectId, projectName);
		this.taskName = taskName;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	

}

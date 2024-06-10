package com.example.EmployeeDashboard.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class EmployeeData {
	@Id
	@Column
	private String employeeId;
	@Column
	private String jobRole;
	@Column
	private int experience;
	@Column
	private String band;
	@Column
	private String projectName;
	@Column
	private String Client;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getClient() {
		return Client;
	}
	public void setClient(String client) {
		Client = client;
	}
	@Override
	public String toString() {
		return "EmployeeData [employeeId=" + employeeId + ", jobRole=" + jobRole + ", experience=" + experience
				+ ", band=" + band + ", projectName=" + projectName + ", Client=" + Client + "]";
	}
}

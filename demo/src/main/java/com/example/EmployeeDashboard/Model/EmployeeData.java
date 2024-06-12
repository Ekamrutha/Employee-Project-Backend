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
	private String firstName;
	@Column
	private String lastName;
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
	@Column
	private String managerId;
	@Column
	private String managerName;
	@Column
	private String skills;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "EmployeeData [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", jobRole=" + jobRole + ", experience=" + experience + ", band=" + band + ", projectName="
				+ projectName + ", Client=" + Client + ", managerId=" + managerId + ", managerName=" + managerName
				+ ", skills=" + skills + "]";
	}
	
	
}

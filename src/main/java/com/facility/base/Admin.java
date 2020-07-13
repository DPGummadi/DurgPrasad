package com.facility.base;

import java.util.List;

public class Admin {
	private String ID, username, DOB, department, address, name;
	private List<Staff> complete_staff_list;
	private List<Supervisor> supevisors_under_me;
	private List<Task> complete_task_list;
	private List<String> logistics_list;

	Admin(String ID, String username, String name, String DOB, String department, String address) {
		this.setID(ID);
		this.setUsername(username);
		this.setName(name);
		this.setDOB(DOB);
		this.setDepartment(department);
		this.setAddress(address);
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Staff> getComplete_staff_list() {
		return complete_staff_list;
	}

	public void setComplete_staff_list(List<Staff> complete_staff_list) {
		this.complete_staff_list = complete_staff_list;
	}

	public List<Supervisor> getSupevisors_under_me() {
		return supevisors_under_me;
	}

	public void setSupevisors_under_me(List<Supervisor> supevisors_under_me) {
		this.supevisors_under_me = supevisors_under_me;
	}

	public List<Task> getComplete_task_list() {
		return complete_task_list;
	}

	public void setComplete_task_list(List<Task> complete_task_list) {
		this.complete_task_list = complete_task_list;
	}

	public List<String> getLogistics_list() {
		return logistics_list;
	}

	public void setLogistics_list(List<String> logistics_list) {
		this.logistics_list = logistics_list;
	}

}
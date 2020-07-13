package com.facility.base;

import java.util.Date;

public class Staff {
	private long id;
	private String department;
	private String name;
	private Date DOB;
	private String address;
	private String status;
	public Task task[];


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Task[] getTask() {
		return task;
	}

	public void setTask(Task[] task) {
		this.task = task;
	}

}

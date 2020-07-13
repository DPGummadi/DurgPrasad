package com.facility.FacilityManagement.Modal;
import java.util.List;
public class Supervisor {
	private String ID;
	private String username;
	private String name;
	private String department;
	private String DOB;
	private String address;
	private List<Staff> staff_under_me;
	private int no_of_staff,no_of_tasks;
	
	Supervisor(String ID, String username, String department, String DOB, String address)
	{
		this.setID(ID);
		this.setUsername(username);
		this.setName(department);
		this.setDepartment(department);
		this.setDOB(DOB);
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Staff> getStaff_under_me() {
		return staff_under_me;
	}

	public void setStaff_under_me(List<Staff> staff_under_me) {
		this.staff_under_me = staff_under_me;
	}

	public int getNo_of_staff() {
		return no_of_staff;
	}

	public void setNo_of_staff(int no_of_staff) {
		this.no_of_staff = no_of_staff;
	}

	public int getNo_of_tasks() {
		return no_of_tasks;
	}

	public void setNo_of_tasks(int no_of_tasks) {
		this.no_of_tasks = no_of_tasks;
	}
	
}

package com.facility.base;

import java.util.*;

public class Task {
	private int taskID;
	private Date deadline;
	private String status = "NOT STARTED"; // NOT STARTED(default),ONGOING,COMPLETE
	private String type;

	public int getTaskID() {
		return taskID;
	}

	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

package com.learn.issuetracker.model;

import java.time.LocalDate;

/*
 * Model class for storing Issue Object
*/

public class Issue {

	private String issueId;
	private String summary;
	private LocalDate createdOn;
	private LocalDate expectedResolutionOn;
	private String priority;
	private String status;
	private Employee assignedTo;

	public Issue() {
		//Default Constructor
		this.issueId = "";
		this.summary = "";
		this.createdOn = LocalDate.now();
		this.expectedResolutionOn = null;
		this.priority = "LOW";
		this.status = "OPEN";
		this.assignedTo = new Employee();
	}

	/*
	 * Complete the parameterized Constructor
	 */
	public Issue(String issueId, String summary, LocalDate createdOn, LocalDate expectedResolutionOn, String priority,
			String status, Employee assignedTo) {
				this.issueId = issueId;
				this.summary = summary;
				this.createdOn = createdOn;
				this.expectedResolutionOn = expectedResolutionOn;
				this.priority = priority;
				this.status = status;
				this.assignedTo = assignedTo;
	}

	public String getIssueId() {
		return this.issueId;
	}

	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public LocalDate getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDate getExpectedResolutionOn() {
		return this.expectedResolutionOn;
	}

	public void setExpectedResolutionOn(LocalDate expectedResolutionOn) {
		this.expectedResolutionOn = expectedResolutionOn;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Employee getAssignedTo() {
		return this.assignedTo;
	}

	public void setAssignedTo(Employee assignedTo) {
		this.assignedTo = assignedTo;
	}

	@Override
	public String toString() {
		return "Issue [issueId=" + issueId + ", summary=" + summary + ", createdOn=" + createdOn
				+ ", expectedResolutionOn=" + expectedResolutionOn + ", priority=" + priority + ", status=" + status
				+ ", assignedTo=" + assignedTo + "]";
	}
}
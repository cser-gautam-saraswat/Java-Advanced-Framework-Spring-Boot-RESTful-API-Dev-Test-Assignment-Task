package com.capgemini.serialization.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Student implements Serializable{
	private Integer id;
	private String name;
	private String mailId;
	private Long contactNumber;
	private List<Project> projects;
	public Student() {

	}
	public Student(Integer id, String name, String mailId, Long contactNumber, List<Project> projects) {
		super();
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.contactNumber = contactNumber;
		this.projects = projects;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mailId=" + mailId + ", contactNumber=" + contactNumber
				+ ", projects=" + projects + "]";
	}
	
	
}

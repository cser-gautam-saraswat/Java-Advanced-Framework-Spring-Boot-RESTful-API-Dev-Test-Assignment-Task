package com.capgemini.serialization.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



public class Student implements Serializable {
	private Integer Id;
	private String name;
	private String mailid;
	private Long contactNumber;
	
	private Project project;
	
	public Student() {
	}

	public Student(Integer id, String name, String mailid, Long contactNumber, Project project) {
		Id = id;
		this.name = name;
		this.mailid = mailid;
		this.contactNumber = contactNumber;
		this.project = project;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Project getProject() {
		return project;
	}

	public void setProjects(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", mailid=" + mailid + ", contactNumber=" + contactNumber + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, contactNumber, mailid, name, project);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(Id, other.Id) && Objects.equals(contactNumber, other.contactNumber)
				&& Objects.equals(mailid, other.mailid) && Objects.equals(name, other.name)
				&& Objects.equals(project, other.project);
	}

	
	
	
}

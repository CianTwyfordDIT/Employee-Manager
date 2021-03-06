package com.example.employeemanager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	private String name;
	private String email;
	private String jobTitle;
	private String phoneNum;
	private String imageURL;
	
	@Column(nullable = false, updatable = false)
	private String employeeCode;
	
	public Employee()
	{
		
	}

	public Employee(Long id, String name, String email, String jobTitle, String phoneNum, String imageURL,
			String employeeCode)
	{
		this.name = name;
		this.email = email;
		this.jobTitle = jobTitle;
		this.phoneNum = phoneNum;
		this.imageURL = imageURL;
		this.employeeCode = employeeCode;
	}

	public Long getId() 
	{
		return id;
	}

	public void setId(Long id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getJobTitle() 
	{
		return jobTitle;
	}

	public void setJobTitleString(String jobTitle) 
	{
		this.jobTitle = jobTitle;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) 
	{
		this.phoneNum = phoneNum;
	}

	public String getImageURL() 
	{
		return imageURL;
	}

	public void setImageURL(String imageURL) 
	{
		this.imageURL = imageURL;
	}

	public String getEmployeeCode() 
	{
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) 
	{
		this.employeeCode = employeeCode;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", jobTitle=" + jobTitle
				+ ", phoneNum=" + phoneNum + ", imageURL=" + imageURL + ", employeeCode=" + employeeCode + "]";
	}
	
	
}

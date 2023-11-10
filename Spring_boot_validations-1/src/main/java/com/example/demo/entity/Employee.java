package com.example.demo.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="Employee_validations")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull(message = "name should not be null")
	private String name;
	@Pattern(regexp = "^[6-9]\\d{9}$",message = "phone number should start with 6 to 9 series and length is 10 only")
	private String ph;
	@Email(message = "enter valid emailid")
	private String email;
	@NotNull(message = "address should not be null")
	private String address;
	
	@Embedded
	private QualificationDetails qualification;
	@Embedded
	private ExperienceDetails expdetails;
	@Embedded
	private JobDetails jobdetails;
	
	
	public QualificationDetails getQualification() {
		return qualification;
	}
	public void setQualification(QualificationDetails qualification) {
		this.qualification = qualification;
	}
	public ExperienceDetails getExpdetails() {
		return expdetails;
	}
	public void setExpdetails(ExperienceDetails expdetails) {
		this.expdetails = expdetails;
	}
	public JobDetails getJobdetails() {
		return jobdetails;
	}
	public void setJobdetails(JobDetails jobdetails) {
		this.jobdetails = jobdetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}

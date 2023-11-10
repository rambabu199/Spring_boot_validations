package com.example.demo.entity;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Embeddable
public class JobDetails {
	@NotNull(message = "job role should not be null")
	private String jrole;
	@Min(value = 0,message = "salary should not be lessthen 0")
	private double salary;
	@NotNull(message = "company name should not be null")
	private String companyname;
	@NotNull(message = "date_of_joining should not be null")
	private String dateofjoining;
	
	public String getJrole() {
		return jrole;
	}
	public void setJrole(String jrole) {
		this.jrole = jrole;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getDateofjoining() {
		return dateofjoining;
	}
	public void setDateofjoining(String dateofjoining) {
		this.dateofjoining = dateofjoining;
	}
	
	

}

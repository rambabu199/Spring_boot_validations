package com.example.demo.entity;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Embeddable
public class XClassDetails {
	@NotNull(message = "10 th percentage should not be null")
	@Max(message = "max value is 100",value = 100)
	@Min(message = "min value is 0", value = 0)
	private double xpercentage;
	
	@NotNull(message = "schoolname should not be null")
	private String schoolname;
	
	@NotNull(message = "school address should not be null")
	private String schoolAddress;
	@NotNull(message = "10th year of pass should not be null")
	private int syearofpass;
	public double getPercentage() {
		return xpercentage;
	}
	public void setXPercentage(double percentage) {
		this.xpercentage = percentage;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public int getSYearofpass() {
		return syearofpass;
	}
	public void setSYearofpass(int syearofpass) {
		this.syearofpass = syearofpass;
	}
	
	

}

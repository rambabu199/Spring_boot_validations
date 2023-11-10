package com.example.demo.entity;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Embeddable
public class BTchDetails {

	@NotNull(message = "10 th percentage should not be null")
	@Max(message = "max value is 100",value = 100)
	@Min(message = "min value is 0", value = 0)
	private double bpercentage;
	private String bcollegename;
	private String bcity;
	private int byearofpass;
	public double getBpercentage() {
		return bpercentage;
	}
	public void setBpercentage(double bpercentage) {
		this.bpercentage = bpercentage;
	}
	public String getBcollegename() {
		return bcollegename;
	}
	public void setBcollegename(String bcollegename) {
		this.bcollegename = bcollegename;
	}
	public String getBcity() {
		return bcity;
	}
	public void setBcity(String bcity) {
		this.bcity = bcity;
	}
	public int getByearofpass() {
		return byearofpass;
	}
	public void setByearofpass(int byearofpass) {
		this.byearofpass = byearofpass;
	}
	
	
	
}

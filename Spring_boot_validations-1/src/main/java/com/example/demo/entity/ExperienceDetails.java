package com.example.demo.entity;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Embeddable
public class ExperienceDetails {
	
	@NotNull(message = "exp role should not be null")
	private String role;
	@Min(value = 0)
	@Max(value = 50)
	private double yearsofexp;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getYearsofexp() {
		return yearsofexp;
	}
	public void setYearsofexp(double yearsofexp) {
		this.yearsofexp = yearsofexp;
	}
	

}

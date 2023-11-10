package com.example.demo.entity;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;

@Embeddable
public class QualificationDetails {

	@NotNull(message = "qualification should not be null")
	private String qualification;
	@NotNull(message = "year of pass should not be null")
	@Max(value = 2020)
	private int yearofpass;
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYearofpass() {
		return yearofpass;
	}
	public void setYearofpass(int yearofpass) {
		this.yearofpass = yearofpass;
	}
	
	
}

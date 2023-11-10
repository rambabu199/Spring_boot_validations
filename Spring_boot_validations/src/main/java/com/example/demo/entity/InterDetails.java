package com.example.demo.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class InterDetails {

	private double percentage;
	private String collegename;
	private String ccity;
	private int yearofpass;
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getCCity() {
		return ccity;
	}
	public void setCCity(String city) {
		this.ccity = city;
	}
	public int getYearofpass() {
		return yearofpass;
	}
	public void setYearofpass(int yearofpass) {
		this.yearofpass = yearofpass;
	}
	
}

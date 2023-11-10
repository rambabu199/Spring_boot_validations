package com.example.demo.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="vstudent_Validations")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull(message = "name should not be null")
	private String name;
	
	
	@Max(message = "marks should be less then 100", value = 100)
	@Min(message = "marks should be greater then 0",value = 0)
	@NotNull(message = "marks should not be null and should bt in range between 0 to 100")
	private double marks;
	
	
	@NotNull(message = "city should not be null")
	private String city;
	
	@Pattern(regexp = "^[6-9]\\d{9}$")
	private String ph;
	
	@Email
	private String email;
	@Embedded
	private XClassDetails xclassdetails;
	
	@Embedded
	private InterDetails interdetails;
	
	@Embedded
	private BTchDetails btechdetails;
	
	
	public Student(String name, double marks, String city, String ph,String email) {
		super();
		this.name = name;
		this.marks = marks;
		this.city = city;
		this.ph = ph;
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public XClassDetails getXclassdetails() {
		return xclassdetails;
	}
	public void setXclassdetails(XClassDetails xclassdetails) {
		this.xclassdetails = xclassdetails;
	}
	public InterDetails getInterdetails() {
		return interdetails;
	}
	public void setInterdetails(InterDetails interdetails) {
		this.interdetails = interdetails;
	}
	public BTchDetails getBtechdetails() {
		return btechdetails;
	}
	public void setBtechdetails(BTchDetails btechdetails) {
		this.btechdetails = btechdetails;
	}
	
	
	

}

package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeServiceInterface {
	
	public String upsert(Employee employee);
	
	public List<Employee>displayAll();
	
	public Employee displayByID(int id);
	
	public String deleteByID(int id);
	
	public String deleteAllrec();
	

}

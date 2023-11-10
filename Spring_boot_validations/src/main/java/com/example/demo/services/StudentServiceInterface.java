package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentServiceInterface {
	public Student addstudent(Student student);
	public List<Student>displayAll();
	
	public String deleterecbyid(int id);
	
	public Student retrivebyid(int id);
	
	public String upsert(Student student);
	
	public String deleteallrec();
	

}

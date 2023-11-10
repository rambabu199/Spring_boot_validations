package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.services.StudentServiceInterface;

@Service
public class StudentServiceImpl implements StudentServiceInterface{
	@Autowired
	private StudentRepo sturepo;

	@Override
	public Student addstudent(Student student) {
		// TODO Auto-generated method stub
		return sturepo.save(student);
	}

	@Override
	public List<Student> displayAll() {
		// TODO Auto-generated method stub
		return sturepo.findAll();
	}

	@Override
	public String deleterecbyid(int id) {
		if(sturepo.existsById(id))
		{
			sturepo.deleteById(id);
			return "record deleted successfully";
		}
		else
		return "no records found";
	}

	@Override
	public Student retrivebyid(int id) {
		if(sturepo.existsById(id))
		{
			return sturepo.findById(id).get();
		}
		else
		return null;
	}

	@Override
	public String upsert(Student student) {
		int id=student.getId();
		if(sturepo.existsById(id))
		{
			sturepo.save(student);
			return"updated successfully";
		}
		else {
			sturepo.save(student);
		return "added successfully";
		}
	}

	@Override
	public String deleteallrec() {
		// TODO Auto-generated method stub
		sturepo.deleteAll();
		return "deleted successfully";
	}

	

}

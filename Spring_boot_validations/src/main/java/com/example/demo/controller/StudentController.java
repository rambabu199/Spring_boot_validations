package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.services.StudentServiceInterface;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentServiceInterface stuser;
	@PostMapping("/add")
	public ResponseEntity<Student>addstudents(@RequestBody Student student)
	{
		Student stu=stuser.addstudent(student);
		return new ResponseEntity<Student>(stu,HttpStatus.CREATED);
	}
	@GetMapping("/getall")
	public ResponseEntity<List<Student>>retriveAll()
	{
		List<Student>stu=stuser.displayAll();
		return new ResponseEntity<List<Student>>(stu,HttpStatus.OK);
	}
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Student>getByID(@PathVariable int id)
	{
		Student stu=stuser.retrivebyid(id);
		return new ResponseEntity<Student>(stu,HttpStatus.OK);
	}
	
	@DeleteMapping("/removebyid/{id}")
	public ResponseEntity<String>removeByid(@PathVariable int id)
	{
		String str=stuser.deleterecbyid(id);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String>updatedata(@RequestBody Student student)
	{
		String str=stuser.upsert(student);
		return new ResponseEntity<String>(str,HttpStatus.CREATED);
	}
	@DeleteMapping("/deleteAll")
	public ResponseEntity<String>removeallrec()
	{
		String str=stuser.deleteallrec();
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	
	
	

}

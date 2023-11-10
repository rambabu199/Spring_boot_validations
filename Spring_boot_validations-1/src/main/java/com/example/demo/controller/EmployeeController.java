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

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeServiceInterface;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeServiceInterface empinterface;
	
	@PostMapping("/addemp")
	public ResponseEntity<String>addEmployee(@RequestBody Employee employee)
	{
		String str=empinterface.upsert(employee);
		return new ResponseEntity<String>(str,HttpStatus.CREATED);
	}
	@PutMapping("/update")
	public ResponseEntity<String>updateemp(@RequestBody Employee emp)
	{
		String str=empinterface.upsert(emp);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Employee>>retriveall()
	{
		List<Employee>e=empinterface.displayAll();
		return new ResponseEntity<List<Employee>>(e,HttpStatus.OK);
	}
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Employee>retrivebyid(@PathVariable int id)
	{
		Employee e=empinterface.displayByID(id);
		return new ResponseEntity<Employee>(e,HttpStatus.OK);
	}
	
	@DeleteMapping("/removebyid/{id}")
	public ResponseEntity<String>removeByID(@PathVariable int id)
	{
		String str=empinterface.deleteByID(id);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	@DeleteMapping("/removeall")
	public ResponseEntity<String>removeAll()
	{
		String str=empinterface.deleteAllrec();
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
}

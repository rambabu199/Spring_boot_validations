package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.service.EmployeeServiceInterface;
@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface{
	@Autowired
	private EmployeeRepo emprepo;

	@Override
	public String upsert(Employee employee) {
		int id=employee.getId();
		if(emprepo.existsById(id))
		{
			emprepo.save(employee);
			return "record updated successfully";
		}
		else {
			emprepo.save(employee);
		return "record inserted successfully";}
	}

	@Override
	public List<Employee> displayAll() {
		
		return emprepo.findAll();
	}

	@Override
	public Employee displayByID(int id) {
		if(emprepo.existsById(id))
		{
			return emprepo.findById(id).get();
		}
		else
		return null;
	}

	@Override
	public String deleteByID(int id) {
		if(emprepo.existsById(id))
		{
			emprepo.deleteById(id);
			return "record deleted successfully";
		}
		else
		{
		return "no records found";
	}}

	@Override
	public String deleteAllrec() {
		// TODO Auto-generated method stub
		emprepo.deleteAll();
		return "deleted successfully";
	}

}

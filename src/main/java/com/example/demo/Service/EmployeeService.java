package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Employee;
import com.example.demo.Repository.EmployeeRepo;

@Service
public class EmployeeService {
  
	@Autowired
	EmployeeRepo ep;
	 
	public Employee savinfo(Employee e)
	{
		return ep.save(e);
	}
	public List<Employee> showinfo()
	{
		return ep.findAll();
	}
}

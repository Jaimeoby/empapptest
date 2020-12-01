package com.tcs.employeeApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.employeeApplication.model.Employee;
import com.tcs.employeeApplication.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/emp")
public class EmployeeController {
	@Autowired
	EmployeeService empServices;
	
	@GetMapping
	public List<Employee> getEmployees(){
		return empServices.getEmployees().get();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable("id") long employeeid)
	{
		return empServices.findById(employeeid).get();
	}
	
	@PostMapping("/create")
	public Employee createEmployee(Employee employee)
	{
		return empServices.addEmployee(employee);
	}
	
	@PostMapping("/update")
	public Employee updateEmployee(Employee employee)
	{
		return empServices.updateEmployee(employee);
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable("id") long employeeid)
	{
		empServices.deleteEmployee(employeeid);
		return "success";
	}
	
}

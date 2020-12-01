package com.tcs.employeeApplication.service;

import java.util.List;
import java.util.Optional;

import com.tcs.employeeApplication.model.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public String deleteEmployee(long id);
	public Optional<Employee> findById(long id);
	public Optional<List<Employee>> getEmployees();
	public Optional<List<Employee>> findByOrganizationId(long id);

}

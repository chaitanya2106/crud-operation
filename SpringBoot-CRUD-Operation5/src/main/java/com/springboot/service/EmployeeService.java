package com.springboot.service;

import java.util.List;

import com.springboot.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	public void deleteEmployeeById(Integer id);
	public Employee getEmployeeById(Integer id);
	public List<Employee> getAllEmployee(Employee employee);
	
}

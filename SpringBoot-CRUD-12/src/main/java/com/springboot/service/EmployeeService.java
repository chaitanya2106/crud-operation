package com.springboot.service;

import java.util.List;

import com.springboot.entity.Employee;

public interface EmployeeService {
	
	public Employee getEmployeeById(Integer id);
	public void deleteEmployeeById(Integer id);
	public List<Employee> getAll(Employee emp);
	public Employee saveEmp(Employee emp);
	

}

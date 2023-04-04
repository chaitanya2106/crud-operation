package com.springboot.service;

//import java.util.List;

import com.springboot.entity.Employee;

public interface EmployeeSevice {
	public Employee saveEmployee(Employee employee);

	public Iterable<Employee> getAllEmployee(Employee employee);

	public void deleteEmployeeById(Integer id);

	//public Employee updateEmployeeById(Integer id);

	public Employee getEmployeeById(Integer id);

	//public List getEmployeeByCity(String city);
}

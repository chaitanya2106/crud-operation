package com.springboot.serviceimpl;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.springboot.entity.Employee;
import com.springboot.repository.EmployeeRepository;
import com.springboot.service.EmployeeSevice;

@Service
public class EmployeeServiceImpl implements EmployeeSevice {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public Iterable<Employee> getAllEmployee(Employee employee) {
		// Auto-generated method stub return null; }
		return employeeRepository.findAll();
	}

	@Override

	public void deleteEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		 employeeRepository.deleteById(id);;
	}

	/*
	 * @Override
	 * 
	 * public Employee updateEmployeeById(Integer id) { // TODO Auto-generated
	 * method stub return employeeRepository.updateById(id); }
	 */

	@Override

	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepository.findByid(id);

	}

	
	// @Override
	// public List getEmployeeByCity(String city) { 
		 // TODO Auto-generated
	  
	 // return employeeRepository.getEmployeeByCity(city); }
	 

}

package com.springboot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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

import com.springboot.entity.Employee;
import com.springboot.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		Employee emp = employeeService.saveEmployee(employee);
		return ResponseEntity.ok().body(emp);
	}

	@DeleteMapping("/deletebyid/{id}")
	public void deleteEmployeeById(@PathVariable("id") Integer id) throws Exception {
		employeeService.deleteEmployeeById(id);
	}

	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Integer id) {
		Employee emp = employeeService.getEmployeeById(id);
		return ResponseEntity.ok().body(emp);

	}

	@GetMapping("/getall")
	public ResponseEntity<List<Employee>> getAllEmployee(Employee employee) {
		List<Employee> emp = employeeService.getAllEmployee(employee);
		return ResponseEntity.ok().body(emp);
	}

	
	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee,@PathVariable("id") Integer id) {
		try{
			Employee existemployee=employeeService.getEmployeeById(id);
		
		employee.setId(id);
		employeeService.saveEmployee(employee);
		return ResponseEntity.ok().body(employee);
		}
		catch(NoSuchElementException e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	
		}
		
	}
}

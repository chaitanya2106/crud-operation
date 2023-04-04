package com.springboot.controller;

import java.util.List;

import javax.management.InstanceAlreadyExistsException;

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
import com.springboot.exception.EmployeeAlreadyExistsException;
import com.springboot.exception.IdNotFoundException;
import com.springboot.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Employee> getEmployeeById(Employee employee, @PathVariable("id") Integer id)
			throws IdNotFoundException {
		if (employee.getId() == id) {
			Employee emp = employeeService.getEmployeeById(id);
			return ResponseEntity.ok().body(emp);
		} else {
			throw new IdNotFoundException("id not found");
		}
	}

	@DeleteMapping("/deletebyid/{id}")
	public void deleteEmployeeById(Employee employee, @PathVariable("id") Integer id) throws IdNotFoundException {

		if (employee.getId() == id) {
			employeeService.deleteEmployeeById(id);
		} else {
			throw new IdNotFoundException("id not found");
		}
	}

	@GetMapping("/getall")
	public ResponseEntity<List<Employee>> getAll(Employee emp) {
		List<Employee> e = employeeService.getAll(emp);
		return ResponseEntity.ok().body(e);
	}

	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmp(@RequestBody Employee emp) throws InstanceAlreadyExistsException {
		try {
			Employee employee = employeeService.saveEmp(emp);
			return ResponseEntity.ok().body(employee);
		} catch (Exception e) {
			throw new EmployeeAlreadyExistsException("Already present");
		}
	}

	@PutMapping("/updatebyid/{id}")
	public ResponseEntity<Employee> updateEmployeeById(@RequestBody Employee employee, @PathVariable Integer id) {

		try {
			employeeService.getEmployeeById(id);
			employee.setId(id);
			return ResponseEntity.ok().body(employee);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}

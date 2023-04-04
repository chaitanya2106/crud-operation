package com.springboot.controller;

//import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.springboot.service.EmployeeSevice;



@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeSevice employeeSevice;

	@PostMapping("/saveemployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		Employee emp = employeeSevice.saveEmployee(employee);
		return ResponseEntity.ok().body(emp);

	}

	@GetMapping("/getemployeebyid/{id}")
	public ResponseEntity<Employee> getEmployeeId(@PathVariable("id") Integer id) {
		Employee emp = employeeSevice.getEmployeeById(id);
		return ResponseEntity.ok().body(emp);
	}

	/*
	 * @PutMapping("/updateemployeebyid/{id}") public ResponseEntity<Employee>
	 * updateEmployeeById(@PathVariable("id") Integer id) { Employee emp =
	 * employeeSevice.updateEmployeeById(id); return ResponseEntity.ok().body(emp);
	 * }
	 */

	@DeleteMapping("/deleteemployeebyid/{id}")
	public void deleteEmployeeById(@PathVariable("id") Integer id) {
		 employeeSevice.deleteEmployeeById(id);
		
	}

	@GetMapping("/getallemployee")
	public ResponseEntity<Iterable> getAllEmployee(Employee employee) {
		Iterable<Employee> emp = employeeSevice.getAllEmployee(employee);
		return ResponseEntity.ok().body(emp);
	}
	
	//  @GetMapping("/getemployeebycity{city}")
	  //public ResponseEntity<Employee> getEmployeeByCity(@PathVariable String city){
		//  Employee employee= (Employee) employeeSevice.getEmployeeByCity(city);
		  // return ResponseEntity.ok().body(employee);
	  //}
}

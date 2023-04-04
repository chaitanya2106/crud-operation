package com.springboot.controller;

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

import com.springboot.entity.Customer;
import com.springboot.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@PostMapping("/save")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
		Customer c = customerService.saveCustomer(customer);
		return ResponseEntity.ok().body(c);
	}

	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Integer id) {
		Customer c = customerService.getCustomerById(id);
		return ResponseEntity.ok().body(c);
	}

	@GetMapping("/getall")
	public ResponseEntity<Iterable<Customer>> getAllCustomers() {
		Iterable<Customer> c = customerService.getAllCustomers();
		return ResponseEntity.ok().body(c);
	}

	@DeleteMapping("/deletebyid/{id}")
	public void deleteCustomerById(@PathVariable Integer id) {
		customerService.deleteCustomerById(id);
	}

	@PutMapping("/updatebyid/{id}")
	public ResponseEntity<Customer> updateById(@RequestBody Customer customer, @PathVariable Integer id) {
		try {
			Customer existcustomer = customerService.getCustomerById(id);
			customer.setId(id);
			customerService.saveCustomer(customer);
			return ResponseEntity.ok().body(customer);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}

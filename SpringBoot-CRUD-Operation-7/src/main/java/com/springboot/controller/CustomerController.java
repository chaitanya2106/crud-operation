package com.springboot.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
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

	@GetMapping("/getcustomer/{id}")
	public ResponseEntity<Customer> getCustomerByid(@PathVariable Integer id) {
		Customer c = customerService.getCustomerByid(id);
		return ResponseEntity.ok().body(c);

	}

	@GetMapping("/getallcustomers")
	public ResponseEntity<List<Customer>> getAllCustomer(Customer customer) {
		List<Customer> c = customerService.getAllCustomer(customer);
		return ResponseEntity.ok().body(c);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteCustomerByid(@PathVariable Integer id)throws Exception {
		customerService.deleteCustomerByid(id);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Customer> updateCustomerById(@RequestBody Customer customer,@PathVariable("id") Integer id) {
		try {
			Customer existCustomer=customerService.getCustomerByid(id);
			customer.setId(id);
			customerService.saveCustomer(customer);
			return ResponseEntity.ok().body(customer);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}

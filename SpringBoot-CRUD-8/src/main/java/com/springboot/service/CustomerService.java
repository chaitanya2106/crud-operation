package com.springboot.service;

import java.util.List;

import com.springboot.entity.Customer;

public interface CustomerService {
	public Customer saveCustomer(Customer customer);
	public Customer getCustomerById(Integer id);
	public Iterable<Customer> getAllCustomers();
	public void deleteCustomerById(Integer id);

}

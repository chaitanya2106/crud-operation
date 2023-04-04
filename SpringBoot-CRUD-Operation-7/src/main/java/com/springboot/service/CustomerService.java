package com.springboot.service;

import java.util.List;

import com.springboot.entity.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer customer);
	public Customer getCustomerByid(Integer id);
	public List<Customer> getAllCustomer(Customer customer);
	public void deleteCustomerByid(Integer id);
}

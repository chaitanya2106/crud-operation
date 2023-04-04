package com.springboot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.CustomerDao;
import com.springboot.entity.Customer;
import com.springboot.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.save(customer);
	}

	@Override
	public Customer getCustomerById(Integer id) {
		// TODO Auto-generated method stub
		return customerDao.findById(id);
	}

	@Override
	public Iterable<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.findAll();
	}

	@Override
	public void deleteCustomerById(Integer id) {
		// TODO Auto-generated method stub
		customerDao.deleteById(id);

	}

}

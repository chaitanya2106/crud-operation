package com.springboot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Customer;
import com.springboot.repository.CustomerDao;
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
	public Customer getCustomerByid(Integer id) {
		// TODO Auto-generated method stub
		return customerDao.findById(id);
	}

	@Override
	public List<Customer> getAllCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomers(customer);
	}

	@Override
	public void deleteCustomerByid(Integer id) {
		// TODO Auto-generated method stub
        customerDao.deleteById(id);
	}

}

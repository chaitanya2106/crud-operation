package com.springboot;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.dao.CustomerDao;
import com.springboot.entity.Customer;
import com.springboot.service.CustomerService;
import com.springboot.serviceimpl.CustomerServiceImpl;
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class JUnitMockito {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Mock
	CustomerDao customerDao;
	@InjectMocks
	CustomerServiceImpl customerServiceImpl;

	@Test
	public void saveCustomer() {
		Customer c = new Customer(1, "Neha", "Latur", 986512);
     when(customerServiceImpl.saveCustomer(c)).thenReturn(c);
     assertEquals(c,customerServiceImpl.saveCustomer(c));
	}
}

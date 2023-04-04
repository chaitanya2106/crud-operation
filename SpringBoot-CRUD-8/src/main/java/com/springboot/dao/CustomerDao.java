package com.springboot.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Customer;
@Repository
public interface CustomerDao extends CrudRepository<Customer, Serializable> {
public Customer findById(Integer id);
}

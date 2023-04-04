package com.springboot.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Customer;
@Repository
public interface CustomerDao extends CrudRepository<Customer, Serializable>{
    public Customer findById(Integer id);
    @Query(value="select * from customer",nativeQuery = true)
    public List<Customer> getAllCustomers(Customer customer);
   
}

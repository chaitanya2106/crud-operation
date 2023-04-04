package com.springboot.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Address;
@Repository
public interface AddressDao extends CrudRepository<Address, Serializable>{

	public Address findById(Integer id);
}

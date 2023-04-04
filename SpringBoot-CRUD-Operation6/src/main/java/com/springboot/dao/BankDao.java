package com.springboot.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Bank;
@Repository
public interface BankDao extends CrudRepository<Bank, Serializable> {
	@Query(value = "select * from bank",nativeQuery = true)
	public List<Bank> getAllAccountDetails(Bank bank);

	//public Bank findBybankAccountNum(Integer bankAccountNum);

	public Bank findBybankAccountNum(Integer bankAccountNum);
}

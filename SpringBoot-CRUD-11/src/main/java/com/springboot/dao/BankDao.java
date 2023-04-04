package com.springboot.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Bank;

@Repository
public interface BankDao extends JpaRepository<Bank, Serializable> {
	public Bank findByBankId(Integer id);

	@Query(value = "select * from bank where branch=?1", nativeQuery = true)
	public Bank getByBranch(Bank branch);
	
	//public Bank saveOrUpdate(Bank bank,Integer id);
}

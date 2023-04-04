package com.springboot.service;

import java.util.List;

import com.springboot.entity.Bank;

public interface BankService {
	public List<Bank> getAll(Bank bank);

	public void deleteByBankId(Integer id);

	public Bank saveBank(Bank bank);

	public Bank getByBankId(Integer id);

	public Bank getByBranch(Bank branch);

	//public Bank saveOrUpdate(Bank bank, Integer id);
}

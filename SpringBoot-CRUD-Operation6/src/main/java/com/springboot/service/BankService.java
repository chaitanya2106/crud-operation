package com.springboot.service;

import java.util.List;

import com.springboot.entity.Bank;

public interface BankService {
	public Bank saveAccount(Bank bank);
	public List<Bank> getAllAccountList(Bank bank);
	public Bank getAccountDetailById(Integer bankAccountNum);
	public void deleteAccountById(Integer bankAccountNum);
	//public Bank updateAccountById(Integer bankAccountNum,Bank bank);

}

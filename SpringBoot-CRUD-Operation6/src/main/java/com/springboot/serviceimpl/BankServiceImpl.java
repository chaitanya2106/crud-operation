package com.springboot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.BankDao;
import com.springboot.entity.Bank;
import com.springboot.service.BankService;

@Service
public class BankServiceImpl implements BankService {
	@Autowired
	private BankDao bankDao;

	@Override
	public Bank saveAccount(Bank bank) {
		// TODO Auto-generated method stub
		return bankDao.save(bank);
	}

	@Override
	public List<Bank> getAllAccountList(Bank bank) {
		// TODO Auto-generated method stub
		return bankDao.getAllAccountDetails(bank);
	}

	/*
	 * @Override public Bank getAccountDetailById(Integer bankAccountNum) { // TODO
	 * Auto-generated method stub return
	 * bankDao.findBybankAccountNum(bankAccountNum); }
	 */

	@Override
	public void deleteAccountById(Integer bankAccountNum) {
		// TODO Auto-generated method stub
		bankDao.deleteById(bankAccountNum);
	}

	@Override
	public Bank getAccountDetailById(Integer bankAccountNum) {
		// TODO Auto-generated method stub
		return bankDao.findBybankAccountNum(bankAccountNum);
	}

	/*
	 * @Override public Bank updateAccountById(Integer bankAccountNum, Bank bank) {
	 * // TODO Auto-generated method stub if
	 * (bankDao.findById(bankAccountNum).isPresent()){ Bank b =
	 * bankDao.findById(bankAccountNum).get();
	 * 
	 * b.setAccHolderName(bank.getAccHolderName());
	 * b.setBankAccountNum(bank.getBankAccountNum());
	 * b.setBankName(bank.getBankName()); b.setStstus(bank.getStstus()); Bank bnk
	 * =bankDao.save(bank);
	 * 
	 * return new Bank(bnk.getAccHolderName(),bnk.getBankAccountNum(),
	 * bnk.getBankName(), bnk.getStstus()); }else{ return null;
	 * 
	 * }
	 * 
	 * }
	 */

}

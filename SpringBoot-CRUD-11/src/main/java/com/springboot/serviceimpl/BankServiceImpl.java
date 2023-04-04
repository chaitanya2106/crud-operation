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
	public List<Bank> getAll(Bank bank) {
		// TODO Auto-generated method stub
		return bankDao.findAll();
	}

	@Override
	public void deleteByBankId(Integer id) {
		// TODO Auto-generated method stub
		bankDao.deleteById(id);
	}

	@Override
	public Bank saveBank(Bank bank) {
		// TODO Auto-generated method stub
		return bankDao.save(bank);
	}

	@Override
	public Bank getByBankId(Integer id) {
		// TODO Auto-generated method stub
		return bankDao.findByBankId(id);
	}

	@Override
	public Bank getByBranch(Bank branch) {
		// TODO Auto-generated method stub
		return bankDao.getByBranch(branch);
	}

//	@Override
//	public Bank saveOrUpdate(Bank bank, Integer id) {
//		// TODO Auto-generated method stub
//		return bankDao.saveOrUpdate(bank, id);
//	}

}

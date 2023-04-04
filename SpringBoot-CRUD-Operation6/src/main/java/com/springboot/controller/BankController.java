package com.springboot.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Bank;
import com.springboot.service.BankService;

@RestController
@RequestMapping("/bank")
public class BankController {
	@Autowired
	private BankService bankService;

	@PostMapping("/saveaccount")
	public ResponseEntity<Bank> saveAccount(@RequestBody Bank bank) {
		Bank b = bankService.saveAccount(bank);
		return ResponseEntity.ok().body(b);
	}

	@GetMapping("/getaccbyaccnum/{bankAccountNum}")
	public ResponseEntity<Bank> getAccountDetailById(@PathVariable("bankAccountNum") Integer bankAccountNum) {
		Bank bank = bankService.getAccountDetailById(bankAccountNum);
		return ResponseEntity.ok().body(bank);
	}

	@GetMapping("/getallaccounts")
	public ResponseEntity<List<Bank>> getAllAccountDetails(Bank bank) {
		List<Bank> b = bankService.getAllAccountList(bank);
		return ResponseEntity.ok().body(b);
	}

	@DeleteMapping("/delete/{bankAccountNum}")
	public void deleteAccountById(@PathVariable Integer bankAccountNum) throws Exception {
		bankService.deleteAccountById(bankAccountNum);
	}

	@PutMapping("/update/{bankAccountNum}")
	public ResponseEntity<Bank> updateBankByAccNum(@RequestBody Bank bank,
			@PathVariable("bankAccountNum") Integer bankAccountNum) {
		try {
			Bank existAcc = bankService.getAccountDetailById(bankAccountNum);
			bank.setBankAccountNum(bankAccountNum);
			bankService.saveAccount(bank);
			return ResponseEntity.ok().body(bank);

		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}

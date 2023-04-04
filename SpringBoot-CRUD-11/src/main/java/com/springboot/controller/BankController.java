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
@RequestMapping("bank")
public class BankController {
	@Autowired
	private BankService bankService;

	@GetMapping("/getall")
	public ResponseEntity<List<Bank>> getAll(Bank bank) {
		List<Bank> l = bankService.getAll(bank);
		return ResponseEntity.ok().body(l);
	}

	@DeleteMapping("/deletebyid/{id}")
	public void deleteByBankId(@PathVariable("id") Integer id) {
		bankService.deleteByBankId(id);
	}

	@PostMapping("/save")
	public ResponseEntity<Bank> saveBank(@RequestBody Bank bank) {
		Bank b = bankService.saveBank(bank);
		return ResponseEntity.ok().body(b);
	}

	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Bank> getByBankId(@PathVariable Integer id) {
		Bank b = bankService.getByBankId(id);
		return ResponseEntity.ok().body(b);
	}

	@GetMapping("/getbybranch/{branch}")
	public ResponseEntity<Bank> getByBranch(@PathVariable Bank branch) {
		Bank b = bankService.getByBranch(branch);
		return ResponseEntity.ok().body(b);
	}

	@PutMapping("/updatebyid/{id}")
	public ResponseEntity<Bank> updateByBankId(@RequestBody Bank bank, @PathVariable("id") Integer id) {
		try {
			bankService.getByBankId(id);
			bank.setBankId(id);
			bankService.saveBank(bank);
			return ResponseEntity.ok().body(bank);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

//	@PostMapping("/saveorupdatebyid/{id}")
//	public ResponseEntity<Bank> updateById(@RequestBody Bank bank, @PathVariable("id") Integer id) {
//		try {
//			bankService.getByBankId(id);
//			bank.setBankId(id);
//			bankService.saveOrUpdate(bank, id);
//			return ResponseEntity.ok().body(bank);
//		} catch (NoSuchElementException e) {
//			// TODO: handle exception
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//
//	}

}

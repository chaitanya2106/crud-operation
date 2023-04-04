package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Address;
import com.springboot.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	private AddressService addressService;

	@PostMapping("/save")
	public ResponseEntity<Address> saveAddress(@RequestBody Address address) {
		Address add = addressService.saveAddress(address);
		return ResponseEntity.ok().body(add);

	}

	@DeleteMapping("/deletebyid/{id}")
	public void deleteAddressById(@PathVariable Integer id) {
		addressService.deleteAddressById(id);
	}

	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Address> getAddressById(@PathVariable Integer id) {
		Address add = addressService.getAddressById(id);
		return ResponseEntity.ok().body(add);
	}

	@GetMapping("/getall")
	public ResponseEntity<List<Address>> getAllAddresses(Address address){
		List<Address> add=addressService.getAllAddresses(address);
		return ResponseEntity.ok().body(add);
	}

}

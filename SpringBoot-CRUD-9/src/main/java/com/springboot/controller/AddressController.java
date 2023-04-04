package com.springboot.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Address;
import com.springboot.entity.User;
import com.springboot.service.AddressSevice;
import com.springboot.service.UserService;

@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	private AddressSevice addressSevice;
	@Autowired
	private UserService userService;

	@PostMapping("/saveaddress")
	public ResponseEntity<List<Address>> saveAddress(@RequestBody User user) {
		User u = userService.saveUser(user);
		List<Address> l = u.getAddress();
		for (Address a : l) {
			addressSevice.saveAddress(a);
		}
		return ResponseEntity.ok().body(l);
	}

	@PutMapping("/updateadress")
	public ResponseEntity<Address> updateAddressById(@PathVariable("id") Integer id, @RequestBody Address address) {
		try {
			Address exist = addressSevice.getAddressById(id);
			address.setId(id);
			return ResponseEntity.ok().body(address);

		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/getaddress/{id}")
	public ResponseEntity<Address> getAddressById(@PathVariable("id") Integer id) {
		Address a = addressSevice.getAddressById(id);
		return ResponseEntity.ok().body(a);
	}
}

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

import com.springboot.entity.Address;
import com.springboot.entity.User;
import com.springboot.service.AddressSevice;
import com.springboot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private AddressSevice addressSevice;

	@GetMapping("/getuser/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) {
		User user = userService.getUserById(id);
		return ResponseEntity.ok().body(user);
	}

	@GetMapping("/getall")
	public ResponseEntity<Iterable<User>> getAllUsers(User user) {
		Iterable<User> u = userService.getAllUsers(user);
		return ResponseEntity.ok().body(u);

	}

	@PutMapping("/updatebyid/{id}")
	public ResponseEntity<User> updateUserById(@RequestBody User user, @PathVariable("id") Integer id) {
		try {
			User exist = userService.getUserById(id);
			user.setId(id);
			userService.saveUser(user);
			return ResponseEntity.ok().body(user);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/deletebyid/{id}")
	public void deleteUserById(@PathVariable("id") Integer id) {
		userService.deleteUserById(id);
	}

	@PostMapping("/saveuser")
	public ResponseEntity<User> saveUser(User user) {
		User u = userService.saveUser(user);
		return ResponseEntity.ok().body(u);

	}

	@GetMapping("/getbycity/{city}")
	public ResponseEntity<List<User>> getUsersByCity(@PathVariable("city") String city) {
		List<User> c = userService.getUsersByCity(city);
		return ResponseEntity.ok().body(c);
	}
}

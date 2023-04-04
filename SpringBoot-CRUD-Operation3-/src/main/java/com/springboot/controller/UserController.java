package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.User;
import com.springboot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/saveuser")
	public ResponseEntity<User> saveUser(User user) {
		User u = userService.saveUser(user);
		return ResponseEntity.ok().body(u);
	}

	@GetMapping("/getuserbyid/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) {
		User u = userService.getUserById(id);
		return ResponseEntity.ok().body(u);
	}

	/*
	 * public User getAllUsers(User user) {
	 * 
	 * }
	 */
	@DeleteMapping("/deleteuserbyid")
	public void deleteUserById(Integer id) {
		userService.deleteUserById(id);
	}

	@PutMapping("/updateuserbyid")
	public ResponseEntity<User> updateUserById(@PathVariable Integer id) {
		User u = userService.updateUserById(id);
		return ResponseEntity.ok().body(u);
	}

}

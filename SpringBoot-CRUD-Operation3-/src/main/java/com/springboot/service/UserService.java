package com.springboot.service;

import com.springboot.entity.User;

public interface UserService {
	
	public User saveUser(User user);

	public User getUserById(Integer id);

	//public List<User> getAllUsers(User user);

	public void deleteUserById(Integer id);

	public User updateUserById(Integer id);

}

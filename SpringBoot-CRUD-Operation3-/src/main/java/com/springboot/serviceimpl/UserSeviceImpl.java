package com.springboot.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.UserRepository;
import com.springboot.entity.User;
import com.springboot.service.UserService;

@Service
public class UserSeviceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
	 
	User user=userRepository.findById(id);
	return user;
	}

	/*
	 * @Override public User getAllUsers(User user) { // TODO Auto-generated method
	 * stub return userRepository.getAllUsers(user); }
	 */

	@Override
	public void deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public User updateUserById(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.updateUserById(id);
	}

}

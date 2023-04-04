package com.springboot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.UserDao;
import com.springboot.entity.User;
import com.springboot.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}

	@Override
	public Iterable<User> getAllUsers(User user) {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	/*
	 * @Override public User updateUserById(Integer id, User user) { // TODO
	 * Auto-generated method stub return null; }
	 */

	@Override
	public void deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		userDao.deleteById(id);

	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}

	@Override
	public List<User> getUsersByCity(String city) {
		// TODO Auto-generated method stub
		return userDao.getUsersByCity(city);
	}

}

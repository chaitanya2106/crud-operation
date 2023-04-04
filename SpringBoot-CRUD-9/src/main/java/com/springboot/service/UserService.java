package com.springboot.service;

import java.util.List;

import com.springboot.entity.User;

public interface UserService {
	public User getUserById(Integer id);
    public Iterable<User> getAllUsers(User user);
    //public User updateUserById(Integer id,User user);
    public void deleteUserById(Integer id);
    public User saveUser(User user);
    public List<User> getUsersByCity(String City);
}

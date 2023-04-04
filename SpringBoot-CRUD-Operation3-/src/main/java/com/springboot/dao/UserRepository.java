package com.springboot.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.User;
@Repository
public interface UserRepository extends CrudRepository<User, Serializable> {
	public User findById(Integer id);

	//public List getAllUsers(User user);

	public void deleteUserById(Integer id);
	public User updateUserById(Integer id);
}

package com.springboot.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.User;
@Repository
public interface UserDao extends CrudRepository<User, Serializable>{
	@Query(value="select * from user where city=?1",nativeQuery = true)
	public List<User> getUsersByCity(String city);
	public User findById(Integer id);
}

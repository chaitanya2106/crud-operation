package com.springboot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Doctors;
@Repository
public interface DoctorsRepository extends CrudRepository<Doctors, Integer>{
	

}

package com.springboot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Patient;
@Repository
public interface PatientRepository extends CrudRepository<Patient, Integer>{

	
}

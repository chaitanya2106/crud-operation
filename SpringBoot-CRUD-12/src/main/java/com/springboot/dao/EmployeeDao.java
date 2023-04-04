package com.springboot.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Employee;
@Repository
public interface EmployeeDao extends JpaRepository<Employee,Serializable>{
public Employee findById(Integer id);
}

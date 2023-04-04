package com.springboot.entity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}

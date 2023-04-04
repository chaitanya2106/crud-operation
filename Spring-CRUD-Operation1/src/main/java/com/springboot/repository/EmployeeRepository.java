package com.springboot.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	public Employee findByid(Integer id);

	//public Employee deleteByid(Integer id);

	//public Employee updateById(Integer id);

	//@Query(value = "select * from employee where city=?1", nativeQuery = true)
	//public List getEmployeeByCity(String city);

}

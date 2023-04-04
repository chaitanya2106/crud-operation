package com.springboot.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Serializable>{
    public Employee findById(Integer id);
    @Query(value="select * from employee",nativeQuery = true)
    public List<Employee> getAllEmployee(Employee employee);

}

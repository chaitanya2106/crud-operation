package com.springboot.seviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Employee;
import com.springboot.entity.repository.EmployeeRepository;
import com.springboot.service.EmployeeService;

@Service
public class EmployeeSeviceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

}

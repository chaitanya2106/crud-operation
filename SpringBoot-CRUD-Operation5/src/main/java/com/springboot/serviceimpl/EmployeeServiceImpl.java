package com.springboot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.EmployeeDao;
import com.springboot.entity.Employee;
import com.springboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.save(employee);
	}

	@Override
	public void deleteEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		employeeDao.deleteById(id);
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return employeeDao.findById(id);
	}

	@Override
	public List<Employee> getAllEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployee(employee);
	}

}

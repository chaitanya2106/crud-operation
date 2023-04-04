package com.springboot.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.StudentDao;
import com.springboot.entity.Student;
import com.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.save(student);
	}

	@Override
	public void deleteStudentById(Integer id) {
		// TODO Auto-generated method stub
		studentDao.deleteById(id);
	}

	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return studentDao.findBystdId(id);
	}

	@Override
	public Iterable<Student> getAllStudents(Student student) {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

	@Override
	public Student getStudentsByCity(Student city) {
		// TODO Auto-generated method stub
		return studentDao.getStudentByCity(city);
	}

}

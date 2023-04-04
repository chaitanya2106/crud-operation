package com.springboot.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.StudentRepository;
import com.springboot.entity.Student;
import com.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	/*
	 * @Override public Optional<Student> getStudentById(Integer id) { // TODO
	 * Auto-generated method stub return studentRepository.findById(id); }
	 */

	@Override
	public Iterable<Student> getAllStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudentById(Integer id) {
		// TODO Auto-generated method stub
		return studentRepository.updateById(id);
	}

	@Override
	public void deleteStudentById(Integer id) {
		// TODO Auto-generated method stub
		 studentRepository.deleteStudentById(id);
	}

	/*
	 * @Override public Student getStudentById(Integer id) { // TODO Auto-generated
	 * method stub return studentRepository.getStudentById(id);
	 * 
	 * }
	 */
}

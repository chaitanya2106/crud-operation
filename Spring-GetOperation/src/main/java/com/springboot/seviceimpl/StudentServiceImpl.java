package com.springboot.seviceimpl;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Student;
import com.springboot.repository.StudentRepository;
import com.springboot.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
  @Autowired
  private StudentRepository studentRepository;
  
	@Override
	public Student getDataById(Integer id) {
		// TODO Auto-generated method stub
		//Optional<Student> student=studentRepository.findById(id);
		return  studentRepository.findByStudentId(id);
	
	}
	
	

	@Override
	public Iterable<Student> getAlldata() {
		// TODO Auto-generated method stub
		
		return studentRepository.findAll();
	}

}

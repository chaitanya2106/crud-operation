package com.springboot.service;

import java.util.Optional;

import com.springboot.entity.Student;

public interface StudentService {
	public Student saveStudent(Student student);
   // public Optional<Student> getStudentById(Integer id);
    public Iterable<Student> getAllStudent(Student student);
    public Student updateStudentById(Integer id);
    public void deleteStudentById(Integer id);
    //public Student getStudentById(Integer id);
}

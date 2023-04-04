package com.springboot.service;

import com.springboot.entity.Student;

public interface StudentService {
	public Student saveStudent(Student student);

	public void deleteStudentById(Integer id);

	public Student getStudentById(Integer id);

	public Iterable<Student> getAllStudents(Student student);

	public Student getStudentsByCity(Student city);
}

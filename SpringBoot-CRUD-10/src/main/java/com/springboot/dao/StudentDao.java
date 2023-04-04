package com.springboot.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.Student;

public interface StudentDao extends CrudRepository<Student, Serializable> {

	public Student findBystdId(Integer id);

	@Query(value = "select * from student where city =?1", nativeQuery = true)
	public Student getStudentByCity(Student city);
}

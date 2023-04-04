package com.springboot.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
     //public Optional<Student> findById(Integer id);
     public Student updateById(Integer id);
     public Student deleteStudentById(Integer id);
     //public Student getStudentById(Integer id);
}

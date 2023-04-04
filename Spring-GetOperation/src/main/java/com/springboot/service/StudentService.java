package com.springboot.service;

import com.springboot.entity.Student;

public interface StudentService {
      public Student getDataById(Integer id);
      public Iterable<Student> getAlldata();
}

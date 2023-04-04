package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Student;
import com.springboot.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@PostMapping("/savestudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		Student std = studentService.saveStudent(student);
		return ResponseEntity.ok().body(std);

	}

	@GetMapping("/getallstudents")
	public ResponseEntity<Iterable<Student>> getAllStudent(Student student) {
		Iterable<Student> std = studentService.getAllStudent(student);
		return ResponseEntity.ok().body(std);
	}

	@PutMapping("/updatestudentbyid/{id}")
	public ResponseEntity<Student> updateStudentByid(@PathVariable("id") Integer id) {
		Student std = studentService.updateStudentById(id);
		return ResponseEntity.ok().body(std);
	}

	@DeleteMapping("/deletestudentbyid/{id}")
	public void deleteStudentById(@PathVariable("id") Integer id) {
		studentService.deleteStudentById(id);
	}

	
}

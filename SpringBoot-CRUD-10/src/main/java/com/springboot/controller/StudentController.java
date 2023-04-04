package com.springboot.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		Student s = studentService.saveStudent(student);
		return ResponseEntity.ok().body(s);
	}

	@DeleteMapping("/deletebyid/{stdid}")
	public void deleteStudentById(@PathVariable("stdid") Integer id) {

		studentService.deleteStudentById(id);
	}

	@GetMapping("getbystdid/{stdid}")
	public ResponseEntity<Student> getStudentById(@PathVariable("stdid") Integer id, Student student) {
		try {
			Student s = studentService.getStudentById(id);
			student.setStdId(id);
			studentService.saveStudent(student);
			return ResponseEntity.ok().body(student);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("getall")
	public ResponseEntity<Iterable<Student>> getAllStudents(Student student) {
		Iterable<Student> s = studentService.getAllStudents(student);
		return ResponseEntity.ok().body(s);
	}

	@GetMapping("getbycity/{city}")
	public ResponseEntity<Student> getStudentsByCity(@PathVariable("city") Student city) {
		Student s = studentService.getStudentsByCity(city);
		return ResponseEntity.ok().body(s);
	}

	@PutMapping("/updatebyid/{stdid}")
	public ResponseEntity<Student> updateById(@RequestBody Student student, @PathVariable("stdid") Integer id) {
		try {
			studentService.getStudentById(id);
			student.setStdId(id);
			studentService.saveStudent(student);
			return ResponseEntity.ok().body(student);

		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

}

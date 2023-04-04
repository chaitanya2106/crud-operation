package com.springboot.studentcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Student;
import com.springboot.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
@GetMapping("/getdatabyid/{id}")
	public ResponseEntity<Student> getDataById(@PathVariable("id") Integer id) {
	Student student=studentService.getDataById(id);
		return ResponseEntity.ok().body(student);
		
	}
@GetMapping("/getalldata")
        public ResponseEntity <Iterable<Student>> getAlldata(){
        	Iterable<Student> s=studentService.getAlldata();
        	return ResponseEntity.ok().body(s);
        }
}

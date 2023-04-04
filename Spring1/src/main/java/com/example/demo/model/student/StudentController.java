package com.example.demo.model.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

	/*
	 * public void getStudentdata() {
	 * 
	 * }
	 */
	@GetMapping("/getData")
	public String getTest() {

		return "Student data";

	}

	@GetMapping("/getStudentDetails")
	public List<Student> getStudentDetails() {

		Student student1 = new Student(876, "Neha", "Pune", 21367);
		Student student2 = new Student(978, "Rohit", "Mumbai", 89431);
		Student student3 = new Student(431, "Riya", "Kolhapur", 89634);
		Student student4 = new Student(753, "Priya", "Nashik", 97876);

		List<Student> list = new ArrayList<>();
		
		  list.add(student1); list.add(student2); list.add(student3);
		  list.add(student4);
		 
		return list;

	}

	@GetMapping("/getSingleStudent")
	public void getSingleStudent() {
		Student student = new Student(997, "Ram", "Jaipur", 65309);
	}
}

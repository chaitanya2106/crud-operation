package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Patient;
import com.springboot.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;

	@GetMapping("/showallpatients")
	public ResponseEntity<Iterable<Patient>> showAllPatients() {
		Iterable<Patient> p = doctorService.showAllPatients();
		return ResponseEntity.ok().body(p);
	}
}

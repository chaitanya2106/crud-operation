package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Doctors;
import com.springboot.entity.Patient;
import com.springboot.service.DoctorService;
import com.springboot.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	private PatientService patientService;
//	@Autowired
//	private DoctorService doctorService;

	@PostMapping("/savepatient")
	public ResponseEntity<Patient> savePatient(Patient patient) {
		Patient p = patientService.savePatient(patient);
		return ResponseEntity.ok().body(p);
	}

	@GetMapping("/showalldoctors")
	public ResponseEntity<Iterable<Doctors>> showAllDoctors(){
		Iterable<Doctors> d=patientService.showAllDoctors();
		return ResponseEntity.ok().body(d);
	}

}

package com.springboot.service;

import com.springboot.entity.Doctors;
import com.springboot.entity.Patient;

public interface PatientService {
	public Patient savePatient(Patient patient);
	public Iterable<Doctors> showAllDoctors();

}

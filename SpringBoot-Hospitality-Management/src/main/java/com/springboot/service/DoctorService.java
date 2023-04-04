package com.springboot.service;

import com.springboot.entity.Patient;

public interface DoctorService {
	public Iterable<Patient> showAllPatients();
	

}

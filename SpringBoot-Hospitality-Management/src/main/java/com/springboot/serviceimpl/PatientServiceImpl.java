package com.springboot.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.DoctorsRepository;
import com.springboot.dao.PatientRepository;
import com.springboot.entity.Doctors;
import com.springboot.entity.Patient;
import com.springboot.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientRepository patientRepository;
	@Autowired
	private DoctorsRepository doctorsRepository;

	@Override
	public Patient savePatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

	@Override
	public Iterable<Doctors> showAllDoctors() {
		// TODO Auto-generated method stub
		return doctorsRepository.findAll();
	}

//	@Override
//	public Iterable<Patient> showAllDoctors() {
//		// TODO Auto-generated method stub
//		return patientRepository.findAll();
//	}

}

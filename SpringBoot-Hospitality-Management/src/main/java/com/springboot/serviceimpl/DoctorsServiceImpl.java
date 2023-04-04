package com.springboot.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.DoctorsRepository;
import com.springboot.dao.PatientRepository;
import com.springboot.entity.Patient;
import com.springboot.service.DoctorService;

@Service
public class DoctorsServiceImpl implements DoctorService {
	@Autowired
	private DoctorsRepository doctorsRepository;
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public Iterable<Patient> showAllPatients() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

//	@Override
//	public Iterable<Doctors> showAllPatients() {
//		// TODO Auto-generated method stub
//		return doctorsRepository.findAll();
//	}

}

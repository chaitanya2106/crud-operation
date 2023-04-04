package com.springboot.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Doctors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctorId;
	private String firstNAme;
	private String lastName;
	private String degree;
	private String introduction;
	private String department;
	private String designation;

	public Doctors() {
		// TODO Auto-generated constructor stub
	}

	@ManyToMany(mappedBy = "Patient")
	private List<Patient> patient;

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}

	public Doctors(int doctorId, String firstNAme, String lastName, String degree, String introduction,
			String department, String designation, List<Patient> patient) {
		super();
		this.doctorId = doctorId;
		this.firstNAme = firstNAme;
		this.lastName = lastName;
		this.degree = degree;
		this.introduction = introduction;
		this.department = department;
		this.designation = designation;
		this.patient = patient;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getFirstNAme() {
		return firstNAme;
	}

	public void setFirstNAme(String firstNAme) {
		this.firstNAme = firstNAme;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(degree, department, designation, doctorId, firstNAme, introduction, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctors other = (Doctors) obj;
		return Objects.equals(degree, other.degree) && Objects.equals(department, other.department)
				&& Objects.equals(designation, other.designation) && doctorId == other.doctorId
				&& Objects.equals(firstNAme, other.firstNAme) && Objects.equals(introduction, other.introduction)
				&& Objects.equals(lastName, other.lastName);
	}

}

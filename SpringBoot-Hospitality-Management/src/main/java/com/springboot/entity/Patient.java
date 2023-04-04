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
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	private String firstName;
	private String lastName;
	private long mobileNumber;
	private String Address;
	private int pincode;
	private String city;
	private String email;

	public Patient() {
		// TODO Auto-generated constructor stub
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Doctors> doctors;

	public List<Doctors> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctors> doctors) {
		this.doctors = doctors;
	}

	public Patient(int patientId, String firstName, String lastName, long mobileNumber, String address, int pincode,
			String city, String email, List<Doctors> doctors) {
		super();
		this.patientId = patientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		Address = address;
		this.pincode = pincode;
		this.city = city;
		this.email = email;
		this.doctors = doctors;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Address, city, email, firstName, lastName, mobileNumber, patientId, pincode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(city, other.city)
				&& Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && mobileNumber == other.mobileNumber
				&& patientId == other.patientId && pincode == other.pincode;
	}

}

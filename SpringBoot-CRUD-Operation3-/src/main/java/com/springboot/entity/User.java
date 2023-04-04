package com.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", pincode=" + pincode + ", mobilenNumber="
				+ mobilenNumber + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getMobilenNumber() {
		return mobilenNumber;
	}
	public void setMobilenNumber(long mobilenNumber) {
		this.mobilenNumber = mobilenNumber;
	}
	private String name;
	private String city;
	private int pincode;
	private long mobilenNumber;

}

package com.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Customer {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;

	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", name=" + name + ", city=" + city + ", pincode=" + pincode + "]";
	}

	private String name;

	private String city;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	private int pincode;

}

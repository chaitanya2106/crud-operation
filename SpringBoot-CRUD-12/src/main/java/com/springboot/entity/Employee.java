package com.springboot.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fName;
	private String lName;

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, fName, id, lName, mobNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(fName, other.fName) && id == other.id
				&& Objects.equals(lName, other.lName) && mobNumber == other.mobNumber;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fName=" + fName + ", lName=" + lName + ", mobNumber=" + mobNumber
				+ ", address=" + address + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public long getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(long mobNumber) {
		this.mobNumber = mobNumber;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	private long mobNumber;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> address;

}

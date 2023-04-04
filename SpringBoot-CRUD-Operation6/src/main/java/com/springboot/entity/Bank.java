package com.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int bankAccountNum;
	private String accHolderName;
	private String bankName;
	private String ststus;
	
	@Override
	public String toString() {
		return "Bank [bankAccountNum=" + bankAccountNum + ", accHolderName=" + accHolderName + ", bankName=" + bankName
				+ ", ststus=" + ststus + "]";
	}
	public int getBankAccountNum() {
		return bankAccountNum;
	}
	public void setBankAccountNum(int bankAccountNum) {
		this.bankAccountNum = bankAccountNum;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getStstus() {
		return ststus;
	}
	public void setStstus(String ststus) {
		this.ststus = ststus;
	}
	
	

}

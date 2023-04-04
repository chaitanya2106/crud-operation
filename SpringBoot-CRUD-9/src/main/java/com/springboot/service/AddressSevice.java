package com.springboot.service;

import com.springboot.entity.Address;

public interface AddressSevice {

	public Address saveAddress(Address adresss);
	//public Address updateAddressById(Integer id,Address address);
	public Address getAddressById(Integer id);
}

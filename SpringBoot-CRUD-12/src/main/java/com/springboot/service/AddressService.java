package com.springboot.service;

import java.util.List;

import com.springboot.entity.Address;

public interface AddressService {

	public Address saveAddress(Address address);
	public void deleteAddressById(Integer id);
	public Address getAddressById(Integer id);
	public List<Address> getAllAddresses(Address address);
	
}

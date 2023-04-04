package com.springboot.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.AddressDao;
import com.springboot.entity.Address;
import com.springboot.service.AddressSevice;
@Service
public class AddressServiceImpl implements AddressSevice {

	@Autowired
	private AddressDao addressDao;

	@Override
	public Address saveAddress(Address address) {
		// TODO Auto-generated method stub
		return addressDao.save(address);
	}

	/*
	 * @Override public Address updateAddressById(Integer id, Address address) { //
	 * TODO Auto-generated method stub return null; }
	 */

	@Override
	public Address getAddressById(Integer id) {
		// TODO Auto-generated method stub
		return addressDao.findById(id);
	}

}

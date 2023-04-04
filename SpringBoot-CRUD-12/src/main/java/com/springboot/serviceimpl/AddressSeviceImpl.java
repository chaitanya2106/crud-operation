package com.springboot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.AddressDao;
import com.springboot.entity.Address;
import com.springboot.service.AddressService;

@Service
public class AddressSeviceImpl implements AddressService {
	@Autowired
	private AddressDao addressDao;

	@Override
	public Address saveAddress(Address address) {
		// TODO Auto-generated method stub
		return addressDao.save(address);
	}

	@Override
	public void deleteAddressById(Integer id) {
		// TODO Auto-generated method stub
		addressDao.deleteById(id);
	}

	@Override
	public Address getAddressById(Integer id) {
		// TODO Auto-generated method stub
		return addressDao.findById(id);
	}

	@Override
	public List<Address> getAllAddresses(Address address) {
		// TODO Auto-generated method stub
		return addressDao.findAll();
	}

}

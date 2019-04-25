package com.coderslab.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.coderslab.entity.Address;
import com.coderslab.repository.AddressRepository;
import com.coderslab.service.AddressService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AddressServiceImpl implements AddressService {

	@Autowired private AddressRepository addressRepository;
	@Autowired @Qualifier("jdbcTemplate") private JdbcTemplate jdbcTemplate;

	@Override
	@Transactional
	public Address save(Address obj) {
		return addressRepository.save(obj);
	}

	@Override
	public Address update(Address obj) {
		return save(obj);
	}

	@Override
	public List<Address> findAll() {
		return addressRepository.findAll();
	}

	@Override
	public Address findById(Long id) {
		return addressRepository.findById(id).get();
	}

	@Override
	public Address archiveById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Boolean deleteById(Long id) {
		try {
			addressRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			log.error("Error is : {}, {}", e.getMessage(), e);
			return false;
		}
	}

}

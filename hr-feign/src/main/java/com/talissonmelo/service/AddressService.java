package com.talissonmelo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talissonmelo.feignclient.AddressFeignClient;
import com.talissonmelo.model.Address;

@Service
public class AddressService {

	@Autowired
	private AddressFeignClient feignClient;
	
	public Address findByCep(String cep) {
		Address address = feignClient.findByCep(cep).getBody();
		return address;
	}
}

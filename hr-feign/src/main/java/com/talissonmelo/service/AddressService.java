package com.talissonmelo.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talissonmelo.feignclient.AddressFeignClient;
import com.talissonmelo.model.Address;
import com.talissonmelo.model.AddressResume;
import com.talissonmelo.model.Complement;
import com.talissonmelo.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressFeignClient feignClient;
	
	@Autowired
	private AddressRepository repository;
	
	@Autowired
	private ModelMapper mapper;
	
	public AddressResume insertAddress(String cep, Complement complement) {
		Address address = feignClient.findByCep(cep).getBody();
		address.setComplemento(complement.getComplemento());
		address.setNumero(complement.getNumero());
		AddressResume resume = mapper.map(address, AddressResume.class);
		return repository.save(resume);
	}
}

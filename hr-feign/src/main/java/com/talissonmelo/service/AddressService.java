package com.talissonmelo.service;

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
	
	public AddressResume findByCep(String cep, Complement complement) {
		Address address = feignClient.findByCep(cep).getBody();
		address.setComplemento(complement.getComplemento());
		address.setNumero(complement.getNumero());
		return toAddressResume(address);
	}

	private AddressResume toAddressResume(Address address) {
		AddressResume resume = new AddressResume();
		resume.setBairro(address.getBairro());
		resume.setCep(address.getCep());
		resume.setComplemento(address.getComplemento());
		resume.setLocalidade(address.getLocalidade());
		resume.setLogradouro(address.getLogradouro());
		resume.setNumero(address.getNumero());
		resume.setUf(address.getUf());
		return repository.save(resume);
	}
}

package com.talissonmelo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talissonmelo.model.Address;
import com.talissonmelo.service.AddressService;

@RestController
@RequestMapping(value = "/address")
public class AddressController {

	@Autowired
	private AddressService service;
	
	@GetMapping(value = "/{cep}")
	public ResponseEntity<Address> findByCepAddress(@PathVariable String cep){
		Address address = service.findByCep(cep);
		return ResponseEntity.ok().body(address);
	}
}

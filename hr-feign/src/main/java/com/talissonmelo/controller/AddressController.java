package com.talissonmelo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talissonmelo.model.AddressResume;
import com.talissonmelo.model.Complement;
import com.talissonmelo.service.AddressService;

@RestController
@RequestMapping(value = "/address")
public class AddressController {

	@Autowired
	private AddressService service;
	
	@PostMapping(value = "/{cep}")
	public ResponseEntity<AddressResume> findByCepAddress(@PathVariable String cep, @Valid @RequestBody Complement complement) {
		AddressResume address = service.findByCep(cep, complement);
		return ResponseEntity.ok().body(address);
	}
}

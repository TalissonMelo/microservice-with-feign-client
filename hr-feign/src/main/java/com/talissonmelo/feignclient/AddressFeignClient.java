package com.talissonmelo.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.talissonmelo.model.Address;

@Component
@FeignClient(name = "viacep" ,url = "https://viacep.com.br", path = "/ws")
public interface AddressFeignClient {

	@GetMapping(value = "/{cep}/json")
	ResponseEntity<Address> findByCep(@PathVariable String cep);
}

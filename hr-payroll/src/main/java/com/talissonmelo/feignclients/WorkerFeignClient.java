package com.talissonmelo.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.talissonmelo.entities.Worker;

@Component
@FeignClient(name = "hr-worker", url= "localhost:8001", path = "/workers")
public interface WorkerFeignClient {

	@GetMapping(value = "/{workerId}")
	public ResponseEntity<Worker> findById(@PathVariable Long workerId);
}

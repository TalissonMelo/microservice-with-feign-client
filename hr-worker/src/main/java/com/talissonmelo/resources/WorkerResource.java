package com.talissonmelo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talissonmelo.entities.Worker;
import com.talissonmelo.service.WorkerService;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

	@Autowired
	private WorkerService service;

	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> workers = service.findAll();
		return ResponseEntity.ok().body(workers);
	}

	@GetMapping(value = "/workerId")
	public ResponseEntity<Worker> findById(@PathVariable Long workerId) {
		Worker worker = service.findById(workerId);
		return ResponseEntity.ok().body(worker);
	}
}

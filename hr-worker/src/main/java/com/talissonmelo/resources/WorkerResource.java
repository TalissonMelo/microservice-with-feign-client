package com.talissonmelo.resources;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.talissonmelo.entities.Worker;
import com.talissonmelo.entities.dto.WorkerDto;
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

	@GetMapping(value = "/{workerId}")
	public ResponseEntity<Worker> findById(@PathVariable Long workerId) {
		Worker worker = service.findById(workerId);
		return ResponseEntity.ok().body(worker);
	}
	
	@PostMapping
	public ResponseEntity<Worker> save(@Valid @RequestBody WorkerDto workerDto){
		Worker worker = service.insert(workerDto);
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{id}")
				.buildAndExpand(worker.getId()).toUri();
		return ResponseEntity.created(uri).body(worker);
	}
}

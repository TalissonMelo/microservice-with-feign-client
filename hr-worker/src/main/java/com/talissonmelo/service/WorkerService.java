package com.talissonmelo.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talissonmelo.entities.Worker;
import com.talissonmelo.entities.dto.WorkerDto;
import com.talissonmelo.repositories.WorkerRepository;
import com.talissonmelo.service.exception.EntityNotFoundException;

@Service
public class WorkerService {

	@Autowired
	private WorkerRepository repository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public List<Worker> findAll(){
		return repository.findAll();
	}
	
	public Worker findById(Long workerId) {
		return repository.findById(workerId).orElseThrow(
				() -> new EntityNotFoundException(workerId));
	}
	
	public Worker insert(WorkerDto workerDto) {
		Worker worker = modelMapper.map(workerDto, Worker.class);
		return repository.save(worker);
	}
}

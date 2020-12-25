package com.talissonmelo.service.exception;

public class EntityNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public EntityNotFoundException(Long id) {
		super("Resorce not found. Id " + id);
	}

}

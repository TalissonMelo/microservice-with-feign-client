package com.talissonmelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talissonmelo.model.AddressResume;

public interface AddressRepository extends JpaRepository<AddressResume, Long> {

}

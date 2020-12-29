package com.talissonmelo.service;

import org.springframework.stereotype.Service;

import com.talissonmelo.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("XXX", 100.0, days);
	}
}

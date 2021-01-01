package com.talissonmelo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.talissonmelo.entities.Payment;
import com.talissonmelo.entities.Worker;

@Service
public class PaymentService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${hr-worker-host}")
	private String wokerHost;

	public Payment getPayment(long workerId, int days) {
		Map<String, String> uriVariable = new HashMap<>();
		uriVariable.put("id", ""+workerId);

		Worker worker = restTemplate.getForObject(wokerHost + "/workers/{id}", Worker.class, uriVariable);
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}

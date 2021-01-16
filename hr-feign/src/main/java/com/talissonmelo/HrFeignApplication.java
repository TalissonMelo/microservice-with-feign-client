package com.talissonmelo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HrFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrFeignApplication.class, args);
	}

}
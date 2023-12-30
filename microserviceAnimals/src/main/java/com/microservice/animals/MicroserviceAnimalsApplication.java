package com.microservice.animals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceAnimalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceAnimalsApplication.class, args);
	}

}

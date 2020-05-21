package com.madbarsoft.ratingdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RagingDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RagingDataServiceApplication.class, args);
	}
	
	

}


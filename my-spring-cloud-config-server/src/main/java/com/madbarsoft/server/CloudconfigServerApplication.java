package com.madbarsoft.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudconfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudconfigServerApplication.class, args);
	}

}

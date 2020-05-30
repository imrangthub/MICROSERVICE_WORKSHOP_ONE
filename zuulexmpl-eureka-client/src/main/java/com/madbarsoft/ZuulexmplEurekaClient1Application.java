package com.madbarsoft;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ZuulexmplEurekaClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(ZuulexmplEurekaClient1Application.class, args);
	}

}


package com.madbarsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class ZuulexmplEurekaClient3Application {

	public static void main(String[] args) {
		SpringApplication.run(ZuulexmplEurekaClient3Application.class, args);
	}

}
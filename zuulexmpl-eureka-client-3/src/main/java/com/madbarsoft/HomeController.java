package com.madbarsoft;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/msg1")
	public String getHomeMsg1() {
		System.out.println("This Message from Eureka Client 3 Home Controller Msg1");
		return "This Message from Eureka Client 3 Home Controller Msg1";
	}

}

package com.madbarsoft;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	@GetMapping("/msg1")
	public String getHomeMsg1() {
		System.out.println("This Message from Eureka Client 2 Home Controller Msg1");
		return "This Message from Eureka Client 2 Home Controller Msg1";
	}

}

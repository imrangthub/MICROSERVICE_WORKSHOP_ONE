package com.madbarsoft;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

	@Value("${msg.greeting1}")
	private String greeting1;
	
	@Value("${msg.greeting2: This Msg2 Default value}")
	private String greeting2;
	
	
	

	@GetMapping("/msg1")
	public String getTestMsg1() {
		System.out.println("This Log Message from CloudconfigclientApplication GreetingController : Msg 1");

		return "This Message 1 from GreetingController, Message: "+greeting1;
	}
	
	@GetMapping("/msg2")
	public String getTestMsg2() {
		System.out.println("This Log Message from CloudconfigclientApplication GreetingController : Msg 2");

		return "This Message 2 from GreetingController, Message: "+greeting2;
	}

}

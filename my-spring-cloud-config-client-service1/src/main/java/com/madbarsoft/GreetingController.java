package com.madbarsoft;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/greeting")
public class GreetingController {

	@Value("${msg.greeting1}")
	private String greeting1;

	@Value("${msg.greeting2: This Msg2 Default value}")
	private String greeting2;

	@Value("${my.greeting}")
	private String greeting;

	@GetMapping("/msg")
	public String getTestMsg() {
		System.out.println("This Log Message from CloudconfigclientApplication GreetingController : My Greeting ");

		return "This Message 1 from GreetingController, My Greeting: " + greeting;
	}

	@GetMapping("/msg1")
	public String getTestMsg1() {
		System.out.println("This Log Message from CloudconfigclientApplication GreetingController : Msg 1");

		return "This Message 1 from GreetingController, Message: " + greeting1;
	}

	@GetMapping("/msg2")
	public String getTestMsg2() {
		System.out.println("This Log Message from CloudconfigclientApplication GreetingController : Msg 2");

		return "This Message 2 from GreetingController, Message: " + greeting2;
	}

}

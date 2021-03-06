package com.madbarsoft;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-app")
public class TestAppController {

	@GetMapping("/msg1")
	public String getTestMsg1() {
		System.out.println("This Log Message from Movie Test Controller: Msg 1");
		return "This Message from Movie Test Controller, Message 1";
	}
	
	@GetMapping("/msg2")
	public String getTestMsg2() {
		System.out.println("This Log Message from Movie Test Controller: Msg 2");
		return "This Message from Movie Test Controller, Message 2";
	}
	

}

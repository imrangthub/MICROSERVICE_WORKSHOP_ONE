package com.madbarsoft;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api3")
public class ClientThreeController {
	
	@GetMapping("/")
	public String getHomeMsg1() {
		System.out.println("This Message from Eureka Client 3 Home Controller Root");
		return "This Message from Eureka Client 3 Home Controller Root";
	}
	
	
	@GetMapping("/msg2")
	public String ms2() {
		System.out.println("This Message from Eureka Client 3 Home Controller ms2");
		return "This Message from Eureka Client 3 Home Controller ms2";
	}

	@RequestMapping("/eureka-client-3")
	public String home() throws JSONException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("message", "Hello World 3");
		return jsonObject.toString();
	}
	
	
	

}

package com.xoriant.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// client -2
@RestController
@RequestMapping("/api/client")
@RefreshScope
public class ClientRestController {
	
	@Value("${name}")
	private String personName;
	
	@GetMapping
	public String getName() {
		return "Hello dear "+personName;
	}
	
	@GetMapping("/{age}")
	public String sayAge(@PathVariable int age) {
		System.out.println(">>>>>>> CLient -1 Age:: "+age);
		return "Your Age is "+age;
	}

}

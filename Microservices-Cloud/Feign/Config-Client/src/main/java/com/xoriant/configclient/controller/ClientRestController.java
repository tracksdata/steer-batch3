package com.xoriant.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.configclient.service.AgeServiceImpl;

// Client -1
@RestController
@RequestMapping("/api/client")
@RefreshScope
public class ClientRestController {

	@Autowired
	private AgeServiceImpl as;

	@Value("${name}")
	private String personName;

	@GetMapping
	public String getName() {
		return "Hello dear " + personName;
	}

	@GetMapping("/test")
	public String f1() {
		return "Hello "+ as.getAge(67);

	}

}

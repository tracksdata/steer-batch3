package com.xoriant.configclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "client-1",url = "http://localhost:7072/api/client")
public interface TestFeignService {
	
	@GetMapping("/{age}")
	public String f1(@PathVariable int age);
	
	
	

}

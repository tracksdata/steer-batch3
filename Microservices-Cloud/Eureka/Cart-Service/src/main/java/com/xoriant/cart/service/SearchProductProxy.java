package com.xoriant.cart.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.xoriant.cart.model.Product;

@FeignClient(name = "search-service") // http://localhost:search-service/api/search
public interface SearchProductProxy {
	
	@GetMapping("/api/search/{id}")
	public Product findProduct(@PathVariable int id);

}

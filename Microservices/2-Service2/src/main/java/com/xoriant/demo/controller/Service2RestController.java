package com.xoriant.demo.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.xoriant.demo.model.Product;

@RestController
@RequestMapping("api/service2")
public class Service2RestController {
	
	private RestTemplate rt=new RestTemplate();

	//
	@GetMapping("/s2")
	public String f1() {
		return "Message from service-2";
	}
	
	@GetMapping("/greet")
	public String f2() {
		String message=rt.getForObject("http://localhost:2001/api/service1/greet", String.class);
		return message;
	}
	
	@GetMapping("/{id}")
   public Product findProduct(@PathVariable int id) {
	  Product product= rt.getForObject("http://localhost:2001/api/service1/"+id, Product.class);
	  return product;
   }
	
	@GetMapping
	public List<Product> findAll(){
		System.out.println(">");
		List<Product> prods= rt.getForObject("http://localhost:2001/api/service1", ArrayList.class);
		System.out.println(">>>>> "+prods);
		return prods;
	}
	

}

package com.xoriant.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.xoriant.ecart.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
	ApplicationContext ac= SpringApplication.run(Application.class, args);
	
	ProductService productService = ac.getBean(ProductService.class);
	
	//productService.findAllProductsV2().forEach(System.out::println);
	productService.findProductByName("%i%").forEach(System.out::println);
	
	
	
	}

}

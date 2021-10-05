package com.xoriant.ecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.xoriant.ecart.model.Brand;
import com.xoriant.ecart.model.Category;
import com.xoriant.ecart.model.Product;
import com.xoriant.ecart.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class EcartRestController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping
	public Product saveProduct(@RequestBody Product product) {
		System.out.println(">>>> Product <<<<");
		System.out.println(product);
		return productService.save(product);
	}
	
	@GetMapping()
	public List<Product> findAllProducts(){
		return productService.findAll();
	}
	
	
	
	
	
	

}

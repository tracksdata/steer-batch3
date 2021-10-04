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
	
	@GetMapping(produces = {"application/json" }, consumes = MediaType.ALL_VALUE)
	public List<Product> findAllProducts(){
		return productService.findAll();
	}
	@GetMapping("/{productId}")
	public Product findProductById(@PathVariable int productId) {
		return productService.findById(productId);
		
	}
	
	@GetMapping("/brands")
	public List<Brand> findAllBrands() {
		return productService.findAllBrands();
	}
	
	@GetMapping("/categories")
	public List<Category> findAllCategories() {
		return productService.findAllCatogories();
	}
	
	@GetMapping("/filter/brandName{brandName}")
	public List<Product> filterProductsByBrandName(@PathVariable String brandName){
		return productService.filterProductsByBrandName(brandName);
	}
	
	@GetMapping("/filter/productName/{productName}")
	public List<Product> findAllPrductsByProductName(@PathVariable String productName){
		
		return productService.findProductByName("%"+productName+"%");
		
	}
	
	@GetMapping("/filter/price/{minPrice}/{maxPrice}")
	public List<Product> filterProductsByPriceRange(@PathVariable int minPrice,@PathVariable int maxPrice){
		return productService.filterProductsByMinAndMaxRange(minPrice, maxPrice);
	}
	
	
	
	

}

package com.xoriant.ecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xoriant.ecart.model.Brand;
import com.xoriant.ecart.model.Category;
import com.xoriant.ecart.model.Product;
import com.xoriant.ecart.service.ProductService;

@RestController
@RequestMapping("/api/search")
@RefreshScope
public class SearchRestController {

	@Autowired
	ProductService productService;

	@GetMapping("/{productId}")
	public Product findProductById(@PathVariable int productId) {
		System.out.println(">>>>> Search-Service-4 <<<<<<< ");
		System.out.println("=================================");
		Product prod = productService.findById(productId);
		System.out.println(prod);
		System.out.println("=================================");
		return prod;
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
	public List<Product> filterProductsByBrandName(@PathVariable String brandName) {
		return productService.filterProductsByBrandName(brandName);
	}

	@GetMapping("/filter/productName/{productName}")
	public List<Product> findAllPrductsByProductName(@PathVariable String productName) {

		return productService.findProductByName("%" + productName + "%");

	}

	@GetMapping("/filter/price/{minPrice}/{maxPrice}")
	public List<Product> filterProductsByPriceRange(@PathVariable int minPrice, @PathVariable int maxPrice) {
		return productService.filterProductsByMinAndMaxRange(minPrice, maxPrice);
	}

}

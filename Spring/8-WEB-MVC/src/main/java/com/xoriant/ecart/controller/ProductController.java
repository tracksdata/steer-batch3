package com.xoriant.ecart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xoriant.ecart.model.Brand;
import com.xoriant.ecart.model.Category;
import com.xoriant.ecart.model.Product;
import com.xoriant.ecart.service.ProductService;

@Controller
public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	
	
	@RequestMapping("/")
	public String welcome() {
		return "index";
	}

	// load form
	@RequestMapping(value = "/loadForm")
	public String loadProdForm() {
		return "product-form";
	}

	@RequestMapping("/saveProduct")
	public String saveProduct(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("price") double price) {

		System.out.println(">>> Product ID: " + id);
		System.out.println(">>> Name: " + name);
		System.out.println(">>> Price: " + price);

		return "welcome";
	}

	@RequestMapping("/saveProductV1")
	public String saveProductV1(@ModelAttribute Product product,@RequestParam("categoryId")int categoryId,@RequestParam("brandId")int brandId) {
		
		Brand b1=new Brand(brandId);
		Category c1=new Category(categoryId);
		product.setBrand(b1);
		product.setCategory(c1);
		System.out.println(product);
		
		productService.save(product);

		return "index";
	}

	@RequestMapping(value = "/s1")
	public void f1() {
		System.out.println(">>>> ProductController::f1 method");
	}

	@RequestMapping(value = "/s2")
	public String f2(Model model) {
		System.out.println(">>>> ProductController::f2 method");
		model.addAttribute("user", "Praveen Reddy");
		model.addAttribute("city", "Pune");

		return "one";
	}

	@RequestMapping(value = "/s3")
	public ModelAndView f3() {
		System.out.println(">>>> ProductController::f3 method");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("one");
		mav.addObject("user", "James");
		mav.addObject("city", "Bangalore");
		return mav;

	}

}

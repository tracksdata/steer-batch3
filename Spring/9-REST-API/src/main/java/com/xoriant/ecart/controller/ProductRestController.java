package com.xoriant.ecart.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

	/*
	 * 1. GET 2. POST 3. PUT 4. DELETE 5. PATCH
	 * 
	 */

	@GetMapping
	public String f1() {
		return "GET::hello";
	}
	
	@GetMapping("/{user}")
	public String f12(@PathVariable("user")String userName) {
		return "GET::hello-f12 >>>> "+userName;
	}
	
	@GetMapping("/f1")
	public String f11() {
		return "GET::hello - v1";
	}

	@PostMapping
	public String f3() {
		return "POST::hello";
	}

	@PutMapping
	public String f4() {
		return "PUT::hello";
	}

	@PatchMapping
	public String f5() {
		return "Patch::hello";
	}

	@DeleteMapping
	public String f6() {
		return "Delete::hello";
	}

}

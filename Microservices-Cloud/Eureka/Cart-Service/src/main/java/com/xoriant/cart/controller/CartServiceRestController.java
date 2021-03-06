package com.xoriant.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.cart.model.ItemLine;
import com.xoriant.cart.service.CartService;

@RestController
@RequestMapping("/api/cart")
@RefreshScope
public class CartServiceRestController {

	@Autowired
	private CartService cartService;
	
	
	//find all Cart Items
	@GetMapping("/findAll/{user}")
	public List<ItemLine> findAllCartItems(@PathVariable String user) {
		return cartService.findAll(user);
	}
	
	// add item to the cart\
	@GetMapping("/{user}/{id}/{qty}")
	//@PostMapping("/{user}")
	public ItemLine addItemToCart(@PathVariable int id,@PathVariable int qty,@PathVariable String user) {
		//System.out.println(">>> Controller:: "+itemLine);
		return cartService.save(user,id,qty);
	}
	
	// clear cart of a given user
	@DeleteMapping("/{user}")
	public void clearCart(@PathVariable String user) {
		cartService.clearCart(user);
	}
	
}

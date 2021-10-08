package com.xoriant.cart.service;

import java.util.List;

import com.xoriant.cart.model.ItemLine;

public interface CartService {



	// load all cart items
	List<ItemLine> findAll(String user);

	// clear cart for a user
	void clearCart(String user);


	ItemLine save(String user, int id, int qty);

}

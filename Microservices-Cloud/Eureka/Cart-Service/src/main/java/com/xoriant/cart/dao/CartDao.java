package com.xoriant.cart.dao;

import java.util.List;

import com.xoriant.cart.model.ItemLine;

public interface CartDao {

	// save cart Item to the cart
	ItemLine save(String user, ItemLine itemLine);

	// load all cart items
	List<ItemLine> findAll(String user);

	// clear cart for a user
	void clearCart(String user);

}
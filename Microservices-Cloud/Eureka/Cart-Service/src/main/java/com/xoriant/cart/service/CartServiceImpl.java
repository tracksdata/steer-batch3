package com.xoriant.cart.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xoriant.cart.dao.CartDao;
import com.xoriant.cart.model.Item;
import com.xoriant.cart.model.ItemLine;
import com.xoriant.cart.model.Product;

@Service
public class CartServiceImpl implements CartService{
	@Autowired
	private CartDao cartDao;
	
	@Autowired
	private SearchProductProxy searchProxy;

	@Override
	public ItemLine save(String user,int id,int qty) {
		System.out.println(">>> CART SERVICE :: ADDING PRODUCT TO THE CART:: "+id);
		Product prod=searchProxy.findProduct(id);
		Item item=new Item(prod.getProductId(),prod.getProductName(),prod.getPrice());
		ItemLine itemLine=new ItemLine(item, qty);
		
		// TODO Auto-generated method stub
		return cartDao.save(user, itemLine);
	}

	@Override
	public List<ItemLine> findAll(String user) {
		// TODO Auto-generated method stub
		return cartDao.findAll(user);
	}

	@Override
	public void clearCart(String user) {
		cartDao.clearCart(user);
	}

}

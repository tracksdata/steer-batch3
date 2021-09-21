package com.xoriant.eshop;

import com.xoriant.eshop.dao.PriceMatrix;
import com.xoriant.eshop.dao.PriceMatrixImpl;
import com.xoriant.eshop.service.BillingServiceImpl;

public class Customer {

	public static void main(String[] args) {

		String[] cart1 = { "P001", "P002", "P003" };
		String[] cart2 = { "P001", "P002" };

		//=================================================
		PriceMatrix price=new PriceMatrixImpl(); // dependency
		//================================================
		
		BillingServiceImpl biller = new BillingServiceImpl(); // dependent

		biller.setPrice(price); // Injecting dependency (price) to the dependent (biller) is called DI
		
		double total = biller.getCartTotal(cart1);
		System.out.println("Cart1 Total : " + total);
		total = biller.getCartTotal(cart2);
		System.out.println("Cart2 Total : " + total);

	}

}

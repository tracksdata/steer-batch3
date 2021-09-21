package com.xoriant.eshop.dao;

//Dependency
public class PriceMatrixImpl implements PriceMatrix {
	
	public PriceMatrixImpl() {
		System.out.println(">>> PriceMatrixImpl object created...");
	}
	
	
	/*
	 * 
	 * Types of Objects : 2
	 * ====================
	 *  1. Dependency : An object which never depends on any other objects
	 *  2. Dependent: An object which always
	 * depends on dependency
	 * 
	 */

	@Override
	public double getItemPrice(String itemCode) {
		// code to fetch item price from database of a given item code
		return 100.00;
	}

}

package com.xoriant.eshop.service;

import com.xoriant.eshop.dao.PriceMatrix;

//Dependent
public class BillingServiceImpl {
	
	/*
	 *  Design Issues
	 *  ================
	 *  
	 *  => too many dependency object creations.
	 *  		-> memory management issues
	 *  		-> app perfomance goes down
	 *  
	 *   Why this issue happened?
	 *   ---------------------------
	 *   => dependent class itself creating dependency class object
	 *   
	 *   what is the solution?
	 *   -------------------------
	 *   => do not create dependency object in the dependent class directly
	 *   => Instead , use techniques like JNDI
	 *   => JNDI location is tightly binded with dependent class.
	 *   
	 *   what is the best solution?
	 *   ------------------------------
	 *   => do not create or do not  look up using like JNDI.
	 *   => Ask some one  (container) to inject / pass to the dependent object
	 *       -> this is called IoC (Inversion of control)
	 *       
	 *    How to implement IoC?
	 *    -------------------------
	 *    => using dependency injection technique.
	 *    
	 *    What is Dependency Injection (DI) ?
	 *    --------------------------------------
	 *    => Injecting / passing dependency object to the dependent object : DI
	 *    
	 *    In how many ways DI can be implemented?: 2 ways
	 *    ----------------------------------------
	 *   	1. setter based injection
	 *      2. constructor based injection
	 *       
	 *   
	 *   	1. setter based injection
	 *   -----------------------------------
	 *   Rules: 
	 *      1. Create referance of dependency class object in the dependent at class level
	 *      2. create setter method to the above defined property. 
	 *      
	 */
	
	
	private PriceMatrix price; // dependency ref

	
	public void setPrice(PriceMatrix price) {
		this.price = price;
	}


	public double getCartTotal(String[] cart) {

		double total = 0.0;

		//PriceMatrixImpl price = new PriceMatrixImpl(); // dependency

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;

	}

}

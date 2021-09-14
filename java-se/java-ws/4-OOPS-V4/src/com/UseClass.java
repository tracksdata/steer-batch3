package com;

public class UseClass {

	public static void main(String[] args) {
		
		// V1 code
		/*
		Bank be=new Bank();
		Bank cust=new Bank();
		
		be.closeAccount();
		be.openAccount();
		be.withDraw();
		be.deposit();
		//----------------------
		cust.withDraw();
		cust.deposit();
		cust.openAccount();
		cust.closeAccount();
		//------------------------
		 */
		
		// V2 code
		
		//Object obj=new Bank();
		
		BankEmployee be=new Bank();
		be.openAccount();
		be.closeAccount();
		be.withDraw();
		be.deposit();
		
		System.out.println("-----------------------");
		
		Customer cust=new Bank();
		cust.deposit();
		cust.withDraw();
	
		Manager m=new Bank();
		m.lockerAccess();
		
		
		
		
		
		
		
	}

}

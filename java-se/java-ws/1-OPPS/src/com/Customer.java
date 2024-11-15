package com;

public class Customer {

	private String custName;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String custName) {

		this.custName = custName;
	}
	
	CardAccount cardObj=new CardAccount();
	
	public void info() { // this means who  ever calling this method..
		System.out.println(">> Account:: info for "+this.getCustName());
		// apply credit card
		cardObj.openCardAccount(this);
	}

	public static void main(String[] args) {

		Account acc = new Account();

		Customer c1 = new Customer("Praveen");
		Customer c2 = new Customer("James");
		Customer c3 = new Customer("Ozvitha");

		c1.info();
		c2.info();
		
		
		
		
		

	}

}

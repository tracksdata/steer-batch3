package com;

public class UseClass {

	public static void main(String[] args) {

		Employee emp = name -> {
			System.out.println(">>>> Name is " + name);
		};

		Customer cust = name -> {
			System.out.println(">>> Cust name is " + name);
		};

		// Operation op1=(a,b)->a+b;
		
		Operation op2 = (a, b) -> {
			System.out.println("A: " + a);
			System.out.println("B: " + b);
			return (a + b);
		};

		System.out.println(op2.sum(100, 200));

		emp.save("Praveen");
		cust.save("Ozvitha");

	}

}

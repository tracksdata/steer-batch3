package com;

class Employee implements Runnable {

	@Override
	public void run() {
		display();
		f1();
	}

	void display() {
		System.out.println(">>>> display method by " + Thread.currentThread().getName());
	}

	void f1() {
		System.out.println(">>>> f1 method by " + Thread.currentThread().getName());

	}

}

public class Test {

	public static void main(String[] args) {

		System.out.println(">>> " + Thread.currentThread().getName());

		Employee emp = new Employee();

		Thread t1 = new Thread(emp, "First");
		Thread t2 = new Thread(emp, "Second");
		
		System.out.println(t1.getState() +" of "+t1.getName());
		System.out.println(t2.getState() +" of "+t2.getName());

		// emp.run(); // non thread app
	    t1.start();
		//t2.start();
		
		System.out.println(t1.getState() +" of "+t1.getName());
		System.out.println(t2.getState() +" of "+t2.getName());
		
		try {
			Thread.sleep(10000);
			System.out.println("============================================");
			System.out.println(t1.getState() +" of "+t1.getName());
			System.out.println(t2.getState() +" of "+t2.getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	//	for (int i = 1; i <= 20; i++) {
//			System.out.println(i);
	//	}

	}

}

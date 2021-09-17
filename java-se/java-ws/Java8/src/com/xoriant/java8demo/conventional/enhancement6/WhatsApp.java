package com.xoriant.java8demo.conventional.enhancement6;

public class WhatsApp implements Notification{

	@Override
	public void notify(double balance) {
		System.out.print("Whats app message has sent...");
		System.out.println("The remaining balance is :" + balance);
	}

}

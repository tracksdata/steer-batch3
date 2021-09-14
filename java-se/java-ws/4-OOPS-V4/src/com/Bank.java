package com;

public class Bank implements BankEmployee, Customer, Manager {
	
	@Override
	public void lockerAccess() {
		System.out.println(">>> Locker access given...");
	}

	@Override
	public void openAccount() {
		System.out.println(">>> Openning account");
	}

	@Override
	public void closeAccount() {
		System.out.println(">>> Closing account");
	}

	@Override
	public void deposit() {
		System.out.println(">>> Depositing");
	}

	@Override
	public void withDraw() {
		System.out.println(">>> Withdrawing...");
	}

}

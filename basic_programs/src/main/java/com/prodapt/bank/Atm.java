package com.prodapt.bank;

public class Atm implements Bank {
	int balance = 10000;

	@Override
	public void deposite(int amount) {
		System.out.println("depositin amount " + amount);
		balance = balance + amount;
		System.out.println("amount deposite succesfully");

	}

	@Override
	public void withdraw(int amount) {
		System.out.println("withdrwaing amount " + amount);
		balance = balance - amount;// balance-=amount;
		System.out.println(" amount withdraw succesfully");

	}

	@Override
	public void checkBalance() {
		System.out.println("current balance is " + balance);
	}
}

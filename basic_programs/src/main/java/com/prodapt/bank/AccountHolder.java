package com.prodapt.bank;

public class AccountHolder {
	public static void main(String[] args) {
		Atm a = new Atm();
		a.checkBalance();
		a.deposite(10000);
		a.checkBalance();
		a.withdraw(5000);
		System.out.println("---------------------------");
		Bank b = new Atm();
		b.checkBalance();
		b.withdraw(10000);
		b.deposite(1000);

		b.checkBalance();

	}
}

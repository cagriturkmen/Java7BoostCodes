package com.bilgeadam.week04.lesson001.hw;

public class SavingsAccounts extends BankAccount {

	double interestRate;
	
	public SavingsAccounts(String accountNumber, String accountName,double interestRate) {
		super(accountNumber, accountName);
		this.interestRate=interestRate;
	}
	
	public void addInterest() {
		
		double interest = this.balance * (this.interestRate/100);
		deposit(interest);
		
	}
	
	@Override
	public void deposit(double amount) {

		balance = balance + amount ;
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("Yetersiz bakiye:");
		}else {
			balance= balance - amount;
		}		
	}

	
	
}

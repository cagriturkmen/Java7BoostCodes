package com.bilgeadam.week04.lesson001.hw;

import java.util.List;

public class Bank {
	
	String name;
	List<BankAccount> accounts;
	
	public Bank(String name, List<BankAccount> accounts) {
	
		this.name = name;
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", accounts=" + accounts + "]";
	}
	
	
	
}

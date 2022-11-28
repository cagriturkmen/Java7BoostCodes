package com.bilgeadam.week04.lesson001.hw.solid.singleresponsibility;

public class LoanService {
	
	public double getLoanInterestInfo(String loanType) {
		if(loanType.equals("homeloan")) {
			return 2.30;
		}
		if(loanType.equals("carloan")) {
			return 1.99;
		}
		if(loanType.equals("personalloan")) {
			return 2.00;
		}
		return 0;
	}
	
}

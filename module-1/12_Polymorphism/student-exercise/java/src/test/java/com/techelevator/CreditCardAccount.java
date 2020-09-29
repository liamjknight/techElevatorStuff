package com.techelevator;

public class CreditCardAccount implements Accountable {
	//variables
	private String accountHolder;
	private String accountNumber;
	private int debt;
	
	//getters
	public String getAccountHolder() {
		return this.accountHolder;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public int getDebt() {
		return this.debt;
	}
	
	public int getBalance() {//returns the debt as a negative int, easier to use in VIP method later 
		return this.debt*(-1);
	}

	//constructors
	public CreditCardAccount(String accountHolder, String accountNumber) {
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.debt=0;
	}
	
	//methods
	public int pay(int amountToPay) {
		this.debt-=amountToPay;
		return this.debt;
	}
	
	public int charge(int amountToCharge) {
		this.debt+=amountToCharge;
		return this.debt;
	}
}

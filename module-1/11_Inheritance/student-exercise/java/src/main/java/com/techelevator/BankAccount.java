package com.techelevator;

public class BankAccount {
	private String accountHolderName;
	private String accountNumber;
	private int balance;
	
	//getters and setters
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	
	
	//constructors
	public BankAccount(String accountHolderName, String accountNumber) {
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		this.balance=0;
	}
	
	public BankAccount(String accountHolderString, String accountNumber, int balance) {
		this.accountHolderName=accountHolderString;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	//methods
	public int deposit(int amountToDeposit) {
		this.balance+=amountToDeposit;
		return balance;	
	}
	
	public int withdraw(int amountToWithdraw) {
		this.balance-=amountToWithdraw;
		return balance;
	}
}

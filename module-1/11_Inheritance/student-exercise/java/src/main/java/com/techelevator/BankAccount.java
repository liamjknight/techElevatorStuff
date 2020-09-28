package com.techelevator;

public class BankAccount {
	private String accountHolderName;
	private String accountNumber;
	private double balance;
	
	//getters
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	
	//constructors
	public BankAccount(String accountHolderName, String accountNumber) {
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
	}
	
	public BankAccount(String accountHolderString, String accountNumber, Double balance) {
		this.accountHolderName=accountHolderString;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	//methods
	public double deposit(double amountToDeposit) {
		return balance+amountToDeposit;	
	}
	
	public double withdraw(double amountToWithdraw) {
		if(balance-amountToWithdraw<0) {
			amountToWithdraw+=10;
			if (balance-amountToWithdraw>-100) {
				return balance - amountToWithdraw;
			}else {
				return balance;
			}
		}else {
			return balance - amountToWithdraw;
		}
	}
}

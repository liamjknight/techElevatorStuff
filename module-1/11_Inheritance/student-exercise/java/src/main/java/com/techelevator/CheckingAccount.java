package com.techelevator;

public class CheckingAccount extends BankAccount {
	//constructors
	public CheckingAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	}
	
	//methods
	@Override
	public int withdraw(int amountToWithdraw) {
		int balance = super.getBalance();
		if (balance-amountToWithdraw>-100) {
			if(balance-amountToWithdraw<0) {
				amountToWithdraw+=10;
				super.withdraw(amountToWithdraw);
				return balance-amountToWithdraw;
			}else {
				super.withdraw(amountToWithdraw);
				return balance-amountToWithdraw;
			}
		}else {
			return balance;
		}
	}
	
}

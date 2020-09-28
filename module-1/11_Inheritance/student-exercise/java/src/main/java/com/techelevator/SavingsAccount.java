package com.techelevator;

public class SavingsAccount extends BankAccount {
	//constructors
	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	}
	@Override
	public int withdraw(int amountToWithdraw) {
		int balance = super.getBalance();
		if(balance-amountToWithdraw<0) {
			return balance;
		}else {
			if(balance-amountToWithdraw<150) {
				amountToWithdraw+=2;
			}
			super.withdraw(amountToWithdraw);
			return super.getBalance();
		}
	}
}

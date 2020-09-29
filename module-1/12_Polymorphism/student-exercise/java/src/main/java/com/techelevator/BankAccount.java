package com.techelevator;

public class BankAccount implements Accountable{
	
	//variables
    private String accountHolderName;
    private String accountNumber;
    private int balance;

    //constructors
    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount(String accountHolder, String accountNumber, int balance) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    //getters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    //methods
    // Update the balance by using the DollarAmount.Plus method
    public int deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        return balance;
    }

    // Update the balance by using the DollarAmount.Minus method
    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        return balance;
    }

    public int transferTo(BankAccount destinationAccount, int transferAmount) {
    	int originalBalance = this.getBalance();
    	this.withdraw(transferAmount);
    	if(originalBalance!=this.getBalance()) {
    		destinationAccount.deposit(transferAmount);
    	}
    	return this.getBalance();
    }
}

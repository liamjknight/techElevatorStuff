package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
	
	//variables
	private String name;
	private String address;
	private String phoneNumber;
	private List<Accountable> accounts = new ArrayList<Accountable>();
	
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Accountable[] getAccounts() {//make sure to read over this
		return this.accounts.toArray(new Accountable[accounts.size()]);
	}
	
	
	//methods
	public void addAccount(Accountable newAccount) {
		this.accounts.add(newAccount);
	}
	
	public boolean isVip() {
		int totalBalance = 0;
		System.out.println("Start");
		for (Accountable balance : accounts) {
			System.out.println("Add this"+balance.getBalance());
			totalBalance+=balance.getBalance();
			System.out.println("Is now this"+totalBalance);
		}
		return (totalBalance>=25000)?true:false;
	}
}

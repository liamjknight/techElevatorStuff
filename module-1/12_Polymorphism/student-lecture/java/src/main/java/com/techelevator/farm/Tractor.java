package com.techelevator.farm;

public class Tractor implements Singable{
	//variables
	private String name;
	private String sound;
	
	
	//getters
	public String getName() {
		return this.name;
	}
	
	public String getSound() {
		return this.sound;
	}
	
	
	//constructor
	public Tractor() {
		this.name="Big Green";
		this.sound="Vroom";
	}
}

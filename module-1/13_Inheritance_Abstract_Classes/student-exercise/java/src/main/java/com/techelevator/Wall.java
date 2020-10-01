package com.techelevator;

abstract class Wall {
	//variables
	private String color;
	private String name;
	
	//getters
	public String getColor() {
		return color;
	}
	public String getName() {
		return name;
	}
	
	//constructor
	public Wall(String name, String color) {
		this.color=color;
		this.name=name;
	}
	
	//methods
	public abstract int getArea();
	
}

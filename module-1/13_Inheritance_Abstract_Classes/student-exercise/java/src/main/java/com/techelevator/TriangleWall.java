package com.techelevator;

public class TriangleWall extends Wall {
	//variables
	private int base;
	private int height;
	
	//getters
	public int getBase() {
		return base;
	}
	public int getHeight() {
		return height;
	}

	//constructors
	public TriangleWall(String name, String color, int base, int height) {
		super(name, color);
		this.base=base;
		this.height=height;
	}

	//methods
	@Override
	public int getArea() {
		return (base*height)/2;
	}
	public String toString() {
		String returnString = String.format("%s (%dx%d) triangle", super.getName(), this.base, this.height);
		return returnString;
	}

}

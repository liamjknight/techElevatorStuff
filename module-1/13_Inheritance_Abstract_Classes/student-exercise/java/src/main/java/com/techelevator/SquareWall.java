package com.techelevator;

public class SquareWall extends RectangleWall {
	//variables
	private int sideLength;
	
	//constructors
	public SquareWall(String name, String color, int sideLength) {
		super(name, color, sideLength, sideLength);
		this.sideLength=sideLength;
	}
	
	//methods
	public String toString() {//none of them are working??
		System.out.println(super.getName()+" ("+sideLength+"x"+sideLength+") square");
		return "duh";
	}
}

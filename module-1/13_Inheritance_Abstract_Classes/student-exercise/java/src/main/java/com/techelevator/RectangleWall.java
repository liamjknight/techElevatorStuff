package com.techelevator;

public class RectangleWall extends Wall {
	private int length;
	private int height;
	
	//getters
	public int getLength() {
		return length;
	}
	public int getHeight() {
		return height;
	}
	
	//constructor
	public RectangleWall(String name, String color, int length, int height) {
		super(name, color);
		this.length=length;
		this.height=height;
	}
	
	//methods
	@Override
	public int getArea() {
		return length*height;
	}
	public String toString() {//why is this returning its reference: com.techelevator.RectangleWall@3d012ddd
		Integer lengthInt=this.length;
		Integer heightInt=this.height;
		String string = (super.getName().toString()+" ("+lengthInt.toString()+"x"+heightInt.toString()+") rectangle");
		return string;
	}
}

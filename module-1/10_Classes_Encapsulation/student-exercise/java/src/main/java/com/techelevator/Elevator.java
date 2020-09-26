package com.techelevator;

public class Elevator {
	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;
	
	
	//getters
	public int getCurrentFloor() {
		return currentFloor;
	}
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public boolean isDoorOpen() {
		return doorOpen;
	}
	
	//constructors
	public Elevator(int numberOfLevels) {
		this.currentFloor=1;
		this.doorOpen=false;
		this.numberOfFloors=numberOfLevels;
	}
	
	
	//methods
	public void openDoor() {
		this.doorOpen = true;
	}
	public void closeDoor() {
		this.doorOpen = false;
	}
	public void goUp(int desiredFloor) {
		if (!this.doorOpen&&(desiredFloor>=this.currentFloor&&desiredFloor<=this.numberOfFloors)) {
			this.currentFloor=desiredFloor;
		} 
	}
	public void goDown(int desiredFloor) {
		if (!this.doorOpen&&(desiredFloor<=this.currentFloor&&desiredFloor>=1)) {
			this.currentFloor=desiredFloor;
		} 
	}
}

package com.techelevator;

public class Airplane {
	private String planeNumber;
	private int totalFirstClassSeats;
	private int bookedFirstClassSeats;
	private int availableFirstClassSeats;
	private int totalCoachSeats;
	private int bookedCoachSeats;
	private int availableCoachSeats;
	
	
	//getters
	public String getPlaneNumber() {
		return planeNumber;
	}
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	public int getAvailableFirstClassSeats() {
		this.availableFirstClassSeats=this.totalFirstClassSeats-this.bookedFirstClassSeats;
		return availableFirstClassSeats;
	}
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}
	public int getAvailableCoachSeats() {
		this.availableCoachSeats=this.totalCoachSeats-this.bookedCoachSeats;
		return availableCoachSeats;
	}
	
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber=planeNumber;
		this.totalCoachSeats=totalCoachSeats;
		this.totalFirstClassSeats=totalFirstClassSeats;
		this.availableCoachSeats=totalCoachSeats;
		this.availableFirstClassSeats=totalFirstClassSeats;
	}
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		System.out.println("first class or not "+forFirstClass+"\n seats requested "+totalNumberOfSeats);
		System.out.println("first class avail "+this.availableFirstClassSeats);
		System.out.println("coach avail "+this.availableCoachSeats);
		System.out.println("-----------------------------------");
		if (forFirstClass) {;
			if(totalNumberOfSeats<=this.availableFirstClassSeats) {
				this.bookedFirstClassSeats+=totalNumberOfSeats;
				System.out.println("1");
				return true;
			}else {
				System.out.println("2");
				return false;
			}
		}else {
			if (totalNumberOfSeats<=this.availableCoachSeats) {
				this.bookedCoachSeats+=totalNumberOfSeats;
				System.out.println("3");
				return true;
			}else {
				System.out.println("4");
				return false;
			}
		}
	}	
}

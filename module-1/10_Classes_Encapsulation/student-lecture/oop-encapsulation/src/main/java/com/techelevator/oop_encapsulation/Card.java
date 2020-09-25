package com.techelevator.oop_encapsulation;

public class Card {
	private int suit;
	private int rank;
	private boolean faceUp;
	
	public Card(int suit, int rank) {
		this.suit=suit;
		this.rank=rank;
		
	}
	public void flip() {
		faceUp=!faceUp;
	}
	//make a getter for our private variables
	public int getSuit() {
		return this.suit;
	}
	public int getRank() {
		return this.rank;
	}
	public boolean isFaceUp() {
		return this.faceUp;
	}
	public String cardString(boolean isFaceUp) {
		String result = "Unknown";
		if (isFaceUp) {
			result="Card: "+getRank()+": "+getRank();
		}else {
			result="##";
		}
		return result;
	}
	public String cardDescript() {
		return "Card is a "+this.rank+" of "+this.suit;
	}
}

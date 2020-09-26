package com.techelevator;

import javax.naming.ldap.StartTlsRequest;

public class FruitTree {
	private int piecesOfFruitLeft;
	private String typeOfFruit;
	
	
	//getters
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}

	public String getTypeOfFruit() {
		return typeOfFruit;
	}


	//constructor
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = startingPiecesOfFruit;
	}
	
	public boolean pickFruit(int numberOfPiecesToRemove) {
		if(numberOfPiecesToRemove<=this.piecesOfFruitLeft) {
			this.piecesOfFruitLeft=this.piecesOfFruitLeft-numberOfPiecesToRemove;
			return true;
		}else {
			return false;
		}
	}
}

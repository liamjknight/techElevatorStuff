package com.techelevator.oop_encapsulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cardList = new ArrayList<Card>();
	
	public Deck(int[] suits, int[] ranks) {
		this(suits, ranks, new Card[] {});//wtf is this doing?
	}
	
	public Deck(int[] suits, int[] ranks, Card[] additionalCards) {
		for(int suit:suits) {
			for(int rank:ranks) {
				cardList.add(new Card(suit,rank));
			}
		}
		for(Card card:additionalCards) {
			cardList.add(card);
		}
	}
	public Card dealOne() {
		if (cardList.size()!=0) {
			return cardList.remove(0);
		}else {
			return null;
		}
	}
	public void shuffle() {
		Collections.shuffle(cardList);
	}
	public String deckString() {
		String returnString = "";
		for(Card card:cardList) {
			//didn't get all the info to finish this one
		}
		return returnString;
	}
}

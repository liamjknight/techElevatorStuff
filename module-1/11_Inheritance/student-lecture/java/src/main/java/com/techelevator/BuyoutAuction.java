package com.techelevator;

import java.text.Bidi;

public class BuyoutAuction extends Auction {
	//private variables
	private int buyoutPrice;
	
	
	
	//getters and setters
	public int getBuyoutPrice() {
		return buyoutPrice;
	}

	public void setBuyoutPrice(int buyoutPrice) {
		this.buyoutPrice = buyoutPrice;
	}
	
	
	//constructors
	public BuyoutAuction(String itemForSale, int buyoutPrice) {
		super(itemForSale);
		this.buyoutPrice=buyoutPrice;
	}
	
	//methods
	@Override
	public boolean placeBid(Bid offeredBid) {
		boolean isCurrentWinningBid=false;
		
		if(getHighBid().getBidAmount()<this.buyoutPrice) {
			if(offeredBid.getBidAmount()>=this.buyoutPrice) {
				offeredBid=new Bid(offeredBid.getBidder(), buyoutPrice);
			}
			isCurrentWinningBid = super.placeBid(offeredBid);
		}
		
		return isCurrentWinningBid;
	}
	
}

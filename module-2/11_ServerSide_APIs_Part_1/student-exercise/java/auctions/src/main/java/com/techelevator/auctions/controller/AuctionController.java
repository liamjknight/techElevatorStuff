package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

@RestController
public class AuctionController {

    private AuctionDAO dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDAO();
    }  
    
    
    @RequestMapping(path="/auctions", method=RequestMethod.POST)
    public Auction createAuction(@RequestBody Auction auction) {
    	return dao.create(auction);
    }
    
    
    @RequestMapping(path="/auctions/{id}", method=RequestMethod.GET)
    public Auction getAuctionByID(@PathVariable int id) {
    	return dao.get(id);
    }
    
    
    @RequestMapping(path="/auctions", method=RequestMethod.GET)
    public List<Auction> filterByTitle(@RequestParam(required = false) String title_like, @RequestParam(required = false) Double currentBid_lte){
    	if(title_like!=null) {
    		if(currentBid_lte!=null) {
    			return dao.searchByTitleAndPrice(title_like, currentBid_lte);//both title and bid are queried
    		}else {
    			return dao.searchByTitle(title_like);
    		}
    	}else if(currentBid_lte!=null) {
    		return dao.searchByPrice(currentBid_lte);
    	}else {
    		return dao.list();
    	}
    }    
}

package com.techelevator.reservations.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.reservations.dao.HotelDAO;
import com.techelevator.reservations.dao.MemoryHotelDAO;
import com.techelevator.reservations.dao.MemoryReservationDAO;
import com.techelevator.reservations.dao.ReservationDAO;
import com.techelevator.reservations.models.Hotel;
import com.techelevator.reservations.models.Reservation;

@RestController
public class HotelController {

    private HotelDAO hotelDAO;
    private ReservationDAO reservationDAO;

    public HotelController() {
        this.hotelDAO = new MemoryHotelDAO();
        this.reservationDAO = new MemoryReservationDAO(hotelDAO);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDAO.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDAO.get(id);
    }

    
    @RequestMapping(path="/reservations", method=RequestMethod.GET)
    public List<Reservation> listReservations(){
    	return reservationDAO.findAll();
    }
    
    
    @RequestMapping(path="/reservations/{id}", method=RequestMethod.GET)
    public Reservation getReservation(@PathVariable int id) {
    	Reservation result = null;
    	
    	try {
    		result = reservationDAO.get(id);
    	}
    	catch(Exception ex) {
    		System.out.printf("Error: %s\n", ex.getLocalizedMessage());
    	}
    	
    	return result;
    }
    
    
    @RequestMapping(path="/hotels/{id}/reservations", method=RequestMethod.GET)
    public List<Reservation> listReservationsByHotel(@PathVariable int id){
    	List<Reservation> result = null;
    	
    	try {
    		result = reservationDAO.findByHotel(id);
    	}
    	catch(Exception ex) {
    		System.out.printf("Error: %s\n", ex.getLocalizedMessage());
    	}
    	
    	return result;
    }
    
    
    @RequestMapping(path="hotels/{id}/reservations", method=RequestMethod.POST)
    public Reservation makeReservation(@RequestBody Reservation newReservation, @PathVariable int id) {
    	Reservation result = null;
    	
    	try {
    		result = reservationDAO.create(newReservation, id);
    	}
    	catch(Exception ex) {
    		System.out.printf("Error: %s\n", ex.getLocalizedMessage());
    	}
    	
    	return result;
    }
    
    
    @RequestMapping(path="/filter", method=RequestMethod.GET)
    public List<Hotel> filterByCityState(@RequestParam String state, @RequestParam(required=false) String city){
    	List<Hotel> filtered = new ArrayList<Hotel>();
    	List<Hotel> notFiltered = hotelDAO.list();
    	
    	for(Hotel hotel : notFiltered) {
    		
    		if(hotel.getAddress().getState().equalsIgnoreCase(state)) {
    			
    			if(city != null) {
    				
    				if(hotel.getAddress().getCity().equalsIgnoreCase(city)) {
    					filtered.add(hotel);
    				}
    				
    			}else {
    				filtered.add(hotel);
    			}
    		}
    	} 	
    	return filtered;
    }
}

package com.techelevator.dao.jdbc;

import com.techelevator.dao.ReservationDAO;
import com.techelevator.model.Reservation;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JDBCReservationDAOTests extends BaseDAOTests {

    private ReservationDAO dao;

    @Before
    public void setup() {
        dao = new JDBCReservationDAO(dataSource);
    }

    @Test
    public void createReservation_Should_ReturnNewReservationId() {
    	long reservationId = -2;
    	String testName = "TEST NAME";
    	
        int reservationCreated = dao.createReservation(1,
                testName,
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(3));
        
        String getResSql = "SELECT reservation_id FROM reservation WHERE name = ?;";
        SqlRowSet idSet = jdbc.queryForRowSet(getResSql, testName);
        
        if(idSet.next()) {
        	reservationId = idSet.getInt("reservation_id");
        	
        }
        			
        assertEquals((int)reservationId, reservationCreated);
    }
    
    @Test
    public void showComingReservationTest() {
    	int parkId = 1;
    	int test1Low = dao.createReservation(1, "test1", LocalDate.now().plusDays(1), LocalDate.now().plusWeeks(1));
    	int test2Hi = dao.createReservation(1, "test2", LocalDate.now().plusDays(30), LocalDate.now().plusDays(40));
    	
    	List<Reservation> actualList = dao.upcomingReservations(parkId);
    	
    	boolean showsLowEdge = false;
    	boolean showsHiEdge = false;
    	for(Reservation res : actualList) {
    		if((int)res.getReservationId() == test1Low) {
    			showsLowEdge = true;
    		}
    		if((int)res.getReservationId() == test2Hi) {
    			showsHiEdge = true;
    		}
    		
    	}
    	
    	assertTrue("Did not show High Edge", showsHiEdge);
    	assertTrue("Did not show Low Edge", showsLowEdge);
    }

}

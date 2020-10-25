package com.techelevator.dao.jdbc;

import com.techelevator.dao.ReservationDAO;
import com.techelevator.model.Reservation;
import com.techelevator.model.Site;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JDBCReservationDAO implements ReservationDAO {

    private JdbcTemplate jdbcTemplate;

    public JDBCReservationDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int createReservation(int siteId, String name, LocalDate fromDate, LocalDate toDate) {
    	long reservationId = -1;
    	String sqlNextId = "(SELECT nextval('reservation_reservation_id_seq') AS nextval);";
        String sqlInsert = "INSERT INTO reservation(site_id, name, from_date, to_date, create_date) " + 
        				  "VALUES(?, ?, CAST(? AS date), CAST(? AS date), now());"; 
        
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sqlNextId);
        jdbcTemplate.update(sqlInsert, siteId, name, fromDate, toDate);
        
        if(rowSet.next()) {
        	reservationId = rowSet.getLong(1) + 1; //has to add 1 since each search iterates the serial up once.
        }
        
       return (int)reservationId;

    }

    @Override
	public List<Reservation> upcomingReservations(int parkId) {
    	List<Reservation> returnList = new ArrayList<Reservation>();
    	LocalDate plus30 = LocalDate.now().plusDays(30);
		String sqlQuery = "SELECT * FROM reservation r INNER JOIN site s ON s.site_id = r.site_id " +
						  "INNER JOIN campground c ON c.campground_id = s.campground_id " +
						  "WHERE from_date > now() AND from_date <= CAST(? AS date) AND c.park_id = ?;";
		
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sqlQuery, plus30, (long)parkId);
		
		while(rowSet.next()) {
			returnList.add(mapRowToReservation(rowSet));
		}
		return returnList;
	}
    
    private Reservation mapRowToReservation(SqlRowSet results) {
        Reservation r = new Reservation();
        r.setReservationId(results.getInt("reservation_id"));
        r.setSiteId(results.getInt("site_id"));
        r.setName(results.getString("name"));
        r.setFromDate(results.getDate("from_date").toLocalDate());
        r.setToDate(results.getDate("to_date").toLocalDate());
        r.setCreateDate(results.getDate("create_date").toLocalDate());
        return r;
    }

	


}

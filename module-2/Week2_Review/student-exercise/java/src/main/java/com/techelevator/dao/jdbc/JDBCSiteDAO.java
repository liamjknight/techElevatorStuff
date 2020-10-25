package com.techelevator.dao.jdbc;

import com.techelevator.dao.SiteDAO;
import com.techelevator.model.Site;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JDBCSiteDAO implements SiteDAO {

    private JdbcTemplate jdbcTemplate;

    public JDBCSiteDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Site> getSitesThatAllowRVs(int parkId) {
        List<Site> returnList = new ArrayList<Site>();
        String sqlQuery = "SELECT s.site_id, s.campground_id, s.site_number, s.max_occupancy, s.accessible, s.max_rv_length, s.utilities FROM site s " +
        				  "INNER JOIN campground c ON c.campground_id = s.campground_id " +
        				  "WHERE c.park_id = 1 AND s.max_rv_length > 0;";
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sqlQuery);
        while(rowSet.next()) {
        	returnList.add(mapRowToSite(rowSet));
        }
        return returnList;
    }
    
    @Override
    public List<Site> returnOpenSites(int parkId){
    	List<Site> returnList = new ArrayList<Site>();
    	String sqlQuery = "SELECT * FROM site s " + 
    					  "INNER JOIN reservation r ON r.site_id = s.site_id " + 
    					  "INNER JOIN campground c ON c.campground_id = s.campground_id " + 
    					  "WHERE NOT(now()>to_date AND now()<from_date) AND c.park_id = ?;";
    	SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sqlQuery, (long)parkId);
    	while(rowSet.next()) {
    		returnList.add(mapRowToSite(rowSet));
    	}
    	return returnList;    	
    }
    
    @Override
    public List<Site> returnOpenSitesInRange(int parkId, String fromDate, String toDate){
    	List<Site> returnList = new ArrayList<Site>();
    	String sqlQuery = "SELECT * FROM site s " + 
    			"INNER JOIN reservation r ON r.site_id = s.site_id " + 
    			"INNER JOIN campground c ON c.campground_id = s. " + 
    			"WHERE CAST(? AS date) NOT BETWEEN(r.from_date AND r.to_date) AND CAST(? AS date) NOT BETWEEN(r.from_date AND r.to_date);";
    	SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sqlQuery, (long)parkId);
    	while(rowSet.next()) {
    		returnList.add(mapRowToSite(rowSet));
    	}
    	return returnList;    	
    }

    private Site mapRowToSite(SqlRowSet results) {
        Site site = new Site();
        site.setSiteId(results.getInt("site_id"));
        site.setCampgroundId(results.getInt("campground_id"));
        site.setSiteNumber(results.getInt("site_number"));
        site.setMaxOccupancy(results.getInt("max_occupancy"));
        site.setAccessible(results.getBoolean("accessible"));
        site.setMaxRvLength(results.getInt("max_rv_length"));
        site.setUtilities(results.getBoolean("utilities"));
        return site;
    }
}

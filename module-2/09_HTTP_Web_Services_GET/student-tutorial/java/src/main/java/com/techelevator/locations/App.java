package com.techelevator.locations;

import java.util.Scanner;

import org.springframework.web.client.RestTemplate;

import com.techelevator.models.Location;
import com.techelevator.services.ConsoleService;
import com.techelevator.services.LocationService;

public class App {

  private static final String API_URL = "http://localhost:3000/locations";

  public static void main(String[] args) {
    int menuSelection = 999;
    

    ConsoleService consoleService = new ConsoleService();
    LocationService locationService = new LocationService("http://localhost:3000/locations/");

    while (menuSelection != 0) {
      menuSelection = consoleService.printMainMenu();
      if (menuSelection == 1) {
        RestTemplate restTemplate = new RestTemplate();
        Location[] locations = restTemplate.getForObject(API_URL, Location[].class);
        consoleService.printLocations(locations);
        
      } else if (menuSelection == 2) {
        

      } else if (menuSelection == 0) {
        // exit
        consoleService.exit();
      } else {
        // defensive programming: anything else is not valid
        System.out.println("Invalid Selection");
      }
    }

  }

}

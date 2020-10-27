package com.techelevator.auction;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

import org.springframework.beans.TypeMismatchException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.techelevator.models.Auction;

public class App {

    private static final String API_URL = "http://localhost:3000/auctions";
    public static RestTemplate restTemplate = new RestTemplate();
    private static Scanner scanner;

    public static void main(String[] args) {
        init();
        run();
    }

    /**
     * Here to support testing
     */
    public static void init() {
        scanner = new Scanner(System.in);
    }

    public static Auction[] listAllAuctions() {
        Auction[] auctionList = restTemplate.getForObject(API_URL, Auction[].class);
        return auctionList;
    }

    public static Auction listDetailsForAuction() {
    	System.out.println("Enter the auction ID you would like to see detailed: ");
        int auctionId = 0;
    	try {
        	auctionId = scanner.nextInt();
        }catch(TypeMismatchException ex) {
        	System.out.println("Did not enter an integer.");
        	return listDetailsForAuction();//recurs to let user retry
        }
        if(auctionId>0&&auctionId<=listAllAuctions().length) {
        	return restTemplate.getForObject(API_URL + "/" + auctionId, Auction.class);
        }else {
        	System.out.println("ID not attributed to any Auction.");
        	return listDetailsForAuction();//recurs to let user retry
        }
    }

    public static Auction[] findAuctionsSearchTitle() {
        System.out.println("Enter text you want to search for: ");
        String searchString = scanner.nextLine();
        try {
        	Auction[] results = restTemplate.getForObject(API_URL + "?title_like=" + searchString, Auction[].class);
        	return results;
        }catch(RestClientException ex) {
        	System.out.printf("Error: %s", ex.getLocalizedMessage());
        	return findAuctionsSearchTitle();
        }
    }

    public static Auction[] findAuctionsSearchPrice() {
    	System.out.println("Enter price you want to search for: ");
        BigDecimal searchAmount = new BigDecimal(scanner.nextLine());
        searchAmount = searchAmount.setScale(2, RoundingMode.CEILING);
        try {
        	Auction[] results = restTemplate.getForObject(API_URL + "?currentBid_lte=" + searchAmount, Auction[].class);
        	return results;
        }catch(RestClientException ex) {
        	System.out.printf("Error: %s", ex.getLocalizedMessage());
        	return findAuctionsSearchTitle();
        }
    }

    private static void run() {
        int menuSelection = 999;

        printGreeting();

        while (menuSelection != 5) {
            try {
                menuSelection = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("Error parsing the input for menu selection.");
            }
            System.out.println("");
            if (menuSelection == 1) {
                printAuctions(listAllAuctions());
            } else if (menuSelection == 2) {
                printAuction(listDetailsForAuction());
            } else if (menuSelection == 3) {
                printAuctions(findAuctionsSearchTitle());
            } else if (menuSelection == 4) {
                printAuctions(findAuctionsSearchPrice());
            } else if (menuSelection == 5) {
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Invalid Selection");
            }
            menuSelection = 999;
            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
            printGreeting();
        }
    }

    private static void printGreeting() {
        System.out.println("");
        System.out.println("Welcome to Online Auctions! Please make a selection: ");
        System.out.println("1: List all auctions");
        System.out.println("2: List details for specific auction");
        System.out.println("3: Find auctions with a specific term in the title");
        System.out.println("4: Find auctions below a specified price");
        System.out.println("5: Exit");
        System.out.println("");
        System.out.print("Please choose an option: ");
    }

    private static void printAuctions(Auction[] auctions) {
        if (auctions != null) {
            System.out.println("--------------------------------------------");
            System.out.println("Auctions");
            System.out.println("--------------------------------------------");
            for (Auction auction : auctions) {
                System.out.println(auction.currentBidToString());
            }
        }
    }

    private static void printAuction(Auction auction) {
        if (auction != null) {
            System.out.println("--------------------------------------------");
            System.out.println("Auction Details");
            System.out.println("--------------------------------------------");
            System.out.println("Id: " + auction.getId());
            System.out.println("Title: " + auction.getTitle());
            System.out.println("Description: " + auction.getDescription());
            System.out.println("User: " + auction.getUser());
            System.out.println("Current Bid: " + auction.getCurrentBid());
            System.out.println("");
        }
    }

}

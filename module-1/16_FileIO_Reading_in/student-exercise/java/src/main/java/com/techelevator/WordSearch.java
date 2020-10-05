package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class WordSearch {
	
	public static void main(String[] args) {
		Scanner consoleIn = new Scanner(System.in);
		File fileToSearch;
		
		//checking if user inputed file exists
		System.out.println("What is the file that should be searched?");
		String file = consoleIn.nextLine();
		fileToSearch = new File(file);
		if(!fileToSearch.exists()) {
			System.out.println("File does not exist");
			System.exit(1);
		}
		if(!fileToSearch.isFile()) {
			System.out.println("Entred URI is not a file");
			System.exit(1);
		}
		
		//getting search phrase
		System.out.println("What is the search word you are looking for?");
		String searchPhrase = consoleIn.nextLine();
		
		//does capitalization matter?
		System.out.println("Should the search be case sensitive? (Y\\N)");
		String caseSense = consoleIn.nextLine().toLowerCase();
			
		
		//searching the document
		try(Scanner fileScanner = new Scanner(fileToSearch)) {
			int lineNum = 0;
			while(fileScanner.hasNextLine()) {
				lineNum++;
				String line = fileScanner.nextLine();
				if(caseSense.equals("y")) {
					if (line.contains(searchPhrase)) {
						System.out.println(lineNum + ") " + line);
					}
				}else {
					if (line.toLowerCase().contains(searchPhrase.toLowerCase())) {
						System.out.println(lineNum + ") " + line);
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Something BAD happened");
		}
	}
	
			
}
		
		
		

	
	
		


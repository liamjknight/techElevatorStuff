package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		//get variables
		System.out.println("What word would you like to replace?");
		String wordToReplace = " "+userInput.nextLine().toLowerCase()+" ";
		System.out.println("What would you like to replace the word with?");
		String replacementWord = " "+userInput.nextLine()+" ";
		
		File userFile = getUserFile();
		
		System.out.println("Enter your file's destination");
		File destinationFile = makeNewFile(userInput.nextLine());
		
		try(Scanner fileScanner = new Scanner(userFile);
				PrintWriter toDestination = new PrintWriter(destinationFile)) {
			
			while(fileScanner.hasNextLine()) {
				String workingLine = fileScanner.nextLine();
				workingLine = workingLine.toLowerCase().replace(wordToReplace, replacementWord);
				toDestination.println(workingLine);
			}
			
		} catch (FileNotFoundException e) {
			System.out.printf("Error: %s", e);
		}
		System.out.println("Complete!");
	}
	public static File getUserFile() {
		System.out.println("-----------------------------");
		System.out.println("Please enter your file's name");
		File returnFile = new File(userInput.nextLine());
		if (returnFile.exists()) {
			if(returnFile.isFile()) {
				return returnFile;
			}else {
				System.out.println("Entry is not a file");
				System.exit(1);
				return getUserFile();
			}
		}else {
			System.out.println("File does not exist");
			System.exit(1);
			return getUserFile();
		}	
	}
	
	public static File makeNewFile(String fileName) {
		File returnFile = new File(fileName);
		if(!returnFile.exists()) {
			try {
				returnFile.createNewFile();
			} catch (IOException e) {
				System.out.printf("Error: %s", e.getLocalizedMessage());
				e.printStackTrace();
			}
		}
		if(returnFile.isDirectory()) {
			System.out.println("The file pointed to is a directory");
			System.exit(1);
		}
		return returnFile;
	}
}

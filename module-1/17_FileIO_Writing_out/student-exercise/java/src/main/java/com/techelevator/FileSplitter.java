package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileSplitter {
	static char fileDelimit = File.separatorChar;
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		File userFile = getUserFile();
		
		System.out.println("How many lines do you want per split file?");
		int linesPerFile = userInput.nextInt();
		//get every ^ lines from userFile
		try(Scanner fileInput = new Scanner(userFile)){
			while(fileInput.hasNextLine()) {
				String stringToBeFile = "";
				for(int i = 0; i < linesPerFile; i++) {
					if(fileInput.hasNextLine()) {
						String lineToConcat = fileInput.nextLine();
						stringToBeFile += (lineToConcat+"\n");
					}
				}
				System.out.println(stringToBeFile);
				System.out.println("---------------------------------------------------");
				
			}
		}catch(FileNotFoundException e) {
			System.out.printf("Error: %s", e.getLocalizedMessage());
		}
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
				return getUserFile();
			}
		}else {
			System.out.println("File does not exist");
			return getUserFile();
		}	
	}
}

package com.techelevator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture {
	public static String sysSeparate = File.separator;

	public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names. 
		 * It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix 
		 * use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a 
		 * file system path
		 *///getting the original file
		/*System.out.println("Please enter file path to inspect");
		String path = userInput.nextLine();
		File userFile = new File(path);
		if(!userFile.exists()) {
			System.out.println("Entry does not exist");
			System.exit(1);
		}
		if(!userFile.isFile()) {
			System.out.println("Entry is not a File");
			System.exit(1);
		}*///directory creation
		System.out.println("What is the name of the directory you want to create?");
		String directory = userInput.nextLine();
		
		File newDirectory = new File(directory);
		
		if(newDirectory.exists()) {
			System.out.println("Directory already exists");
		}else {
			if(newDirectory.mkdir()) {
				System.out.println("It worked! Directory created");
			}else {
				System.out.println("Directory not created");
			}
		}//file creation
		System.out.println("What is the name of the file you want to create");
		String newFile = userInput.nextLine();
		File saveFile = new File(newDirectory+sysSeparate+newFile);
		if(saveFile.createNewFile()) {
			System.out.println("New file created in new directory");
		}else {
			System.out.println("Failed to create new file in new directory");
		}
		//write to new file
		System.out.println("Enter a string to save in your file");
		String message = userInput.nextLine();
		
		try(PrintWriter toNewFile = new PrintWriter(saveFile)){
			toNewFile.println(message);
		}
		System.out.println("Enter a string to save in your file");
		String newMessage = userInput.nextLine();
		
		//again with append data pattern--->this didn't work
		try(PrintWriter appender = new PrintWriter(new FileOutputStream(newFile, true))){
			System.out.println("ayee");
			appender.printf("%S", newMessage);
		}
		//logging object --->for whatever reason this version of append worked
		Logger myLogger = new Logger("log.txt");
		myLogger.log("Woot");
		myLogger.log("Hope this works");
	}
}

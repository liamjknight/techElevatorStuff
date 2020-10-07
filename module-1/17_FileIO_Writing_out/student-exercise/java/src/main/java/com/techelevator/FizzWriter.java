package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) {
		File fizzBuzz = new File("FizzBuzz.txt");
		
			try {
				fizzBuzz.createNewFile();
				System.out.println("FizzBuzz.txt has been created.");
			} catch (IOException e) {
				System.out.printf("Error: %s", e.getLocalizedMessage());
			}
		
		try(PrintWriter printFizzBuzz = new PrintWriter(fizzBuzz)){
			for(int i = 1; i <= 300; i++) {
				String printLine;
				if(i % 15 == 0) {
					printLine="FizzBuzz";
				}else if(i % 5 == 0) {
					printLine = "Buzz";
				}else if(i % 3 == 0) {
					printLine = "Fizz";
				}else {
					printLine = Integer.toString(i);
				}
				printFizzBuzz.println(printLine);
			}
		}catch(FileNotFoundException e) {
			System.out.printf("Error: %s", e.getLocalizedMessage());
		}
	}
}

package com.techelevator.commandLineStudentLecture;
import java.util.Scanner;
public class commandLineApp {

	public static void main(String[] args) {
		
		parrotHelperClass pollyClass = new parrotHelperClass();
		
		Scanner inputScanner = new Scanner(System.in);

		System.out.println("Enter your phrase: ");
		
		String userInput = inputScanner.nextLine();
		
		pollyClass.parrotString(userInput);
		
		System.out.println("----------------------------");
		
		pollyClass.angryParrotString(userInput);
		}
	}



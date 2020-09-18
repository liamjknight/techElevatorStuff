package com.techelevator;
import java.util.Scanner;
public class Fibonacci {
	
	public void fibPrint(int highEnd) {
		int[] fibStart = {0, 1};
		String fibString = "";
		
		if (highEnd<1) {
			System.out.println(fibStart[0]);
		}else if (highEnd==1) {
			System.out.println(fibStart[0]+", "+fibStart[1]);
		}else {
			int holdCurrentNum;
			int currentNum = 1;
			Integer previousNum = 0;
			do {
				fibString = fibString + previousNum.toString() + ", ";
				holdCurrentNum = currentNum;
				currentNum += previousNum;
				previousNum = holdCurrentNum;
			} while (previousNum<=highEnd);
		}
		System.out.println(fibString);
	}

	public static void main(String[] args) {
		Fibonacci fibbing = new Fibonacci();
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter the Fibonacci number: ");
		
		String highEndString = userInput.nextLine();
		int highEndInt = Integer.parseInt(highEndString);
		
		fibbing.fibPrint(highEndInt);
		
	
	}

}

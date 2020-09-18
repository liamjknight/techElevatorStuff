package com.techelevator;

import java.util.Scanner;

public class LinearConvert {
	public void conversionMethod(int length, String type) {
		if (type=="m") {
			int toFeet = (int)(length * 3.2808399);
			System.out.println(toFeet);
		}else if (type=="f") {
			int toMeters = (int)(length * 0.3048);
			System.out.println(toMeters);
		}
	}

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		LinearConvert convert = new LinearConvert();
		
		System.out.println("Please enter the length: ");
		int length = Integer.parseInt(userInput.nextLine());
		System.out.println("Is the measurement in (m)eter, or (f)eet?");
		String type = userInput.nextLine();
		convert.conversionMethod(length, type);
	}

}

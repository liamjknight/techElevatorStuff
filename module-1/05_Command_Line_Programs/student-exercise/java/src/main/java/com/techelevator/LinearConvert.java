package com.techelevator;
import java.util.Scanner;

public class LinearConvert {

	public void meterFeetConversion(double length, String type) {
		if (type=="m") {//toFeet
			double toFeet = (length * 3.2808399);
			int toFeetFinal = (int)toFeet;
			System.out.println(toFeetFinal);
		}else if (type=="f") {//toMeters
			double toMeters = (length * 0.3048);
			int toMetersFinal = (int)toMeters;
			System.out.println(toMetersFinal);
		}
		
		
	}
	
	public static void main(String[] args) {
		//bringing in classes
		Scanner userInput = new Scanner(System.in);
		LinearConvert conversionTime = new LinearConvert();
		//getting length variable
		System.out.println("What's the length?");
		int length = Integer.parseInt(userInput.nextLine());
		System.out.println(length);
		//getting type variable
		System.out.println("Feet or Meters?");
		String type = userInput.nextLine();
		System.out.println(type);
		
		conversionTime.meterFeetConversion(length, type);//running method
	}

}

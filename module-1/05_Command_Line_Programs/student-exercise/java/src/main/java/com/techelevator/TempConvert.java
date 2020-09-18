package com.techelevator;
import java.util.Scanner;

public class TempConvert {
	public void tempConvert(double temp, String type) {
		
		if (type == "C") {
			double fahrenheit = 0.0D;
			fahrenheit = temp * 1.8D + 32;
			System.out.println(temp+"C is "+fahrenheit+"F");
		}else {
			double celcius = 0.0D;
			celcius = (temp - 32) / 1.8D;
			System.out.println(temp+"F is "+celcius+"C");
		}
		
	}

	public static void main(String[] args) {
		Scanner userInputScanner = new Scanner(System.in);
		TempConvert conversion = new TempConvert();//bringing methods into executable
		
		System.out.println("Please enter the temperature: ");//taking temp input
		
		String tempString = userInputScanner.nextLine();//saves their temp
		
		int temp = Integer.parseInt(tempString);//convert string to int
		
		System.out.println("Is the temperature in (C)elcius of (F)ahrenheit: ");
		
		String typeString = userInputScanner.nextLine();//tells us which conversion to run
		
		conversion.tempConvert(temp, typeString);
			
	}
		
		
}

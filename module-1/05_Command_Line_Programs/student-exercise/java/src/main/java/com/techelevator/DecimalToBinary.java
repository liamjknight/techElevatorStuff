package com.techelevator;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter in a series of decimal values (separated by spaces): ");
		
		String toConvert = userInput.nextLine();
		String[] toConvertArray = toConvert.split(" ");
		for (int i = 0; i < toConvertArray.length; i++) {
			 int convertToInt = Integer.parseInt(toConvertArray[i]);
			 String convertToBin = Integer.toBinaryString(convertToInt);
			 System.out.println(convertToInt+" in binary is "+convertToBin);
		}
	}

}

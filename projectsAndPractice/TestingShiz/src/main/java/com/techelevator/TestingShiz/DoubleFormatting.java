package com.techelevator.TestingShiz;

import java.text.NumberFormat;

public class DoubleFormatting {
	public static void main(String args[]) {
		double simple = 4.0999; 
		double round = 4.0009; 
		NumberFormat nf = NumberFormat.getInstance(); 
		nf.setMaximumFractionDigits(2); 
		System.out.println(nf.format(simple)); // prints 4.01 
		System.out.println(nf.format(round)); // prints 5
		
	}
}

package com.techelevator.commandLineStudentLecture;
import java.util.Scanner;
public class parrotHelperClass {
	public void parrotString(String english) {
		String response;
		response = "Squack " + english + "!";
		System.out.println(response);
	}
	public void angryParrotString(String english) {
		String[] response;
		response = english.split(" ");
		
		for (int i = 0; i < response.length; i++) {
			System.out.println(response[i]);
		}
	}
}

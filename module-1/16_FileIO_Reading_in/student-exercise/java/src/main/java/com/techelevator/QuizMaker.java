package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.Scanner;

public class QuizMaker {
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
		
		File testFile = getFile();
		int totalQuestions = 0;
		int totalAnsweredCorrectly = 0;
		
		try(Scanner testScanner = new Scanner(testFile)){
			
			while(testScanner.hasNextLine()) {
				//takes each line and creates question
				totalQuestions++;
				String inputString = testScanner.nextLine();
				String inputSplit[] = inputString.split("\\|");//[|] needed or else the split happens each char
				int correctAnswer=0;
				for(int i = 0; i < inputSplit.length; i++) {
		
					if(inputSplit[i].contains("*")) {
						correctAnswer = i;
						inputSplit[i] = inputSplit[i].replace("*", "");
					}
					
					if(i>0)	{
						System.out.println(i+") "+inputSplit[i]);
					}else {
						System.out.println(inputSplit[i]);
					}
				}//request answer
				System.out.println("Please enter the *number* that corrosponds to your answer");
				int answer = Integer.parseInt(userInput.nextLine());
				if(answer == correctAnswer) {
					totalAnsweredCorrectly++;
					System.out.println("Your answer "+answer+" is correct!");
				}else {
					System.out.println("Your answer "+answer+" is incorrect.");
				}
			}
			testScanner.close();
			System.out.printf("You got %d answer(s) correct out of the total %d questions asked.", totalAnsweredCorrectly, totalQuestions);
		}

	}
	
	
	private static File getFile() {
		System.out.println("Enter the quiz file");
		File testFile = new File(userInput.nextLine());
		if(!testFile.exists()) {
			System.out.println("File does not exist");
			System.exit(1);
		}
		if(!testFile.isFile()) {
			System.out.println("Entred URI is not a file");
			System.exit(1);
		}
		return testFile;
	}
}

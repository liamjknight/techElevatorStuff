package com.techelevator;

public class HomeworkAssignment {
	
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;
	//getters and setters
	public int getEarnedMarks() {
		return this.earnedMarks;
	}
	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks=earnedMarks;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	public String getSubmitterName() {
		return submitterName;
	}
	public String getLetterGrade() {
		double studentGrade=earnedMarks-(earnedMarks/possibleMarks);
		System.out.println(this.earnedMarks+", "+this.possibleMarks);
		System.out.println(studentGrade);
		if(studentGrade>=90) {
			this.letterGrade="A";
		}else if(studentGrade<90&&studentGrade>=80) {
			this.letterGrade="B";
		}else if(studentGrade<80&&studentGrade>=70) {
			this.letterGrade="C";
		}else if(studentGrade<70&&studentGrade>=60) {
			this.letterGrade="D";
		}else {
			this.letterGrade="F";
		}
		System.out.println(this.letterGrade);
		return letterGrade;
	}
	//constructor
	public HomeworkAssignment(int possibleMarks, String submitterName) {
		this.possibleMarks=possibleMarks;
		this.submitterName=submitterName;
	}

}

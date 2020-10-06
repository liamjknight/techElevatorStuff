package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Logger {
	private File logFile;
	
	public String getLogPath() {
		return logFile.getAbsolutePath();
	}
	
	public Logger() {
		
	}
	
	public Logger(String logFile) {
		this.logFile = new File(logFile);
	}
	
	//public Logger(String logFile, String Message) {}
	
	public void log(String message) throws FileNotFoundException {
		try(PrintWriter logWriter = new PrintWriter(new FileOutputStream(logFile, true))){
			logWriter.println(message);
		}
	}
}

package com.techelevator;

public class Television {
	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2;
	
	//getters
	public boolean isOn() {
		return isOn;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	
	
	//methods 
	public void turnOff() {
		this.isOn=false;
	}
	public void turnOn() {
		this.isOn=true;
	}
	public void changeChannel(int newChannel) {
		if ((newChannel<=18&&newChannel>=3)&&this.isOn) {
			this.currentChannel=newChannel;
		}
	}
	public void channelUp() {
		if (this.isOn) {
			this.currentChannel++;
		}
		if(this.currentChannel>18) {
			this.currentChannel=3;
		}
	}
	public void channelDown() {
		if (this.isOn) {
			this.currentChannel--;
		}
		if(this.currentChannel<3) {
			this.currentChannel=18;
		}
	}
	public void raiseVolume() {
		if (this.isOn&&this.currentVolume<10) {
			this.currentVolume++;
		}
	}
	public void lowerVolume() {
		if (this.isOn&&this.currentVolume>0) {
			this.currentVolume--;
		}
	}
}

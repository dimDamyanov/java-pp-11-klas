package unit14;

import java.util.Date;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;
	
	Time() {
		this(new Date().getTime());
	}
	
	Time(long milliseconds) {
		this.seconds = (int) ((milliseconds/1000) % 60);
		this.minutes = (int) ((milliseconds/(60*1000)) % 60);
		this.hours = (int) ((milliseconds/(60*60*1000)) % 24);
		
		
	}
	
	Time(int newHours, int newMinutes, int newSeconds) {
		this.hours = newHours;
		this.minutes = newMinutes;
		this.seconds = newSeconds;
	}
	
	public void setTime(long elapseTime) {
		this.seconds = (int) ((elapseTime/1000) % 60);
		this.minutes = (int) ((elapseTime/(60*1000)) % 60);
		this.hours = (int) ((elapseTime/(60*60*1000)) % 24);
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}
	
	@Override
	public String toString() {
		return String.format("%d:%d:%d", this.hours, this.minutes, this.seconds);
	}
}

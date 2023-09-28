package interfacesActivity;

public class Time implements Comparable<Time>, Calculable<Time>{
	
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		this.hour = (hour + (minute / 60)) % 24;
		this.minute = (minute + (second / 60)) % 60;
		this.second = (second) % 60;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public int getSeconds() {
		return this.second;
	}
	
	//deep copy 
	public Time(Time o) {
		
	}
	
	public Time add(Time o) {
		return null;
	}

	public Time subtract(Time o) {
		return null;
	}

	public int compareTo(Time o) {
		return 1;
	}
	
	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}

}

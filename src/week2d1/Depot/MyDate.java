package week2d1.Depot;

public class MyDate {
	private int year;
	private int month;
	private int day;
	private int hour;
	private int monute;
	
	public MyDate(int year, int month, int day, int hour, int monute) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.monute = monute;
	}

	public int getDay() {
		return day;
	}
	public int getHour() {
		return hour;
	}
	public int getMonth() {
		return month;
	}
	public int getMonute() {
		return monute;
	}
	public int getYear() {
		return year;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setMonute(int monute) {
		this.monute = monute;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}

package week1d2.sudentAndSubject;

public class Subject {
	public String name;
	public int hours;
	
	Subject(String name, int hours){
		this.name = name;
		this.hours = hours;
	}
	
	public String getSubjectInfo (){
		return String.format("Subject: %s, hours: %s", name, hours);
	}
}

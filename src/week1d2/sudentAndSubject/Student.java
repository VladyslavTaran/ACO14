package week1d2.sudentAndSubject;

public class Student {
	public String name;
	public Address address;
	public StudentSubjects subjects;
	public Faculty faculty;
	
	Student(String name, String city, String street, int houseNumber){
		this.name = name;
		address.city = city;
		address.street = street;
		address.houseNumber = houseNumber;
	}
	
	Student(String name, Address address){
		this.name = name;
		this.address = address;
	}
	
	public void study(String subjName, int hours){
		StudentSubject subj;
		subj = subjects.getStudentSubjectByName(subjName);
		if (subj != null){
			subj.usedHours += hours;
		}
	}
	
	public void addSubject(String subjName){
		Subject subj;
		subj = faculty.getSubjectByName(subjName);
		if (subj != null) subjects.add(new StudentSubject(subj));
	}
	
	public boolean passExam(StudentSubject studentSubject){
		if ((studentSubject.usedHours*100/studentSubject.subject.hours)>=80) return true;
		return false;
	}
	
	public double getAverageMark(){
		int sum = 0;
		for (StudentSubject subj : subjects.subjects){
			sum += subj.mark;
		}
		return sum/subjects.subjects.size();
	}
}

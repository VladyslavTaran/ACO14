package week1d2.sudentAndSubject;

public class StudentSubject {
	Subject subject;
	int mark = -1;
	int usedHours = -1;

	StudentSubject(Subject subject) {
		this.subject = subject;
	}
	
	public int getMarkOnSubject(){
		return mark;
	}
}

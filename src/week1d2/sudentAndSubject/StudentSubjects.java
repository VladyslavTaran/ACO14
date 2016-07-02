package week1d2.sudentAndSubject;

import java.util.ArrayList;
import java.util.List;

public class StudentSubjects {
	List<StudentSubject> subjects = new ArrayList<>();
	static int counter;
	public int amount;
	
	public void add(StudentSubject studentSubject){
		subjects.add(counter, studentSubject);
		counter++;
		amount = counter;
	}
	
	public StudentSubject getStudentSubjectByName(String subjName){
		for (StudentSubject subj : subjects){
			if (subj.subject.name.contains(subjName)){
				return subj;
			}
		}
		return null;
	}
	
	public String getAllSubjectsInfo(){
		String res=null;
		for (StudentSubject stSubj: subjects){
			res += String.format("%s/n", stSubj.subject.getSubjectInfo());
		}
		return res;
	}
}

package week1d2.sudentAndSubject;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
	List<Subject> subjects;
	List<Student> students;
	static int count;
	public int subjectsCount;
	static int stdcount;
	public int studentsCount;
	
	Faculty() {
		subjects = new ArrayList<>();
		students = new ArrayList<>();
	}
	
	public void addSubject(Subject subject){
		subjects.add(count, subject);
		count++;
		subjectsCount = count;
	}
	
	public Subject getSubjectByName(String subjName){
		for (Subject subj : subjects){
			if (subj.name.contains(subjName)){
				return subj;
			}
		}
		return null;
	}
	
	public void addStudent(Student student){
		student.faculty = this;
		students.add(stdcount, student);
		stdcount++;
		studentsCount = stdcount;
	}
}

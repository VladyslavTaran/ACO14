package week1d2.sudentAndSubject.tests;

import week1d2.sudentAndSubject.Faculty;

public class TestFaculty {
	public static boolean testAddSubject(Faculty faculty, int expectedAmount){
		return (faculty.subjectsCount == expectedAmount);
	}
	
	public static boolean testGetSubjectByName(Faculty faculty, String subjName){
		return (faculty.getSubjectByName(subjName).name.equals(subjName));
	}
	
	public static boolean testAddStudent(Faculty faculty, int expectedAmount){
		return (faculty.studentsCount == expectedAmount);
	}
}

package week1d2.sudentAndSubject;

import week1d2.sudentAndSubject.tests.TestFaculty;

public class Test {

	public static void main(String[] args) {
		Faculty faculty = new Faculty();
		
		Subject subj1 = new Subject("Math", 120);
		Subject subj2 = new Subject("Phisics", 90);
		Subject subj3 = new Subject("Astronomy", 70);
		Subject subj4 = new Subject("Philosophy", 50);
		
		faculty.addSubject(subj1);
		faculty.addSubject(subj2);
		faculty.addSubject(subj3);
		faculty.addSubject(subj4);
		
		//test Faculty methods
		System.out.println("Test Faculty.addSubject: " + TestFaculty.testAddSubject(faculty, 4));
		System.out.println("Test Faculty.getSubjectByName: " + TestFaculty.testGetSubjectByName(faculty, "Math"));
		
		Student stud1 = new Student("Kolia", new Address("Kyiv", "Dontsia", 23));
		Student stud2 = new Student("Petia", new Address("Kyiv", "Lepse", 12));
		Student stud3 = new Student("Sveta", new Address("Kharkov", "Sumskoyi", 35));
		
		faculty.addStudent(stud1);
		faculty.addStudent(stud2);
		faculty.addStudent(stud3);
		
		System.out.println("Test Faculty.addStudent: " + TestFaculty.testAddStudent(stud1.faculty, 3));
		
		/*stud1.addSubject("Math");
		stud1.addSubject("Astronomy");
		stud1.addSubject("Phisics");
		stud1.subjects.getAllSubjectsInfo();
		
		stud2.addSubject("Math");
		stud2.addSubject("Philosophy");
		stud2.subjects.getAllSubjectsInfo();
		
		stud3.addSubject("Astronomy");
		stud3.addSubject("Philosophy");
		//stud3.subjects.getAllSubjectsInfo();*/
	}

}

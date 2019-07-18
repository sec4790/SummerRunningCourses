package summer2019CPSC4360.application;

import java.util.*;

public class StudentSchedule extends ScheduleSystem {
	
	Student student;
	int studentID;
	Course course;
	static List<Course> previousCourses;
	static List<Course> currentCourses;
	static List<Course> coursesNeeded;
	static List<Course> degreeProgram;
	
	StudentSchedule(){
		
	}
	
	StudentSchedule(Student student, int studentID){
		this.student = student;
		this.studentID = studentID;
		this.currentCourses = new ArrayList<Course>();
		this.coursesNeeded = new ArrayList<Course>();
		this.degreeProgram = new ArrayList<Course>();
		this.previousCourses = new ArrayList<Course>();
	}
	
	/********Getters and setter****************************/
	public static void setDegreeProgram(Course c){
		degreeProgram.add(c);
		
	}
	
	public static void setPreviousCourses(Course c) {
		previousCourses.add(c);
	}
	
	public static List<Course> getPreviousCourses(){
		return previousCourses;
	}
	
	public List<Course> getDegreeProgram() {
		return degreeProgram;
	}

/****************Display methods***************/	
	public static void displayPreviousCourses() { 
		for(Course c : previousCourses) {
			System.out.println(c);
		}
		
	}
	
	public static void displayCurrentCourses() {
		for(Course c : currentCourses) {
			System.out.println(c);
		}
	}
	
	public static void displayDegreeProgram() {
		for(Course c : degreeProgram) {
			System.out.println(c);
		}
	}

	public static void displayNeededCourses() {
		
		for(int i = 0; i < degreeProgram.size(); i++) {
			coursesNeeded.add(degreeProgram.remove(i));
		}
		for(Course c : coursesNeeded) {
			System.out.println(c);
		}
		
	}
	/*****************************************/

	/**
	 * Might need some enrollment methods?
	 */
	
	/**********Testing*************************/
	public static void main(String[] args) {
		
		StudentSchedule stu = new StudentSchedule(new Student(20446907), 20446907);
		
		Course course1 = new Course("Math", 123);
		Course course2 = new Course("Science", 456);
		Course course3 = new Course("Literature", 789);
		
		//List<Course> degreeProgram = new ArrayList<>();
		stu.setDegreeProgram(course1);
		stu.setDegreeProgram(course2);
		stu.setDegreeProgram(course3);
		
		stu.setPreviousCourses(course1);
		
		System.out.println("This are the classes I need in all\n");
		stu.displayDegreeProgram();
		System.out.println("\nThis is the classes I've already taken\n");
		stu.displayPreviousCourses();
		
		System.out.println("\nSo these are the classes I need to graduate\n");
		stu.displayNeededCourses();
		
	}

	
	

}

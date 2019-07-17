package summer2019CPSC4360.application;

import java.util.*;

public class StudentSchedule extends ScheduleSystem{
	
	Student student;
	Course course;
	static List<Course> previousCourses;
	static List<Course> currentCourses;
	static List<Course> coursesNeeded;
	
	StudentSchedule(){
		
	}
	
	StudentSchedule(Student student){
		this.student = student;
	}
	
	/****Need a way to compare all courses taken with courses needed***
	 *
	 *
	 *
	 *
	 *
	 */
	
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
	
	public static void displayNeededCourses() {
		for(Course c : coursesNeeded) {
			System.out.println(c);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		Course course = new Course(1234, "CPSC4360", "section2", "Andrei");
	
		previousCourses = new ArrayList<>();
		previousCourses.add(course);
		displayPreviousCourses();
		
	}

	
	

}

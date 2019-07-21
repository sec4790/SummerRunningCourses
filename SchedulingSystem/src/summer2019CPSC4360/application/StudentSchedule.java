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
	
	public static List<Course> getNeededCourses(){
		for(int i = 0; i < degreeProgram.size(); i++)
			coursesNeeded = (List<Course>) degreeProgram.remove(i);
		return coursesNeeded;
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
		
		degreeProgram.removeAll(previousCourses);
		System.out.println(degreeProgram);

	}
	
	/**
	 * Enroll in class
	 * @param course
	 */
	
	public static void addCourseToSchedule(Course course) {
		while(!currentCourses.contains(course)) { //as long as it's not already on their schedule
			//add to current schedule
			currentCourses.add(course);
			//remove the course from courses needed
			coursesNeeded.remove(course);
			}

	}
	
	

}

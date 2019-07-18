package summer2019CPSC4360.application;

import java.util.*;

public class InstructorSchedule extends ScheduleSystem{
	
	Instructor instructor;
	Course course;
	List<Course> coursesTaught;
	List<Course> coursesTeaching;
	List<Course> coursesOffered;
	
	InstructorSchedule(){
		
	}
	
	InstructorSchedule(Instructor instructor){
		this.instructor = instructor;
		this.course = course;
		this.coursesTaught = new ArrayList<Course>();
		this.coursesTeaching = new ArrayList<Course>();
		this.coursesOffered = new ArrayList<Course>();
	}
	
	/****Offer to teach a course**************/
	public void offerCourse(Course c) { //set course
		if(isValidated(c)) {
			coursesTeaching.add(c);
		}
		else
			System.out.println("Not validated. Speak to administrator");
	}
	
	/*****Display schedule methods************/
	
	//display what teacher has taught
	public void displayCoursesTaught() {
		for(Course c: coursesTaught) {
			System.out.println(c);
		}
		
	}
	
	//display what teacher is validated to teach
	public void displayCoursesTeaching() {
		for(Course c: coursesTeaching) {
			System.out.println(c);
		}
	}
	
	//display what classes teacher is offering but is still awaiting validation
	public void displayCoursesOffered() {
		for(Course c: coursesOffered) {
			System.out.println(c);
		}
	}
	
	public boolean isValidated(Course c) {
		Administrator admin = new Administrator();
	}
	
	//display a certain student's current or past schedule
	
	public void displayStudentSchedule(Student student) {
		
	}
	
	/*****************************************/
	
	
	public static void main(String[] args) {
		
		
		
	}

}

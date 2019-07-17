package summer2019CPSC4360.application;

import java.util.List;

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
	}
	
	/****Offer to teach a course**************/
	public void offerCourse(int CRN) {
		//offer to run a course, which needs to be validated by the Administrator
		
		//If Administrator validates, add to ScheduleSystem
		//else print("Not validated") and do nothing
	}
	
	/*****Display schedule methods************/
	
	//display what teacher has taught
	public void displayCoursesTaught() {
		
	}
	
	//display what teacher is validated to teach
	public void displayCoursesTeaching() {
		
	}
	
	//display what classes teacher is offering but is still awaiting validation
	public void displayCoursesOffered() {
		
	}
	
	//display a certain student's current or past schedule
	
	public void displayStudentSchedule(Student student) {
		
	}
	
	/*****************************************/
	
	
	public static void main(String[] args) {
		
		InstructorSchedule sched = new InstructorSchedule("Andrei");
		
	}

}

package summer2019CPSC4360.application;

import java.util.*;

public class InstructorSchedule extends ScheduleSystem{
	
	Instructor instructor;
	Course course;
	StudentSchedule studentSchedule;
	static List<Course> coursesTaught;
	static List<Course> coursesTeaching;
	static List<Course> coursesOffered;
	
	InstructorSchedule(){
		
	}
	
	InstructorSchedule(Instructor instructor){
		this.instructor = instructor;
		this.course = course;
		this.coursesTaught = new ArrayList<Course>();
		this.coursesTeaching = new ArrayList<Course>();
		this.coursesOffered = new ArrayList<Course>();
		this.studentSchedule = new StudentSchedule();
	}
	
	/**
	 * Getters and setters
	 * 
	 * 
	 */
	
	public static void setCoursesTaught(Course c) {
		coursesTaught.add(c);
	}
	
	public static void setCoursesTeaching(Course c) {
		coursesTeaching.add(c);
	}
	
	public static void setCoursesOferred(Course c) {
		coursesOffered.add(c);
	}
	
	public static List<Course> getCoursesTaught(){
		return coursesTaught;
	}
	
	public static List<Course> getCoursesTeaching(){
		//if they've gone through the validation process
		return coursesTeaching;
	}
	
	public static List<Course> getCoursesOffered(){
		return coursesOffered; //still awaiting validation
	}
	
	
	/**
	 * 
	 * Display methods
	 * 
	 * **/
	
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
	/** Under construction
	 * 
	public boolean isValidated(Course c) {
		Administrator admin = new Administrator();
	}
	*/
	
	//display a certain student's current or past schedule
	
	public void displayStudentCurrentSchedule(StudentSchedule studentScheduleContructorParameters) {
		StudentSchedule.displayCurrentCourses();
	}
	
	public void displayStudentPreviousSchedule(StudentSchedule studentScheduleContructorParameters) {
		StudentSchedule.displayPreviousCourses();
	}
	
	
	
	public static void main(String[] args) {
		
		/**
		 * 
		 * Testing
		 *
		InstructorSchedule instructor = new InstructorSchedule(new Instructor("Stefan Andrei", "L20446907"));
		
		StudentSchedule stu = new StudentSchedule(new Student("Joe Smith", 20446907), 20446907);Course course1 = new Course("Math", 101);
		Course course2 = new Course("Biology", 102);
		Course course3 = new Course("Programming", 103);
		Course course4 = new Course("Literature", 104);
		
		stu.addCourseToSchedule(course2);
		
		instructor.displayStudentCurrentSchedule(stu);
		*/
		
		
		
		
	}

}

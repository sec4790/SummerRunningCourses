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
	
	public static void main(String[] args) {
		/**
		 * 
		 * Testing
		 *
		StudentSchedule stu = new StudentSchedule(new Student("Joe Smith", 20446907), 20446907);
	
		Course course1 = new Course("Math", 101);
		Course course2 = new Course("Biology", 102);
		Course course3 = new Course("Programming", 103);
		Course course4 = new Course("Literature", 104);
		
		System.out.println("These are the classes needed for graduation");
		setDegreeProgram(course1);
		setDegreeProgram(course2);
		setDegreeProgram(course3);
		setDegreeProgram(course4);
		displayDegreeProgram();
		
		System.out.println("The student has already taken:");
		setPreviousCourses(course1);
		displayPreviousCourses();
		
		System.out.println("That means the student still needs to take: ");
		displayNeededCourses();
		
		System.out.println("The student wants to add " + course2 + " to his/her schedule");
		System.out.println("The student's current schedule is: ");
		displayCurrentCourses();
		System.out.println("Now let's add that class, so the student's schedule is now...");
		addCourseToSchedule(course2);
		displayCurrentCourses();
		*/
		
	}

	
	

}

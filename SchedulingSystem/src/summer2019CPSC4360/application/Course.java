package summer2019CPSC4360.application;

import java.util.*;
import java.util.Set;

public class Course {
	
	public String CRN;
	private String name;
	private String section;
	private Instructor instructor;
	private boolean isFull;
	private static int maxStudents = 20;
	private Set daysOfWeek;
	private Set timeOfDay;
	static int numOfStudents = 0;
	private static int numberComputersInRoom = 10;
	protected static ArrayList<Student> roster;
	String theseTimes = "hours";
	String theseDays = "days of the week";
	public static ArrayList<Course> courses;
	
	
	public Course() {
		
	}
	
	public Course(String courseCRN, String courseName, String courseSection, Instructor instructor) {
		this.CRN = courseCRN;
		this.name = courseName;
		this.section = courseSection;
		this.instructor = instructor;
		this.roster= new ArrayList<Student>();
	}
	
	public Course(String name, String courseCRN) {
		this.CRN = courseCRN;
		this.name = name;
		this.maxStudents = maxStudents;
		this.roster= new ArrayList<Student>();
		toString();
	}
	


	/**********Getters and setters***************/
	
	public void setCRN(String CRN) {
		this.CRN = CRN;
	}
	
	public void setCourseName(String name) {
		this.name = name;
	}
	
	public void setSection(String section) {
		this.section = section;
	}
	
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	public String getCRN() {
		return CRN;
	}
	
	public String getCourseName() {
		return name;
	}
	
	public String getSection() {
		return section;
	}
	
	public Instructor getInstructor() {
		return instructor;
	}
	
	public int getCourseCapacity() {
		return maxStudents;
	}
	
	public ArrayList<Student> getRoster(){
		return roster;
	}
	
	public static int getRosterSize(Course course) {
		return roster.size();
		
	}
	/**
	 * Display the students in this course
	 */
	public void displayRoster() {
		for(Student s : roster) {
			System.out.println(s);
		}
	}
	
	/**
	 * Is the class full?
	 * 
	 * */
	public static boolean isFull(Course course) {
		
		if(getRosterSize(course) >= maxStudents) {
			return true;
		}
		return false;
		
	}
	/***********************************************/
	
	/***
	 * 
	 * Are there enough computers per student?
	 * @return
	 */
	public static boolean meetComputerStandards(Course course) {
		if(getRosterSize(course) <= numberComputersInRoom) {
			return true;
		}
		return false;
	}
	
	/**
	 * we can add student to roster IF
	 * the class is not full
	 * and there are enough computers for each student
	 * @param student
	 */
	public static void addStudentToRoster(Student student, Course course) {
	
		if(!isFull(course) && meetComputerStandards(course))
			roster.add(student);
		else
			System.out.println("Cannot add student to class. Please see administrator for details");
		
	}
	
	public String toString() {
		return getCourseName();
	}
	
	
}
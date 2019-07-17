package summer2019CPSC4360.application;

import java.util.ArrayList;
import java.util.Set;

public class Course {
	
	public int CRN;
	private String name;
	private String section;
	private Instructor instructor;
	private boolean isFull;
	private int maxStudents = 25;
	private Set daysOfWeek;
	private Set timeOfDay;
	static int currentStudents = 0;
	private int numberComputersInRoom = 10;
	private static ArrayList<Student> students;
	String theseTimes = "hours";
	String theseDays = "days of the week";
	
	
	public Course() {
		this.CRN = 12345;
		this.name = "Name_Of_Course";
		this.section = "Section";
		this.instructor = null;
		this.isFull = false;
		this.maxStudents = 50;
		toString();
	}
	
	public Course(int courseCRN, String courseName, String courseSection, Instructor instructor) {
		this.CRN = courseCRN;
		this.name = courseName;
		this.section = courseSection;
		this.instructor = instructor;
		//this.isFull = courseIsFull;
		//this.maxStudents = courseMaxStudents;
	}
	
	/**********Getters and setters***************/
	
	public void setCRN(int CRN) {
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
	
	public int getCRN() {
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
	
	/************************************************/
	
	public void addStudent(Student studentID) {
		if(fullClass(CRN) == true) {
			System.out.println("Cannot add student. class is full");
		}
		else
			students.add(studentID);
			currentStudents ++;
	}
	
	
	public boolean fullClass(int CRN) {
		
		if(currentStudents >= maxStudents || currentStudents >= numberComputersInRoom) 
			return true;
	
		else
			return false;
		
	}
	
	public String toString() {
		return "Course name : " + getCourseName() + " is taught by " + getInstructor() + " at " + theseTimes + " on " + theseDays;
	}
	

	public static void main(String[] args) {
		
		/**Messing something up*/
		
		Course course = new Course(1234, "CPSC4360", "section2", "Andrei");
		
		System.out.println(course);
		
	}
	
}

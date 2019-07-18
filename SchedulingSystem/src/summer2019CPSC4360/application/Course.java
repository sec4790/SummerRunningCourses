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
	static int numOfStudents = 0;
	private int numberComputersInRoom = 10;
	private static ArrayList<Student> roster;
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
		this.roster= new ArrayList<Student>();
	}
	
	public Course(String name, int courseCRN) {
		this.CRN = courseCRN;
		this.name = name;
		this.isFull = isFull;
		this.maxStudents = maxStudents;
		toString();
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
	
	public int getCourseCapacity() {
		return maxStudents;
	}
	
	public ArrayList<Student> getRoster(){
		return roster;
	}
	
	/************************************************/
	
	/*****Is the class full?************************/
	public boolean isFull() {
		
		if(roster.size() == maxStudents) {
			return true;
		}
		return false;
		
	}
	/***********************************************/
	
	/******************************************
	 * Are there enough computers per student?
	 * @return
	 */
	public boolean meetComputerStandards() {
		if(roster.size() <= numOfStudents) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Course: " + name;
	}
	

	public static void main(String[] args) {
		
		
	}
	
}

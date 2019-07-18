package summer2019CPSC4360.application;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	String name;
	String year; //freshman, sophomore, junior, senior
	int studentID;
	String email;
	String phoneNumber;
	List<Course> currentSchedule;
	List <Course> coursesNeeded = new ArrayList<Course>();
	static int numClasses;
	
	public Student(String name, int studentID) {
		this.name = name;
		//this.year = year;
		this.studentID = studentID;
		//this.email = email;
		//this.phoneNumber = phoneNumber;
		//this.currentSchedule = new ArrayList<Course>();
		
		
	}
	
	public Student(int studentID) {
		this.studentID = studentID;
	}
	
	/**Getters and setters*/
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	/**************************************************/
	
	
	
	/******Student enroll in class******************/
	public void enroll(Course c) {
		if(!currentSchedule.contains(c)) { //as long as it's not already on their schedule
		//add to current schedule
		currentSchedule.add(c);
		}
		//remove from courses that still need to be taken
		coursesNeeded.remove(c);
	}
	/**************************************************/
	
	
	
	
	/********toString method that returns information on the student*/
	public String toString() {
		return "Student name :\t " + getName() + "\nStudent ID: \t" + getStudentID();
	}
	/***********************************************/
	
	

	
	
	
	public static void main(String[] args) {
		
		
	}
	

}

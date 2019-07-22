package summer2019CPSC4360.application;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {

	String firstName;
	String lastName;
	String year; // freshman, sophomore, junior, senior
	int studentID;
	String email;
	String phoneNumber;
	List<Course> currentSchedule;
	List<Course> coursesNeeded = new ArrayList<Course>();
	static int numClasses;

	public Student(String FirstName, String LastName, int ID) {
		this.firstName = FirstName;
		this.lastName = LastName;
		this.studentID = ID; 
		// this.year = year;
		//this.studentID = studentID;
		// this.email = email;
		// this.phoneNumber = phoneNumber;
		// this.currentSchedule = new ArrayList<Course>();

	}

	public Student(int studentID) {
		this.studentID = studentID;
	}

	/** Getters and setters */

	public void setfirstName(String name) {
		this.firstName = name;
	}

	public String getfirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
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

	/****** Student enroll in class ******************/
	public void enroll(Course c) {
		if (!currentSchedule.contains(c)) { // as long as it's not already on their schedule
			// add to current schedule
			currentSchedule.add(c);
		}
		// remove from courses that still need to be taken
		coursesNeeded.remove(c);
	}
	
	/**************************************************/

	/****** Populate coursesNeeded ******************/
	
	
	

	/**************************************************/

	/******** toString method that returns information on the student */
	public String toString() {
		String str = "Student Name: " + this.getfirstName() + " " + this.getlastName() + "\nStudent ID#: " + this.getStudentID();
		return str;
	}

	/***********************************************/

	public static void main(String[] args) {

	}

}

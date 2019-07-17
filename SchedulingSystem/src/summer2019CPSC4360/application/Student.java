package summer2019CPSC4360.application;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	String name;
	String year; //freshman, sophomore, junior, senior
	int studentID;
	String email;
	String phoneNumber;
	List<Course> schedule = new ArrayList<Course>();
	static int numClasses;
	
	public Student(String name, String year, int studentID, String email, String phoneNumber) {
		this.name = name;
		this.year = year;
		this.studentID = studentID;
		this.email = email;
		this.phoneNumber = phoneNumber;
		
		
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
	
	
	
	
	
	
	/********toString method that returns information on the student*/
	public String toString() {
		return "Student name :\t " + getName() + "\nStudent ID: \t" + getStudentID();
	}
	/***********************************************/
	
	

	
	
	
	public static void main(String[] args) {
		
		Student stu1 = new Student("Stephen King", "Freshman", 11223344, "scary@university.edu", "40944444444");
		System.out.println(stu1);
		
	}
	
	/**If student has taken class in previous schedule, flag warning or something*/
	
	/**Does student meet the prerequisites?*/

}

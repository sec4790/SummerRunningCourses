package summer2019CPSC4360.application;

import java.util.Set;

public class Course {
	
	private int CRN;
	private String name;
	private String section;
	private Instructor instructor;
	private boolean isFull;
	private int maxStudents;
	private Set daysOfWeek;
	private int currentStudents;
	
	
	public Course() {
		this.CRN = 12345;
		this.name = "Name_Of_Course";
		this.section = "Section";
		this.instructor = null;
		this.isFull = false;
		this.maxStudents = 50;
	}
	
	public Course(int courseCRN, String courseName, String courseSection, Instructor courseInstructor, boolean courseIsFull, int courseMaxStudents ) {
		this.CRN = courseCRN;
		this.name = courseName;
		this.section = courseSection;
		this.instructor = courseInstructor;
		this.isFull = courseIsFull;
		this.maxStudents = courseMaxStudents;
	}

}

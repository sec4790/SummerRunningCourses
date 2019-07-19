package summer2019CPSC4360.application;

import java.util.List;

public class Administrator extends ScheduleSystem{

	String name;
	String adminID;
	
	
	public Administrator() {
		
	}
	
	public Administrator(String name) {
		this.name = name;
	}
	
	public static boolean validateCourse(Course CRN) {
		
		Course course = new Course();
		if(CRN.equals(course))
			return true;
		return false;
	}
	
	public void addCourse(Course CRN) {
		if(validateCourse(CRN) == false) {
			ScheduleSystem.summerICourses.add(CRN);
		}
		else
			return;
			//do nothing;
	}
	
	public static void main(String[] args) {
		
		
	}
}

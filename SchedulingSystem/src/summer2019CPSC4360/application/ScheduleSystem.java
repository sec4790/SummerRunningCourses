package summer2019CPSC4360.application;

import java.util.*;


import summer2019CPSC4360.userInterface.*;

public class ScheduleSystem {
	
	public static void main(String[] args) {
		
		//userTypeSelectGUI UTSGUI = new userTypeSelectGUI();
		
		//selectSemesterGUI SSGUI = new selectSemesterGUI();
		
		//courseDisplayGUI CDGUI = new courseDisplayGUI();
		
		//StudentGUI STUGUI = new StudentGUI();
	
		List<Student> students = new ArrayList<Student>();
		Student stu1 = new Student("John Smith", "Freshman", 123456, "jsmith@lamar.edu", "(409) 123-4567" );
		students.add(stu1);
		
		for(int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).toString());
		}
		
		List<Course> courses = new ArrayList<Course>();
		
		
	}

}

package summer2019CPSC4360.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import summer2019CPSC4360.userInterface.userTypeSelectGUI;
import summer2019CPSC4360.utility.DatabaseOperationsManager;

public class ScheduleSystem extends Course{
	
	public static DatabaseOperationsManager dbm;
	
	public static void main(String[] args) {
		
		
		userTypeSelectGUI UTSGUI = new userTypeSelectGUI();		
		dbm = new DatabaseOperationsManager();
		
		//selectSemesterGUI SSGUI = new selectSemesterGUI();
		//courseDisplayGUI CDGUI = new courseDisplayGUI();
		//StudentGUI STUGUI = new StudentGUI();
		
		
		
		/**
		 * 
		 * We want to gather all courses from different instructors into a big List which will be our master schedule
		 * or if not one big master schedule, then 3 different summer schedules
		 * 
		 * 
		 ** */
		
		/**Create some hypothetical courses 
		 * which should come from a database
		 */
		
		
		/**Create a hypothetical student
		 * which should be database stuff
		 * */
		
		
			
		/**Populate a degree program for a student
		 * add some courses to make it spicy
		 */
		
		//student1.setDegreeProgram(course1);
		///student1.setDegreeProgram(course2);
		//student1.setDegreeProgram(course3);
		//student1.setDegreeProgram(course4);
		
		/**Create an instructor
		 * 
		 */
	//	Instructor instructor = new Instructor("Stefan Andrei", "T1234");
		//InstructorSchedule instructor1 = new InstructorSchedule(instructor);
		
		
		/**Master schedule that teacher will add to and student will take away from*/
		//List<Course> summerICourses = new ArrayList<Course>();
		
		
		
		
//		System.out.println("Hello! I am the instructor " + instructor + " \n\nI'm ready to offer some classes this summer... "
//				+ "let's see what we have to start with.\n\nI am going to display the current summerI course schedule");
//		System.out.println();
//		System.out.println("Summer I Courses:");
//		for(Course c : summerICourses) {
//			System.out.println(c);
//		}
//		System.out.println();
//		System.out.println("Oops! Looks like there's nothing there. How about I offer a course");
//		System.out.println();
//		System.out.println("I will see what the student " + student + " needs since he/she will graduate soon");
//		System.out.println();
//		System.out.println("I am displaying the courses " + student + " needs :");
//		student1.displayNeededCourses();
//		System.out.println();
//		System.out.println("Let's see, it looks like " + student + " is taking a general studies path, that means he/she needs");
//		student1.displayDegreeProgram();
//		System.out.println();
//		System.out.println("She already has taken " + course1);
//		System.out.println();
//		System.out.println("I can check her previous classes from my current account, let's do that");
//		System.out.println();
		
		//error here
		//instructor1.displayStudentPreviousSchedule(student1);
		
		
//		System.out.println();
//		System.out.println("Maybe she would like to take " + course2 + " this summer. I'll offer that!");
//		System.out.println();
//		System.out.println("I am going to offer " + course2 + " which should be passed to the Administrator to validate the course" + 
//		"\nwhich will then add that course to the schedule. This part is currently under construction. Let's push through\n"
//				+"as if it was already validated");
//		
//		instructor1.setCoursesOferred(course2);
//		instructor1.setCoursesTeaching(course2);
//		
//		System.out.println();System.out.println("So now my current teaching schedule looks like this");
//		instructor1.displayCoursesTeaching();
//		System.out.println();
//		System.out.println("Cool! It's on my schedule, now let's add it to the summer I schedule");
//		summerICourses.add(course2);
//		System.out.println();
//		System.out.println("Now the summer I course list should have " + course2);
//		System.out.println("Summer I Courses:");
//		for(Course c : summerICourses) {
//			System.out.println(c);
//		}
//		System.out.println();
//		System.out.println("Let's wait for the student to log-in and enroll in this course!");
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println("Hello! I am the student : " + student);
//		System.out.println();
//		System.out.println("My financial aid went through! I can register for 1 class this summer.. let's see what I need");
//		System.out.println();
//		System.out.println("I will display the classes I need from my account");
//		student1.displayNeededCourses();
//		System.out.println();
//		System.out.println("looks like the next item i need is " + course2 + " Let me check summer I course schedule");
//		System.out.println();
//		for(Course c : summerICourses) {
//			System.out.println(c);
//		}
//		System.out.println();
//		System.out.println("Oh sweet! It looks like I can add Biology to my summer I schedule. Let me do that");
//		
		/**
		 * 
		 * Running into errors here
		 */
		
		
		//Student adds course to their person schedule
		//student1.addCourseToSchedule(course2);
		
		/**Course adds student to it's schedule. Checking for computers and roster size in the Course Class.
		 * 
		 * under construction
		 */
		//this is wrong.
//		for(Course c : summerICourses) {
//			if(c.equals(course2)) {
//				course2.addStudentToCourse(student);
//			}
//		}
		
		//System.out.println();
	//	System.out.println("Ok so my summer schedule should be...");
		//student1.displayCurrentCourses(); //student can see their schedule on their account
		//System.out.println();
	//	System.out.println("And the " + course2 + " roster should have my name in it");
		//course2.displayRoster(); //student can see their name on the course's information
		
		
	}
	
	
}

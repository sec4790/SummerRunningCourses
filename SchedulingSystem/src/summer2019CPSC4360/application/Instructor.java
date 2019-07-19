package summer2019CPSC4360.application;

public class Instructor {
	private String name;
	private String username;
	private String password;
	private String teacherID;
	Course course;
	
	public Instructor(String name, String teacherID) {
		this.name = name;
		this.teacherID = teacherID;
		toString();
	}
	
	public Instructor() {
		
	}
	
	/******Getters and setters ***********/
	public void setName(String name) {
		this.name = name;
	}
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTeacherID() {
		return teacherID;
	}
	/*************************************/
	
	/******Offer to teach course***********/
	public void offerCourse(Course CRN) {
		
	}
	
	public String toString() {
		return "Instructor: " + name  + "\tTeacher ID:" + teacherID;
	
	
	}
	
	public static void main(String[] args) {
		
		/**testing
		 * 
		 *
		Instructor ins = new Instructor("Stefan Andrei", "987675");
		
		System.out.println(ins);
		*/
	}
}

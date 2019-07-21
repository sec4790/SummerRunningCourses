package summer2019CPSC4360.application;

public class Instructor {
	private String name;
	private String username;
	private String password;
	private String teacherID;
	private int OfficeNumb;
	Course course;
	
	public Instructor(String name, String teacherID) {
		this.name = name;
		this.teacherID = teacherID;
		this.OfficeNumb = OfficeNumb;
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
	
	public void setOfficeNumb(int OfficeNumb){
		this.OfficeNumb = OfficeNumb;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTeacherID() {
		return teacherID;
	}
	
	public int getOfficeNumb(){
		return OfficeNumb;
	}
	

	/*************************************/
	
	/******Offer to teach course**********
	// I think its just return the CRN because if the instructor is offer it then its just it
	// We just have to return the course number back.
	public void offerCourse(Course CRN) {
		return CRN; 
	}
	*/
	
	public String toString() {
		return "Instructor: " + name  + "\tTeacher ID:" + teacherID + "\tOffice Number: " + OfficeNumb;
	
	
	}
	
	public static void main(String[] args) {
		
		/**testing
		 * 
		 *
		Instructor ins = new Instructor("Stefan Andrei", "987675");
=======
		Instructor ins = new Instructor("Stefan Andrei", "987675", "210");
>>>>>>> b8e40adf62f636508b1ad6e2b56fd62cbd5fe20b
		
		System.out.println(ins);
		*/
	}
}

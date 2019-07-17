package summer2019CPSC4360.application;

public class Administrator {

	String name;
	String adminID;
	
	public Administrator() {
		
	}
	
	public Administrator(String name) {
		this.name = name;
	}
	
	public boolean validateCourse(int CRN) {
		//if class passes validation standards return true
		//else
		return false;
	}
	
	public void addCourse(int CRN) {
		if(validateCourse(CRN) == true) {
			//add course to ScheduleSystem
		}
		else
			return;
			//do nothing;
	}
}

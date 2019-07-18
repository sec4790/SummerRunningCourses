package summer2019CPSC4360.application;

public class Administrator {

	String name;
	String adminID;
	String OfficeNumb;
	
	public Administrator() {
		
	}
	
	public Administrator(String name) {
		this.name = name;
	}
	
	public void setname(String name){
		this.name = name;
	}
	
	public void setadminID(String adminID){
		this.adminID= adminID;
	}
	
	public void setOfficeNumb(String OfficeNumb){
		this.OfficeNumb = OfficeNumb;
	}
	
	public boolean validateCourse(int CRN) {
		//if class passes validation standards return true
		//So, if CRN > 0 then the course is exist if it not then return false
		if (CRN > 0){
			return true;
		}
		else return false;
	}
	
	public void addCourse(int CRN) {
		if(validateCourse(CRN) == true) {
			return CRN; 
			
			//add course to ScheduleSystem
		}
		else
			return;
			//do nothing;
	}
}

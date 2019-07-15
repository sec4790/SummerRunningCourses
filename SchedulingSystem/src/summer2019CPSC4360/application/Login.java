package summer2019CPSC4360.application;

public class Login {

	public static boolean authenticateLogin(String username, String password) {
		
		//replace with a database lookup for username
		//if username if found, lookup for password
		if(username.equals("TestUser") && password.equals("password1")) {
			return true;
		}
		return false;
	}
}

package summer2019CPSC4360.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import summer2019CPSC4360.application.Administrator;
import summer2019CPSC4360.application.Dean;
import summer2019CPSC4360.application.Instructor;
import summer2019CPSC4360.application.Student;
import summer2019CPSC4360.application.User;

public class DatabaseOperationsManager {

	Connection databaseConnection;

	public DatabaseOperationsManager() {
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			String msAccDB = "TestDatabase.accdb";
			String dbURL = "jdbc:ucanaccess://" + msAccDB;
			databaseConnection = DriverManager.getConnection(dbURL);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error: Cannot connect to database");
			e.printStackTrace();
		}
	}

	public User initializeUserByUsername(String username) throws SQLException {
		PreparedStatement statement = this.databaseConnection
				.prepareStatement("select * from Users where username='" + username + "'");
		ResultSet rs = statement.executeQuery();
		rs.next();
		switch (rs.getString("Type")) {
		case "Student":
			Student queriedStudent = new Student(rs.getString("firstName"), rs.getString("lastName"), rs.getInt("studentID"));
			return queriedStudent;
		case "Instructor":
			Instructor queriedInstructor = new Instructor();
			return queriedInstructor;
		case "Administrator":
			Administrator queriedAdministrator = new Administrator();
			return queriedAdministrator;
		case "Dean":
			Dean queriedDean = new Dean();
			return queriedDean;
		}

		return null;
	}

	public String lookupPasswordFromUsername(String username) throws SQLException {
		PreparedStatement statement = this.databaseConnection
				.prepareStatement("select * from Users where username ='" + username + "'");
		ResultSet rs = statement.executeQuery();
		rs.next();
		return rs.getString("password");
	}

}

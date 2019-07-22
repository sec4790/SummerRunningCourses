package summer2019CPSC4360.userInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import summer2019CPSC4360.application.Instructor;
import summer2019CPSC4360.application.ScheduleSystem;
import summer2019CPSC4360.application.Student;

public class loginGUI extends JDialog {

	private JLabel loginUsernameLabel;
	private JLabel loginPasswordLabel;
	private JTextField loginUsernameField;
	private JPasswordField loginPasswordField;
	private String userType;

	public loginGUI(String loginUserType) {

		JPanel loginPanel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.fill = gbc.HORIZONTAL;

		loginUsernameLabel = new JLabel("Username: ");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		loginPanel.add(loginUsernameLabel, gbc);

		loginUsernameField = new JTextField(20);
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		loginPanel.add(loginUsernameField, gbc);

		loginPasswordLabel = new JLabel("Password: ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		loginPanel.add(loginPasswordLabel, gbc);

		loginPasswordField = new JPasswordField(20);
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		loginPanel.add(loginPasswordField, gbc);

		loginPanel.setBorder(new LineBorder(Color.GRAY));

		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent loginEvent) {
				if (validLogin(getEnteredUsername(), getEnteredPassword())) {
					JOptionPane.showMessageDialog(loginGUI.this, "Login Successful!");
					switch (userType) {
					case "Student":
						Student user = null;
						try {
							user = (Student) ScheduleSystem.dbm.initializeUserByUsername(getEnteredUsername());
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						// lookup for a Student who has the EnterdUsername
						StudentGUI STUGUI = new StudentGUI(user);
						break;
					case "Instructor":
						Instructor userInstructor = null;
						try {
							userInstructor = (Instructor) ScheduleSystem.dbm.initializeUserByUsername(getEnteredUsername());
							
						} catch(SQLException e) {
							e.printStackTrace();
						}
						InstructorGUI INSGUI = new InstructorGUI(userInstructor);
						break;
					case "Administrator":
						// ScheduleSystem.createAdministratorGUI();
						break;
					case "Dean":
						// ScheduleSystem.createDeanGUI();
						break;
					default:
						throw new IllegalArgumentException("Invalid User Type");
					}

					loginGUI.this.dispose();

				} else {
					JOptionPane.showMessageDialog(loginGUI.this, "Login Failed: Incorrect Username or Password.");
				}

			}

		});

		JButton cancelButton = new JButton("Cancel");

		cancelButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		JPanel buttonPanel = new JPanel();
		buttonPanel.add(loginButton);
		buttonPanel.add(cancelButton);
		getContentPane().add(loginPanel, BorderLayout.CENTER);
		getContentPane().add(buttonPanel, BorderLayout.PAGE_END);

		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
		this.userType = loginUserType;
	}

	public String getEnteredUsername() {
		return new String(loginUsernameField.getText().trim());
	}

	public String getEnteredPassword() {
		return new String(loginPasswordField.getPassword());
	}

	public boolean validLogin(String username, String password) {
		String currentUsername = username;
		String currentPassword = password;
		try {
			if(currentPassword.equals(ScheduleSystem.dbm.lookupPasswordFromUsername(currentUsername))) {
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Invalid Username or Password");
			e.printStackTrace();

		}
		return false;
	}

}

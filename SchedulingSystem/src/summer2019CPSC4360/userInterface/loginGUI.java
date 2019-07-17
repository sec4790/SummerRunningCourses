package summer2019CPSC4360.userInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class loginGUI extends JDialog{
	
	private JLabel loginUsernameLabel;
	private JLabel loginPasswordLabel;
	private JTextField loginUsernameField;
	private JPasswordField loginPasswordField;
	
	public loginGUI() {
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
		JButton cancelButton = new JButton("Cancel");
		
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(loginButton);
		buttonPanel.add(cancelButton);
		getContentPane().add(loginPanel, BorderLayout.CENTER);
		getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
		
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
	}
	
	public String getEnteredUsername() {
		return new String(loginUsernameField.getText().trim());
	}
	
	public String getEnteredPassword() {
		return new String(loginPasswordField.getPassword().toString().trim());
	}
	
	

}

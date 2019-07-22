package summer2019CPSC4360.userInterface;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import summer2019CPSC4360.application.Student;

public class StudentGUI extends JFrame {
	
	
	JEditorPane stuEditorPane;
	
	public StudentGUI(Student user) {

		JFrame stuFrame = new JFrame("This is the student's window");
		JPanel stuMainPanel = new JPanel();
		JPanel stuButtonPanel = new JPanel();
		stuButtonPanel.setLayout(new GridBagLayout());
		JPanel stuContentPanel = new JPanel();
		JEditorPane stuEditorPane = new JEditorPane();
		stuEditorPane.setSize(800,600);
		stuEditorPane.setEditable(false);
		stuContentPanel.add(stuEditorPane);
		JLabel stuLabel = new JLabel("Welcome, " + user.getfirstName()  +", here are your options:");
		stuLabel.setVerticalAlignment(JLabel.TOP);
		stuLabel.setHorizontalAlignment(JLabel.CENTER);
		stuMainPanel.add(stuLabel);
		
		
		
		JButton btnStuInfo = new JButton("View Student Information");
		JButton btnViewCourseList = new JButton("View Previous Schedules");
		JButton btnClassesTaken = new JButton("View Previous Courses");
		JButton btnClassesNeeded = new JButton("View Remaining Required Courses");
		JButton btnViewCurrentSchedule = new JButton("View Current Schedule");

		stuButtonPanel.add(btnStuInfo);
		btnStuInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stuEditorPane.setText(user.toString());
				pack();
			}
		});
		stuButtonPanel.add(btnViewCourseList);
		btnViewCourseList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectSemesterGUI ssGUI = new selectSemesterGUI();
			}
		});
		stuButtonPanel.add(btnClassesTaken);
		btnClassesTaken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// go to classes taken for this student
			}
		});
		stuButtonPanel.add(btnClassesNeeded);
		btnClassesNeeded.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// go to classes needed for this degree plan
			}
		});
		stuButtonPanel.add(btnViewCurrentSchedule);
		btnViewCurrentSchedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		getContentPane().add(stuMainPanel, BorderLayout.PAGE_START);
		getContentPane().add(stuButtonPanel, BorderLayout.CENTER);
		getContentPane().add(stuContentPanel, BorderLayout.PAGE_END);
		
		pack();
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void DisplayStudentInformation() {
		
	}

}

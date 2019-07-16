package summer2019CPSC4360.userInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.sun.codemodel.internal.JLabel;

public class StudentGUI extends JFrame {

	public StudentGUI() {
		
		JFrame stuFrame = new JFrame("This is the student's window");
		JPanel stuPanel = new JPanel();
		stuPanel.setLayout(new GridLayout(5,2));
		javax.swing.JLabel stuLabel = new javax.swing.JLabel("Welcome, Student Name, here are your options:");
		stuLabel.setVerticalAlignment(SwingConstants.TOP);
		stuLabel.setHorizontalAlignment(javax.swing.JLabel.CENTER);
		stuPanel.add(stuLabel);
		
		JButton btnStuInfo = new JButton("Your Student Information");
		JButton btnViewCourseList = new JButton("View previous or future course schedules");
		JButton btnClassesTaken = new JButton("View classes you have taken");
		JButton btnClassesNeeded = new JButton("View classes that you still need to take");
		JButton btnViewCurrentSchedule = new JButton("View your current schedule");
		
		stuPanel.add(btnStuInfo);
		btnStuInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				}	
			});
		stuPanel.add(btnViewCourseList);
		btnViewCourseList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectSemesterGUI ssGUI = new selectSemesterGUI();
				ssGUI.setVisible(true);
				}	
			});
		stuPanel.add(btnClassesTaken);
		btnClassesTaken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//go to classes taken for this student
				}	
			});
		stuPanel.add(btnClassesNeeded);
		btnClassesNeeded.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//go to classes needed for this degree plan
				}	
			});
		stuPanel.add(btnViewCurrentSchedule);
		btnViewCurrentSchedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				}	
			});
		
		stuFrame.getContentPane().add(stuPanel);
		stuFrame.setSize(400, 600);
		stuFrame.setLocationRelativeTo(null);
		stuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		stuFrame.setVisible(true);
	}

}

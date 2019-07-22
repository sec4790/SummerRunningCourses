package summer2019CPSC4360.userInterface;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import summer2019CPSC4360.application.ScheduleSystem;

public class userTypeSelectGUI extends JFrame {

	public userTypeSelectGUI() {

		JFrame UTSframe = new JFrame("Scheduling System: User Type Select");
		JPanel UTSpanel = new JPanel();
		JPanel UTSButtonPanel = new JPanel();
		UTSpanel.setLayout(new GridLayout(2, 1));
		JLabel UTSlabel = new JLabel("Select User Type:");
		UTSlabel.setHorizontalAlignment(JLabel.CENTER);
		JButton studentButton = new JButton();
		studentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				loginGUI login = new loginGUI("Student");
				UTSframe.setVisible(false);
			}
		});
		studentButton.setText("Student");
		JButton instructorButton = new JButton();
		instructorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				loginGUI login = new loginGUI("Instructor");
				UTSframe.setVisible(false);

			}
		});
		instructorButton.setText("Instructor");
		JButton administratorButton = new JButton();
		administratorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginGUI login = new loginGUI("Administrator");
				UTSframe.setVisible(false);
				
			}
		});

		administratorButton.setText("Administrator");
		JButton deanButton = new JButton();
		deanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginGUI login = new loginGUI("Dean");
				UTSframe.setVisible(false);
			}
		});
		deanButton.setText("Dean");
		UTSpanel.add(UTSlabel);
		UTSpanel.add(UTSButtonPanel);
		UTSButtonPanel.add(studentButton);
		UTSButtonPanel.add(instructorButton);
		UTSButtonPanel.add(administratorButton);
		UTSButtonPanel.add(deanButton);
		UTSframe.getContentPane().add(UTSpanel);
		UTSframe.pack();
		UTSframe.setLocationRelativeTo(null);
		UTSframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		UTSframe.setVisible(true);

	}
}

package summer2019CPSC4360.userInterface;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class userTypeSelectGUI extends JFrame{
	
	public userTypeSelectGUI() {
		
	JFrame UTSframe = new JFrame("Scheduling System: User Type Select");
	JPanel UTSpanel = new JPanel();
	UTSpanel.setLayout(new GridLayout(5,1));
	JLabel UTSlabel = new JLabel("Select User Type:");
	UTSlabel.setHorizontalAlignment(JLabel.CENTER);
	JButton studentButton = new JButton();
	studentButton.setText("Student");
	JButton instructorButton = new JButton();
	instructorButton.setText("Instructor");
	JButton administratorButton = new JButton();
	administratorButton.setText("Administrator");
	JButton deanButton = new JButton();
	deanButton.setText("Dean");
	UTSpanel.add(UTSlabel);

	UTSpanel.add(studentButton);
	UTSpanel.add(instructorButton);
	UTSpanel.add(administratorButton);
	UTSpanel.add(deanButton);
	UTSframe.add(UTSpanel);
	UTSframe.setSize(400, 600);
	UTSframe.setLocationRelativeTo(null);
	UTSframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	UTSframe.setVisible(true);	
	}
}

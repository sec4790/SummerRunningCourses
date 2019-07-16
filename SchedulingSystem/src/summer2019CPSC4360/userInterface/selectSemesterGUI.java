package summer2019CPSC4360.userInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class selectSemesterGUI extends JFrame {

	private JPanel contentPane;

	public selectSemesterGUI() {
		
		JFrame ssFrame = new JFrame("Scheduling System: Choose Semester");
		JPanel ssPanel = new JPanel();
		ssPanel.setLayout(new GridLayout(5,1));
		JLabel ssLabel = new JLabel("Select Semester:");
		ssLabel.setVerticalAlignment(SwingConstants.TOP);
		ssLabel.setHorizontalAlignment(JLabel.CENTER);
		ssPanel.add(ssLabel);
		JButton btnSummerI = new JButton("Summer I");
		JButton btnSummerII = new JButton("Summer II");
		JButton btnSummerIII = new JButton("Summer III");
		JButton btnChoosePrevious = new JButton("Choose a previous semester course list");

		ssPanel.add(btnSummerI);
		btnSummerI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				courseDisplayGUI cdGUI = new courseDisplayGUI();
				cdGUI.setVisible(true);
				}	
			});
		ssPanel.add(btnSummerII);
		btnSummerII.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				courseDisplayGUI cdGUI = new courseDisplayGUI();
				cdGUI.setVisible(true);
				}	
			});
		ssPanel.add(btnSummerIII);
		btnSummerI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				courseDisplayGUI cdGUI = new courseDisplayGUI();
				cdGUI.setVisible(true);
				}	
			});
		ssPanel.add(btnChoosePrevious);
		btnSummerI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				courseDisplayGUI cdGUI = new courseDisplayGUI();
				cdGUI.setVisible(true);
				}	
			});
		
		
		
		ssFrame.getContentPane().add(ssPanel);
		ssFrame.setSize(400, 600);
		ssFrame.setLocationRelativeTo(null);
		ssFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ssFrame.setVisible(true);
}
}

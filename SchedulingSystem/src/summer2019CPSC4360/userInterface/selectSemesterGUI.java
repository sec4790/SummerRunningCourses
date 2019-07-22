package summer2019CPSC4360.userInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.BrokenBarrierException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class selectSemesterGUI extends JFrame {

	private JPanel contentPane;

	public selectSemesterGUI() {
		
		this.setTitle("Scheduling System: Choose Semester");
		JPanel ssMainPanel = new JPanel();
		JLabel ssLabel = new JLabel("Select Semester:");
		ssLabel.setVerticalAlignment(SwingConstants.TOP);
		ssLabel.setHorizontalAlignment(JLabel.CENTER);
		ssMainPanel.add(ssLabel);
		
		JPanel ssBtnPanel = new JPanel();
		JButton btnSummerI = new JButton("Summer I");
		JButton btnSummerII = new JButton("Summer II");
		JButton btnSummerIII = new JButton("Summer III");
		JButton btnChoosePrevious = new JButton("Choose a previous semester course list");

		ssBtnPanel.add(btnSummerI);
		btnSummerI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				courseDisplayGUI cdGUI = new courseDisplayGUI();
				}	
			});
		ssBtnPanel.add(btnSummerII);
		btnSummerII.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				courseDisplayGUI cdGUI = new courseDisplayGUI();
				}	
			});
		ssBtnPanel.add(btnSummerIII);
		btnSummerIII.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				courseDisplayGUI cdGUI = new courseDisplayGUI();
				}	
			});
		ssBtnPanel.add(btnChoosePrevious);
		btnChoosePrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				courseDisplayGUI cdGUI = new courseDisplayGUI();
				}	
			});
		
		
		getContentPane().add(ssMainPanel, BorderLayout.PAGE_START);
		getContentPane().add(ssBtnPanel, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
}
}

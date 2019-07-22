package summer2019CPSC4360.userInterface;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class courseDisplayGUI extends JFrame{
	public static String hello = "Hello";
	
	public courseDisplayGUI() {
		
	this.setTitle("Scheduling System: Display courses");
	JPanel cdPanel = new JPanel();
	getContentPane().add(cdPanel);
	
	JLabel lblNewLabel = new JLabel("These are the classes:");
	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	
	JList list = new JList();
	
	
	JButton btnAddClass = new JButton("Add class");
	
	JButton btnEnroll = new JButton("Enroll");
	
	/**Layout for the list*/
	GroupLayout gl_cdPanel = new GroupLayout(cdPanel);
	gl_cdPanel.setHorizontalGroup(
		gl_cdPanel.createParallelGroup(Alignment.LEADING)
			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
			.addGroup(gl_cdPanel.createSequentialGroup()
				.addGap(48)
				.addGroup(gl_cdPanel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_cdPanel.createSequentialGroup()
						.addComponent(list, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
					.addGroup(gl_cdPanel.createSequentialGroup()
						.addComponent(btnAddClass)
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnEnroll)
						.addGap(45))))
	);
	gl_cdPanel.setVerticalGroup(
		gl_cdPanel.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_cdPanel.createSequentialGroup()
				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(list, GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addGroup(gl_cdPanel.createParallelGroup(Alignment.BASELINE)
					.addComponent(btnAddClass)
					.addComponent(btnEnroll))
				.addContainerGap(32, Short.MAX_VALUE))
	);
	cdPanel.setLayout(gl_cdPanel);
	/**End list */

	
	setSize(400, 600);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setVisible(true);	
	}
}

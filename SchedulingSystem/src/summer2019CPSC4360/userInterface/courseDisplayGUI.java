package summer2019CPSC4360.userInterface;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import javax.swing.JScrollPane;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.ListSelectionModel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class courseDisplayGUI extends JFrame{
	public static String hello = "Hello";
	
	public courseDisplayGUI() {
		
	JFrame cdFrame = new JFrame("Scheduling System: Display courses");
	JPanel cdPanel = new JPanel();
	cdFrame.getContentPane().add(cdPanel);
	
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

	
	cdFrame.setSize(400, 600);
	cdFrame.setLocationRelativeTo(null);
	cdFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	cdFrame.setVisible(true);	
	}
}

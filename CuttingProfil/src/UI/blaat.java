package UI;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSpinner;

import java.awt.BorderLayout;

import javax.swing.JList;
import javax.swing.JScrollPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Label;

public class blaat {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					blaat window = new blaat();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public blaat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{30, 402, 0};
		gridBagLayout.rowHeights = new int[]{255, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		//frame.getContentPane().setLayout(gridBagLayout);
		
//		JSpinner spinner = new JSpinner();
//		GridBagConstraints gbc_spinner = new GridBagConstraints();
//		gbc_spinner.anchor = GridBagConstraints.WEST;
//		gbc_spinner.fill = GridBagConstraints.VERTICAL;
//		gbc_spinner.insets = new Insets(0, 0, 0, 5);
//		gbc_spinner.gridx = 0;
//		gbc_spinner.gridy = 0;
//		frame.getContentPane().add(spinner, gbc_spinner);
//		 
//		 JScrollPane scrollPane = new JScrollPane();
//		 GridBagConstraints gbc_scrollPane = new GridBagConstraints();
//		 gbc_scrollPane.fill = GridBagConstraints.BOTH;
//		 gbc_scrollPane.gridx = 1;
//		 gbc_scrollPane.gridy = 0;
//		 frame.getContentPane().add(scrollPane, gbc_scrollPane);
//		 
		  JButton bt1 = new JButton("bt1");
		  JButton bt2 = new JButton("bt2");
		  JButton bt3 = new JButton("bt3");
		  JButton bt4 = new JButton("bt4");
		  
		  JList list = new JList();
		  //scrollPane.setRowHeaderView(list);
		 
		  
		  list.add(bt1);
		  list.add(bt2);
		  list.add(bt3);
		  list.add(bt4);
		  list.add(new Label("knor"));
		  list.setToolTipText("w000t");
		  list.setSize(500, 500);
		  frame.getContentPane().add(list);
		  
	}

}

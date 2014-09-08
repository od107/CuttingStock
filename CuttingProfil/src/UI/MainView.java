package UI;

//import Order.*;

import javax.swing.JFrame;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.SpinnerNumberModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSpinner;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

@SuppressWarnings("serial")
public class MainView extends JFrame{

	//private JFrame frmCuttingStock;
//	private JTextField txtInputInt;
//	private int overlength = 0;
	private JButton btnInputOrder = new JButton("Input Order");
	private JButton btnDisplayOrder = new JButton("Display Order");
	private JButton btnImportOrder = new JButton("Import Order");
	private JButton btnDisplayCutlist = new JButton("Display Cutlist");
	private JButton btnExportCuttingList = new JButton("Export CutList");
	private JButton btnCalcCuttingList = new JButton("Calculate Cutlist");
	private JSpinner overlengthSpinner = new JSpinner();
	private JComboBox<String> comboBoxCalcMethod = new JComboBox<String>();
	private JLabel lblCm = new JLabel("cm");
	private JLabel lblOverlength = new JLabel("overlength");
	private JLabel lblCalculationMethod = new JLabel("Calculation method");
	private JLabel lblLengthsNeeded = new JLabel("Lengths needed:");
	/**
	 * Create the application.
	 */
	public MainView() {

		//frmCuttingStock = new JFrame();
//		setTitle("Cutting stock solver");
		setBounds(200, 200, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(
				new FormLayout(
						new ColumnSpec[] { 
								FormFactory.RELATED_GAP_COLSPEC,
								ColumnSpec.decode("default:grow"), 
								FormFactory.RELATED_GAP_COLSPEC,
								ColumnSpec.decode("default:grow"), 
								FormFactory.RELATED_GAP_COLSPEC,
								ColumnSpec.decode("default:grow"),
								FormFactory.RELATED_GAP_COLSPEC, },
								
								new RowSpec[] { 
								FormFactory.RELATED_GAP_ROWSPEC,
								FormFactory.DEFAULT_ROWSPEC,
								FormFactory.RELATED_GAP_ROWSPEC, 
								FormFactory.DEFAULT_ROWSPEC, 
								FormFactory.RELATED_GAP_ROWSPEC, 
								FormFactory.DEFAULT_ROWSPEC,
								FormFactory.RELATED_GAP_ROWSPEC, 
								FormFactory.DEFAULT_ROWSPEC, 
								FormFactory.RELATED_GAP_ROWSPEC, 
								FormFactory.DEFAULT_ROWSPEC,
								FormFactory.RELATED_GAP_ROWSPEC, 
								RowSpec.decode("default:grow"), 
								FormFactory.RELATED_GAP_ROWSPEC,
								RowSpec.decode("default:grow"), }));

		getContentPane().add(btnInputOrder, "2, 2");
		getContentPane().add(btnDisplayOrder, "4, 2");
		getContentPane().add(btnImportOrder, "6, 2");
		getContentPane().add(lblOverlength, "2, 4, right, default");
		getContentPane().add(overlengthSpinner, "4, 4");
		getContentPane().add(lblCm, "6, 4");
		getContentPane().add(lblCalculationMethod, "2, 6, right, default");
		getContentPane().add(comboBoxCalcMethod, "4, 6, fill, default");
		getContentPane().add(btnCalcCuttingList, "2, 8");
		getContentPane().add(btnDisplayCutlist, "4, 8");
		getContentPane().add(btnExportCuttingList, "6, 8");
		getContentPane().add(lblLengthsNeeded, "2, 10");

		overlengthSpinner.setModel(new SpinnerNumberModel(0, 0, 100, 5));
		
		btnDisplayCutlist.setEnabled(false);
		btnExportCuttingList.setEnabled(false);
		btnDisplayOrder.setEnabled(false);
		btnImportOrder.setEnabled(false);
	}

	void addInputOrderButtonHandler(ActionListener actionListener) {
		btnInputOrder.addActionListener(actionListener);
	}

	void addDisplayOrderButtonHandler(ActionListener actionListener) {
		btnDisplayOrder.addActionListener(actionListener);
	}

	void addImportOrderButtonHandler(ActionListener actionListener) {
		btnImportOrder.addActionListener(actionListener);
	}

	void addDisplayCutlistButtonHandler(ActionListener actionListener) {
		btnDisplayCutlist.addActionListener(actionListener);
	}

	void addExportCutlistButtonHandler(ActionListener actionListener) {
		btnExportCuttingList.addActionListener(actionListener);
	}

	void addCalculateCutlistButtonHandler(ActionListener actionListener) {
		btnCalcCuttingList.addActionListener(actionListener);
	}

	void addHandlers() {
		btnInputOrder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.err.println("click?");
				InputOrderView frame = new InputOrderView();
				frame.setVisible(true);
			}
		});

		overlengthSpinner.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent arg0) {
				System.out.println("wooooot");
			}
		});

	}

	/**
	 * Launch the application.
	 */

	// private class Handler implements ActionListener {
	//
	// public void actionPerformed(ActionEvent event) {
	//
	// String string = "";
	//
	// if (event.getSource() == btnInputOrder)
	// string = "inputting order";
	// else if (event.getSource() == overlengthSpinner) {
	// string = "spinning around";
	// } else if (event.getSource() == btnCalcCuttingList) {
	// string = "Calculating list";
	// }
	//
	// JOptionPane.showMessageDialog(null, string);
	// }
	//
	// }

}

package UI;
/*
 * Per order (globaal) : client, reference en een set van windows
 * per window: id; brand en set van profils
 * per profil: type colour length denominoation 
 * 
 * 
 * -> add/remove/commit/next window
 * -> add/remove/commit profil
 * 
 * 
 */
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Order.ProfilType;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class InputOrderView extends JFrame {

	private JPanel contentPane;
	private JTextField txtClient = new JTextField("Client");
	private JTextField txtReference = new JTextField("Reference");
	private JTextField txtWindowNumber = new JTextField();
	private JTextField txtBrand = new JTextField();
	private JTextField txtColour = new JTextField();
	private JTextField txtLength = new JTextField();
	private JTextField txtDenomination = new JTextField();
	private JTextField txtProfilnbr = new JTextField();

	private JSeparator separator_3 = new JSeparator();
	private JButton button_1 = new JButton(">");
	private JButton btnCompleteOrder = new JButton("Complete Order");
	private JButton button = new JButton("<");
	private JButton btnSave = new JButton("Save");
	private JLabel lblCount = new JLabel("Count: ");
	
	private JLabel lblClient = new JLabel("Client");
	private JLabel lblOrderReference = new JLabel("Order reference");
	private JSeparator separator = new JSeparator();
	
	private JLabel lblBrand = new JLabel("Brand");
	private JSeparator separator_1 = new JSeparator();
	private JLabel lblType = new JLabel("Type");
	private JComboBox<String> typeComboBox = new JComboBox<String>();
	private JLabel lblColour = new JLabel("Colour");		
	private JLabel lblWindowNumber = new JLabel("Window number");
	private JLabel lblDenomination = new JLabel("Denomination");
	private JLabel lblLength = new JLabel("Length");
	private JSeparator separator_2 = new JSeparator();
	
	/**
	 * Create the frame.
	 */
	public InputOrderView() {
		setTitle("Input Order");
		setBounds(100, 100, 432, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("120px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("64px:grow"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("120px"),},
			new RowSpec[] {
				FormFactory.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("32px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("32px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("32px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("32px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("32px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("32px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("32px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("32px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("32px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("32px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("32px"),
				FormFactory.LINE_GAP_ROWSPEC,}));
		
		contentPane.add(lblClient, "2, 2, right, fill");
		contentPane.add(txtClient, "4, 2, fill, center");
		contentPane.add(lblOrderReference, "2, 4, right, fill");
		contentPane.add(txtReference, "4, 4, fill, default");
		contentPane.add(separator, "2, 6, 5, 1, fill, fill");		
		contentPane.add(lblWindowNumber, "2, 8, right, fill");
		contentPane.add(txtWindowNumber, "4, 8, fill, default");
		contentPane.add(lblBrand, "2, 10, right, fill");
		contentPane.add(txtBrand, "4, 10, fill, default");
		contentPane.add(separator_1, "2, 12, 5, 1, fill, fill");
		contentPane.add(lblType, "2, 14, right, fill");
		contentPane.add(typeComboBox, "4, 14, fill, default");
		contentPane.add(lblColour, "2, 16, right, fill");
		contentPane.add(txtColour, "4, 16, fill, default");
		contentPane.add(separator_2, "2, 18, 5, 1, fill, fill");
		contentPane.add(lblLength, "2, 20, right, fill");
		contentPane.add(txtLength, "4, 20, fill, default");
		contentPane.add(lblDenomination, "2, 22, right, fill");
		contentPane.add(txtDenomination, "4, 22, fill, default");		
		contentPane.add(separator_3, "2, 24, 5, 1, fill, fill");
		contentPane.add(lblCount, "2, 26, right, fill");
		contentPane.add(btnSave, "6, 26");
		contentPane.add(button, "2, 28, right, center");		
		contentPane.add(txtProfilnbr, "4, 28, center, center");		
		contentPane.add(button_1, "6, 28, left, center");
		contentPane.add(btnCompleteOrder, "4, 30, 2, 1");
		
		txtWindowNumber.setText("window number");
		txtWindowNumber.setColumns(10);
		txtBrand.setText("brand");
		txtBrand.setColumns(10);
		txtColour.setText("colour");
		txtColour.setColumns(10);
		txtLength.setText("length");
		txtLength.setColumns(10);
		txtDenomination.setText("denomination");
		txtDenomination.setColumns(10);
		txtProfilnbr.setText("ProfilNbr");
		txtProfilnbr.setColumns(10);
		txtClient.setColumns(10);
		txtReference.setColumns(10);
		
		for (ProfilType s : ProfilType.values())
			typeComboBox.addItem(s.toString());

	}

	
//	void setClient(String client){
//		txtClient.
//	}
	String getClient(){
		return txtClient.getText();
	}
	
	void addButtonCompleteHandler(ActionListener handler){
		btnCompleteOrder.addActionListener(handler);
	}
		
}

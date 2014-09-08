package UI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Order.Order;
import Order.Profil;
import Order.ProfilType;

public class CuttingStock {
	// views 
	MainView mainview = new MainView();	
	InputOrderView inputOrderView = new InputOrderView();
	// model
	Order order = new Order("","");

	CuttingStock() {
		setupHandlers();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				mainview.setVisible(true);
			};
		});
	}

	void setupHandlers() {
		mainview.addInputOrderButtonHandler(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				inputOrderView.setVisible(true);
			}
		});
		mainview.addCalculateCutlistButtonHandler(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				calculateCutlist();
				//TODO: do something with the calculated results here
			}
		});
		inputOrderView.addButtonCompleteHandler(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				processInputOrder();
			}
		});
		
	}

	void calculateCutlist(){
		System.out.println("I like monkeys");
	}
	
	void processInputOrder(){
		//bestelling.getWindow(1, "Deceuninck").addProfil(new Profil("wit", ProfilType.FRAME, 120, "onder"));
		
	}
	
	public static void main(String[] args) {
		new CuttingStock();
	}

}

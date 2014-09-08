package Order;

import java.util.ArrayList;
import java.util.List;

public class Window {
	private int window_id;
	private String brand;
	private List<Profil> profils = new ArrayList<Profil>();

	//
	// public Window(){
	// this(0,null,null, ProfilType.FRAME, 0, null);
	// }
	//

	public Window(int window_id, String brand) {
		// this(windowNbr, brand, null, ProfilType.FRAME, 0, null);
		setWindowId(window_id);
		setBrand(brand);
	}

	void addProfil(Profil profil){
		profils.add(profil);
	}
	
	final List<Profil> getProfils(){
		return profils;		
	}
	
	// public Window(int windowNbr, String brand, String colour, ProfilType
	// type, int length, String denom){
	// this.windowNbr = windowNbr;
	// this.brand = brand;
	// listPerWindow = new ArrayList<ListOfProfils>();
	// listPerWindow.add(new ListOfProfils(colour, type, length, denom));
	// }
//
//	public void setValues(int windowNbr, String brand, String colour,
//			ProfilType type, int length, String denom) {
//		this.windowNbr = windowNbr;
//		this.brand = brand;
//		ListOfProfils list = findList(colour, type);
//		if (list == null) {
//			list = new ListOfProfils(colour, type, length, denom);
//			listPerWindow.add(list);
//		} else {
//			list.setValues(colour, type, length, denom);
//			listPerWindow.set(listPerWindow.indexOf(list), list);
//		}
//	}
//
//	private ListOfProfils findList(String colour, ProfilType type) {
//		for (ListOfProfils list : listPerWindow) {
//			if (list.getColour() == colour && list.getType() == type) {
//				return list;
//			}
//		}
//		return null;
//	}

	public int getWindowNbr() {
		return window_id;
	}

	public void setWindowId(int windowNbr) {
		this.window_id = windowNbr;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

//	public ArrayList<ListOfProfils> getListPerWindow() {
//		return listPerWindow;
//	}
//
//	public void setListPerWindow(ArrayList<ListOfProfils> listPerWindow) {
//		this.listPerWindow = listPerWindow;
//	}

}

package Order;

import java.util.Map;
import java.util.TreeMap;

public class Order {
	private String client;
	private String reference;
	private Map<Integer, Window> id_to_window = new TreeMap<Integer, Window>();

	public Order(String client, String reference) {
		// this(client, reference, 0, null, null, ProfilType.FRAME, 0, null);
		setClient(client);
		setReference(reference);
	}

	Window getWindow(int window_id, String brand) {
		Window window = id_to_window.get(window_id);
		if (window == null) {
			window = new Window(window_id, brand);
			id_to_window.put(window_id, window);
		}
		return window;
	}

	@Override
	public String toString() {
		String s = "overzicht bestelling\n" + "client: " + getClient() + "\n" + "reference: " + getReference() + "\n";
		for (Map.Entry<Integer, Window> id_window_entry : id_to_window.entrySet()) {
			Window window = id_window_entry.getValue();
			s += "   RaamNummer: " + window.getWindowNbr() + "\n";
			s += "   Merk: " + window.getBrand() + "\n";

			for (Profil profil : window.getProfils())
				s += "   - " + profil.toString() + "\n";
		}
		return s;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
}

// public void setValues(int window_id, String brand, String colour,
// ProfilType type, int length, String denom) {
// Window window = getWindow(window_id, brand);
// // window.setWindowId(window_id);
// // window.setBrand(brand);
// window.addProfil(new Profil(colour, type, length, denom));
// }

// window.getProfileList

// colour, type, length, denom

// window.setValues(window_id, brand, colour, type, length, denom);

/*
 * this.client = client; this.reference = reference; Window window =
 * findWindowByNbr(windowNbr); if(window == null){ window = new Window(
 * windowNbr, brand, colour, type, length, denom); listOfWindows.add(window); }
 * else{ window.setValues(windowNbr, brand, colour, type, length, denom);
 * listOfWindows.set(listOfWindows.indexOf(window), window); }
 */
// }

// WindowNbr is the key for class Window
// private Window findWindowByNbr(int windowNbr){
// for (Window window : list_of_windows) {
// if (window.getWindowNbr() == windowNbr) {
// return window;
// }
// }
// return null;
// }

// public Order(String client, String reference, int window_id, String
// brand, String colour, ProfilType type, int length, String denom){
// this.client = client;
// this.reference = reference;
//
// //list_of_windows = new ArrayList<Window>();
// // list_of_windows.add(new Window(windowNbr, brand, colour,type, length,
// denom));
// id_to_window.put(window_id, new Window(window_id, brand, colour,type,
// length, denom));
// }

// public ArrayList<Window> getListOfWindows() {
// return list_of_windows;
// }
// public void setListOfWindows(ArrayList<Window> listOfWindows) {
// this.list_of_windows = listOfWindows;
// }
//
// public Order(){
// this(null, null, 0, null, null, ProfilType.FRAME, 0, null);
// }
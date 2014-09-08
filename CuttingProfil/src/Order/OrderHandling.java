package Order;
//import java.util.ArrayList;

public class OrderHandling {
	private int overlength; //overlength should not be added to arcs
	
	public int getOverlength(){
		return overlength;
	}
	public void setOverlength(int ol){
		this.overlength = ol;
	}

//	public void setValues(int window_id, String brand, String colour,
////			ProfilType type, int length, String denom) {
//	

	public static void main(String[] args) {
		Order bestelling = new Order("Windowmakers","B023");
		bestelling.getWindow(1, "Deceuninck").addProfil(new Profil("wit", ProfilType.FRAME, 120, "onder", false));
		
		
//		Window window = getWindow(window_id, brand);
//		window.setWindowId(window_id);
//		window.setBrand(brand);
//		window.addProfil(new Profil(colour, type, length, denom));
		

		bestelling.getWindow(1, "Deceuninck").addProfil(new Profil( "wit", ProfilType.FRAME, 120, "onder", false));
		bestelling.getWindow( 1, "Deceuninck").addProfil(new Profil( "wit", ProfilType.FRAME, 220, "links", false));
		bestelling.getWindow( 1, "Deceuninck").addProfil(new Profil( "bruin", ProfilType.FRAME, 220, "rechts", false));
		bestelling.getWindow( 1, "Deceuninck").addProfil(new Profil( "wit", ProfilType.FRAME, 220, "boven", true));
		bestelling.getWindow( 1, "Deceuninck").addProfil(new Profil( "wit", ProfilType.FRAME, 220, "rechts", false));
		bestelling.getWindow( 2, "Deceuninck").addProfil(new Profil( "wit", ProfilType.WING, 200, "links", true));
		bestelling.getWindow( 1, "Deceuninck").addProfil(new Profil( "antraciet", ProfilType.WING, 180, "rechts", true));
		bestelling.getWindow( 1, "Deceuninck").addProfil(new Profil( "wit", ProfilType.WING, 180, "links", false));
		bestelling.getWindow( 1, "Deceuninck").addProfil(new Profil( "wit", ProfilType.WING, 120, "onder", false));
		
//
//		bestelling.getWindow( 1, "Deceuninck", "wit", ProfilType.FRAME, 120, "onder");
//		bestelling.getWindow( 1, "Deceuninck", "wit", ProfilType.FRAME, 220, "links");
//		bestelling.getWindow( 1, "Deceuninck", "bruin", ProfilType.FRAME, 220, "rechts");
//		bestelling.getWindow( 1, "Deceuninck", "wit", ProfilType.FRAME, 220, "boven");
//		bestelling.getWindow( 1, "Deceuninck", "wit", ProfilType.FRAME, 220, "rechts");
//		bestelling.getWindow( 2, "Deceuninck", "wit", ProfilType.WING, 200, "links");
//		bestelling.getWindow( 1, "Deceuninck", "antraciet", ProfilType.WING, 180, "rechts");
//		bestelling.getWindow( 1, "Deceuninck", "wit", ProfilType.WING, 180, "links");
//		bestelling.getWindow( 1, "Deceuninck", "wit", ProfilType.WING, 120, "onder");
//		
////		printOrder(bestelling);
		System.out.println(bestelling);
	}
	
//	public static void printOrder(Order bestelling){
//		System.out.println("overzicht bestelling");
//		System.out.println("client: "+ bestelling.getClient() );
//		System.out.println("reference: "+ bestelling.getReference());
//		for (Window raam : bestelling.getListOfWindows()){
//			System.out.println("   RaamNummer: " + raam.getWindowNbr());
//			System.out.println("   Merk: " + raam.getBrand());
//			for(ListOfProfils lijst : raam.getListPerWindow()){
//				System.out.println("      Kleur: " + lijst.getColour());
//				System.out.println("      Type: " + lijst.getType());	
//				for(Profil profiel : lijst.getProfilList()){
//					System.out.println("         Naam: " + profiel.getDenomination());
//					System.out.println("         Lengte: " + profiel.getLength());
//				}
//			}
//		}
//		
//	}
}

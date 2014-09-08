package Order;

public class Profil {

	private String colour;
	private ProfilType type;
	private int length;
	private String denomination;
	private boolean isArc;

	Profil(String colour, ProfilType type, int length, String denom, boolean isArc) {
		setColour(colour);
		setType(type);
		setLength(length);
		setDenomination(denom);
		setArc(isArc);
	}

	@Override
	public String toString() {
		String s = "Colour: %-10s type: %-6s length: %5d, denomination: %-10s";
		return String.format(s, colour, type, length, denomination);
		// return s;
//		return "Colour: " + colour + ",\t type: " + type + ",\t length: " + length
//				+ ",\t denomination: " + denomination;
	}


	//
	//
	// public Profil(){
	// this(0, null);
	// // this.length = 0;
	// // this.denomination = null;
	// }
	// public Profil(int length){
	// this(length, null);
	// // this.length = length;
	// // this.denomination = null;
	// }
	// public Profil(int length, String denom){
	// this.length = length;
	// this.denomination = denom;
	// }
	//
	// public void setValues(int length, String denom){
	// this.length = length;
	// this.denomination = denom;
	// }
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public ProfilType getType() {
		return type;
	}

	public void setType(ProfilType type) {
		this.type = type;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	
	public boolean isArc() {
		return isArc;
	}

	public void setArc(boolean isArc) {
		this.isArc = isArc;
	}

}

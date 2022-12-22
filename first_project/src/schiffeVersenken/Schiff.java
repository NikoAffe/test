package schiffeVersenken;

public class Schiff {
	int x;
	int y;
	boolean getroffen;
	boolean ausrichtung;
	int length;


	public Schiff(int x, int y, boolean ausrichtung, int length) {
		this.x = x;
		this.y = y;
		this.ausrichtung = ausrichtung;
		this.length = length;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public boolean isAusrichtung() {
		return ausrichtung;
	}


	public void setAusrichtung(boolean ausrichtung) {
		this.ausrichtung = ausrichtung;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	

}

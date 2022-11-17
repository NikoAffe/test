package schiffeVersenken;

public class Schiff {
	double x;
	double y;
	boolean getroffen;
	boolean ausrichtung;
	int length;


	public Schiff(double x, double y, boolean ausrichtung, int length) {
		this.x = x;
		this.y = y;
		this.ausrichtung = ausrichtung;
		this.length = length;
	}

}

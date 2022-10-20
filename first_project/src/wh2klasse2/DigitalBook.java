package wh2klasse2;

public class DigitalBook extends Book {
	int size;
	public DigitalBook(double artikelNummer, double preis, String autor, String titel, int year, int size) {
		super(artikelNummer, preis, autor, titel, year);
		this.size = size;
		
	}

	public double getPreis() {

		 
		return super.getPreis();
	}

	@Override
	public String toString() {
		return super.toString() + "DigitalBook [size=" + size + "]";
	}
	
}

package wh2klasse2;

public class Artikel {
	private double artikelNummer;
	private double preis;
	
	
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	public Artikel(double artikelNummer, double preis) {
		super();
		this.artikelNummer = artikelNummer;
		this.preis = preis;
	}
	@Override
	public String toString() {
		return "Artikel [artikelNummer=" + artikelNummer + ", preis=" + preis + "]";
	}
	
	public void ausgabe() {
		System.out.printf("ArtikelNummer: %s \nPreis: %s € \n", artikelNummer, preis);
	}
}

package wh2klasse2;

public class Book extends Artikel {
	String autor;
	String titel;
	int year;
	final double VAT = 0.07;

	public Book(double artikelNummer, double preis, String autor, String titel, int year) {
		super(artikelNummer, preis);
		this.autor = autor;
		this.titel = titel;
		this.year = year;
		
	}
	
	public double getPreis() {

		 
		return super.getPreis() * (1+ VAT);
	}

	@Override
	public String toString() {
		return super.toString() + "Book [autor=" + autor + ", titel=" + titel + ", year=" + year + ", VAT=" + VAT + "]";
	}
	

}

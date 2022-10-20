package wh2klasse2;

public class DVD extends Artikel{

private enum COUNTRYCODE{DE,AT;};
private COUNTRYCODE cc;
 private String name;
 private int duration;
 private final double VAT = 0.19;
 
 public DVD(double artikelNummer, double preis, String name, int duration, COUNTRYCODE cc) {
		super(artikelNummer, preis);
		this.name = name;
		this.duration = duration;
		this.cc = cc;
	}
 
	public double getPreis() {

		 
		return super.getPreis() * (1 + VAT);
	}

	@Override
	public String toString() {
		return super.toString() +  "DVD [cc=" + cc + ", name=" + name + ", duration=" + duration + ", VAT=" + VAT + "]";
	}

}

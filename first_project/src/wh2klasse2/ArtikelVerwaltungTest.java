package wh2klasse2;

public class ArtikelVerwaltungTest {

	public static void main(String[] args) {
		ShoppingCart s = new ShoppingCart();
		Artikel a1 = new Artikel(12345, 50);
		s.addArtikel(a1);
		s.ausgabe();
		

	}

}

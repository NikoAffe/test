package wh2klasse2;


public class ShoppingCart {
	private Artikel[] alle = new Artikel[1000];
	private int index = 0;
	
	public void addArtikel(Artikel a)
	{
		alle[index++] = a;
	}
	
	public void removeArtikel(int position)
	{
		alle[position] = alle[index-1];
		alle[index-1] = null;
		index--;
	}
	
	public void ausgabe() {
		for(int i = 0; i < index; i++) {
			alle[i].ausgabe();
			
			
		}
	}
}

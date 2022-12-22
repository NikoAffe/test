package schiffeVersenken;

public class SchiffeErstellen {
static int i = 0;
static int j = 0;
static int k = 0;
static int h = 0;
	public static Schiff erstellSchiff() {
		
		int length = (int)Math.random() * 4 + 1;
		if(length == 5 && i == 0) {
			i++;
			length = 5;
		} else if(length == 4 && j < 2) {
			j++; 
			length = 4;
		} else if(length == 3 && k < 3) {
			k++;
			length = 3;
		}  else if(length == 2 && h < 4) {
			h++;
			length = 2;
		}
		boolean orient = Math.random()< 0.5;
		
		int x = (int)Math.random() *10;
		if(orient == true && x + length > Playground.size ) {
			x = Playground.size - length - 1;
		}
		int y = (int)Math.random() *10;
		if(orient == false && y + length > Playground.size ) {
			y = Playground.size - length - 1;
		}
		
		Schiff t1 = new Schiff(x,y,orient,length);
		return t1;
	}
}

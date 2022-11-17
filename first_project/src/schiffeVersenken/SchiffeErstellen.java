package schiffeVersenken;

public class SchiffeErstellen {
int i = 0;
int j = 0;
	void erstellSchiff() {
		
		int length = (int)Math.random() * 4 + 1;
		if(length == 5 && i == 0) {
			i++;
			length = 5;
		} else if(length == 4 && j < 2) {
			j++; 
			length = 4;
		}
		boolean orient = Math.random()< 0.5;
		
		double x = Math.random() *10;
		if(orient == true && (x + length) > Playground.size ) {
			x = Playground.size - length - 1;
		}
		double y = Math.random() *10;
		
		
		Schiff t1 = new Schiff(x,y,orient,length);
		
	}
}

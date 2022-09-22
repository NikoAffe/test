package ForSchleifen;

public class ForSchleife {

	public static void main(String[] args) {
//		int i = 0;
//		while (i < 10) {
//			System.out.println(i);
//			i++;
//		}
//		double d = 0.5;
//		for (int j = 0; j < 10; j++) {
//			System.out.printf("Die Fliesskommazahl; %.2f\n", d);
//			d += j;
//		
//		}
	double betrag = 2000;
//	double zinsen = betrag * 0.05; // 5 / 100
//	betrag += zinsen; 
	
	
	for (int jahre = 0; jahre < 26;)
	{
	betrag = betrag * 1.05; 
	System.out.println(betrag);
	jahre++; }
	}
}
	
	



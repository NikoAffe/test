package WH1Klasse;

import java.util.Iterator;

public class bsp7 {

	static double durchschnitt(int[] werte) {
		int x = 0;
		for (int i = 0; i < werte.length; i++) {
			x = x + werte[i];
		}
		return x / werte.length;
	}

	public static void main(String[] args) {
		int[] i = { 3, 3, 3, 3 };
		System.out.println(durchschnitt(i));
	}

}

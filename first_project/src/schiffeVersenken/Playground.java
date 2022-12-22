package schiffeVersenken;

public class Playground {
static int size;
int[][] playGrnd = new int[size][size];

public Playground(int size) {
	this.size = size;
}

public static int getSize() {
	return size;
}

public static void setSize(int size) {
	Playground.size = size;
}


public void allesWasser () {
	for(int i = 0; i < Playground.size; i++ ) {
		for(int j = 0; j < Playground.size; i++) {
			playGrnd[i][j] = 0;
		}
	}
}
}


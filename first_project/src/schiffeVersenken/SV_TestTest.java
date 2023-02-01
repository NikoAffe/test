package schiffeVersenken;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SV_TestTest {

	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	@BeforeEach
	void setUp() throws Exception {
		Schiff s1 = SchiffeErstellen.erstellSchiff();
		Playground p1 = new Playground(10);
		p1.allesWasser();
		
		
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	static void testFrei() {
		Playground p1 = new Playground(10);
		p1.allesWasser();
		int x = 1;
		int y = 1;
		for(int i = 5; i > 0; i -- ) {
		boolean test = frei(p1.playGrnd , x, y) || x < 0 || y < 0;
		assertTrue( test);
		assertTrue(checkNeben(p1.playGrnd, x, y - 1) && checkNeben(p1.playGrnd, x + 1, y - 1) && checkNeben(p1.playGrnd, x - 1, y - 1)
		&& checkNeben(p1.playGrnd, x, y) && checkNeben(p1.playGrnd, x + 1, y) && checkNeben(p1.playGrnd, x - 1, y) && checkNeben(p1.playGrnd, x, y + 1)
		&& checkNeben(p1.playGrnd, x + 1, y + 1) && checkNeben(p1.playGrnd, x - 1, y + 1));}
	}
	static boolean frei(int[][] m, int x, int y) {
		if (m[x][y] == 0) {
			return true;
		} else {
			return false;
		}
	
	

	
		
		
	

	
}
	static	boolean checkNeben(int[][] m, int x, int y) {
		return frei(m, x, y) || x < 0 || y < 0;
	}
	
}
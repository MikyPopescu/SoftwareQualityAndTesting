package cts.g1082.popescu.mihaela.teste;

import static org.junit.Assert.*;

import java.util.Random;


import cts.g1082.popescu.mihaela.Avion;
import cts.g1082.popescu.mihaela.teste.suita.ICategorie;
import org.junit.After;
import org.junit.Test;
import org.junit.experimental.categories.Category;



public class TestMetodaGetNumarLocuriOcupate {

	@Test
	@Category(ICategorie.class)
	public void testGetNumarLocuriOcupateCardinality() {
		Avion avion = new Avion();
		boolean[] statusLocuri = new boolean[] { true, false, true, false, true};
		int locuriOcupate = avion.getNumarLocuriOcupate(statusLocuri);
		int locuriOcupateAsteptate =3;
		
		assertEquals(locuriOcupateAsteptate, locuriOcupate);
		
		
	}

	@Test(timeout= 1000)
	public void testGetNumarLocuriPerformance() {
		Avion avion = new Avion();
        boolean[] statusLocuri = new boolean[1000];
		for(int i=0;i<1000;i++) {
			statusLocuri[i] = true;
		}
		
		int locuriOcupate = avion.getNumarLocuriOcupate(statusLocuri);
	}
}

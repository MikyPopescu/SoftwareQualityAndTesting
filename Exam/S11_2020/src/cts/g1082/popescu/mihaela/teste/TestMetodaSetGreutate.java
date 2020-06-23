package cts.g1082.popescu.mihaela.teste;

import static org.junit.Assert.*;

import cts.g1082.popescu.mihaela.Avion;
import cts.g1082.popescu.mihaela.teste.suita.ICategorie;
import org.junit.After;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestMetodaSetGreutate {

	
	@Test
	@Category(ICategorie.class)
	public void testSetGreutateRight() {
		Avion avion = new Avion(50,"Avion a", 150 );
		avion.setGreutateIncarcata(50);
		float greutateAsteptata= 50;
		float greutateObtinuta= avion.getGreutateIncarcata();
		
		assertEquals(greutateAsteptata, greutateObtinuta, 0.01);
		
	}
	
	
	@Test
	public void testSetGreutateConformance() {
		Avion avion = new Avion(100,"Avion b", 150 );
		avion.setGreutateIncarcata(100);	
		float greutateAsteptata= 100;
		float greutateObtinuta= avion.getGreutateIncarcata();
		
		assertEquals(greutateAsteptata, greutateObtinuta, 0.01);
		
		
	}
	
}

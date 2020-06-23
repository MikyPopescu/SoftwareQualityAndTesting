package cts.g1082.popescu.mihaela.teste;

import static org.junit.Assert.*;

import cts.g1082.popescu.mihaela.Avion;
import cts.g1082.popescu.mihaela.teste.suita.ICategorie;
import org.junit.After;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestMetodaGetPretBilet {

	@Test
	public void testMetodaGetPretBiletRight70() {
		Avion avion = new Avion();
		float pretObtinut = avion.getPretBilet(70);
		float pretAsteptat=100;
		
		assertEquals(pretAsteptat, pretObtinut, 0.01);
		
	}
	
	
	@Test
	public void testMetodaGetPretBiletRight260() {
		Avion avion = new Avion();
		float pretObtinut = avion.getPretBilet(260);
		float pretAsteptat= 300;
		
		assertEquals(pretAsteptat, pretObtinut, 0.01);
		
	}
	
	@Test
	@Category(ICategorie.class)
	public void testMetodaGetPretBiletRight200() {
		Avion avion = new Avion();
		float pretObtinut = avion.getPretBilet(200);
		float pretAsteptat=200;
		
		assertEquals(pretAsteptat, pretObtinut, 0.01);
		
	}
	
	
	

}

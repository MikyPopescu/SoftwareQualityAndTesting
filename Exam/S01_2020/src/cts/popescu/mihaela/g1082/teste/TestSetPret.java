package cts.popescu.mihaela.g1082.teste;

import cts.popescu.mihaela.g1082.Produs;
import cts.popescu.mihaela.g1082.teste.suita.Categorie;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class TestSetPret {

    @Test
    @Category(Categorie.class)
    public void testSetPretRight() {
        Produs produs = new Produs("Ciocolata", 50.0);
        produs.setPret(50.0, 2);

        double pretAsteptat = 25.0;
        double pretObtinut = produs.getPret();
        assertEquals(pretAsteptat, pretObtinut, 0.01);
    }

    @Test
    public void testBoundaryInferior() {
        Produs produs = new Produs("Lapte", 1.0);
        produs.setPret(1.0, 1);

        double pretAsteptat = 1.0;
        double pretObtinut = produs.getPret();
        assertEquals(pretAsteptat, pretObtinut, 0.01);

    }


    @Test
    public void testBoundarySuperior() {
        Produs produs = new Produs("Lapte", 1000.0);
        produs.setPret(1000.0, 1);

        double pretAsteptat = 1000.0;
        double pretObtinut = produs.getPret();
        assertEquals(pretAsteptat, pretObtinut, 0.01);

    }
}
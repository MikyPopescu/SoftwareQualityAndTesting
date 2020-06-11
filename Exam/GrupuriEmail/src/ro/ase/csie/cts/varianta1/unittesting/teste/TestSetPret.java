package ro.ase.csie.cts.varianta1.unittesting.teste;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.csie.cts.varianta1.unittesting.clase.Produs;
import ro.ase.csie.cts.varianta1.unittesting.exceptii.ExceptiePretPreaMare;
import ro.ase.csie.cts.varianta1.unittesting.suita.ICategorieSuitaCustom;

import static org.junit.Assert.*;

public class TestSetPret {
    @Test
    public void setPretRightPromotie2() {

        Produs produs= new Produs("Ciocolata", 50.0);
        produs.setPret(50.0, 2);

        double pretAsteptat= 25.0;
        double pretObtinut= produs.getPret();
        assertEquals(pretAsteptat, pretObtinut,0.01);


    }

    @Test
    @Category(ICategorieSuitaCustom.class)
    public void setPretRightPromotie1() {

        Produs produs= new Produs("Lapte",50.0);
        produs.setPret(50.0, 1);

        double pretAsteptat= 50.0;
        double pretObtinut= produs.getPret();
        assertEquals(pretAsteptat, pretObtinut,0.01);

    }

    @Test
    public void setPretDedfault() {

        Produs produs= new Produs("Lapte",50.0);
        produs.setPret(50.0, 3);

        double pretAsteptat= 50.0;
        double pretObtinut= produs.getPret();
        assertEquals(pretAsteptat, pretObtinut,0.01);
    }

    @Test

    public void testBoundaryInferior() {
        Produs produs= new Produs("Lapte",1.0);
        produs.setPret(1.0, 1);

        double pretAsteptat= 1.0;
        double pretObtinut= produs.getPret();
        assertEquals(pretAsteptat, pretObtinut,0.01);

    }


    @Test
    public void testBoundarySuperior() {
        Produs produs= new Produs("Lapte",1000.0);
        produs.setPret(1000.0, 1);

        double pretAsteptat= 1000.0;
        double pretObtinut= produs.getPret();
        assertEquals(pretAsteptat, pretObtinut,0.01);

    }



    @Test(expected = ExceptiePretPreaMare.class)
    public void testRangeInAfaraIntervalului() {
        Produs produs= new Produs("Lapte",1200.0);
        produs.setPret(1200.0, 1);


    }
}
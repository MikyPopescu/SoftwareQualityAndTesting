package ro.ase.csie.cts.varianta1.unittesting.teste;


import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.csie.cts.varianta1.unittesting.clase.Facturare;
import ro.ase.csie.cts.varianta1.unittesting.exceptii.ExceptieFacturaFaraProduse;
import ro.ase.csie.cts.varianta1.unittesting.suita.ICategorieSuitaCustom;

import static org.junit.Assert.*;

public class TestCalculValoareTVA {
    @Test(expected = ExceptieFacturaFaraProduse.class)
    public void testExistenceTVA() {

        Facturare factura= new Facturare();
        Double val= factura.calculValoareTVA(null, 0.19);

    }

    @Test
    @Category(ICategorieSuitaCustom.class)
    public void testInverseTVA() {

        Facturare factura= new Facturare();
        Double val= factura.calculValoareTVA(100.0, 0.19);
        Double pret= val/0.19;

        assertEquals(100, pret, 0.1);

        
    }

    @Test
    public void testCrossCheckTVA() {

        Facturare factura= new Facturare();
        Double valObtinuta = factura.calculValoareTVA(100.0, 0.19);
        Double valTvaAsteptat = 100.0 * 19/100;

        assertEquals(valTvaAsteptat, valObtinuta, 0.1);



    }
}
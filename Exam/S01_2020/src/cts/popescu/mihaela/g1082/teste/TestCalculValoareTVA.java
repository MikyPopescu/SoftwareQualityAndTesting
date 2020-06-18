package cts.popescu.mihaela.g1082.teste;

import cts.popescu.mihaela.g1082.Facturare;
import cts.popescu.mihaela.g1082.teste.exceptii.ExceptieFacturaFaraProduse;
import cts.popescu.mihaela.g1082.teste.suita.Categorie;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class TestCalculValoareTVA {
    @Test(expected = ExceptieFacturaFaraProduse.class)
    public void testExistenceTVA() {

        Facturare factura= new Facturare();
        Double val= factura.calculValoareTVA(null, 0.19);
    }

    @Test
    @Category(Categorie.class)
    public void testInverseTVA() {
        Facturare factura= new Facturare();
        Double val= factura.calculValoareTVA(100.0, 0.19);
        Double pret= val/0.19;

        assertEquals(100, pret, 0.1);



    }

}
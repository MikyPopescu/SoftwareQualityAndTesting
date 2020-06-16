package cts.g1082.popescu.mihaela.teste;

import cts.g1082.popescu.mihaela.TestGrila;
import cts.g1082.popescu.mihaela.teste.suita.TestSuiteCategory;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCalculTotalPuncteTestGrila {

    @org.junit.experimental.categories.Category({TestSuiteCategory.class})
    @Test
    public void testSetDificultateRight() {
        TestGrila test = new TestGrila("CTS", 50, 9);
        test.setDificultate("usor");
        assertEquals(1, test.getDificultate());
    }

}
package cts.g1082.popescu.mihaela.teste;

import cts.g1082.popescu.mihaela.TestGrila;
import cts.g1082.popescu.mihaela.teste.suita.TestSuiteCategory;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestSetDificultateTestGrila {

    @Test
    public void testSetDificultateRight() {
        TestGrila test = new TestGrila("CTS", 50, 9);
        test.setDificultate("usor");
        assertEquals(1, test.getDificultate());
    }

    @org.junit.experimental.categories.Category({TestSuiteCategory.class})
    @Test
    public void testBoundaryUsor() {
        TestGrila testGrila = new TestGrila("Matematica", 10, 2);

        testGrila.setDificultate("foarte usor");

        assertEquals(1, testGrila.getDificultate());
    }
    @org.junit.experimental.categories.Category({TestSuiteCategory.class})
    @Test
    public void testBoundaryPro() {
        TestGrila testGrila = new TestGrila("Matematica", 10, 2);

        testGrila.setDificultate("pro");

        assertEquals(3, testGrila.getDificultate());
    }

    @org.junit.experimental.categories.Category({TestSuiteCategory.class})
    @Test
    public void testBoundarDificil() {
        TestGrila testGrila = new TestGrila("Matematica", 10, 2);

        testGrila.setDificultate("dificil");

        assertEquals(2, testGrila.getDificultate());
    }


}
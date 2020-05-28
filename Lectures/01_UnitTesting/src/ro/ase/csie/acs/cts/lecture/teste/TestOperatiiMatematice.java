package ro.ase.csie.acs.cts.lecture.teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ase.csie.acs.cts.lecture.OperatiiMatematice;

import static org.junit.Assert.*;

public class TestOperatiiMatematice { //TestCase


    //UnitTests:
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    //Syntax: test + method name + tested condition
    //No console used! => Specific JUNIT functions
    //TDD: Write method header, write Unit Test => Fail, Implement method, Run Unit Test
    @Test
    public void testCalculMedieValoriCorecte() {
        int[] numere = new int[]{10, 20, 30};

        float expected = 20;

        float actual = OperatiiMatematice.calculMedie(numere);

        assertEquals("Calcul suma pentru 10, 20, 30", expected, actual,0); //delta: result +/- delta value
    }


    @Test
    public void testCalculMedieVectorFaraValori(){
        int[] numere = new int[] {};

        float expected = 0;


        float actual = OperatiiMatematice.calculMedie(numere);

        assertEquals("Calcul suma pentru un vector cu 0 elemente", expected, actual,0);
    }
}
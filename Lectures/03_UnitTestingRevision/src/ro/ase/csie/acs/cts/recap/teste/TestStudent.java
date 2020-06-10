package ro.ase.csie.acs.cts.recap.teste;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.csie.acs.cts.recap.clase.Student;
import ro.ase.csie.acs.cts.recap.exceptii.ExceptieStudentValoriInvalide;
import ro.ase.csie.acs.cts.recap.interfete.InterfataValidariStudent;
import ro.ase.csie.acs.cts.recap.teste.categorii.CategorieTesteImportante;
import ro.ase.csie.acs.cts.recap.teste.categorii.CategorieTestePerformanta;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestStudent {
    Student student;

    public static final String NUME;
    public static final int VARSTA = InterfataValidariStudent.VARSTA_MIN;
    public static final ArrayList<Integer> NOTE = new ArrayList<>();
    public static final int NR_NOTE = 3;

    //performance
    public static final int NR_MAX_NOTE = 10000;
    public static final ArrayList<Integer> NOTE_PERFORMANCE = new ArrayList<>();


    static {
        String numeInitial = "";
        for (int i = 0; i < InterfataValidariStudent.DIM_NUME_MIN; i++) {
            numeInitial += "A";
        }
        NUME = numeInitial;
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        for (int i = 0; i < NR_MAX_NOTE; i++)
            NOTE_PERFORMANCE.add(InterfataValidariStudent.NOTA_MAX);
    }

    @org.junit.Before
    public void setUp() throws Exception {
        student = new Student(NUME, VARSTA, NOTE);
    }

    @After
    public void tearDown() throws Exception {
//        Integer.MIN_VALUE;
//        Integer.MAX_VALUE;
    }

    //Range
    //int varsta: verifica metoda pentru valori de intrare in spatiul posibil [MIN-MAX]
    //+Error Condition / Existence / !Conformance: 0 nu apartine [14,90]
    @Test(expected = ExceptieStudentValoriInvalide.class)
    public void testSetVarstaRangeZero() throws ExceptieStudentValoriInvalide {
        int varstaZero = 0;

        student.setVarsta(varstaZero);
    }


    //Range pt o valoare intre VARSTA_MIN si VARSTA_MAX
    //RIGHT / Conformance
    @Category(CategorieTesteImportante.class)
    @Test
    public void testSetVarstaRangeValoareValida() {
        int varstaExpected = InterfataValidariStudent.VARSTA_MIN + 1;

        try {

            student.setVarsta(varstaExpected);
            int varstaStudentActual = student.getVarsta();
            assertEquals("Test valoare valida", varstaExpected, varstaStudentActual);

        } catch (ExceptieStudentValoriInvalide e) {

            fail("Metoda a generat exceptie pentru valori valide!");

        }
    }


    //1-Boundary - Range doar pe limite
    //verific limitele valorilor valide
    //lower limit - VARSTA_MIN
    //Right
    @Category(CategorieTesteImportante.class)
    @Test
    public void testSetVarstaBoundaryLimitaInferioara() throws ExceptieStudentValoriInvalide {
        int limitaInferioara = InterfataValidariStudent.VARSTA_MIN;

        student.setVarsta(limitaInferioara);
        int varstaActual = student.getVarsta();

        assertEquals(limitaInferioara, varstaActual);
    }

    //2-Boundary
    //upper limit - VARSTA_MAX
    //Range
    //Right
    @Test
    public void testSetVarstaBoundaryLimitaSuperioara() throws ExceptieStudentValoriInvalide {
        int limitaSuperioara = InterfataValidariStudent.VARSTA_MAX;

        student.setVarsta(limitaSuperioara);
        int varstaActual = student.getVarsta();

        assertEquals(limitaSuperioara, varstaActual);
    }

    //Reference

    //Time/Performance
    // rezultate intr-un timp limita
    // la un anumit moment de timp evenimentul x se intampla
    @Category(CategorieTestePerformanta.class)
    @Test(timeout = 1000)
    public void testGetMedie2ZecimalePerformance() throws ExceptieStudentValoriInvalide {
    //NU generez datele de test in testul unitar!

//        int nrNote = 10000;
//        ArrayList<Integer> note = new ArrayList<>();
//        for (int i = 0; i < nrNote; i++) {
//            note.add(IValidariStudent.NOTA_MAX);
//        }

        student.setNote(NOTE_PERFORMANCE);

        float medieExpected = InterfataValidariStudent.NOTA_MAX;
        float medieActual = student.getMedie2Zecimale();

        assertEquals(medieExpected, medieActual, 0);

    }



}
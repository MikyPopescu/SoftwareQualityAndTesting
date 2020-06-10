package ro.ase.csie.acs.cts.recap.teste;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.csie.acs.cts.recap.clase.Student;
import ro.ase.csie.acs.cts.recap.exceptii.ExceptieStudentValoriInvalide;
import ro.ase.csie.acs.cts.recap.interfete.InterfataValidariStudent;
import ro.ase.csie.acs.cts.recap.teste.categorii.CategorieTesteImportante;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TestStudentGetMedie {
    Student student;

    @Before
    public void setUp() throws Exception {
        ArrayList<Integer> note = new ArrayList<>(Arrays.asList(9, 9, 9));
        student = new Student("Anonim", InterfataValidariStudent.VARSTA_MIN, note);
    }

    //CrossCheck
    //verifica prin alte metode rezultatul obtinut
    @Category({CategorieTesteImportante.class,CategorieTesteImportante.class})
    @Test
    public void testGetMedie2ZecimaleCrossCheck() throws ExceptieStudentValoriInvalide {
        ArrayList<Integer> note = new ArrayList<>(Arrays.asList(9, 9, 10));

        student.setNote(note);
        //obtin rezultat prin alta metoda
        float suma = 0;
        for (int nota : note) {
            suma += nota;
        }
        float medie = suma / note.size();
        DecimalFormat df = new DecimalFormat("#.##"); //2 zecimale
        df.setRoundingMode(RoundingMode.DOWN);
        String medieFormatata = df.format(medie);

        float medieExpected = Float.parseFloat(medieFormatata);

        float medieActual = student.getMedie2Zecimale();

        assertEquals(medieExpected, medieActual, 0);
    }

    //InverseRelation
    @Test
    public void testGetMedie2ZecimaleInverseRelation() throws ExceptieStudentValoriInvalide {
        ArrayList<Integer> note = new ArrayList<>(Arrays.asList(10, 10, 10));
        student.setNote(note);

        //medie * nrElem = suma elementelor
        float suma = 0;
        for (int nota : note) {
            suma += nota;
        }

        float medieCalculata = student.getMedie2Zecimale();

        float valoareRelatieInversa = medieCalculata * note.size();

        assertEquals(suma, valoareRelatieInversa, 0.05);
    }
}
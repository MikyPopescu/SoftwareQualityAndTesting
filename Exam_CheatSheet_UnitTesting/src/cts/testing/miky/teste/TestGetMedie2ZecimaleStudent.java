package cts.testing.miky.teste;

import cts.testing.miky.Student;
import cts.testing.miky.exceptii.ExceptieStudentValoriInvalide;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TestGetMedie2ZecimaleStudent {

    //Right/Conformance1
    @Category({Categorie.class})
    @Test
    public void testGetMedie2ZecimaleRight() throws ExceptieStudentValoriInvalide {
        String nume = "Gigel";
        int varsta = 20;
        ArrayList<Integer> note = new ArrayList<>();
        note.add(9);
        note.add(9);
        note.add(10);
        Student student = new Student(nume, varsta, note);


        float medieAsteptata = 9.33f;

        float medieCalculata = student.getMedie2Zecimale();

        assertEquals(medieAsteptata, medieCalculata, 0);
    }

    //Existance/ErrorCondition/Conformance2
    @Test(expected = ExceptieStudentValoriInvalide.class)
    public void testGetMedie2ZecimaleExistenceNoteNull() throws ExceptieStudentValoriInvalide {
        String nume = "Gigel";
        int varsta = 20;
        ArrayList<Integer> note = new ArrayList<>();
        note.add(9);
        note.add(9);
        note.add(10);
        Student student = new Student(nume, varsta, note);
        ArrayList<Integer> noteNull = null;
        student.setNote(noteNull);

        student.getMedie2Zecimale();
    }

    //ordering
    @Test
    public void testGetMedie2ZecimaleNoteSortateCrescator() throws ExceptieStudentValoriInvalide {
        String nume = "Gigel";
        int varsta = 20;

        ArrayList<Integer> note = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9));
        Student student = new Student(nume, varsta, note);
        student.setNote(note);

        float medieAsteptata = 7;
        float medieCalculata = student.getMedie2Zecimale();

        assertEquals(medieAsteptata, medieCalculata, 0);
    }

    //cardinality - 0
    @Test
    public void testGetMedie2ZecimaleNoteZeroNote() throws ExceptieStudentValoriInvalide {
        String nume = "Gigel";
        int varsta = 20;
        ArrayList<Integer> note = new ArrayList<>();
        Student student = new Student(nume, varsta, note);
        student.setNote(note);

        float medieAsteptata = 0;
        float medieCalculata = student.getMedie2Zecimale();

        assertEquals(medieAsteptata,medieCalculata,0);
    }

    //cardinality - 1
    @Test
    public void testGetMedie2ZecimaleNoteONota() throws ExceptieStudentValoriInvalide {
        String nume = "Gigel";
        int varsta = 20;
        int notaUnica=1;
        ArrayList<Integer> note = new ArrayList<>();
        note.add(notaUnica);
        Student student = new Student(nume, varsta, note);
        student.setNote(note);

        float medieAsteptata = notaUnica;
        float medieCalculata = student.getMedie2Zecimale();

        assertEquals(medieAsteptata,medieCalculata,0);
    }

    //inverse
    @Test
    public void testGetMedie2ZecimaleInverse() throws ExceptieStudentValoriInvalide {
        String nume = "Gigel";
        int varsta = 20;
        
        ArrayList<Integer> note =
                new ArrayList<>(Arrays.asList(9,9,10));
        Student student = new Student(nume, varsta, note);
        student.setNote(note);

        //se bazeaza pe faptul ca relatia inversa dintre medie
        //	si datele de intrare este medie*nrElemente ~= sumaElemente
        float suma = 0;
        for(int nota : note)
            suma += nota;

        float medieCalculata = student.getMedie2Zecimale();

        float valoareRelInversa = medieCalculata * note.size();

        assertEquals(suma, valoareRelInversa, 0.05);
    }
    //cross
    @Test
    public void testGetMedie2ZecimaleCross() throws ExceptieStudentValoriInvalide {
        String nume = "Gigel";
        int varsta = 20;

        ArrayList<Integer> note =
                new ArrayList<>(Arrays.asList(9,9,10));
        Student student = new Student(nume, varsta, note);
        student.setNote(note);

        //obtin rezultat prin alta metoda
        float suma = 0;
        for(int nota : note)
            suma += nota;
        float medie = suma/note.size();
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);

        String medieFormatata = df.format(medie);

        float medieAsteptata = Float.parseFloat(medieFormatata);

        float medieCalculata = student.getMedie2Zecimale();

        assertEquals(medieAsteptata, medieCalculata, 0);

    }
}
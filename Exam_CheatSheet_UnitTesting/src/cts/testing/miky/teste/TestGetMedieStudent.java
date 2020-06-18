package cts.testing.miky.teste;

import cts.testing.miky.Student;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestGetMedieStudent {

    //test Right / Conformance 1
    @Test
    public void testGetMedieValoriRight() {
        //definire date de test
        ArrayList<Integer> note = new ArrayList<>();

        note.add(9);
        note.add(10);
        note.add(9);

        Student student = new Student("Gigel", 20, note);

        //definire rezultat asteptat
        float valoareAsteptata = 9.33f;

        //obtinere rezultat (testare functie)
        float medieCalculata = student.getMedie();

        //verific rezultatul
        assertEquals("Medie incorecta pentru valori normale!", valoareAsteptata, medieCalculata, 0.005);
    }

    //test existance?
    @Test
    public void testGetMedieListaFaraNote() {
        //1.
        ArrayList<Integer> note = new ArrayList<>();
        Student student = new Student("Gigel", 20, note);
        student.setNote(note);

        //2.
        float valoareAsteptata = 0;

        //3.
        float medieCalculata = student.getMedie();

        //4.
        assertEquals("Studentul nu are note ", valoareAsteptata, medieCalculata, 0);


    }

}
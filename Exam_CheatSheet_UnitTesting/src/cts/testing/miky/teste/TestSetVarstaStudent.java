package cts.testing.miky.teste;

import cts.testing.miky.Student;
import cts.testing.miky.exceptii.ExceptieStudentVarstaInvalida;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestSetVarstaStudent {

    //Right/Conformance 1 pe setter
    @Category({Categorie.class})
    @Test
    public void testSetVarstaRight() {
        String nume = "Gigel";
        int varsta = 20;
        ArrayList<Integer> note = new ArrayList<>();
        note.add(9);
        note.add(9);
        note.add(10);
        Student student = new Student(nume, varsta, note);

        int varstaNoua = 25;


        student.setVarsta(varstaNoua);

        assertEquals(varstaNoua, student.getVarsta());
    }


    //Error Condition /Existance /Conformance2
    @Test(expected = ExceptieStudentVarstaInvalida.class)
    public void testSetVarstaConditieEroare() {
        String nume = "Gigel";
        int varsta = 20;
        ArrayList<Integer> note = new ArrayList<>();
        note.add(9);
        note.add(9);
        note.add(10);
        Student student = new Student(nume, varsta, note);

        int varstaInvalida = -24;

        student.setVarsta(varstaInvalida);


        //=> validare pe setVarsta
    }
}

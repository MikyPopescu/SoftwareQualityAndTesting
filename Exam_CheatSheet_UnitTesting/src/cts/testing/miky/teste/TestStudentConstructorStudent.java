package cts.testing.miky.teste;

import cts.testing.miky.Student;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestStudentConstructorStudent {

    //Right / Conformance 1
    //valori corecte => astept rezultate corecte

    @Test
    public void testConstructorRightInitializareAtribute(){

        String nume = "Gigel";
        int varsta = 20;
        ArrayList<Integer> note = new ArrayList<>();
        note.add(9);
        note.add(10);

        Student student = new Student(nume, varsta, note);


        assertEquals("Numele nu este initializat corect", nume, student.getNume());
        assertEquals("Varsta nu este initializata corect", varsta, student.getVarsta());

        for (int i = 0; i < note.size(); i++) {
            assertEquals("Nota nu este initializata corect", (int) note.get(i), student.getNota(i));
        }
    }

    //Test Right - Constructorul genereaza un obiect
    @Test
    public void testConstructorRightCreareObiect() {
        String nume = "Gigel";
        int varsta = 20;
        ArrayList<Integer> note = new ArrayList<>();
        note.add(9);
        note.add(10);

        try {
            Student student = new Student(nume, varsta, note);
            assertNotNull(student);
        } catch (Exception e) {
            fail("Constructorul a generat exceptie pentru valori corecte ale campurilor !");
        }


    }

}
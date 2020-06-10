package ro.ase.csie.acs.cts.recap.teste;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ro.ase.csie.acs.cts.recap.clase.Student;
import ro.ase.csie.acs.cts.recap.interfete.InterfataBazaDeDate;
import ro.ase.csie.acs.cts.recap.interfete.InterfataValidariStudent;
import ro.ase.csie.acs.cts.recap.teste.stub.StubInterfataBazaDeDate;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TestStudentInterfataBD {
    Student student;
    StubInterfataBazaDeDate stubInterfataBD;

    @Before
    public void setUp() throws Exception {
        ArrayList<Integer> note = new ArrayList<>(Arrays.asList(9, 9, 9));
        student = new Student("Anonim", InterfataValidariStudent.VARSTA_MIN, note);

        stubInterfataBD = new StubInterfataBazaDeDate();
    }

    //RIGHT - Conformance - inserarea NU are loc
    @Test
    public void testInsertStudentBDRaspunsZero() throws Exception {
        student = new Student("Gigel", InterfataValidariStudent.VARSTA_MIN, null);

        //clasa anonima
        student.setDB(new InterfataBazaDeDate() {
            //metoda stub
            @Override
            public boolean insertStud(Student student) {
                return true;
            }
        });

        int rezultatObtinut = student.insertStudentBD();
        int rezultatAsteptat = 1;

        assertEquals(rezultatAsteptat, rezultatObtinut);
    }

    //clasa stub
    @Test
    public void testInsertStudentBazaDeDateCuStub() throws Exception {
        ArrayList<Integer> note = new ArrayList<>(Arrays.asList(9, 9, 9));
        student = new Student("Gigel", InterfataValidariStudent.VARSTA_MIN, note);

        student.setDB(stubInterfataBD);
        stubInterfataBD.setRaspunsAsteptatInsertStud(true);

        int rezultatObtinut = student.insertStudentBD();
        int rezultatAsteptat = 1;

        assertEquals(rezultatAsteptat, rezultatObtinut);
    }

}
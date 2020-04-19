package ro.ase.csie.acs.cts.seminar6.teste;

import org.junit.*;
import ro.ase.csie.acs.cts.seminar6.Student;
import ro.ase.csie.acs.cts.seminar6.exceptii.ExceptieStudentVarstaInvalida;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestStudent {
    //test fixture
    //vreau sa mentin valorile pe intreaga durata a test-case-ului => variabile statice si constante
    public static final String NUME = "Gigel";
    public static final int VARSTA = 20;
    public static final ArrayList<Integer> NOTE = new ArrayList<>();
    Student student;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        //resurse globale, nu am nevoie sa le reinitializez in fiecare test
        NOTE.add(9);
        NOTE.add(10);

    }

    @Before
    public void setUp() throws Exception {
        student = new Student(NUME, VARSTA, NOTE);
    }

    @After
    public void tearDown() throws Exception {
    }


    @AfterClass
    public static void tearDownAfterClass() throws Exception {

    }

    @Ignore
    @Test
    public void test() {
        fail("Not yet implemented");
    }


    //Right - Right-BICEP
    //Conformance - CORRECT
    //valori de intrare ok => metoda returneaza rezultatele corecte

    //Test Right - Constructorul initializeaza corect campurile
    @Test
    public void testConstructorRightInitializareAtribute() {
        //1
        String nume = "Gigel";
        int varsta = 20;
        ArrayList<Integer> note = new ArrayList<>();
        note.add(9);
        note.add(10);

        Student student = new Student(nume, varsta, note);

        //2, 3, 4
        assertEquals("Numele nu este initializat corect", nume, student.getNume());
        assertEquals("Varsta nu este initializata corect", varsta, student.getVarsta());
        //verificare vector de note cand nu am referinta unui ArrayList (altfel assertArrayEquals)
        for (int i = 0; i < note.size(); i++) {
            assertEquals("Nota nu este initializata corect", (int) note.get(i), student.getNota(i));
        }
    }

/*
    //Single Responsability -> separ testConstructorRightInitializareAtribute
    @Test
    public void testConstructorRightInitializareNume() {
        String nume = "Gigel";
        int varsta = 20;
        ArrayList<Integer> note = new ArrayList<>();
        note.add(9);
        note.add(10);

        Student student = new Student(nume, varsta, note);

        assertEquals("Numele nu este initializat corect", nume, student.getNume());

    }

    @Test
    public void testConstructorRightInitializareVarsta() {
        String nume = "Gigel";
        int varsta = 20;
        ArrayList<Integer> note = new ArrayList<>();
        note.add(9);
        note.add(10);

        Student student = new Student(nume, varsta, note);

        assertEquals("Varsta nu este initializata corect", varsta, student.getVarsta());
    }

    @Test
    public void testConstructorRightInitializareNote() {
        String nume = "Gigel";
        int varsta = 20;
        ArrayList<Integer> note = new ArrayList<>();
        note.add(9);
        note.add(10);

        Student student = new Student(nume, varsta, note);

        for (int i = 0; i < note.size(); i++) {
            assertEquals("Nota nu este initializata corect", (int) note.get(i), student.getNota(i));
        }
    }
*/

    //Test Right - Constructorul genereaza un obiect
    @Test
    public void testConstructorRightCreareObiect() {

        try {
            Student student = new Student(NUME, VARSTA, NOTE);
            assertNotNull(student);
        } catch (Exception e) {
            fail("Constructorul a generat exceptie pentru valori corecte ale campurilor !");
        }


    }

    //Test Right - setter
    @Test
    public void testSetVarstaRight() {
        // int varstaNoua = 25; din greseala pot pune ac valoare VARSTA
        int varstaDiferita = VARSTA + 1;

        student.setVarsta(varstaDiferita);

        assertEquals(varstaDiferita, student.getVarsta());
    }

    //Test Right - getter
    @Test
    public void testGetMedie2ZecimaleRight() {
        ArrayList<Integer> note = new ArrayList<>();
        note.add(9);
        note.add(9);
        note.add(10);

        student.setNote(note);

        float medieAsteptata = 9.33f;

        float medieCalculata = student.getMedie2Zecimale();

        assertEquals(medieAsteptata, medieCalculata, 0);
    }

    //Error Condition
    @Test(expected = ExceptieStudentVarstaInvalida.class)
    public void testSetVarstaConditieEroare() {
        int varstaInvalida = -24;
        /* JUNIT 3
        try{
            student.setVarsta(varstaInvalida);
            fail("Nu am primit exceptie!");
        }
        catch (ExceptieStudentVarstaInvalida e){
            assertTrue(true);
        }
        */

        //JUNIT 4 => expected (ma astept sa primesc o exceptie)
        student.setVarsta(varstaInvalida);
    }
}
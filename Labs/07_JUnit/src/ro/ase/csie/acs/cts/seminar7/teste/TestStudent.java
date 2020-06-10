package ro.ase.csie.acs.cts.seminar7.teste;

import org.junit.*;
import ro.ase.csie.acs.cts.seminar7.InterfataStudentValid;
import ro.ase.csie.acs.cts.seminar7.Student;
import ro.ase.csie.acs.cts.seminar7.exceptii.ExceptieStudentValoriInvalide;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TestStudent {
    //text fixture
    Student student;

    public static final String NUME;
    public static final int VARSTA = InterfataStudentValid.VARSTA_MIN;
    public static final ArrayList<Integer> NOTE = new ArrayList<>();
    public static final int NR_NOTE = 3;

    //constructor/bloc static
    static {
        //intializare atribute constante
        String numeInitial = "";
        for (int i = 0; i < InterfataStudentValid.DIM_NUME_MIN; i++) {
            numeInitial += "A";
        }
        NUME = numeInitial;
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        for (int i = 0; i < NR_NOTE; i++) {
            NOTE.add(InterfataStudentValid.NOTA_MAX);
        }
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
        fail("Not yet implemented!");
    }

    // Right/Conformance
    @Test
    public void testGetMedie2ZecimaleRight() throws ExceptieStudentValoriInvalide {
        ArrayList<Integer> note = new ArrayList<>(Arrays.asList(9, 9, 10));
        try {
            student.setNote(note);
        } catch (ExceptieStudentValoriInvalide e) {
            fail("Exceptie generata de setNote");
        }

        float medieAsteptata = 9.33f;
        float medieCalculata = student.getMedie2Zecimale();

        assertEquals(medieAsteptata, medieCalculata, 0);

    }

    //Existence
    // - resursa nu exista
    // - referinta note este null
    // este si un test de Error Condition
    @Test(expected = ExceptieStudentValoriInvalide.class)
    public void testGetMedie2ZecimaleExistenceNoteNull() throws ExceptieStudentValoriInvalide {
        ArrayList<Integer> noteNull = null;
        try {
            student.setNote(noteNull);
        } catch (ExceptieStudentValoriInvalide e) {
            fail("Exceptia a fost generata de setNote");
        }

        student.getMedie2Zecimale();
    }

    //Ordering
    @Test
    public void testGetMedie2ZecimaleNoteSortateCrescator() throws ExceptieStudentValoriInvalide {
        ArrayList<Integer> note = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9));

        student.setNote(note);

        float medieAsteptata = 7;
        float medieCalculata = student.getMedie2Zecimale();

        assertEquals(medieAsteptata, medieCalculata, 0);
    }

    //Cardinality
    // - cardinalitate 0
    @Test
    public void testGetMedie2ZecimaleNoteZeroNote() throws ExceptieStudentValoriInvalide {
        ArrayList<Integer> note = new ArrayList<>();
        student.setNote(note);

        float medieAsteptata = 0;
        float medieCalculata = student.getMedie2Zecimale();

        assertEquals(medieAsteptata,medieCalculata,0);
    }

    // - cardinalitate 1
    @Test
    public void testGetMedie2ZecimaleNoteONota() throws ExceptieStudentValoriInvalide {
        int notaUnica=InterfataStudentValid.NOTA_MIN;
        ArrayList<Integer> note = new ArrayList<>();
        note.add(notaUnica);
        student.setNote(note);

        float medieAsteptata = notaUnica;
        float medieCalculata = student.getMedie2Zecimale();

        assertEquals(medieAsteptata,medieCalculata,0);

    }

}
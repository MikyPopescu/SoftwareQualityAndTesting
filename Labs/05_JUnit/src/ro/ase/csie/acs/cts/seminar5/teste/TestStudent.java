package ro.ase.csie.acs.cts.seminar5.teste;

import org.junit.*;
import ro.ase.csie.acs.cts.seminar5.Student;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestStudent {
    //Test fixture
    Student student;

    @Before
    public void setUp() throws Exception {
        System.out.println("Apel setUp");

        //1. definire date de test (de intrare)
        ArrayList<Integer> note = new ArrayList<>();
        note.add(9);
        note.add(10);
        note.add(9);

        student = new Student("Gigel", 20, note);
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Apel setUp global");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Apel tearDown");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Apel tearDown global");

    }

    @Test
    public void Test() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetMedieValoriNormale() {
        //1. definire date de test (de intrare) => in setUp
//        ArrayList<Integer> note = new ArrayList<>();
//        note.add(9);
//        note.add(10);
//        note.add(9);
//
//        Student student = new Student("Gigel", 20, note);

        //2. definire rezultat asteptat
        float valoareAsteptata = 9.33f;

        //3. obtinere rezultat (testare functie)
        float medieCalculata = student.getMedie();

        //4. verificare rezultat
//        if (valoareAsteptata != medieCalculata) {
//            fail("Medie calculata gresit! Am obtinut " + medieCalculata);
//        }
        assertEquals("Medie incorecta pentru valori normale!", valoareAsteptata, medieCalculata, 0.005);

    }

    @Test
    public void testGetMedieListaFaraNote() {
        //1.
        ArrayList<Integer> note = new ArrayList<>();
        //Student student = new Student("Gigel", 20, note); //shadowing, folosesc student declarat global
        student.setNote(note);

        //2.
        float valoareAsteptata = 0;

        //3.
        float medieCalculata = student.getMedie();

        //4.
        assertEquals("Studentul nu are note ", valoareAsteptata, medieCalculata, 0);


    }

}
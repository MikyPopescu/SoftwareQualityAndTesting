package ro.ase.csie.acs.cts.recap.clase;

import ro.ase.csie.acs.cts.recap.exceptii.ExceptieStudentValoriInvalide;
import ro.ase.csie.acs.cts.recap.interfete.InterfataBazaDeDate;
import ro.ase.csie.acs.cts.recap.interfete.InterfataValidariStudent;

import java.util.ArrayList;


public class Student implements InterfataValidariStudent {
    String nume;
    int varsta;
    ArrayList<Integer> note;

    private InterfataBazaDeDate db;

    public void setDB(InterfataBazaDeDate db) {
        this.db = db;
    }

    public Student(String nume, int varsta, ArrayList<Integer> note) {
        super();
        this.nume = nume;
        this.varsta = varsta;
        this.note = note;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume)
            throws ExceptieStudentValoriInvalide {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta)
            throws ExceptieStudentValoriInvalide {

        if (varsta < InterfataValidariStudent.VARSTA_MIN ||
                varsta > InterfataValidariStudent.VARSTA_MAX)
            throw new ExceptieStudentValoriInvalide();

        this.varsta = varsta;
    }

    public void setNote(ArrayList<Integer> note)
            throws ExceptieStudentValoriInvalide {
        this.note = note;
    }

    public int getNrNote() {
        return this.note.size();
    }

    public int getNota(int index) {
        return this.note.get(index);
    }

    public float getMedie2Zecimale()
            throws ExceptieStudentValoriInvalide {

        if (this.note == null)
            throw new ExceptieStudentValoriInvalide();

        float suma = 0;
        for (int nota : this.note) {
            suma += nota;
        }

        float medie = suma / this.note.size();

        return (int) (medie * 100) / 100.0f;

    }


    //stub
    public int insertStudentBD() throws Exception{
        boolean succes = false;
        if(this.db != null){
            succes = this.db.insertStud(this);
        }
        else{
            throw new Exception("Lipsa referinta DB");
        }

        return succes ? 1 : 0;
    }


}

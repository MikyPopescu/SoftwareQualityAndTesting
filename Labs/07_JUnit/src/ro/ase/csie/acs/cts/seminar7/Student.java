package ro.ase.csie.acs.cts.seminar7;

import ro.ase.csie.acs.cts.seminar7.exceptii.ExceptieStudentValoriInvalide;

import java.util.ArrayList;
/*
 *
 * Numele are minim 3 caractere si maxim 255
 * Varsta are valori in [14,90]
 * Nota are valori in [1,10]
 *
 */

public class Student implements InterfataStudentValid {

    //regulile din specificatii nu se pun in comentarii,
    // ci ca variabile intr-o clasa abstracta/interfata separata

    String nume;
    int varsta;
    ArrayList<Integer> note;

    public Student(String nume, int varsta, ArrayList<Integer> note) {
        this.nume = nume;
        this.varsta = varsta;
        this.note = note;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) throws ExceptieStudentValoriInvalide {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) throws ExceptieStudentValoriInvalide {
        this.varsta = varsta;
    }

    public ArrayList<Integer> getNote() {
        return note;
    }

    public void setNote(ArrayList<Integer> note) throws ExceptieStudentValoriInvalide {
        this.note = note;
    }

    public int getNrNote() {
        return this.note.size();
    }

    public int getNota(int index) {
        return this.note.get(index);
    }

    public float getMedie2Zecimale() throws ExceptieStudentValoriInvalide {
        float suma = 0;
        if (this.note == null) {
            throw new ExceptieStudentValoriInvalide();
        }
        for (int nota : this.note) {
            suma += nota;
        }

        float medie = suma / this.note.size();

        return (int) (medie * 100) / 100.0f;
    }
}

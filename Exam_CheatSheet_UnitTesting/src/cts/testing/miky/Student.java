package cts.testing.miky;

import cts.testing.miky.exceptii.ExceptieStudentValoriInvalide;

import java.util.ArrayList;

public class Student {
    String nume; //[3,255]
    int varsta; //[14,90]
    ArrayList<Integer> note; //[1,10]

    public Student(String nume, int varsta, ArrayList<Integer> note) {
        this.nume = nume;
        this.varsta = varsta;
        this.note = note;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public ArrayList<Integer> getNote() {
        return note;
    }

    public void setNote(ArrayList<Integer> note) {
        this.note = note;
    }

    public int getNrNote(){
        return this.note.size();
    }

    public int getNota(int index){
        return this.note.get(index);
    }


    public float getMedie() {
        //daca nu am note
        if (this.note.size() > 0) {
            float suma = 0;
            for (Integer nota : note) {
                suma += nota;
            }
            return suma / note.size();
        } else {
            return 0;
        }
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

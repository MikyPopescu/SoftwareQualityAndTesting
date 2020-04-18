package ro.ase.csie.acs.cts.seminar5;

import java.util.ArrayList;

public class Student {
    String nume;
    int varsta;
    ArrayList<Integer> note;

    public Student(String nume, int varsta, ArrayList<Integer> note) {
        this.nume = nume;
        this.varsta = varsta;
        this.note = note; //shallow copy
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

    public float getMedie() {
        //daca nu am note
        if(this.note.size()>0){
            float suma = 0;
            for (Integer nota: note){
                suma+=nota;
            }
            return suma/note.size();
        }
        else
        {
            return 0;
        }
    }
}

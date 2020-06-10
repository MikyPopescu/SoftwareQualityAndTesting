package ro.ase.csie.acs.cts.seminar6;

import java.util.ArrayList;
/*
*
* Numele are minim 3 caractere si maxim 255
* Varsta are valori in [14,90]
* Nota are valori in [1,10]
*
*/

public class Student {
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

    public float getMedie2Zecimale() {
        return 0;
    }
}

package ro.ase.csie.acs.cts.lecture;

import java.util.ArrayList;

/*
*
* Specificatii:
*
* nume:
*      - minim 3 caractere (litere + spatii)
*      - maxim 255 caractere
* varsta:
*       - valori in intervalul [14,90]
* note:
*       - valori in intervalul [1,10]
*
* metodele genereaza exceptii
*/


public class Student {
    String nume;
    int varsta;
    ArrayList<Integer> note;


    /*
        Conformance:
                   - test cu valori corecte pt care astept un obiect initializat cu acele valori
                   - test cu valori invalide  pt care astept exceptii custom
        Ordering(siruri de valori):
                - nu e neaparat necesar (doar copiez notele)

        Reference:
                - test in care transmitem un ArrayList de note
                - modificam o nota in ArrayList-ul extern (parametru constructor)
                - se modifica notele studentului?
     */

    public Student(String nume, int varsta, ArrayList<Integer> note) {
        this.nume = nume;
        this.varsta = varsta;
        this.note = note;
    }

    public String getNume() {
        return nume;
    }


    /*
     Conformance:
                - test cu valori corecte: dupa set verific (cu get) daca numele studentului a fost modificat
                - test cu valori invalide  pt care astept exceptii particulare
  */

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    /*
     Conformance:
                - test cu valori corecte: testam metoda in intervalul [14, 90]
                - test cu valori invalide, inafara intervalului -> exceptie

  */

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public ArrayList<Integer> getNote() {
        return note;
    }

    public void setNote(ArrayList<Integer> note) {
        this.note = note;
    }


    /*
     Conformance:
                - test cu valori corecte: medie corecta 9 9 10 => 9.33
                - test cu valori invalide deja am validari in get/set/constructor
    Existence:
                - test note == null => exceptie
    Cardinality (siruri de valori):
                - test cu 0 note => exceptie
                - test cu 1 nota => media = nota
                - test cu >=2 note => medie corecta (Conformance)
    */

   public float getMedieDouaZecimale(){
        return 0;
   }



    /*
    Conformance:
      - test cu note random {9,7,8,10,9} => nota minima 7

     Ordering:
      - test in care notele sunt sortate crescator/descrescator
      => nota minima determinata corect, ex {2,3,4,5,6,7} => 2
      => nota minima determinata corect, ex {7,6,5,4,3} => 3
    */

   public int getNotaMinima(){
       return 0;
   }
}

package ro.ase.acs.cts;

public abstract class Vehicul {

//clasa abstracta:
// Minim o metoda abstracta
// poate sa aiba atribute
// poate sa aiba constructor (nu-l voi folosi in mod direct, adica fara new..)
// pot sa am getteri

    //constante:
    private final int MAX_INT = 999999;
    //atribute:
    private int viteza;
    private String denumire;


    //nu am voie sa creez instanta de clasa abstracta, dar pot folosi cu super in clasele derivate
    public Vehicul(int viteza, String denumire) {
        this.viteza = viteza;
        this.denumire = denumire;
    }

    public abstract void deplasare();

    public int getViteza() {
        return viteza;
    }

    public String getDenumire() {
        return denumire;
    }

}

package cts.patterns.miky.implementation;

public class Caracter {
    //stare = atribute
    String nume;
    int puncteViata;


    public Caracter(String nume, int puncteViata) {
        this.nume = nume;
        this.puncteViata = puncteViata;
    }

    public void merge() {
        System.out.println(this.nume + " merge");
    }


    public MementoCaracterJoc salvare() {
        return new MementoCaracterJoc(this.nume, this.puncteViata);
    }

    public void reincarcaStare(MementoCaracterJoc salvareAnterioara) {
        this.nume = salvareAnterioara.getNume();
        this.puncteViata = salvareAnterioara.getPuncteViata();
    }


}

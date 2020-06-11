package ro.ase.csie.acs.cts.seminar12;

import ro.ase.csie.acs.cts.seminar12.InterfataCaractereACME;

public class CaracterACME implements InterfataCaractereACME {
    protected String nume;
    protected int puncte;

    public CaracterACME(String nume, int puncte) {
        this.nume = nume;
        this.puncte = puncte;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getPuncteViata() {
        return puncte;
    }

    @Override
    public void getDescriere() {
        System.out.println("Caracterul " + nume + " are "+puncte+" viata");
    }

    @Override
    public void esteAtacat(int puncte) {
        System.out.println(nume+ "este atacat");
        this.puncte -=puncte;
    }

    @Override
    public void seVindeca(int puncte) {
        System.out.println(nume+ "se vindeca");
        this.puncte +=puncte;
    }
}

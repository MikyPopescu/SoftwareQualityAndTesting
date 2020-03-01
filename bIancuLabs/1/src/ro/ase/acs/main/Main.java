package ro.ase.acs.main;

import ro.ase.acs.cts.Impozabil;
import ro.ase.acs.cts.Masina;
import ro.ase.acs.cts.TipCombustibil;

public class Main {
    //psvm
    public static void main(String[] args) {
        //instanta de masina
        Masina m1 = new Masina(100, "Dacia Logan", 1600);
        m1.setCombustibil(TipCombustibil.benzina); //daca nu setam nimic, era null
        System.out.println(m1.calculeazaImpozit());

        //Design by contract
        Impozabil x; //am creat o referinta la impozabil, nu am voie sa fac instanta (new..)
        x = m1; //upcasting
        x.calculeazaImpozit();
    }
}

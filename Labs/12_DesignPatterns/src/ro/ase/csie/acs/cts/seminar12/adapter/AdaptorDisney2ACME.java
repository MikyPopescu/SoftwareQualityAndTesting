package ro.ase.csie.acs.cts.seminar12.adapter;

import ro.ase.csie.acs.cts.seminar12.InterfataCaractereACME;

public class AdaptorDisney2ACME implements InterfataCaractereACME {
    CaracterDisney caracterDisney;

    public AdaptorDisney2ACME(CaracterDisney caracterDisney) {
        this.caracterDisney = caracterDisney;
    }

    @Override
    public String getNume() {
        return caracterDisney.getDenumire();
    }

    @Override
    public int getPuncteViata() {
        return (int) caracterDisney.getNivelEnergie();
    }

    @Override
    public void getDescriere() {
        System.out.println(caracterDisney.getDenumire() + " - " + caracterDisney.getNivelEnergie());
    }

    @Override
    public void esteAtacat(int puncte) {
        caracterDisney.interactioneaza(puncte);
    }

    @Override
    public void seVindeca(int puncte) {
        caracterDisney.resetareEnergie();
    }
}

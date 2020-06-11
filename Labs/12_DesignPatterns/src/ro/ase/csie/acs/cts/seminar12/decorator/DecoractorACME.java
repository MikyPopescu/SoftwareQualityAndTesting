package ro.ase.csie.acs.cts.seminar12.decorator;

import ro.ase.csie.acs.cts.seminar12.InterfataCaractereACME;

public abstract class DecoractorACME implements InterfataCaractereACME {
    InterfataCaractereACME erou;

    public DecoractorACME(InterfataCaractereACME erou) {
        this.erou = erou;
    }

    @Override
    public String getNume() {
       return erou.getNume();
    }

    @Override
    public int getPuncteViata() {
        return erou.getPuncteViata();
    }

    @Override
    public void getDescriere() {
        erou.getDescriere();
    }

    @Override
    public void esteAtacat(int puncte) {
        erou.esteAtacat(puncte);
    }

    @Override
    public void seVindeca(int puncte) {
        erou.seVindeca(puncte);
    }
}

package cts.patterns.miky.implementation;

public abstract class DecoratorCaractere implements InterfataCaracterJoc {
    InterfataCaracterJoc caracterJoc;

    public DecoratorCaractere(InterfataCaracterJoc caracterJoc) {
        this.caracterJoc = caracterJoc;
    }

    @Override
    public String getNume() {
        return caracterJoc.getNume();
    }

    @Override
    public int getPuncteViata() {
        return caracterJoc.getPuncteViata();
    }

    @Override
    public void getDescriere() {
         caracterJoc.getDescriere();
    }

    @Override
    public void esteAtacat(int puncte) {
        caracterJoc.esteAtacat(puncte);
    }

    @Override
    public void seVindeca(int puncte) {
        caracterJoc.seVindeca(puncte);
    }
}

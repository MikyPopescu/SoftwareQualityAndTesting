package cts.patterns.miky.implementation;

public class ElevLiceu extends Elev {


    public ElevLiceu(String numeElev, float medieSemestru) {
        super(numeElev, medieSemestru);
    }

    @Override
    public void modificaMedia(float medieNoua) {
        System.out.println("Se va modifica media " + this.medieSemestru);
        this.medieSemestru = medieNoua;
    }

    @Override
    public void resetareMedie() {
        System.out.println("Resetare medie ");
        this.medieSemestru = 0;
    }
}

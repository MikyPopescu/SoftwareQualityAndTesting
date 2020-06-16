package cts.patterns.miky.implementation;

public abstract class Elev {
    protected String numeElev;
    protected float medieSemestru;


    public Elev(String numeElev, float medieSemestru) {
        this.numeElev = numeElev;
        this.medieSemestru = medieSemestru;
    }
    public String getNumeElev() {
        return numeElev;
    }
    public void setNumeElev(String numeElev) {
        this.numeElev = numeElev;
    }
    public float getMedieSemestru() {
        return medieSemestru;
    }
    public void setMedieSemestru(float medieSemestru) {
        this.medieSemestru = medieSemestru;
    }

    public abstract void modificaMedia(float medieNoua);
    public abstract void resetareMedie();


}

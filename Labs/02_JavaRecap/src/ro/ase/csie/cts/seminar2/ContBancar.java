package ro.ase.csie.cts.seminar2;

public abstract class ContBancar extends Cont {
    protected String iban;
    protected double balanta;

    @Override
    public double getBalanta() {
        return this.balanta;
    }

    //anulez constructorul default
    //nu vreau sa existe conturi fara iban
    public ContBancar(String iban, double balanta) {
        //super();
        this.iban = iban;
        this.balanta = balanta;
    }
}

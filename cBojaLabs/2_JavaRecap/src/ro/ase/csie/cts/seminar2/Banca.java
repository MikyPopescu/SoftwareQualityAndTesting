package ro.ase.csie.cts.seminar2;

import static ro.ase.csie.cts.seminar2.TipConturi.CREDIT;

public class Banca  {
    private String denumire;
    private static int nextId = 0;

    public Banca(String denumire) {
        //super();
        this.denumire = denumire;
    }

    public ContBancar deschideCont(TipConturi tipCont) {
        String iban = this.denumire + (++nextId);
        switch (tipCont) {
            case CREDIT:
                return new ContCredit(iban);
            case DEBIT:
                return new ContDebit(iban);
            default:
                throw new UnsupportedOperationException();
        }
    }
}

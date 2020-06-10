package ro.ase.csie.cts.seminar2;

import ro.ase.csie.cts.seminar2.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.seminar2.exceptii.ExceptieTransferIlegal;

public class ContCredit extends ContBancar {
    private static final double MAX_CREDIT = 5000;

    public ContCredit(String iban) {
        super(iban, MAX_CREDIT);
    }

    @Override
    public void depune(double suma) {
        this.balanta += suma;
    }

    @Override
    public void retrage(double suma) throws ExceptieFonduriInsuficiente {
        if (suma > this.balanta) {
            throw new ExceptieFonduriInsuficiente();
        }
    }

    @Override
    public void transfer(double suma, Cont destinatie) throws ExceptieTransferIlegal,
                                                    ExceptieFonduriInsuficiente {
        //RTTI
        if (destinatie instanceof ContBancar) {
            //downcasting - fac o referinta de tip ContBancar
            ContBancar contBancar = (ContBancar) destinatie;
            //verificare contul sursa coincide cu contul destinatie
            if (this.iban.equals(contBancar.iban)) {
                throw new ExceptieTransferIlegal("Conturi identice!");
            }
        } else {
            throw new ExceptieTransferIlegal("Destinatie nu este ContBancar");
        }

        this.retrage(suma);
        destinatie.depune(suma);
    }
}

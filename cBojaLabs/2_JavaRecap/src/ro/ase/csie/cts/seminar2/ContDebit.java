package ro.ase.csie.cts.seminar2;

import ro.ase.csie.cts.seminar2.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.seminar2.exceptii.ExceptieTransferIlegal;

public class ContDebit extends ContBancar implements Profitabil {
    public static final double BALANTA_MINIMA = 100;

    public ContDebit(String iban) {
        super(iban, BALANTA_MINIMA);
    }

    @Override
    public void depune(double suma) {
        this.balanta += suma;
    }

    @Override
    public void retrage(double suma) throws ExceptieFonduriInsuficiente {
        if(this.balanta-suma<BALANTA_MINIMA){
            throw new ExceptieFonduriInsuficiente();
        }
        else{
            this.balanta-=suma;
        }
    }

    @Override
    public void transfer(double suma, Cont destinatie) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal {
        if(!(destinatie instanceof ContBancar)){
            throw new ExceptieTransferIlegal("Contul nu este bancar!");
        }
        //verificare referinte (contul sursa coincide cu contul destinatie)
        //TODO: verificare IBAN
        if(this==destinatie){
            throw new ExceptieTransferIlegal("Conturi identice");
        }
        this.retrage(suma);
        destinatie.depune(suma);

    }

    @Override
    public void adaugaDobanda(double rataDobandaValoareAbsoluta) {
        this.balanta *= (1 + rataDobandaValoareAbsoluta);
    }
}

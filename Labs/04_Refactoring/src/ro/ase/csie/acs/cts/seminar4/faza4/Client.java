package ro.ase.csie.acs.cts.seminar4.faza4;

import static ro.ase.csie.acs.cts.seminar4.faza2.Vanzari.*;
import static ro.ase.csie.acs.cts.seminar4.faza3.Vanzari.getDiscountFidelitate;
import static ro.ase.csie.acs.cts.seminar4.faza3.Vanzari.getPretCuDiscount;

public class Client {

    public float calculeazaPretFinal(TipClient tipClient, float pretInitial, int aniFidelitate) throws Exception {
        float pretFinal = 0;
        float discountFidelitate = getDiscountFidelitate(aniFidelitate);

        return getPretCuDiscount(pretInitial, discountFidelitate, tipClient.getDiscount());
    }
}


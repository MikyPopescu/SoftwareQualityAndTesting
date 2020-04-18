package ro.ase.csie.acs.cts.seminar4.faza3;

import static ro.ase.csie.acs.cts.seminar4.faza2.Vanzari.*;
import static ro.ase.csie.acs.cts.seminar4.faza3.Vanzari.getDiscountFidelitate;
import static ro.ase.csie.acs.cts.seminar4.faza3.Vanzari.getPretCuDiscount;

public class Client {
    // switch in loc de if-uri imbricate
    // DRY: formula pentru pret final -> functie + apel
    // Single Responsability (Solid): functia calculeaza discount fidelitate, pret cu discount

    public float calculeazaPretFinal(TipClient tipClient, float pretInitial, int aniFidelitate) throws Exception {
        float pretFinal = 0;
        float discountFidelitate = getDiscountFidelitate(aniFidelitate);

        switch (tipClient) {
            case WOOD:
                pretFinal = pretInitial;
            case BRONZE:
                pretFinal = getPretCuDiscount(pretInitial, discountFidelitate, DISCOUNT_BRONZE);
            case SILVER:
                pretFinal = getPretCuDiscount(pretInitial, discountFidelitate, DISCOUNT_SILVER);
            case GOLD:
                pretFinal = getPretCuDiscount(pretInitial, discountFidelitate, DISCOUNT_GOLD);
            default:
                throw new Exception("Modificare in clasa vanzari!");
        }


    }
}


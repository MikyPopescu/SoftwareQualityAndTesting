package ro.ase.csie.acs.cts.seminar4.faza2;

import static ro.ase.csie.acs.cts.seminar4.faza2.Vanzari.*;

public class Client {

    public float calculeazaPretFinal(TipClient tipClient, float pretInitial, int aniFidelitate) {
        float pretFinal = 0;
        float discountFidelitate = (aniFidelitate > MIN_ANI_FIDELITATE) ?  DISCOUNT_MAX_FIDELITATE : (float) aniFidelitate / 100;
        if (tipClient == TipClient.WOOD) {
            pretFinal = pretInitial;
        } else if (tipClient == TipClient.BRONZE) {
            pretFinal = (pretInitial - (DISCOUNT_BRONZE * pretInitial)) - discountFidelitate * (pretInitial - (DISCOUNT_BRONZE * pretInitial));
        } else if (tipClient == TipClient.SILVER) {
            pretFinal = (pretInitial - (DISCOUNT_SILVER * pretInitial)) - discountFidelitate * (pretInitial - (DISCOUNT_SILVER * pretInitial));
        } else if (tipClient == TipClient.GOLD) {
            pretFinal = (pretInitial - (DISCOUNT_GOLD * pretInitial)) - discountFidelitate * (pretInitial - (DISCOUNT_GOLD * pretInitial));
        }
        return pretFinal;
    }
}


package ro.ase.csie.acs.cts.seminar8;


import ro.ase.csie.acs.cts.seminar8.exceptii.ExceptieTipClient;
import ro.ase.csie.acs.cts.seminar8.marketing.PromotieAbstracta;

import static ro.ase.csie.acs.cts.seminar8.marketing.PromotieAbstracta.*;

public class Client {
    PromotieAbstracta promo;

    public void setPromo(PromotieAbstracta promo) {
        this.promo = promo;
    }

    public float calculeazaPretFinal(TipClient tipClient, float pretInitial, int aniFidelitate) throws ExceptieTipClient {
        float discountFidelitate = promo.getDiscountFidelitate(aniFidelitate);

        switch (tipClient) {
            case WOOD:
                return pretInitial;
            case BRONZE:
                return promo.getPretCuDiscount(pretInitial, discountFidelitate, DISCOUNT_BRONZE);
            case SILVER:
                return promo.getPretCuDiscount(pretInitial, discountFidelitate, DISCOUNT_SILVER);
            case GOLD:
                return promo.getPretCuDiscount(pretInitial, discountFidelitate, DISCOUNT_GOLD);
            default:
                throw new ExceptieTipClient();
        }
    }
}


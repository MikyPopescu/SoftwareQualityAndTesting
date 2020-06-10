package ro.ase.csie.acs.cts.seminar4.faza5;


import ro.ase.csie.acs.cts.seminar4.faza5.exceptii.ExceptieTipClient;
import ro.ase.csie.acs.cts.seminar4.faza5.vanzari.VanzareAbstracta;
import static ro.ase.csie.acs.cts.seminar4.faza5.vanzari.VanzareAbstracta.*;

public class Client {
    VanzareAbstracta vanzareAbstracta;


    public void setVanzareAbstracta(VanzareAbstracta vanzareAbstracta) {
        this.vanzareAbstracta = vanzareAbstracta;
    }

    public float calculeazaPretFinal(TipClient tipClient, float pretInitial, int aniFidelitate) throws ExceptieTipClient {
        float discountFidelitate = vanzareAbstracta.getDiscountFidelitate(aniFidelitate);

        switch (tipClient) {
            case WOOD:
                return pretInitial;
            case BRONZE:
                return vanzareAbstracta.getPretCuDiscount(pretInitial, discountFidelitate, DISCOUNT_BRONZE);
            case SILVER:
                return vanzareAbstracta.getPretCuDiscount(pretInitial, discountFidelitate, DISCOUNT_SILVER);
            case GOLD:
                return vanzareAbstracta.getPretCuDiscount(pretInitial, discountFidelitate, DISCOUNT_GOLD);
            default:
                throw new ExceptieTipClient();
        }
    }
}


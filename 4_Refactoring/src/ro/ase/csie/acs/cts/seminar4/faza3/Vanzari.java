package ro.ase.csie.acs.cts.seminar4.faza3;

import static ro.ase.csie.acs.cts.seminar4.faza2.Vanzari.*;
import static ro.ase.csie.acs.cts.seminar4.faza2.Vanzari.DISCOUNT_GOLD;

public class Vanzari {
    public static final int MIN_ANI_FIDELITATE = 10;
    public static final float DISCOUNT_MAX_FIDELITATE = 0.15f;
    public static final float DISCOUNT_BRONZE = 0.1f;
    public static final float DISCOUNT_SILVER = 0.25f;
    public static final float DISCOUNT_GOLD = 0.35f;

    //functii statice ca sa nu instantiez clasa
    public static float getDiscountFidelitate(int aniFidelitate) {
        return (aniFidelitate > MIN_ANI_FIDELITATE) ? DISCOUNT_MAX_FIDELITATE : (float) aniFidelitate / 100;
    }

    public static float getValoareDiscount(float pret, float discount) {
        return pret * discount;
    }

    public static float getPretCuDiscount(float pret, float discountFidelitate, float discount) {
        float valoareDiscount = getValoareDiscount(pret, discount);
        return (pret - valoareDiscount) * (1 - discountFidelitate);
    }

}

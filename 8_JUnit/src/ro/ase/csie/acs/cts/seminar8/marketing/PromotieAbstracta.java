package ro.ase.csie.acs.cts.seminar8.marketing;

public abstract class PromotieAbstracta {
    public static final int MIN_ANI_FIDELITATE = 10;
    public static final float DISCOUNT_MAX_FIDELITATE = 0.15f;
    public static final float DISCOUNT_BRONZE = 0.1f;
    public static final float DISCOUNT_SILVER = 0.25f;
    public static final float DISCOUNT_GOLD = 0.35f;


    public abstract float getDiscountFidelitate(int aniFidelitate);

    public static float getValoareDiscount(float pret, float discount) {
        return pret * discount;
    }

    public abstract float getPretCuDiscount(float pret, float discountFidelitate, float discount);

}

package ro.ase.csie.acs.cts.seminar4.faza5;

public class Vanzari implements IVanzari{
    public static final int MIN_ANI_FIDELITATE = 10;
    public static final float DISCOUNT_MAX_FIDELITATE = 0.15f;
    public static final float DISCOUNT_BRONZE = 0.1f;
    public static final float DISCOUNT_SILVER = 0.25f;
    public static final float DISCOUNT_GOLD = 0.35f;

    //functii statice ca sa nu instantiez clasa
    public float getDiscountFidelitate(int aniFidelitate) {
        return (aniFidelitate > MIN_ANI_FIDELITATE) ? DISCOUNT_MAX_FIDELITATE : (float) aniFidelitate / 100;
    }

    public float getValoareDiscount(float pret, float discount) {
        return pret * discount;
    }

    public float getPretCuDiscount(float pret, float discountFidelitate, float discount) {
        float valoareDiscount = getValoareDiscount(pret, discount);
        return (pret - valoareDiscount) * (1 - discountFidelitate);
    }

}

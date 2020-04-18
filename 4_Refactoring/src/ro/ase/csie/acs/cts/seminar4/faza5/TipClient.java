package ro.ase.csie.acs.cts.seminar4.faza5;

public enum TipClient {
    WOOD(0), BRONZE(Vanzari.DISCOUNT_BRONZE), SILVER(Vanzari.DISCOUNT_SILVER), GOLD(Vanzari.DISCOUNT_GOLD); //referinte constante la niste obiecte
    private float discount;

    private TipClient(float discount) {
        this.discount = discount;
    }

    public float getDiscount() {
        return this.discount;
    }
}

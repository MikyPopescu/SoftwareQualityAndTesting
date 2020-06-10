package ro.ase.csie.acs.cts.seminar8;



import ro.ase.csie.acs.cts.seminar8.marketing.Promotie;

public enum TipClient {
    WOOD(0), BRONZE(Promotie.DISCOUNT_BRONZE), SILVER(Promotie.DISCOUNT_SILVER), GOLD(Promotie.DISCOUNT_GOLD);
    private float discount;

    private TipClient(float discount) {
        this.discount = discount;
    }

    public float getDiscount() {
        return this.discount;
    }
}

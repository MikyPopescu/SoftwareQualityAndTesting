package ro.ase.csie.acs.cts.seminar4.faza5.vanzari;

public class Vanzari extends VanzareAbstracta{

    public float getDiscountFidelitate(int aniFidelitate) {
          return (aniFidelitate > MIN_ANI_FIDELITATE) ? DISCOUNT_MAX_FIDELITATE : (float) aniFidelitate / 100;
    }

    public float getPretCuDiscount(float pret, float discountFidelitate, float discount) {
        float valoareDiscount = getValoareDiscount(pret, discount);
        return (pret - valoareDiscount) * (1 - discountFidelitate);
    }
}

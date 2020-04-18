package ro.ase.csie.acs.cts.seminar4.faza5;

public interface IVanzari {
    public float getDiscountFidelitate(int aniFidelitate);

    public float getValoareDiscount(float pret, float discount);

    public float getPretCuDiscount(float pret, float discountFidelitate, float discount);
}

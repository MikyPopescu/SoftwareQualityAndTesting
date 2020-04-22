package ro.ase.csie.acs.cts.seminar8.stub;

import ro.ase.csie.acs.cts.seminar8.marketing.PromotieAbstracta;

public class StubPromotie extends PromotieAbstracta {

    float returnGetDiscountFidelitate;
    float returnGetPretCuDiscount;

    boolean genereazaExceptie = false;

    public void setReturnGetDiscountFidelitate(float returnGetDiscountFidelitate) {
        this.returnGetDiscountFidelitate = returnGetDiscountFidelitate;
    }

    public void setReturnGetPretCuDiscount(float returnGetPretCuDiscount) {
        this.returnGetPretCuDiscount = returnGetPretCuDiscount;
    }

    public void setGenereazaExceptie(boolean genereazaExceptie) {
        this.genereazaExceptie = genereazaExceptie;
    }

    @Override
    public float getDiscountFidelitate(int aniFidelitate) {
        return returnGetDiscountFidelitate;
    }

    @Override
    public float getPretCuDiscount(float pret, float discountFidelitate, float discount) {
        if (genereazaExceptie){
            throw new UnsupportedOperationException();
        }
        return returnGetPretCuDiscount;
    }
}

package cts.patterns.miky.implementation;

public class ModulPuncteBonus {
    InterfataCalculPuncteBonus strategieCurenta = null;

    //optional
    public ModulPuncteBonus(InterfataCalculPuncteBonus strategieCurenta) {
        this.strategieCurenta = strategieCurenta;
    }

    public void setStrategieCurenta(InterfataCalculPuncteBonus strategieCurenta) {
        this.strategieCurenta = strategieCurenta;
    }

    public int getPuncteBonusJucator(String nume, int timpJoc) {
        //sun un prieten
        if (strategieCurenta != null) {
            return strategieCurenta.getPuncteBonus();
        } else {
            throw new UnsupportedOperationException(); //daca prietenul nu stie....
        }
    }
}

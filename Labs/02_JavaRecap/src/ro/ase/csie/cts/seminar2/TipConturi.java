package ro.ase.csie.cts.seminar2;

public enum TipConturi {
    CREDIT,DEBIT;

    private int gradRisc;

    public int getGradRisc() {
        return gradRisc;
    }

    @Override
    public String toString() {
        return "Contul este de tip "+this.name();
    }
}

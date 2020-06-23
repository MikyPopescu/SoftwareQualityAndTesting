package cts.g1082.popescu.mihaela.patternStrategy;

public class Avizier {
    IAnunturi strategieCurenta = null;

    public Avizier(IAnunturi strategieCurenta) {
        this.strategieCurenta = strategieCurenta;
    }

    public void setStrategieCurenta(IAnunturi strategieCurenta) {
        this.strategieCurenta = strategieCurenta;
    }

    public String getAnuntBloc(String text) {
        if (strategieCurenta != null) {
            return strategieCurenta.getAnunt() + " "+ text;
        } else {
            throw new UnsupportedOperationException();
        }
    }
}

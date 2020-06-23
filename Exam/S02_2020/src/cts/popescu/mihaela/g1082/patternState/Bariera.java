package cts.popescu.mihaela.g1082.patternState;


public class Bariera {
    int id;

    cts.popescu.mihaela.g1082.patternState.ITrecereCaleFerata stareCurenta = null;

    public Bariera(int id) {
        this.id = id;

        this.stareCurenta = new StareNormala();
    }

    public void setStareCurenta(ITrecereCaleFerata stareCurenta) {
        this.stareCurenta = stareCurenta;
    }

    public void ridicaBariera() {
        this.stareCurenta.ridicaBariera();
    }

    public void coboaraBariera() {
        this.stareCurenta.coboaraBariera();
    }

    public boolean seApropieTren() {
        if (1 + 1 == 2) {
            this.setStareCurenta(new StareAlerta());
            return true;
        } else {
            this.setStareCurenta(new StareCoborata());
            return false;
        }
    }

}

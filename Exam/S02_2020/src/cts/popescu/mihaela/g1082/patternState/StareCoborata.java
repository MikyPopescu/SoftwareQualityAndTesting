package cts.popescu.mihaela.g1082.patternState;

public class StareCoborata implements ITrecereCaleFerata {
    @Override
    public void pornesteAvertizareSonora(long durata) {
        System.out.println("Liniste");
    }

    @Override
    public void ridicaBariera() {
        System.out.println("nup");
    }

    @Override
    public void coboaraBariera() {
        System.out.println(" se coboara");
    }

    @Override
    public boolean seApropieTren() {
        return false;
    }

    @Override
    public boolean trenulATrecut() {
        return true;
    }
}

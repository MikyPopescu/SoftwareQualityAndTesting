package cts.popescu.mihaela.g1082.patternState;

public class StareAlerta implements ITrecereCaleFerata{
    @Override
    public void pornesteAvertizareSonora(long durata) {
        System.out.println("Nino nino");
    }

    @Override
    public void ridicaBariera() {
        System.out.println("nu se ridica");
    }

    @Override
    public void coboaraBariera() {
        System.out.println("repede!!!");
    }

    @Override
    public boolean seApropieTren() {
        return true;
    }

    @Override
    public boolean trenulATrecut() {
        return false;
    }
}

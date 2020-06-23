package cts.popescu.mihaela.g1082.patternState;

public class StareNormala implements ITrecereCaleFerata {


    @Override
    public void pornesteAvertizareSonora(long durata) {
        System.out.println("Niciun sunet in starea normala...");
    }

    @Override
    public void ridicaBariera() {
        System.out.println("Bariera este ridicata in starea normala");
    }

    @Override
    public void coboaraBariera() {
        System.out.println("---");
    }

    @Override
    public boolean seApropieTren() {
        return false;
    }

    @Override
    public boolean trenulATrecut() {
        return false;
    }


}

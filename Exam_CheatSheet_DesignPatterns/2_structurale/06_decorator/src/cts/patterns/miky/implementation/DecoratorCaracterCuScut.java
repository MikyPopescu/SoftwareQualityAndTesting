package cts.patterns.miky.implementation;

public class DecoratorCaracterCuScut extends DecoratorCaractere {
    String scut;

    public DecoratorCaracterCuScut(InterfataCaracterJoc caracterJoc, String scut) {
        super(caracterJoc);
        this.scut = scut;
    }

    @Override
    public void esteAtacat(int puncte) {
        System.out.println("Se apara cu scut " + scut);
        super.esteAtacat(puncte / 2);
    }
}

package ro.ase.csie.acs.cts.seminar12.decorator;

import ro.ase.csie.acs.cts.seminar12.InterfataCaractereACME;

public class DecoratorScut extends DecoractorACME {
    String scut;



    public DecoratorScut(InterfataCaractereACME erou,String scut) {
        super(erou);
        this.scut=scut;
    }

    @Override
    public void esteAtacat(int puncte) {
        System.out.println("Se apara cu un scut " +scut);
        super.esteAtacat(puncte/2);
    }
}

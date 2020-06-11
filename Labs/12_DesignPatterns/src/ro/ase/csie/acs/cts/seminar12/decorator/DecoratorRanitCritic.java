package ro.ase.csie.acs.cts.seminar12.decorator;

import ro.ase.csie.acs.cts.seminar12.InterfataCaractereACME;

public class DecoratorRanitCritic extends DecoractorACME {


    public DecoratorRanitCritic(InterfataCaractereACME erou) {
        super(erou);
    }

    @Override
    public void esteAtacat(int puncte) {
        super.esteAtacat(puncte);
        if(this.erou.getPuncteViata()<100){
            System.out.println("Atentie! Ranit critic! ");
        }
    }
}

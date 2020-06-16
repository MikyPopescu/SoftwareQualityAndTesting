package cts.patterns.miky.client;

import cts.patterns.miky.implementation.CaracterJoc;
import cts.patterns.miky.implementation.DecoratorCaracterCuScut;
import cts.patterns.miky.implementation.DecoratorCaracterRanitCritic;
import cts.patterns.miky.implementation.InterfataCaracterJoc;

public class TestDecorator {
    public static void main(String[] args) {
        InterfataCaracterJoc superman = new CaracterJoc("Superman",1000);
        InterfataCaracterJoc batman = new CaracterJoc("Batman",1000);

        //in mod normal
        superman.getDescriere();
        superman.esteAtacat(200);
        superman.getDescriere();
        System.out.println("\n---------------------\n");

        //cu decoratorul primeste un scut
        DecoratorCaracterCuScut supermanCuScut = new DecoratorCaracterCuScut(superman,"scut de lemn");
        supermanCuScut.esteAtacat(200);
        supermanCuScut.getDescriere();

        System.out.println("\n---------------------\n");
        //sau
        DecoratorCaracterRanitCritic batmanCuAlerta = new DecoratorCaracterRanitCritic(batman);
        batmanCuAlerta.esteAtacat(990);

    }
}

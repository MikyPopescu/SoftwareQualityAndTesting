package ro.ase.csie.acs.cts.seminar12.test;

import ro.ase.csie.acs.cts.seminar12.CaracterACME;
import ro.ase.csie.acs.cts.seminar12.InterfataCaractereACME;
import ro.ase.csie.acs.cts.seminar12.adapter.*;
import ro.ase.csie.acs.cts.seminar12.decorator.DecoratorRanitCritic;
import ro.ase.csie.acs.cts.seminar12.decorator.DecoratorScut;

import java.util.ArrayList;

public class TestClientJoc {
    public static void main(String[] args) {
        //test adapter
        ArrayList<InterfataCaractereACME> eroi = new ArrayList<>();
        eroi.add(new CaracterACME("Superman", 1000));
        eroi.add(new CaracterACME("Batman", 800));

        for (InterfataCaractereACME erou : eroi) {
            erou.getDescriere();
            erou.esteAtacat(50);
        }

        //vreau un caracter disney in joc
        //Problema: complexitatea creste
        CaracterDisney tweety = new LooneyTune("Tweety", 500);
        ArrayList<CaracterDisney> caractereDisney = new ArrayList<>();
        caractereDisney.add(tweety);


        //Adapter:
        //eroi.add(tweety);
        System.out.println("------------------------------------");
        AdaptorDisney2ACME adaptorTweety = new AdaptorDisney2ACME(tweety);
        eroi.add(adaptorTweety);
        for (InterfataCaractereACME erou : eroi) {
            erou.getDescriere();
            erou.esteAtacat(50);
        }


        System.out.println("------------------------------------");
        //test decorator
        InterfataCaractereACME batman = new CaracterACME("Batman", 1000);
        InterfataCaractereACME superman = new CaracterACME("Superman", 1000);
        superman.getDescriere();
        superman.esteAtacat(200);
        superman.getDescriere();

        //superman decorat
        System.out.println("------------------------------------");
        DecoratorScut supermanCuScut = new DecoratorScut(superman, "scut 1");
        supermanCuScut.esteAtacat(200);
        supermanCuScut.getDescriere();

        //decorator batman
        DecoratorRanitCritic batmanCuAlerta= new DecoratorRanitCritic(batman);
        batmanCuAlerta.esteAtacat(950);
        batmanCuAlerta.getDescriere();

        //cascada
        DecoratorRanitCritic supermanCuScutCuAlerta = new DecoratorRanitCritic(supermanCuScut);
        supermanCuScutCuAlerta.esteAtacat(1300);
        supermanCuScutCuAlerta.getDescriere();

    }
}

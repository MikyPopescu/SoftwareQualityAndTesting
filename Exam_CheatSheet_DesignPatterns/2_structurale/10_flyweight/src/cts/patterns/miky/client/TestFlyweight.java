package cts.patterns.miky.client;

import cts.patterns.miky.implementation.DetaliiAfisareEcran;
import cts.patterns.miky.implementation.FlyweightFactory;
import cts.patterns.miky.implementation.FlyweightProdus3D;
import cts.patterns.miky.implementation.TipProdus3D;

import java.util.Random;

public class TestFlyweight {
    public static void main(String[] args) {
        //problema: am 3 telefoane pe ecran si in memorie 3 telefoane
//        FlyweightProdus3D telefon1 = new FlyweightProdus3D("telefon.img", "Telefon");
//        FlyweightProdus3D telefon2 = new FlyweightProdus3D("telefon.img", "Telefon");
//        FlyweightProdus3D telefon3 = new FlyweightProdus3D("telefon.img", "Telefon");

        //solutie flyweight -> fac altfel initializarea
        FlyweightProdus3D telefon1= (FlyweightProdus3D) FlyweightFactory.getModel(TipProdus3D.TELEFON);
        FlyweightProdus3D telefon2= (FlyweightProdus3D) FlyweightFactory.getModel(TipProdus3D.TELEFON);
        FlyweightProdus3D telefon3= (FlyweightProdus3D) FlyweightFactory.getModel(TipProdus3D.TELEFON);

        Random random = new Random();
        String[] culori = new String[]{"rosu", "verde", "albastru"};

        telefon1.afisareEcran(new DetaliiAfisareEcran(random.nextInt(100), random.nextInt(200), culori[random.nextInt(3)]));
        telefon2.afisareEcran(new DetaliiAfisareEcran(random.nextInt(100), random.nextInt(200), culori[random.nextInt(3)]));
        telefon3.afisareEcran(new DetaliiAfisareEcran(random.nextInt(100), random.nextInt(200), culori[random.nextInt(3)]));




    }
}

package cts.patterns.miky.implementation;

import java.util.HashMap;

public class FlyweightFactory {

   private static HashMap<TipProdus3D, InterfataFlyweightProdus3D> produse3d = new HashMap<>();


    //eager instantiation
//    static{
//        getModel(TipProdus3D.TELEFON);
//        getModel(TipProdus3D.TELEVIZOR);
//        getModel(TipProdus3D.IMPRIMANTA);
//    }
//public static...
    public static InterfataFlyweightProdus3D getModel(TipProdus3D tip) {
        //lazy instantiation
        InterfataFlyweightProdus3D produs = produse3d.get(tip);

        if (produs == null) {
            //nu am produsul respectiv -> il creez
            switch (tip) {
                case TELEFON:
                    produs = new FlyweightProdus3D("telefon.img", "telefon");
                    break;
                case TELEVIZOR:
                    produs = new FlyweightProdus3D("televizor.img", "televizor");
                    break;
                case IMPRIMANTA:
                    produs = new FlyweightProdus3D("imprimanta.img", "imprimanta");
                    break;
                default:
                    throw new UnsupportedOperationException();
            }
            produse3d.put(tip, produs);
        }
        return produs;
    }
}

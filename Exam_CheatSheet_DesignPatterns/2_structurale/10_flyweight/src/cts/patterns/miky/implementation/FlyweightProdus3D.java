package cts.patterns.miky.implementation;

import java.util.ArrayList;
import java.util.Random;

//flyconcret
public class FlyweightProdus3D implements InterfataFlyweightProdus3D {

    //stare permanenta
    String fisierProdus;
    String numeProdus;
    ArrayList<Integer> puncte;

    public FlyweightProdus3D(String fisierProdus, String numeProdus) {
        System.out.println("Generare produs pentru "+numeProdus);
        this.fisierProdus = fisierProdus;
        this.numeProdus = numeProdus;
        Random random = new Random();
        this.puncte = new ArrayList<>(random.nextInt(1000));

    }

    //starea temporara este data de detalii
    @Override
    public void afisareEcran(DetaliiAfisareEcran detalii) {
        System.out.println("Afisare produs 3D pentru " + numeProdus);
        System.out.println("Numar de puncte: "+this.puncte.size());
        System.out.println(String.format("Coordonate x=%d, y=%d, culoare=%s", detalii.x, detalii.y, detalii.culoare));
    }
}

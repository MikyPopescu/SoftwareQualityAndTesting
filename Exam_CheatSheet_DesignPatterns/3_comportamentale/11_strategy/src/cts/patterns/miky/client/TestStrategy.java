package cts.patterns.miky.client;

import cts.patterns.miky.implementation.ModulPuncteBonus;
import cts.patterns.miky.implementation.StrategieFixa;
import cts.patterns.miky.implementation.StrategieRandom;

public class TestStrategy {
    public static void main(String[] args) {
        ModulPuncteBonus modul = new ModulPuncteBonus(new StrategieFixa());
        int puncte =modul.getPuncteBonusJucator("Miky",1000);
        System.out.println("Miky a primit " + puncte);

        //schimb strategia
        modul.setStrategieCurenta(new StrategieRandom());
        puncte =modul.getPuncteBonusJucator("Miky",1000);
        System.out.println("Miky a primit " + puncte);
    }
}

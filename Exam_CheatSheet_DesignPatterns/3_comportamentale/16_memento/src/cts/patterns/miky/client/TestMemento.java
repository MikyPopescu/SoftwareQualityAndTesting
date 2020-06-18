package cts.patterns.miky.client;

import cts.patterns.miky.implementation.Caracter;
import cts.patterns.miky.implementation.MementoCaracterJoc;

public class TestMemento {
    public static void main(String[] args) {
        Caracter caracter = new Caracter("Miky", 1000);
        MementoCaracterJoc backup = new MementoCaracterJoc();


        backup = caracter.salvare();
        caracter.reincarcaStare(backup);
    }
}

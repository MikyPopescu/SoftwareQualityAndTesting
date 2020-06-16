package client;

import implementation.Produs3D;

public class TestPrototype {
    public static void main(String[] args) {
        Produs3D produsGeneric = new Produs3D("produs.dat");
        Produs3D produs1 = (Produs3D) produsGeneric.clone(); //nu mai astept
        Produs3D produs2 = (Produs3D) produsGeneric.clone();
        Produs3D produs3 = (Produs3D) produsGeneric.clone();
        System.out.println("Finish");
    }
}

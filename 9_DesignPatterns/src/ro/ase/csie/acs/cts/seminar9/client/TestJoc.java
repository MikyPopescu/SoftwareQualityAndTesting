package ro.ase.csie.acs.cts.seminar9.client;

import ro.ase.csie.acs.cts.seminar9.simplefactory.*;
import ro.ase.csie.acs.cts.seminar9.singleton.ContJucator;
import ro.ase.csie.acs.cts.seminar9.singleton.ExceptieCreareJucator;

public class TestJoc {

    public static void main(String[] args) {

        //SINGLETON

//        ContJucator jucator1 = new ContJucator("Superman","123456");
//        ContJucator jucator2= new ContJucator("Batman","123456");
        try {
            ContJucator jucator1 = ContJucator.getJucator("Superman", "123456");
            ContJucator jucator2 = ContJucator.getJucator("Batman", "123456");


            //foloseste constructorul default - nu se mai genereaza exceptie!
//            ContJucator jucator1 = ContJucator.getJucator();
//            ContJucator jucator2 = ContJucator.getJucator();

            System.out.println(jucator1);
            System.out.println(jucator2);

        } catch (ExceptieCreareJucator e) {
            System.out.println("S-a incercat crearea unui jucator diferit!");
        }



        //SIMPLE FACTORY
//        CaracterJoc caracterPozitiv1= new PersonajPozitiv();
//        CaracterJoc caracterPozitiv2 = new PersonajPozitiv();
//        CaracterJoc caracterNegativ1= new PersonajNegativ();

        CaracterJoc caracterPozitiv1= FactoryCaractereJoc.getCaracterJoc("Superman", TipCaractere.POZITIV);
        CaracterJoc caracterPozitiv2= FactoryCaractereJoc.getCaracterJoc("Batman", TipCaractere.POZITIV);
        CaracterJoc caracterNegativ1= FactoryCaractereJoc.getCaracterJoc("Joker", TipCaractere.NEGATIV);

    }
}

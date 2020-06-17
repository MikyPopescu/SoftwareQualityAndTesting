package cts.patterns.miky.client;

import cts.patterns.miky.implementation.Angajat;
import cts.patterns.miky.implementation.CompositeGrup;

public class TestComposite {
    public static void main(String[] args) {
        Angajat gigel = new Angajat("gigel");
        Angajat dorel = new Angajat("dorel");

        CompositeGrup echipaProiect1 = new CompositeGrup("Echipa proiect 1");
        echipaProiect1.adauga(gigel);
        echipaProiect1.adauga(dorel);

        CompositeGrup echipaProiect2 = new CompositeGrup("Echipa proiect 2");
        echipaProiect2.adauga(echipaProiect1);
        echipaProiect2.adauga(new Angajat("Miky"));


        echipaProiect2.participaLaProiect("PeopleSoft CRM");
        echipaProiect2.intraInPauza();
        echipaProiect2.get("Miky").lucreaza(8);

    }
}

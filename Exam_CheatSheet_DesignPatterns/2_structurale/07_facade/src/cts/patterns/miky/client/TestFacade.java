package cts.patterns.miky.client;

import cts.patterns.miky.implementation.*;

public class TestFacade {
    public static void main(String[] args) {

        //problema
        Fereastra feareastraBucatarie = new Fereastra();
        RobinetApa robinetApaBucatarie = new RobinetApa();
        UsaLocuinta usaLocuinta = new UsaLocuinta();
        MasinaDeSpalat masinaSpalat = new MasinaDeSpalat();

        //inchide locuinta
        feareastraBucatarie.inchide();
        robinetApaBucatarie.inchide();
        usaLocuinta.inchide();
        masinaSpalat.opreste();

        //porneste masina de spalat
        robinetApaBucatarie.deschide();
        masinaSpalat.porneste();

        //solutie facade -> interfata simplificata

        FacadeApartament apartament = new FacadeApartament(new Fereastra(),new MasinaDeSpalat(),new RobinetApa(),new UsaLocuinta());

        apartament.pornesteMasinaDeSpalat();
        apartament.inchideCasa();


    }
}

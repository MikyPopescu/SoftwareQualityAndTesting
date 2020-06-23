package cts.g1082.popescu.mihaela.patternCommand;

import java.util.ArrayList;

public class ManagerReparatii {
    ArrayList<SolicitareRezolvareProblema> rezolvari = new ArrayList<>();

    public void adaugaRezolvare(RezolvareProblema rezolvare) {
        rezolvari.add(rezolvare);
    }

    public void reparaProblemaInBloc(String numarBloc, int numarApartament, String problema) {
        if (this.rezolvari.size() > 0) {
            SolicitareRezolvareProblema rezolvare = rezolvari.get(0);
            rezolvari.remove(0);
            rezolvare.reparaProblemaInBloc(numarBloc, numarApartament, problema);
        }
    }
}

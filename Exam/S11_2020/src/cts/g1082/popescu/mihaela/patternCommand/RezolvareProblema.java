package cts.g1082.popescu.mihaela.patternCommand;

public class RezolvareProblema extends SolicitareRezolvareProblema {
    String numarBloc;
    int numarApartament;
    String problema;
    IReparatie reparatie;

    public RezolvareProblema(String numeMeserias, String numarBloc, int numarApartament, String problema, IReparatie reparatie) {
        super(numeMeserias);
        this.numarBloc = numarBloc;
        this.numarApartament = numarApartament;
        this.problema = problema;
        this.reparatie = reparatie;
    }

    @Override
    public void reparaProblemaInBloc(String numarBloc, int numarApartament, String problema) {
        this.reparatie.executaReparatie();
    }
}

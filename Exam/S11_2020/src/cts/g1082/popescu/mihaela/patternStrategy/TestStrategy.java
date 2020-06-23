package cts.g1082.popescu.mihaela.patternStrategy;

public class TestStrategy {
    public static void main(String[] args) {
        Avizier modulAnunturi = new Avizier(new StrategieNicunAnunt());
        String anunt = modulAnunturi.getAnuntBloc(":(");
        System.out.println("Anunt primit: \n" + anunt);

        modulAnunturi.setStrategieCurenta(new StrategieAnunturiAngajare());
        anunt = modulAnunturi.getAnuntBloc("sofer de tir");
        System.out.println("Anunt primit: \n" + anunt);

        modulAnunturi.setStrategieCurenta(new StrategieAnunturiInformative());
        anunt = modulAnunturi.getAnuntBloc("sedinta de bloc");
        System.out.println("Anunt primit: \n" + anunt);
    }
}

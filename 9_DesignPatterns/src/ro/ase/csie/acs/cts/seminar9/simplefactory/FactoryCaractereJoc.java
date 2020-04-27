package ro.ase.csie.acs.cts.seminar9.simplefactory;

//implementare simple factory
//permite gestiunea eficienta a crearii de obiecte dintr-o familie

public class FactoryCaractereJoc {

    public static CaracterJoc getCaracterJoc(String nume, TipCaractere tip) {
        switch (tip) {
            case POZITIV:
                return new PersonajPozitiv(nume, 100);
            case NEGATIV:
                return new PersonajNegativ(nume);
            default:
                throw new UnsupportedOperationException();
        }
    }
}

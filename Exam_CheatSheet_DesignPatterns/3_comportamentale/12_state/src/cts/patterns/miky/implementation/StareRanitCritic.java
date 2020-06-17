package cts.patterns.miky.implementation;

public class StareRanitCritic implements InterfataActiuniCaractere {


    @Override
    public void seDeplaseaza() {
        System.out.println("Nu se mai poate deplasa");
    }

    @Override
    public void ataca(String inamic, int puncte, CaracterJoc caracterJoc) {
        System.out.println("Nu mai poate ataca...");
    }
}

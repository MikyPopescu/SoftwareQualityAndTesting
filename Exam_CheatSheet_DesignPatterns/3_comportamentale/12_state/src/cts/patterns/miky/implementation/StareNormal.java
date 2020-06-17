package cts.patterns.miky.implementation;

public class StareNormal implements InterfataActiuniCaractere {




    @Override
    public void seDeplaseaza() {
        System.out.println("Caracterul alearga");
    }

    @Override
    public void ataca(String inamic, int puncte,CaracterJoc caracterJoc) {
        System.out.println(caracterJoc.nume+ "ataca pe "+inamic);
        System.out.println("Lovitura are "+ puncte + " puncte");
    }
}

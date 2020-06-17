package cts.patterns.miky.implementation;

public class StareRanit implements InterfataActiuniCaractere {

    @Override
    public void seDeplaseaza() {
        System.out.println("se misca cu greutate");
    }

    @Override
    public void ataca(String inamic, int puncte, CaracterJoc caracterJoc) {
        System.out.println(caracterJoc.nume + " il loveste cu greu pe " + inamic);
        System.out.println("Putere lovitura " + puncte / 2);
    }
}

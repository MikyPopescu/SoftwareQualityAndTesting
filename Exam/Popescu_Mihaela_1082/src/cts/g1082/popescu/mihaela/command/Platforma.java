package cts.g1082.popescu.mihaela.command;

public class Platforma {
    String codActiuni;
    int nrActiuni;
    Operatiune tip;

    public void operatiuneBroker1(String codActiuni, int nrActiuni, Operatiune tip) {
        System.out.println("Broker1 " + tip + ": " + codActiuni + " x " + nrActiuni);
    }

    public void operatiuneBroker2(String codActiuni, int nrActiuni, Operatiune tip) {
        System.out.println("Broker2 " + tip + ": " + codActiuni + " x " + nrActiuni);
    }
}

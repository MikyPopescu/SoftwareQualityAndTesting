package cts.patterns.miky.implementation;

//Clasa care ofera o singura instanta
//ConexiuneBD
//LucruFisiere
public class Singleton {
    private static Singleton instanta = null;

    private Singleton() {

    }

    public static Singleton getInstanta() {
        if (instanta == null) {
            instanta = new Singleton();
        }
        return instanta;
    }
}

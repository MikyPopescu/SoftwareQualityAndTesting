package cts.patterns.miky.implementation;

public abstract class NodAbstract {
    String nume;

    public NodAbstract(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    //metode specifice nodului frunza, angajatilor
    public abstract void participaLaProiect(String denumire);
    public abstract void intraInPauza();
    public abstract void lucreaza(int ore);

    //metode specifice grupurilor, noduri de tip composite
    ///// v1

//    public abstract void adauga(NodAbstract nod);
//    public abstract void sterge(int index);
//    public abstract NodAbstract get(String nume);

    ////v2

    public void adauga(NodAbstract nod) {
        throw new UnsupportedOperationException();
    }


    public void sterge(int index) {
        throw new UnsupportedOperationException();
    }

    public NodAbstract get(String nume) {
        throw new UnsupportedOperationException();
    }
}

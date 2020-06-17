package cts.patterns.miky.implementation;

//frunza
public class Angajat extends NodAbstract {

    public Angajat(String nume) {
        super(nume);
    }

    @Override
    public void participaLaProiect(String denumire) {
        System.out.println(this.nume + " participa la proiectul " + denumire);
    }

    @Override
    public void intraInPauza() {
        System.out.println(this.nume + " a intrat in pauza");
    }

    @Override
    public void lucreaza(int ore) {
        System.out.println(this.nume + " lucreaza de " + ore + " ore");
    }
////////////////v1
//    @Override
//    public void adauga(NodAbstract nod) {
//        throw new UnsupportedOperationException();
//    }
//
//    @Override
//    public void sterge(int index) {
//        throw new UnsupportedOperationException();
//    }
//
//    @Override
//    public NodAbstract get(String nume) {
//        throw new UnsupportedOperationException();
//    }
}

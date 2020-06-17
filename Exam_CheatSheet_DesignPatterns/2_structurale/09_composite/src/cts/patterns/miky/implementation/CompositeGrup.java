package cts.patterns.miky.implementation;

import java.util.ArrayList;

public class CompositeGrup extends NodAbstract {

    ArrayList<NodAbstract> noduri = new ArrayList<>();

    public CompositeGrup(String nume) {
        super(nume);
    }

    @Override
    public void participaLaProiect(String denumire) {
        for (NodAbstract nod : noduri) {
            nod.participaLaProiect(denumire);
        }
    }

    @Override
    public void intraInPauza() {
        for (NodAbstract nod : noduri) {
            if (nod instanceof Angajat) {
                nod.intraInPauza();
            }
        }
    }

    @Override
    public void lucreaza(int ore) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void adauga(NodAbstract nod) {
        this.noduri.add(nod);
    }

    @Override
    public void sterge(int index) {
        if (index >= 0 && index < this.noduri.size()) {
            this.noduri.remove(index);
        }
    }

    @Override
    public NodAbstract get(String nume) {
        NodAbstract referinta = null;
        for (NodAbstract nod : noduri) {
            if (nod.nume.equals(nume)) {
                referinta = nod;
            }
        }
        return referinta;
    }
}

package cts.g1082.popescu.mihaela;

public class Avion {
    //greutateaIncarcata se afla in intervalul [0, CAPACITATE].
    //nu are cum sa aiba o greutate mai mare decat capacitatea
    private float greutateaIncarcata;
    //lungima sirului de caractere pentru model este de minim 5.
    private String model;
    //capacitatea ete cuprinsa intre 100 si 1000 de tone.
    private final float CAPACITATE;

    public Avion(float greutateaIncarcata, String model, float capacitate) {
        this.greutateaIncarcata = greutateaIncarcata;
        this.model = model;
        this.CAPACITATE = capacitate;
    }


    public Avion() {
        this.greutateaIncarcata = 0;
        this.model = null;
        this.CAPACITATE = 100;
    }


    public float getGreutateIncarcata() {
        return greutateaIncarcata;
    }

    public void setGreutateIncarcata(float greutateaIncarcata) {
        this.greutateaIncarcata = greutateaIncarcata;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getCapacitate() {
        return CAPACITATE;
    }

    public float getPretBilet(int nrPasageri) {
        int pretBilet = 100;

        if (nrPasageri < 80)
            return pretBilet;
        else if (nrPasageri < 250)
            return pretBilet * 2;
        else
            return pretBilet * 3;
    }

    public int getNumarLocuriOcupate(boolean[] statusLocuri) {


        int nr = 0;
        for (boolean esteOcupat : statusLocuri)
            if (esteOcupat)
                nr += 1;
        return nr;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Avion [greutate incarcata=");
        builder.append(greutateaIncarcata);
        builder.append(", model=");
        builder.append(model);
        builder.append(", CAPACITATE=");
        builder.append(CAPACITATE);
        builder.append("]");
        return builder.toString();
    }

}
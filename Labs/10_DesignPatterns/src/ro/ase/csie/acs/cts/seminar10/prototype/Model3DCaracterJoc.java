package ro.ase.csie.acs.cts.seminar10.prototype;

import java.util.ArrayList;

public class Model3DCaracterJoc {
    String nume;
    String culoare;
    ArrayList<Integer> puncteGrafice;

    public Model3DCaracterJoc(String fisierGrafic) {
        System.out.println("Incarcare si generare model 3D personaj");
        puncteGrafice = new ArrayList<>();
        //incarc 1000 puncte grafice
        for (int i = 0; i < 10000; i++) {
            puncteGrafice.add(i + 1);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Model3DCaracterJoc() {
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public Object clone() {
        Model3DCaracterJoc clona = new Model3DCaracterJoc();
        clona.culoare = this.culoare;
        clona.nume = this.nume;
        clona.puncteGrafice = (ArrayList<Integer>) this.clone();

        return clona;
    }
}

package implementation;

import java.util.ArrayList;

public class Produs3D implements Cloneable {

    String nume;
    String culoare;
    ArrayList<Integer> puncteGrafice;

    public Produs3D(String fisierGrafic) {
        System.out.println("Incarcare si generare model 3D");
        puncteGrafice = new ArrayList<>();
        //generez 1000 de puncte grafice
        for(int i = 0; i < 1000; i++) {
            puncteGrafice.add(i+1);
        }
       try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
       }
    }


    private Produs3D() {

    }


    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }


    //metoda clone
    @Override
    public Object clone() {
        Produs3D clona =
                new Produs3D();
        clona.culoare = this.culoare;
        clona.nume = this.nume;
        clona.puncteGrafice = new ArrayList<Integer>(this.puncteGrafice);
        return clona;
    }
}

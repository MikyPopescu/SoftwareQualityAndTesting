package cts.patterns.miky.implementation;

public class CaracterJoc {
    String nume;
    int puncteViata;

    InterfataActiuniCaractere stareCurenta = null;

    public CaracterJoc(String nume, int puncteViata) {
        this.nume = nume;
        this.puncteViata = puncteViata;

        //stare initiala
        this.stareCurenta = new StareNormal();
    }

    public void setStareCurenta(InterfataActiuniCaractere stareCurenta) {
        this.stareCurenta = stareCurenta;
    }

    public void merge() {
        this.stareCurenta.seDeplaseaza();
    }

    public void ataca(String inamic, int puncte) {
        this.stareCurenta.ataca(inamic, puncte, this);
    }

    //schimba stare
    public void seVindeca(int puncte) {
        this.puncteViata += puncte;
        if (this.puncteViata < 500) {
            this.setStareCurenta(new StareRanit());
        } else {
            if (this.puncteViata < 1000) {
                this.setStareCurenta(new StareNormal());
            }
        }
    }

    public void esteLovit(int puncte) {
        this.puncteViata -= puncte;
        if (this.puncteViata < 50) {
            this.setStareCurenta(new StareRanitCritic());
        } else {
            if (this.puncteViata < 500) {
                this.setStareCurenta(new StareRanit());
            }
        }
    }

}

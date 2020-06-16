package cts.patterns.miky.implementation;

public class StudentLicenta extends Student {
    @Override
    public void afisareStudent() {
        System.out.println("Afisare student licenta");
    }

    public StudentLicenta(String nume, float medie) {
        this.nume = nume;
        this.medie = medie;
    }
}

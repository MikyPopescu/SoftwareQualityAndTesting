package cts.patterns.miky.implementation;

public class Student implements InterfataStudent {
    protected String nume;
    protected float medie;

    public Student(String nume, float medie) {
        this.nume = nume;
        this.medie = medie;
    }


    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public float getMedie() {
        return medie;
    }

    @Override
    public void getDescriere() {
        System.out.println("Elevul cu numele " + this.nume + " are media " + this.medie);
    }
}

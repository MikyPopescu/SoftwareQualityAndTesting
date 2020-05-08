package ro.ase.csie.acs.cts.seminar10.builder;

import ro.ase.csie.acs.cts.seminar10.interfaces.InterfataArma;

public class SuperErou {
    String nume;
    boolean estePozitiv;
    boolean esteRanitCritic;
    String superPutere;
    String superSuperPutere;
    InterfataArma armaManaStanga;
    InterfataArma armaManaDreapta;

    private SuperErou() {
    }

    private SuperErou(String nume, boolean estePozitiv, boolean esteRanitCritic, String superPutere, String superSuperPutere, InterfataArma armaManaStanga, InterfataArma armaManaDreapta) {
        this.nume = nume;
        this.estePozitiv = estePozitiv;
        this.esteRanitCritic = esteRanitCritic;
        this.superPutere = superPutere;
        this.superSuperPutere = superSuperPutere;
        this.armaManaStanga = armaManaStanga;
        this.armaManaDreapta = armaManaDreapta;
    }

    private void setNume(String nume) {
        this.nume = nume;
    }

    private void setEstePozitiv(boolean estePozitiv) {
        this.estePozitiv = estePozitiv;
    }

    private void setEsteRanitCritic(boolean esteRanitCritic) {
        this.esteRanitCritic = esteRanitCritic;
    }

    private void setSuperPutere(String superPutere) {
        this.superPutere = superPutere;
    }

    private void setSuperSuperPutere(String superSuperPutere) {
        this.superSuperPutere = superSuperPutere;
    }

    private void setArmaManaStanga(InterfataArma armaManaStanga) {
        this.armaManaStanga = armaManaStanga;
    }

    private void setArmaManaDreapta(InterfataArma armaManaDreapta) {
        this.armaManaDreapta = armaManaDreapta;
    }

    //definire builder pentru supererou
    public static class SuperErouBuilder {
        private SuperErou superErou;

        //se vor solicita atributele considerate obligatorii pt un SuperErou
        public SuperErouBuilder(String nume) {
            this.superErou = new SuperErou();
            this.superErou.setNume(nume);
        }

        public SuperErouBuilder estePozitiv() {
            this.superErou.setEstePozitiv(true);
            return this; //referinta builder curent
        }

        public SuperErouBuilder estePersonajNegativ() {
            this.superErou.setEstePozitiv(false);
            return this;
        }

        public SuperErouBuilder esteRanitCritic() {
            this.superErou.setEsteRanitCritic(true);
            return this;
        }

        public SuperErouBuilder setSuperPutere(String putere) {
            this.superErou.setSuperPutere(putere);
            return this;
        }

        public SuperErouBuilder setSuperSuperPutere(String putere) {
            this.superErou.setSuperSuperPutere(putere);
            return this;
        }

        public SuperErouBuilder setArmaManaStanga(InterfataArma arma){
            this.superErou.setArmaManaStanga(arma);
            return this;
        }

        public SuperErouBuilder setArmaManaDreapta(InterfataArma arma){
            this.superErou.setArmaManaDreapta(arma);
            return this;
        }

        //intorc SuperEroul creat
        public SuperErou build(){
            return this.superErou;
        }
    }
}

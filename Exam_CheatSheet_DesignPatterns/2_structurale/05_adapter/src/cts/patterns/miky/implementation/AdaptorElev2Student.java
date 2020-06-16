package cts.patterns.miky.implementation;

//sursa2destinatie
//adaptor obiecte: am deja o solutie, trebuie sa adaptez doar niste obiecte existente
//adaptor de clase: mi se da un framework, vreau o solutie prin care pot crea obiecte deja adaptate la x

public class AdaptorElev2Student implements InterfataStudent{
    Elev elev;

    public AdaptorElev2Student(Elev elev) {
        this.elev = elev;
    }


    @Override
    public String getNume() {
        return elev.getNumeElev();
    }

    @Override
    public float getMedie() {
        return elev.getMedieSemestru(); //daca erau alte tipuri castam la return
    }

    @Override
    public void getDescriere() {
        System.out.println(elev.getNumeElev()+ " are media " +elev.getMedieSemestru());
    }
}

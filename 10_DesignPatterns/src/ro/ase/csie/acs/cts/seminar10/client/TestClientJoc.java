package ro.ase.csie.acs.cts.seminar10.client;

import ro.ase.csie.acs.cts.seminar10.prototype.Model3DCaracterJoc;
import ro.ase.csie.acs.cts.seminar10.builder.SuperErou;

public class TestClientJoc {

    public static void main(String[] args) {
       /*
       Problema Builder:
        SuperErou superman = new SuperErou("Superman",true,false,"Zboara","",null,null);
        SuperErou batman = new SuperErou("Batman",true,false,"","",null,null);
        SuperErou joker = new SuperErou("Joker",false,false,"","",null,null);

       //1 creare
        SuperErou superErou = new SuperErou();

        //2 initializare
        superErou.setNume("Catwoman");
        superErou.setEstePozitiv(true);*/


        //Test Builder
        //creare + initializare
        // oblig utilizatorul sa isi aleaga atributele pentru supererou, mai departe nu poate schimba, nu are acces la setteri
        SuperErou Superman = new SuperErou.SuperErouBuilder("Superman")
                .estePozitiv()
                .esteRanitCritic()
                .setSuperPutere("Zboara")
                .build();



       //Problema Prototype
       /* Model3DCaracterJoc soldat1 = new Model3DCaracterJoc("Soldat.dat");
        Model3DCaracterJoc soldat2 = new Model3DCaracterJoc("Soldat.dat");

        soldat1.setCuloare("Rosu");
        soldat2.setCuloare("Albastru");

        System.out.println("Start Joc");
        */

        //Test Prototype
        Model3DCaracterJoc soldatGeneric = new Model3DCaracterJoc("Soldat.dat");
        Model3DCaracterJoc soldat3 = (Model3DCaracterJoc) soldatGeneric.clone(); //nu mai astept
        Model3DCaracterJoc soldat4 = (Model3DCaracterJoc) soldatGeneric.clone();
        Model3DCaracterJoc soldat5 = (Model3DCaracterJoc) soldatGeneric.clone();
        System.out.println("Start Joc");
    }
}

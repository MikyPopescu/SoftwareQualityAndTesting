package cts.patterns.miky.client;

import cts.patterns.miky.implementation.*;

import java.util.ArrayList;

public class TestAdapter {
    public static void main(String[] args) {
        //initial
        ArrayList<InterfataStudent> studenti = new ArrayList<>();

        studenti.add(new Student("gigel", 9));
        studenti.add(new Student("dorel", 10));

        for (InterfataStudent student : studenti) {
            student.getDescriere();
        }


        //integrarea de studenti ---->ineficient
        Elev elev = new ElevLiceu("Miky", 5);
        ArrayList<Elev> elevi = new ArrayList<Elev>();
        elevi.add(elev);


        //solutie adapter
        //vreau sa fac studenti.add(elev);
        AdaptorElev2Student adaptorElev = new AdaptorElev2Student(elev); //am un obiect care este interfata student, dar in interior este ascuns un student
        studenti.add(adaptorElev);

        System.out.println("\n----------------------------\n");
        for (InterfataStudent student : studenti) {
            student.getDescriere();
        }
    }
}

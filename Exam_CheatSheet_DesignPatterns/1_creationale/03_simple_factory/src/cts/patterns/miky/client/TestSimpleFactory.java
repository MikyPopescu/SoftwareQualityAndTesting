package cts.patterns.miky.client;

import cts.patterns.miky.implementation.FactoryStudent;
import cts.patterns.miky.implementation.Student;
import cts.patterns.miky.implementation.TipStudent;

public class TestSimpleFactory {
    public static void main(String[] args) {
        Student studentLicenta1 = FactoryStudent.getStudent("gigel", TipStudent.LICENTA);
        studentLicenta1.afisareStudent();
        Student studentLicenta2 = FactoryStudent.getStudent("dorel", TipStudent.LICENTA);
        studentLicenta2.afisareStudent();
        Student studentMaster = FactoryStudent.getStudent("maria", TipStudent.MASTER);
        studentMaster.afisareStudent();
    }



}

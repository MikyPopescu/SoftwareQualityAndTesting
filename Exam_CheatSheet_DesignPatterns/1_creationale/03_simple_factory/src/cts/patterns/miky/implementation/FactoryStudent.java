package cts.patterns.miky.implementation;

public class FactoryStudent {
    public static Student getStudent(String nume,TipStudent tip){
        switch (tip){
            case LICENTA:
                return new StudentLicenta(nume,10);
            case MASTER:
                return new StudentMaster(nume);
            default:
                throw new UnsupportedOperationException();
        }
    }
}

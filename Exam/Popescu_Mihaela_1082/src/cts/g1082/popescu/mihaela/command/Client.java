package cts.g1082.popescu.mihaela.command;

import java.util.ArrayList;

public class Client implements IClientBursa {
    public ArrayList<UnseteledOperation> operatiuni;
    public ArrayList<OperatiuneBroker> processOperation;
    String nume;

    public Client(String nume) {
        this.nume = nume;
        operatiuni = new ArrayList<>();
    }


    @Override
    public void vinde(String codActiuni, int nrActiuni) {
        this.operatiuni.add(new UnseteledOperation(codActiuni, nrActiuni, Operatiune.VANZARE));
    }

    @Override
    public void cumpara(String codActiuni, int nrActiuni) {
        this.operatiuni.add(new UnseteledOperation(codActiuni, nrActiuni, Operatiune.CUMPARARE));
    }

    public void selectBroker(){

    }


}



package cts.g1082.popescu.mihaela.command;

public class OperatiuneBroker2 implements OperatiuneBroker{

    private Platforma platforma;
    private Operatiune tip;
    String codActiuni;
    int nrActiuni;



    public OperatiuneBroker2(Platforma platforma, String codActiuni, int nrActiuni, Operatiune tip){
        this.platforma = platforma;
        this.tip = tip;
    }


    @Override
    public void executa() {
        platforma.operatiuneBroker2(codActiuni,nrActiuni,tip);

    }
}

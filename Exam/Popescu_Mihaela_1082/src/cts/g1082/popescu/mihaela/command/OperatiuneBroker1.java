package cts.g1082.popescu.mihaela.command;

public class OperatiuneBroker1  implements OperatiuneBroker{
    private Platforma platforma;
    private Operatiune tip;
    String codActiuni;
    int nrActiuni;
    String numecClient;
    boolean procesata;

    public OperatiuneBroker1(Platforma platforma, Operatiune tip, String codActiuni, int nrActiuni, String numecClient, boolean procesata) {
        this.platforma = platforma;
        this.tip = tip;
        this.codActiuni = codActiuni;
        this.nrActiuni = nrActiuni;
        this.numecClient = numecClient;
        this.procesata = procesata;
    }

    @Override
    public void executa() {
        platforma.operatiuneBroker2(codActiuni,nrActiuni,tip);

    }

}

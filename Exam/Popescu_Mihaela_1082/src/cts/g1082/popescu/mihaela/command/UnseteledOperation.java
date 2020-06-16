package cts.g1082.popescu.mihaela.command;

public class UnseteledOperation {
    String numeClient;
    int  nrActiuni;
    private Operatiune tip;

    public UnseteledOperation(String numeClient, int nrActiuni, Operatiune tip) {
        this.numeClient = numeClient;
        this.nrActiuni = nrActiuni;
        this.tip = tip;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public int getNrActiuni() {
        return nrActiuni;
    }

    public void setNrActiuni(int nrActiuni) {
        this.nrActiuni = nrActiuni;
    }

    public Operatiune getTip() {
        return tip;
    }

    public void setTip(Operatiune tip) {
        this.tip = tip;
    }
}

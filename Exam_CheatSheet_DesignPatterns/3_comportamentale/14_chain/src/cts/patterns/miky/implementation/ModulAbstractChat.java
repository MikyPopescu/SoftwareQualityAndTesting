package cts.patterns.miky.implementation;

//handler
public abstract class ModulAbstractChat {
    ModulAbstractChat next;
    String numeModul;

    public ModulAbstractChat(String numeModul) {
        this.numeModul = numeModul;
    }

    public void setNext(ModulAbstractChat next) {
        this.next = next;
    }

    public abstract void PorcesareMesajChat(MesajChat mesaj);


}

package ro.ase.csie.acs.cts.seminar14.chain;

public abstract class ModulChatAbstract {
    ModulChatAbstract next;
    String numeModul;

    public ModulChatAbstract(String numeModul) {
        super();
        this.numeModul = numeModul;
    }

    public void setNext(ModulChatAbstract next) {
        this.next = next;
    }

    public abstract void procesareMesajChat(MesajChat mesaj);
}

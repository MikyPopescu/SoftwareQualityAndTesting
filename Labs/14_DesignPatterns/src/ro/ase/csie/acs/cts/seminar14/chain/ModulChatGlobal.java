package ro.ase.csie.acs.cts.seminar14.chain;

public class ModulChatGlobal extends ModulChatAbstract {
    public ModulChatGlobal(String numeModul) {
        super(numeModul);
    }

    @Override
    public void procesareMesajChat(MesajChat mesaj) {
        System.out.println("Mesaj catre toti: " + mesaj.getText());

        if(this.next != null)
            this.next.procesareMesajChat(mesaj);
    }
}

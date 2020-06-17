package cts.patterns.miky.implementation;

public class ModulChatGlobal extends ModulAbstractChat {

    public ModulChatGlobal(String numeModul) {
        super(numeModul);
    }

    @Override
    public void PorcesareMesajChat(MesajChat mesaj) {
        System.out.println("Mesaj catre toti "+mesaj.getText());

        if(this.next!=null){
            this.next.PorcesareMesajChat(mesaj);
        }
    }
}

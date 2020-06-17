package cts.patterns.miky.implementation;

public class ModulChatPrivat extends ModulAbstractChat {

    public ModulChatPrivat(String numeModul) {
        super(numeModul);
    }

    @Override
    public void PorcesareMesajChat(MesajChat mesaj) {
        if (!mesaj.getDestinatar().isEmpty()){
            System.out.println("Trimit mesajul catre "+mesaj.destinatar);
            System.out.println(mesaj.getText());
            return;
        }
        if(this.next!=null){
            this.next.PorcesareMesajChat(mesaj);
        }
    }
}

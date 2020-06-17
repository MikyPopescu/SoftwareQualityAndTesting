package cts.patterns.miky.implementation;

//handler a
public class ModulFiltru extends ModulAbstractChat {

    public ModulFiltru(String numeModul) {
        super(numeModul);
    }

    @Override
    public void PorcesareMesajChat(MesajChat mesaj) {
        String[] dictionarCuvinteViolente = new String[]{"ura", "impinge", "te urasc", "naspa"};

        for (String cuvant : dictionarCuvinteViolente) {
            if (mesaj.getText().contains(cuvant)) {
                System.out.println("Filtrare mesaj " + mesaj.getText());
                return; //nu trimit mai departe mesajul
            }
        }

        if(this.next!=null){
            this.next.PorcesareMesajChat(mesaj);
        }
    }
}

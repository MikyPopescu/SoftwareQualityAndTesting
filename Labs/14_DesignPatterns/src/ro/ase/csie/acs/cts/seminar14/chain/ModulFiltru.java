package ro.ase.csie.acs.cts.seminar14.chain;

public class ModulFiltru extends ModulChatAbstract {
    public ModulFiltru(String numeModul) {
        super(numeModul);
    }

    @Override
    public void procesareMesajChat(MesajChat mesaj) {
        String[] dictionarCuvinteViolente =
                new String[]{"ura", "impinge", "te urasc"};

        for (String cuvant : dictionarCuvinteViolente) {
            if (mesaj.getText().contains(cuvant)) {
                System.out.println("Filtrare mesaj: " + mesaj.getText());
                return;
            }
        }

        if (this.next != null)
            this.next.procesareMesajChat(mesaj);
    }
}

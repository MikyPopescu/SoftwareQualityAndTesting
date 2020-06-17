package cts.patterns.miky.client;

import cts.patterns.miky.implementation.*;

public class TestChain {
    public static void main(String[] args) {
        ModulFiltru filtru = new ModulFiltru("Filtru");
        ModulChatPrivat privat = new ModulChatPrivat("Chat privat");
        ModulChatGlobal global = new ModulChatGlobal("Chat global");

        //filtrez cuvinte -> privat ->global
        filtru.setNext(privat);
        privat.setNext(global);

        ModulAbstractChat chat = filtru; //capatul listei

        chat.PorcesareMesajChat(new MesajChat("Salut",1,"Mikysor")); //trece de filtru
        chat.PorcesareMesajChat(new MesajChat("Miky, te urasc",1,"Mikysor")); //nu trimite mai departe
        chat.PorcesareMesajChat(new MesajChat("Zi frumi sa aveti!",1,""));
    }
}

package cts.popescu.mihaela.g1082.patternComposite;

import java.util.ArrayList;
import java.util.Date;

public class GrupClienti implements IActiuniEmail {
    ArrayList<IActiuniEmail> clientiEmail = new ArrayList<>();
    int id;
    String nume;
    long numarMailuri;

    public GrupClienti( int id, String nume, long numarMailuri) {
        this.clientiEmail = clientiEmail;
        this.id = id;
        this.nume = nume;
        this.numarMailuri = numarMailuri;
    }


    @Override
    public void trimiteEmail(IActiuniEmail destinatie, String subject) {
        for(IActiuniEmail client : clientiEmail) {
            if( client instanceof Client) {
                client.trimiteEmail(destinatie, subject);

            }
        }
    }

    @Override
    public void creareEmailDraft(String subject, int prioritate) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getEmail() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void trimiteEveniment(Date dataEveniment, IActiuniEmail destinatie, String subject) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void adauga(IActiuniEmail nod) {
        clientiEmail.add(nod);
    }

    @Override
    public void sterge(int index) {
        if (index > 0) {
            clientiEmail.remove(index);
        }
    }

    @Override
    public IActiuniEmail get(int index) {
        return clientiEmail.get(index);
    }
}

package cts.popescu.mihaela.g1082.patternComposite;

import java.util.Date;

public class Client implements IActiuniEmail{
    int id;
    String nume;
    String adresaMail;
    long numarMailuriTrimise;

    public Client(int id, String nume, String adresaMail, long numarMailuriTrimise) {
        this.id = id;
        this.nume = nume;
        this.adresaMail = adresaMail;
        this.numarMailuriTrimise = numarMailuriTrimise;
    }

    @Override
    public void trimiteEmail(IActiuniEmail destinatie, String subject) {
        System.out.println(this.nume + " trimite mail catre "+destinatie + " cu subiectul "+subject);
    }

    @Override
    public void creareEmailDraft(String subject, int prioritate) {
        System.out.println(this.nume + " a creat draft cu subiectul " +subject + "cu prioritatea " + prioritate);
    }

    @Override
    public String getEmail() {
        return this.adresaMail;
    }

    @Override
    public void trimiteEveniment(Date dataEveniment, IActiuniEmail destinatie, String subject) {
        System.out.println( this.nume  + " trimite eveniment la data " +  dataEveniment  + " catre " +destinatie +
                " cu subiectul  " +  subject);
    }

    @Override
    public void adauga(IActiuniEmail nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sterge(int index) {
        throw new UnsupportedOperationException();
    }


    @Override
    public IActiuniEmail get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", adresaMail='" + adresaMail + '\'' +
                ", numarMailuriTrimise=" + numarMailuriTrimise +
                '}';
    }
}

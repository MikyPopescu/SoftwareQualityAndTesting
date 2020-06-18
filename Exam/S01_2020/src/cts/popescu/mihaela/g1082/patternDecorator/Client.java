package cts.popescu.mihaela.g1082.patternDecorator;

import java.util.Date;

public class Client implements IActiuniEmail{
    int id;
    String nume;
    String adresaEmail;
    long numarEmailuri;

    public Client(int id, String nume, String adresaEmail, long numarEmailuri) {
        this.id = id;
        this.nume = nume;
        this.adresaEmail = adresaEmail;
        this.numarEmailuri = numarEmailuri;
    }

    @Override
    public void trimiteEmail(Date dataEveniment, IActiuniEmail destinatie, String subject) {
        System.out.println(this.nume + "a trimis un email catre " + destinatie + "cu subiectul  " + subject);
    }

    @Override
    public void creareEmailDraft(String subject, int prioritate) {

        System.out.println(this.nume + " a creat draft cu subiectul " +subject + "cu prioritatea " + prioritate);
    }

    @Override
    public String getEmail() {
        return this.adresaEmail;
    }

    @Override
    public void trimiteEveniment(Date dataEveniment, IActiuniEmail destinatie, String subject) {
        System.out.println( this.nume + " trimite eveniment la data " +  dataEveniment  + " catre " +destinatie +
                " cu subiectul  " +  subject);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", adresaEmail='" + adresaEmail + '\'' +
                ", numarEmailuri=" + numarEmailuri +
                '}';
    }
}

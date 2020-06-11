package ro.ase.csie.cts.varianta1.designpatterns.decorator.clase;

import java.sql.Date;

public class Client implements IActiuniEmail{

    String nume;
    long numarEmailuri;
    int id;
    String adresaEmail;




    public Client(String nume, long numarEmailuri, int id, String adresaEmail) {
        super();
        this.nume = nume;
        this.numarEmailuri = numarEmailuri;
        this.id = id;
        this.adresaEmail = adresaEmail;
    }

    @Override
    public void trimiteEmail(IActiuniEmail destinatie, String subject) {

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
    public void trimiteEveniment(java.util.Date dataEveniment, IActiuniEmail destinatie, String subject) {
        System.out.println( this.nume  + " trimite eveniment la data " +  dataEveniment  + " catre " +destinatie +
                " cu subiectul  " +  subject);
    }



    public String getNume() {
        return nume;
    }

    public long getNumarEmailuri() {
        return numarEmailuri;
    }

    public int getId() {
        return id;
    }

    public String getAdresaEmail() {
        return adresaEmail;
    }


    @Override
    public String toString() {
        return "Client [nume=" + nume + ", numarEmailuri=" + numarEmailuri + ", id=" + id + ", adresaEmail="
                + adresaEmail + "]";
    }




}
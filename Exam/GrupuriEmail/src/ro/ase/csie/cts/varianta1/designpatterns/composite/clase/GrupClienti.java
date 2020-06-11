package ro.ase.csie.cts.varianta1.designpatterns.composite.clase;

import java.sql.Date;
import java.util.ArrayList;

public class GrupClienti implements IActiuniEmail{
    ArrayList<IActiuniEmail> clientiEmail= new ArrayList<>();
    String nume;
    int id;
    long nrMailuri;



    public GrupClienti(String nume, int id, long nrMailuri) {
        super();
        this.nume = nume;
        this.id = id;
        this.nrMailuri = nrMailuri;
    }
    @Override
    public void sterge(int index) {

        if(index >0) {
            clientiEmail.remove(index);
        }


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
    public void trimiteEveniment(java.util.Date dataEveniment, IActiuniEmail destinatie, String subject) {
        throw new UnsupportedOperationException();
    }



    @Override
    public void adauga(IActiuniEmail nod) {
        clientiEmail.add(nod);

    }

    @Override
    public IActiuniEmail get(int index) {

        return clientiEmail.get(index);


    }
}

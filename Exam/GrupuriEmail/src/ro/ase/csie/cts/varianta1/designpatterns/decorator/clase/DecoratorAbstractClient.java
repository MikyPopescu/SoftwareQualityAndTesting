package ro.ase.csie.cts.varianta1.designpatterns.decorator.clase;

import java.sql.Date;

public abstract class DecoratorAbstractClient implements IActiuniEmail{
    IActiuniEmail client;

    public DecoratorAbstractClient(IActiuniEmail client) {
        super();
        this.client = client;
    }

    @Override
    public void trimiteEmail(IActiuniEmail destinatie, String subject) {
        client.trimiteEmail(destinatie, subject);

    }

    @Override
    public void creareEmailDraft(String subject, int prioritate) {
        client.creareEmailDraft(subject, prioritate);
    }

    @Override
    public String getEmail() {

        return client.getEmail();
    }

    @Override
    public void trimiteEveniment(java.util.Date dataEveniment, IActiuniEmail destinatie, String subject) {
        client.trimiteEveniment(dataEveniment, destinatie, subject);
    }




}



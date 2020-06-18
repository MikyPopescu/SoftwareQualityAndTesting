package cts.popescu.mihaela.g1082.patternDecorator;

import java.util.Date;

public abstract class DecoratorClienti implements IActiuniEmail{
    IActiuniEmail client;

    public DecoratorClienti(IActiuniEmail client) {
        this.client = client;
    }

    @Override
    public void trimiteEmail(Date dataEveniment, IActiuniEmail destinatie, String subject) {
        client.trimiteEmail(dataEveniment, destinatie,subject);
    }

    @Override
    public void creareEmailDraft(String subject, int prioritate) {
        client.creareEmailDraft(subject,prioritate);
    }

    @Override
    public String getEmail() {
       return client.getEmail();
    }

    @Override
    public void trimiteEveniment(Date dataEveniment, IActiuniEmail destinatie, String subject) {
        client.trimiteEmail(dataEveniment,destinatie,subject);
    }
}

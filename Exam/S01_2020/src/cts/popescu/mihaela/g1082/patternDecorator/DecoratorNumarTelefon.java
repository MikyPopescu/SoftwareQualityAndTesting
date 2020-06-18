package cts.popescu.mihaela.g1082.patternDecorator;

import java.util.Date;

public class DecoratorNumarTelefon extends DecoratorClienti {
    private String numarTelefon;

    public DecoratorNumarTelefon(IActiuniEmail client, String numarTelefon) {
        super(client);
        this.numarTelefon = numarTelefon;
    }

    @Override
    public void trimiteEmail(Date dataEveniment, IActiuniEmail destinatie, String subject) {
        System.out.println("Numar de telefon client " + this.numarTelefon);
        super.trimiteEmail(dataEveniment, destinatie, subject);
    }
}

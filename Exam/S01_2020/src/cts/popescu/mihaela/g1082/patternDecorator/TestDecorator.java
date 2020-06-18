package cts.popescu.mihaela.g1082.patternDecorator;

import java.util.Date;

public class TestDecorator {
    public static void main(String[] args) {
        IActiuniEmail client1 = new Client(1, "Client1", "c1@", 10);
        IActiuniEmail client2 = new Client(2, "Client2", "c1@", 20);
        IActiuniEmail client3 = new Client(3, "Client3", "c1@", 30);

        client1.trimiteEmail(new Date(99, 04, 07), client2, "EXAMEN");
        client2.creareEmailDraft("Alerta!", 2);
        client1.trimiteEveniment(new Date(99, 04, 07), client3, "Buna!");

        DecoratorNumarTelefon decoratorTelefon = new DecoratorNumarTelefon(client1, "0282822");
        decoratorTelefon.trimiteEmail(new Date(99, 04, 07), client1, "Restanta :(");


        DecoratorPrioritate decoratorPrioritate = new DecoratorPrioritate(client2);

        DecoratorNumarTelefon decoratorCascada =
                new DecoratorNumarTelefon(decoratorPrioritate, "0101011");
        decoratorCascada.creareEmailDraft("Alerta!!", 1);
    }
}

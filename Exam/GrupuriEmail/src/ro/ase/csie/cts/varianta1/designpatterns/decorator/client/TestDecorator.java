package ro.ase.csie.cts.varianta1.designpatterns.decorator.client;

import ro.ase.csie.cts.varianta1.designpatterns.decorator.clase.Client;
import ro.ase.csie.cts.varianta1.designpatterns.decorator.clase.DecoratorConcretNumarTelefon;
import ro.ase.csie.cts.varianta1.designpatterns.decorator.clase.DecoratorPrioritate;
import ro.ase.csie.cts.varianta1.designpatterns.decorator.clase.IActiuniEmail;

import java.sql.Date;

public class TestDecorator {
    public static void main(String[] args) {
        IActiuniEmail client1 = new Client("Client1", 200, 123, "c1@");
        IActiuniEmail client2 = new Client("Client2", 200, 123, "c1@");
        IActiuniEmail client3 = new Client("Client3", 200, 123, "c1@");

        client1.trimiteEmail(client2, "exam cts");
        client2.creareEmailDraft("Alerta!", 2);
        client1.trimiteEveniment(new Date(99, 04, 07), client3, "Buna!");

        DecoratorConcretNumarTelefon decoratorTelefon = new DecoratorConcretNumarTelefon(client1, "0282822");
        decoratorTelefon.trimiteEmail(client1, "Hello");


        DecoratorPrioritate decoratorPrioritate = new DecoratorPrioritate(client2);

        DecoratorConcretNumarTelefon decoratorCascada =
                new DecoratorConcretNumarTelefon(decoratorPrioritate, "0101011");
        decoratorCascada.creareEmailDraft("Alerta!!", 1);


    }
}
